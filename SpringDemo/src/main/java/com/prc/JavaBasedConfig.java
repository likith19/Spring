package com.prc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.prc.bean.FirstBean;

@Configuration
public class JavaBasedConfig {
	
	@Bean(name="annotationFirstBean")
	public FirstBean getFirstBeanObj(){
		return new FirstBean();
	}

}
