package com.martial.etudiant.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.martial.etudiant.dto.etudiant.EtudiantDtIn;
import com.martial.etudiant.dto.etudiant.ResponseDto;
import com.martial.etudiant.models.Etudiant;
import com.martial.etudiant.repository.EtudiantRepository;

@Service
public class EtudiantService {
	
	@Autowired
	public EtudiantRepository etudiantRepository;
	
	public ResponseDto create(EtudiantDtIn etudiantDtIn) {
		
		ResponseDto responseDto = new ResponseDto();
		
		System.out.println("Etudiant : "+etudiantDtIn.getName());
		
		Etudiant etudiant = EtudiantDtIn.toEntity(etudiantDtIn);
		
		etudiant = etudiantRepository.save(etudiant);
		
		responseDto.setId(etudiant.getId());
		responseDto.setStatus(200);
		
		return responseDto;
		
		
	}

}
