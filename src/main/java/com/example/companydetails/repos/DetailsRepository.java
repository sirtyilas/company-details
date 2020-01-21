package com.example.companydetails.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.companydetails.dto.DataBaseInfo;


@Repository
public interface DetailsRepository  extends JpaRepository<DataBaseInfo, Integer> {
	
	
	

	public DataBaseInfo findByCompanyId(String companyId);

}
