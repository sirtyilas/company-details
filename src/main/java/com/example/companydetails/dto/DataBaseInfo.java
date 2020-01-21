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
	

	public String getDriverClassName() {

		return driverClassname;

	}
	
	public String getUserName() {

		return userName;

	}	

	public String getDbVersion() {
		return dbVersion;
	}
	public void setDbVersion(String dbVersion) {
		this.dbVersion = dbVersion;
	}
	public String getCompanyId() {
		return companyId;
	}
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	public String getDriverClassname() {
		return driverClassname;
	}

	public void setDriverClassname(String driverClassname) {
		this.driverClassname = driverClassname;
	}

	public String getJdbcURL() {
		return jdbcURL;
	}

	public void setJdbcURL(String jdbcURL) {
		this.jdbcURL = jdbcURL;
	}

	public String getUserPass() {
		return userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
