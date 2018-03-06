package com.prc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppContext {

	public static ApplicationContext getApplicationContext(){
		String conf="applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(conf);
        return context;
	}
	
	public static ApplicationContext getAnnotationApplicationContext(){
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaBasedConfig.class);
        return context;
	}
}
