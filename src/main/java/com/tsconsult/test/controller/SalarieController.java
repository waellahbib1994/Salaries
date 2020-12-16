package com.tsconsult.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tsconsult.test.dto.MessageResponse;
import com.tsconsult.test.entity.Salarie;
import com.tsconsult.test.service.SalarieService;

@RestController
@RequestMapping("/salarie")
@CrossOrigin("*")
public class SalarieController {
	@Autowired
	SalarieService salarieService;
	
	@PostMapping("/addSalarie")
	public MessageResponse addSalarie(@RequestBody Salarie salarie) {
		return salarieService.addSalarie(salarie);
	}
	@GetMapping("/getSalarie")
	public Salarie findById(@RequestParam String cin) {
		return salarieService.findById(cin);
	}
	@GetMapping("/findAll")
	public List<Salarie> findAll() {
		return salarieService.findAll();
	}

}
