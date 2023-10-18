package com.martial.etudiant.controleurs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.martial.etudiant.dto.etudiant.EtudiantDtIn;
import com.martial.etudiant.dto.etudiant.ResponseDto;
import com.martial.etudiant.services.EtudiantService;

@Endpoint
public class EtudiantControlerEndpoint {

	
	private static final String NAMESPACE="http://www.martial.com/etudiant/dto/Etudiant";
	
	@Autowired
	private EtudiantService etudiantService;
	
	@PayloadRoot(namespace = NAMESPACE, localPart = "EtudiantDtIn")
	@ResponsePayload
	public ResponseDto create(@RequestPayload EtudiantDtIn etudiantDtIn) {
		return etudiantService.create(etudiantDtIn);
	}
	
}
