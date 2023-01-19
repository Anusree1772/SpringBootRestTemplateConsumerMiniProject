package com.app.entity;


public class Student {

	
    private Integer stdId;

	private String stdName;

	private String stdGen;

	private String stdCourse;
	
	private String stdAddr;

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

	public String getStdGen() {
		return stdGen;
	}

	public void setStdGend(String stdGen) {
		this.stdGen = stdGen;
	}

	public String getStdCourse() {
		return stdCourse;
	}

	public void setStdCourse(String stdCourse) {
		this.stdCourse = stdCourse;
	}

	public String getstdAddr() {
		return stdAddr;
	}

	public void setstdAddr(String stdAddr) {
		this.stdAddr = stdAddr;
	}

	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", stdGend=" + stdGen + ", stdCourse=" + stdCourse
				+ ", stdAddr=" + stdAddr + "]";
	}
	
	
}
