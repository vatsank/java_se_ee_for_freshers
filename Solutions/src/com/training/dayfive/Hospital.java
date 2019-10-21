package com.training.dayfive;
import java.util.*;
public class Hospital {

	private List<Doctor> doctorsList;
	private Set<Staff> staffList;

	private String hospitalName;
	private String location;
	private long phoneNumber;
	
	public Hospital() {
		super();
		
		  this.doctorsList = new ArrayList<>();
		  this.staffList = new TreeSet<>();
	}

	
	public Hospital(String hospitalName, String location, long phoneNumber) {
		this();
		this.hospitalName = hospitalName;
		this.location = location;
		this.phoneNumber = phoneNumber;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	
	public boolean addDoctor(Doctor doc) {
		
		return this.doctorsList.add(doc);
	}
	
	public boolean addStaff(Staff staff) {
		
		 return this.staffList.add(staff);
	}


	
	public List<Doctor> getDoctors(){
		
		return this.doctorsList;
	}


	public List<Doctor> getDoctorsList() {
		return doctorsList;
	}


	public Set<Staff> getStaffList() {
		return staffList;
	}

	
}
