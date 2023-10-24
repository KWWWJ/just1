package c231023.main.java.com.classJava.board.service;

//import java.sql.Connection;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.datasource.DataSourceTransactionManager;
//import org.springframework.jdbc.datasource.DataSourceUtils;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;
//import org.springframework.transaction.support.TransactionSynchronizationManager;

import c231023.main.java.com.classJava.board.dao.BoardDAO;
import c231023.main.java.com.classJava.board.domain.Board;
import c231023.main.java.com.classJava.user.dao.UserDAO;
import c231023.main.java.com.classJava.user.domain.User;

public class BoardSevice {
	private UserDAO userDAO;
	private BoardDAO boardDAO;
	private DataSource dataSoutce;
	private PlatformTransactionManager transactionManager;
	
	public void setUserDAO(UserDAO userDAO) {this.userDAO = userDAO;}
	public void setBoardDAO(BoardDAO boardDAO) {this.boardDAO = boardDAO;}
	public void setDataSource(DataSource dataSoutce) {this.dataSoutce = dataSoutce;}
	public void setTransactionManager(PlatformTransactionManager transactionManager) {this.transactionManager = transactionManager;}
	
	
	public void add(Board board) {
		boardDAO.add(board);
	}
	
	public Board get(int id) {
		Board board = boardDAO.get(id);
		User user = userDAO.get(board.getUserId());
		board.setUser(user);
		
		return board;
	}
	
	public List<Board> getAll(){
		List<Board> list = boardDAO.getAll();
		for(int i=0; i<list.size(); i++) {
//			list.get(i).setUser(userDAO.get(list.get(i).getUserId())); // 이건 안번에 넣는 것. 아래는 나눠서 작업
			int userId = list.get(i).getUserId();
			User user = userDAO.get(userId);
			list.get(i).setUser(user);
		}
		return list;
	}
	
	
	
	public void upateBefore(Board board, User user) throws Exception {
	// 글 수정
		if(board.getUserId() == user.getId() ) {
			boardDAO.update(board);
		}else {
			throw new Exception("wrong user");
		}
	}
	
	// AutoCommit을 끄고 그 전에 처리하는 방법. Transaction의 시작.
	public void update(Board board, User user) throws Exception{
//		TransactionSynchronizationManager.initSynchronization();
//		Connection conn = DataSourceUtils.getConnection(dataSoutce);
//		conn.setAutoCommit(false);
		// 위의 것이 기초현태, 아래게 개선본
		PlatformTransactionManager tm = new DataSourceTransactionManager(dataSoutce); //결국 newn DAO와 다를게 없다.
		TransactionStatus status = transactionManager.getTransaction(new DefaultTransactionDefinition());
		// 이것도 xml파일에 넣어줄 수 있다.
		
		try {
			User writer = board.getUser();
			if(writer.getId() == user.getId()) {
				boardDAO.update(board);
			}
			
			tm.commit(status);
		}catch(Exception e) {
			tm.rollback(status);
			throw e;			//new Exception("error"); 본래 틀ㅇ느 이것.
		}finally { // close는 역순
//			DataSourceUtils.releaseConnection(conn, dataSoutce);
//			TransactionSynchronizationManager.unbindResource(dataSoutce);
//			TransactionSynchronizationManager.clearSynchronization();
		}
	}
	
	public void updateAllNotTS(User user) throws Exception {
		try {
			List<Board> list = getAll();
			for (int i = 0; i < list.size(); i++) {
				list.get(i).setContent("삭제된 게시물입니다.");
				if(i == 2)user = new User("김남균", "knk", "1234"); 
				Board board = list.get(i);
				User writer = board.getUser();
				if(writer.getId() == user.getId()) {
					boardDAO.update(board);
				}else {
					throw new Exception("worng user");
				}
			}
		}catch(Exception e) {
			
			throw new Exception("error");			// new Exception("error"); 본래 틀ㅇ느 이것.
		}
	}
	
	public void updateAll(User user) throws Exception{

//		PlatformTransactionManager tm = new DataSourceTransactionManager(dataSoutce);
		TransactionStatus status = transactionManager.getTransaction(new DefaultTransactionDefinition());
		try {
			List<Board> list = getAll();
			for (int i = 0; i < list.size(); i++) {
				list.get(i).setContent("삭제된 게시물입니다.");
				if(i == 2)user = new User("김남균", "knk", "1234"); 
				Board board = list.get(i);
				User writer = board.getUser();
				if(writer.getId() == user.getId()) {
					boardDAO.update(board);
				}else {
					throw new Exception("worng user");
				}
			}
			transactionManager.commit(status);
		}catch(Exception e) {
			transactionManager.rollback(status);
			throw e;			//new Exception("error"); 본래 틀ㅇ느 이것.
		}finally { // close는 역순

		}
	}

}
