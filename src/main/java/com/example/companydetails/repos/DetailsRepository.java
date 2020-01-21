package com.example.companydetails.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.companydetails.dto.DataBaseInfo;

public interface DetailsRepository  extends JpaRepository<DataBaseInfo, Integer> {

}
