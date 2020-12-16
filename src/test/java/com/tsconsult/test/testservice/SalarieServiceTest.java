package com.tsconsult.test.testservice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.tsconsult.test.entity.Salarie;
import com.tsconsult.test.service.SalarieService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class SalarieServiceTest {
	@Autowired
	SalarieService salarieService;
	Salarie salarie = new Salarie("123","test1",124.0);
	
	@Test
	public void testAddSalarie() {
		log.info(salarieService.addSalarie(salarie).toString());
	}
	@Test
	public void testFindById() {
		log.info(salarieService.findById(salarie.getCin()).toString());
	}
	@Test
	public void testFindAll() {
		log.info(salarieService.findAll().toString());
	}
}
