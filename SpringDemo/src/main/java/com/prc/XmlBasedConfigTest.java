package com.prc;

import org.springframework.context.ApplicationContext;

import com.prc.bean.FirstBean;
import com.prc.bean.Student;

public class XmlBasedConfigTest 
{
    public static void main( String[] args )
    {	
    	ApplicationContext context = AppContext.getApplicationContext();
    	//Demo
        FirstBean b = (FirstBean) context.getBean("firstBean");
        b.show();
        //Static
        Student s = (Student)context.getBean("student");
        System.out.println("Roll no: " + s.getRollNumber() + " :: " + "Name: " + s.getName());
        //Dynamic
        Student s1 = (Student)context.getBean("studentDynamic");
        s1.setRollNumber(20);
        s1.setName("Pavan");
        System.out.println("Roll no: " + s1.getRollNumber() + " :: " + "Name: " + s1.getName());
    }
}
