package com.CrudSpringBoot.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.CrudSpringBoot.model.Nationality;
import com.CrudSpringBoot.services.NationalityService;

@Controller
public class NationalityController
{
	@Autowired
	private NationalityService nService;
	
	@GetMapping("/getNationalities")
	public String getNationalities(Model m) 
	{
		return "nationalities";
	}

	@RequestMapping("/getNationalityById")
	@ResponseBody
	public Optional<Nationality> getNationalityById(Integer Id, Model m) 
	{
		return nService.getNationalityById(Id);
	}
	
	@RequestMapping(value = "/save",method = {RequestMethod.POST,RequestMethod.PUT,RequestMethod.GET})
	public String updateNationality(Nationality nationality)
	{
		nService.updateNationality(nationality);
		return "redirect:/nationalities";		 	//redirect with the updated list
	}
	
	@RequestMapping(value = "/addNew",method = {RequestMethod.POST,RequestMethod.PUT,RequestMethod.GET})
	public String addNewNationality(Nationality nationality)
	{
		nService.addNationality(nationality);
		return "redirect:/nationalities";
	}
	
	@RequestMapping(value = "/delete",method = {RequestMethod.POST,RequestMethod.PUT,RequestMethod.GET})
	public String deletenationality(Integer Id) 
	{
		nService.deleteNationality(Id);
		return "redirect:/nationalities" ;
	}
	
}
