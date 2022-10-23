package com.se.jpa.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.se.jpa.entity.ChuyenBay;
import com.se.jpa.jpa.repository.HelloRepository;

public class Application {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
		 
        HelloRepository helloRepository = (HelloRepository) ac.getBean("helloRepository");
 
        ChuyenBay chuyenbay = helloRepository.findById(new Long(2)).get();
        System.out.println(chuyenbay.getGaDi());

	}

}
