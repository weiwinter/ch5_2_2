package com.wisely.ch5_2_2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//使用XML配置
//@ImportResource({"classpath:**1.xml","classpath:***2.xml",})
@RestController
@SpringBootApplication
public class Ch522Application {

	@Value("${book.author}")
	private String author;
	
	@Value("${book.name}")
	private String name;
	
	@RequestMapping("/")
	String index() {
		return "Hello! Spring Boot!"+" book's name is "+name+";book's author is "+author;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Ch522Application.class, args);
	}

}
