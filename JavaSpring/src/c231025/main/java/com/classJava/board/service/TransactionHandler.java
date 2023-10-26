package c231025.main.java.com.classJava.board.service;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import c231024.main.java.com.classJava.board.service.BoardService;

public class TransactionHandler implements InvocationHandler{
 private Object target; // 보조 관심사는 어디든 들어갈 수 있어야하므로 Object를 사용한다.
 private String pattern; // 여기 안에 넣는 메서드(이름)을 기준으로 트렌젝션해준다. 여기서는 update를 넣어 확안헐 예정.
 // 이 변수는 일종의 틀이다. 틀에 설정한 이름을 가진 메서드에 동일한 작업을 실행하도록 만든다.
 private PlatformTransactionManager transactionManager;
 
 public void setTarget(Object target) {
	 this.target = target;
 }
 public void setPattern(String pattern) {
	 this.pattern = pattern;
 }
 public void setTransactionManager(PlatformTransactionManager transactionManager) {
	 this.transactionManager = transactionManager;
 }

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		if(method.getName().startsWith(pattern)) return transaction(method, args);
		else return method.invoke(target, args); // 원본 그대로 내보내기

	}
	
	private Object transaction( Method method, Object[] args) throws Throwable {
		TransactionStatus status = transactionManager.getTransaction(new DefaultTransactionDefinition());
		
		try {
			Object ret = method.invoke(target, args);
			transactionManager.commit(status);
			return ret;
		}catch(InvocationTargetException e) {
			transactionManager.rollback(status);
			throw e.getTargetException();
		}
	}
}
