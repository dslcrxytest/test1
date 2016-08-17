package cn.crxy.test;


import java.sql.DriverManager;

import com.mysql.jdbc.Driver;

public class StudentDemo1 {

	public static void main(String[] args) throws Exception {
		
		DriverManager.registerDriver(new Driver());
		Student s = new Student();
		System.out.println(s+"---"+new Driver());

	}

}
