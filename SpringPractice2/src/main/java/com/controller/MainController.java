package com.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.StudentBean;

public class MainController {

	public static void main(String[] arg) throws IOException
	{
		System.out.println("1 "+System.getProperty("dir"));
		File currentDirectory = new File(new File(".").getAbsolutePath());
		System.out.println("2 "+currentDirectory.getCanonicalPath());
		System.out.println("3 "+currentDirectory.getAbsolutePath());
		ApplicationContext context = new ClassPathXmlApplicationContext("ac.xml");
		//StudentBean obj = (StudentBean) context.getBean("c1");
	     // obj.getMessage();
	}
}
