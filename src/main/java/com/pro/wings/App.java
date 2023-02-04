package com.pro.wings;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {

    	ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
    	
    	Employee emp = ctx.getBean("emp", Employee.class);
    	Address add1 = ctx.getBean("address", Address.class);
    	
    	emp.setAdd(add1);
    	
    	System.out.println(emp);
    	System.out.println(emp.hashCode());
    	System.out.println(add1.hashCode());
    	
    	System.out.println("__________________________________________________________");
    	emp.getAdd().setCity("Pune");
    	emp.getAdd().setPincode(416119);
    	
    	System.out.println(emp);
    	System.out.println(emp.hashCode());
    	System.out.println(add1.hashCode());
    	
//    	emp1.findAddress();
//    	System.out.println(emp1.getAdd().hashCode());
//    	
//    	System.out.println(emp1.hashCode());
//    	
//    	emp1 = ctx.getBean("emp", Employee.class);
//    	emp1.findAddress();
//    	System.out.println(emp1.getAdd().hashCode());
//       
//    	System.out.println(emp1.hashCode());
    }
}
