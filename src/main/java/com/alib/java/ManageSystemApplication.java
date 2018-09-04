package com.alib.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ManageSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManageSystemApplication.class, args);
		System.out.println("项目启动成功!");
	}
}
