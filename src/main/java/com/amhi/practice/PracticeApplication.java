package com.amhi.practice;

import com.amhi.practice.config.PracticeApplicationEnvironmentPreparedEvent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PracticeApplication {

	public static void main(String[] args) {
		SpringApplication springApplication =  new SpringApplication();
		springApplication.addListeners(new PracticeApplicationEnvironmentPreparedEvent());
		springApplication.run(PracticeApplication.class, args);
		///SpringApplication.run(PracticeApplication.class, args);
	}

}
