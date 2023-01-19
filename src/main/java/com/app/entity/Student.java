package com.app.entity;


public class Student {

	
    private Integer stdId;

	private String stdName;

	private String stdGend;

	private String stdCourse;
	
	private String stdAddress;

	public Integer getStdId() {
		return stdId;
	}

	public void setStdId(Integer stdId) {
		this.stdId = stdId;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public String getStdGend() {
		return stdGend;
	}

	public void setStdGend(String stdGend) {
		this.stdGend = stdGend;
	}

	public String getStdCourse() {
		return stdCourse;
	}

	public void setStdCourse(String stdCourse) {
		this.stdCourse = stdCourse;
	}

	public String getStdAddress() {
		return stdAddress;
	}

	public void setStdAddress(String stdAddress) {
		this.stdAddress = stdAddress;
	}

	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", stdGend=" + stdGend + ", stdCourse=" + stdCourse
				+ ", stdAddress=" + stdAddress + "]";
	}
	
	
}
