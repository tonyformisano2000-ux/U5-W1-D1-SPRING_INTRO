package com.example.U5_W1_D1_SPRING_INTRO;

import com.example.U5_W1_D1_SPRING_INTRO.model.Menu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class U5W1D1SpringIntroApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(U5W1D1SpringIntroApplication.class, args);

//		Menu menu = ctx.getBean(Menu.class);
//		System.out.println(menu);

	}

}
