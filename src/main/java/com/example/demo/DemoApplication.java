package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("App is Running..");
		
		classForTable obj = new classForTable();

		obj.setId(101);
		obj.setName("manoj");
	}

}
