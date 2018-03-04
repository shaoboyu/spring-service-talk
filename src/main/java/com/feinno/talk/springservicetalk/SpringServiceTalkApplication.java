package com.feinno.talk.springservicetalk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class SpringServiceTalkApplication {

	/**
	* 主程序入口
	*@param:
	*@return:
	*/
	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringServiceTalkApplication.class, args);
		System.out.println("==============Spring-Service-Talk Start Finish============");

	}
}
