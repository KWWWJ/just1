package c231019;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.GenericXmlApplicationContext;

@Configuration
public class CreateAppilcationContext {
	public void main(String[] args) {
		new GenericXmlApplicationContext("applicationContext.xml"); 
	}

}
