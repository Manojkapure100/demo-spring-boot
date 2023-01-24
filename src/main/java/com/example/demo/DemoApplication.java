package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("App is Running..");
		boolean m=true;
		while(m==true){
			System.out.println("m is true");
			if(m==true){
				m=false;
				System.out.println("m is false");
			}else{
				m=true;
				System.out.println("m is true");
			}
		}
	}

}
