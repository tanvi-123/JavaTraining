package com.example.demoonetomany;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class DemoonetomanyApplication {

	public static void main(String[] args) {
		ApplicationContext context;
		context=SpringApplication.run(DemoonetomanyApplication.class, args);
		CartRepository cart;
		cart=context.getBean(CartRepository.class);
		
		ItemsRepository item;
		item=context.getBean(ItemsRepository.class);
		
		Cart c1=new Cart(100, "mouse");
		cart.save(c1);
		Items i1 = new Items(100,"mouse",200,c1);
		Items i2= new Items(101,"Keyboard",300,c1);
		item.save(i1);
		item.save(i2);
	}

}
