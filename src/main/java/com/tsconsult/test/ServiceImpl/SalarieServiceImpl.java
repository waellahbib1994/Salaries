package com.tsconsult.test.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tsconsult.test.dto.MessageResponse;
import com.tsconsult.test.entity.Salarie;
import com.tsconsult.test.repository.SalarieRepository;
import com.tsconsult.test.service.SalarieService;

@Service
public class SalarieServiceImpl implements SalarieService {
	
	@Autowired
	SalarieRepository salarieRepository;

	@Override
	public MessageResponse addSalarie(Salarie salarie) {
		if(salarie == null)
			return new MessageResponse(false, "fail saving Salary !!");
		else {
			salarieRepository.save(salarie);
			return new MessageResponse(true, "Succes ! ");
		}
	}

	@Override
	public Salarie findById(String cin) {
		// TODO Auto-generated method stub
		return salarieRepository.findById(cin).orElse(null);
	}

	@Override
	public List<Salarie> findAll() {
		// TODO Auto-generated method stub
		return salarieRepository.findAll();
	}

}
