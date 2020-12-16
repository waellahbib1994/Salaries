package com.tsconsult.test.service;

import java.util.List;

import com.tsconsult.test.dto.MessageResponse;
import com.tsconsult.test.entity.Salarie;

public interface SalarieService {
	public MessageResponse addSalarie(Salarie salarie);
	public Salarie findById(String salarie);
	public List<Salarie> findAll();
}
