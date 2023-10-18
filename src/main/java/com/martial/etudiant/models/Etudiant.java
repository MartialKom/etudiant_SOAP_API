package com.martial.etudiant.models;

import java.sql.Date;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "etudiant")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Etudiant {
	
	@Id
	@GeneratedValue(strategy  = GenerationType.IDENTITY)
	public Integer id;
	
	public String name;
	
	public int age;
	
	public String mail;
	
	public String dateNaissance;
	
	

}
