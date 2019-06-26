package com.example.regisrty.model;

import javax.validation.constraints.NotEmpty;

public class FileRegisterModel {

	private Long Id;
	

    @NotEmpty(message = "app name must not be empty")
	private String appName;
	

    @NotEmpty(message = "category must not be empty")
	private String category;
	

    @NotEmpty(message = "file name must not be empty")
	private String fileName;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	
}
