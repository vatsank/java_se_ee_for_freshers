package com.training.dayfive;

import java.util.*;

public class Doctor {

	private long id;
	private String doctorName;
	private String specialization;
	private long phoneNumber;
	
	private Set<Staff> staffList;

	public Doctor() {
		super();
		
		staffList = new TreeSet<>();
	}
	
	public Doctor(long id, String doctorName, String specialization, long phoneNumber) {
		this();
		this.id = id;
		this.doctorName = doctorName;
		this.specialization = specialization;
		this.phoneNumber = phoneNumber;
	}


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Set<Staff> getStaffList() {
		return staffList;
	}

	public boolean addStaff(Staff staff) {
		return this.staffList.add(staff);
	}

	@Override
	public String toString() {
		return "Doctor [id=" + id + ", doctorName=" + doctorName + ", specialization=" + specialization
				+ ", phoneNumber=" + phoneNumber + ", staffList=" + staffList + "]";
	}
	
	
}
