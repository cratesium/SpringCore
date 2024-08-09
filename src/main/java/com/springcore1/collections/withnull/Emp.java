package com.springcore1.collections.withnull;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.management.loading.PrivateClassLoader;

public class Emp {
	private String name;
	private List<String>phoneNumber;
    private Set<String> familyMember;
    private Map<String, String> courseCode;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(List<String> phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Set<String> getFamilyMember() {
		return familyMember;
	}

	public void setFamilyMember(Set<String> familyMember) {
		this.familyMember = familyMember;
	}

	public Map<String, String> getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(Map<String, String> courseCode) {
		this.courseCode = courseCode;
	}

	public Emp(String name, List<String> phoneNumber, Set<String> familyMember, Map<String, String> courseCode) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.familyMember = familyMember;
		this.courseCode = courseCode;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
    
	

}
