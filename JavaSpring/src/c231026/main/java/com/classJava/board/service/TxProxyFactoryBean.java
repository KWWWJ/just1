package c231026.main.java.com.classJava.board.service;

import java.lang.reflect.Proxy;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.transaction.PlatformTransactionManager;

import c231025.main.java.com.classJava.board.service.TransactionHandler;

public class TxProxyFactoryBean implements FactoryBean<Object>{ // 펙토리를 만들어서 다른 펙토리에 넘겨주는 녀석이다.
	private Object target;
	private String pattern;
	private PlatformTransactionManager transactionManager;
	private Class<?> serviceInterface; // 제네릭 상에서 ?는 쿼리의 *과 같은 역할이다.
	
	public void setTarget(Object target) {this.target = target;}
	public void setPattern(String pattern) {this.pattern = pattern;}
	public void setTransactionManager(PlatformTransactionManager transactionManager) {this.transactionManager = transactionManager;}
	public void setServiceInterface(Class<?> serviceInterface) {this.serviceInterface = serviceInterface;}
	
	
	@Override
	public Object getObject() throws Exception {
		// TODO Auto-generated method stub
		TransactionHandler txHandler = new TransactionHandler();
		txHandler.setTarget(target);
		txHandler.setPattern(pattern);
		txHandler.setTransactionManager(transactionManager);
		return Proxy.newProxyInstance(
				getClass().getClassLoader(), 
				new Class[] {serviceInterface}, 
				txHandler);
	}

	@Override
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return serviceInterface;
	}

	@Override
	public boolean isSingleton() { // applicationContext에게 싱글톤으로 만들지 말지를 전달하는 메서드.
		// TODO Auto-generated method stub
		return false;
	}
	
}
