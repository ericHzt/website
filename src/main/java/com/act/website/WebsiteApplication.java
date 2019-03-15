package com.act.website;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.act.*")
@MapperScan("com.act.*")
public class WebsiteApplication {

	public static void main(String[] args) {

		SpringApplication.run(WebsiteApplication.class, args);
	}

}
