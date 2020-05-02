package com.CrudSpringBoot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CrudSpringBoot.model.Nationality;
import com.CrudSpringBoot.repositories.NationalityRepository;

@Service
public class NationalityService
{
	@Autowired
	private NationalityRepository nRepository;
	
	public List<Nationality> getNationalities(){
		return (List<Nationality>) nRepository.findAll();
	}
	
	public Optional<Nationality> getNationalityById(Integer Id) {
		return nRepository.findById(Id);
	}
	
	public void addNationality(Nationality nationality) {
		nRepository.save(nationality);
	}
	
	public void updateNationality(Nationality nationality) {
		nRepository.save(nationality);
	}
	
	public void deleteNationality(Integer Id) {
		nRepository.deleteById(Id);
	}
}
