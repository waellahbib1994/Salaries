package com.tsconsult.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.tsconsult.test.entity.Salarie;
import com.tsconsult.test.repository.SalarieRepository;

@SpringBootApplication
public class SalariesApplication {
/*@Autowired
static SalarieRepository salarieRepository;*/
	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(SalariesApplication.class, args);
		
		//salarieRepository.save(new Salarie(1,"aa","bb","aa","bb",20.0));
		
	}

}
