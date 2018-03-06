package com.prc;

import org.springframework.context.ApplicationContext;

import com.prc.bean.FirstBean;

public class JavaBasedConfigTest {

	public static void main(String[] args) {
		ApplicationContext context = AppContext.getAnnotationApplicationContext();
		FirstBean b = (FirstBean) context.getBean("annotationFirstBean");
        b.show();
	}

}
