package com.example.companydetails.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dataBaseInfo")
public class DataBaseInfo {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String driverClassname;
	private String jdbcURL;
	private String userName;
	private String userPass;
	private String companyId;
	private String dbVersion;
	
	
	public DataBaseInfo() {}
	

	public DataBaseInfo(String driverClassname,String jdbcURL,String userName,String userPass,String companyId,String dbVersion) {
		
		this.driverClassname=driverClassname;
		this.jdbcURL=jdbcURL;
		this.userName=userName;
		this.userPass=userPass;
		this.companyId=companyId;
		this.dbVersion =dbVersion;
		
	}
	public String getDriverClassName() {

		return driverClassname;

	}

	public String getJDBCUrl() {

		return jdbcURL;

	}
	
	public String getUserName() {

		return userName;

	}
	
	public String getPass() {

		return userPass;

	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCompanyId() {
		return companyId;
	}


	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}


	public String getDbVersion() {
		return dbVersion;
	}


	public void setDbVersion(String dbVersion) {
		this.dbVersion = dbVersion;
	}

}
