package com.example.companydetails.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.companydetails.dto.DataBaseInfo;
import com.example.companydetails.repos.DetailsRepository;


@RestController
@RequestMapping("/details")
public class CompanyDetails {
	
	@Autowired
	private DetailsRepository detailsRepo;
	
	
	@RequestMapping("database/{companyId}")
	public DataBaseInfo getDatabaseInfo(@PathVariable("companyId")String companyId){
		
		return detailsRepo.findByCompanyId(companyId);			
		
	}
	

	
	@RequestMapping("/database")
	public List<DataBaseInfo> getAllDatabaseInfo(){
		
		return detailsRepo.findAll();			
		
	}
	
	
    @RequestMapping(value = "/{companyId}/database", method = RequestMethod.POST)
    public ResponseEntity<String> saveDatabaseInfo(@RequestBody DataBaseInfo baseInfo) {    	
    	
    		detailsRepo.save(baseInfo);    	
       
            return new ResponseEntity<>( "Database Info saved", HttpStatus.OK);
          
    }

}
