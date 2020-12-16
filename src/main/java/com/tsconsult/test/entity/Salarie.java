package com.tsconsult.test.entity;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Salarie {
	@Id
	private String cin;
	private String name;
	private Double salary;
	
}
