package c231020.board;

import c231019.user.UserBean;
import c231019.user.UserDAO;

public class BoardService {
	private BoardDAO boardDAO;
	private UserDAO userDAO;
	
	public void setBoardDAO(BoardDAO boardDAO) {
		this.boardDAO = boardDAO;
	}
	
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	
	public void add(BoardBean board,  UserBean user) {
		board.setUserId(user.getId());
		boardDAO.add(board);
	}
	
	public BoardBean get(int id) {
		BoardBean board = boardDAO.get(id);
		UserBean user = userDAO.get(board.getUserId());
		board.setUser(user);
		
		return board;
	}
	
//	public void idMatch(BoardBean board, UserBean user) {
//		board.setUserId(user.getId());
//	} 
//	public void nickNameMatch(BoardBean board, UserBean user) {
//		board.setNickName(user.getName());
//	} // 직접 작성해 본 것.
}
