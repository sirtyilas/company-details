package com.example.companydetails.controllers;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.companydetails.dto.DataBaseInfo;


@RestController
@RequestMapping("/details")
public class CompanyDetails {
	
	
	@RequestMapping("/{companyId}/database")
	public DataBaseInfo getDatabaseInfo(@PathVariable("companyId")String companyId){
		return null;	
		
		
		
	}

}
