package com.training.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement

public class BloodDonor {



	private long mobileNumber;
	private String donorName;
	private String bloodGroup;
	
	public BloodDonor() {
		super();
	}

	public BloodDonor(long mobileNumber, String donorName, String bloodGroup) {
		super();
		this.mobileNumber = mobileNumber;
		this.donorName = donorName;
		this.bloodGroup = bloodGroup;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getDonorName() {
		return donorName;
	}

	public void setDonorName(String donorName) {
		this.donorName = donorName;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	@Override
	public String toString() {
		return "BloodDonor [mobileNumber=" + mobileNumber + ", donorName=" + donorName + ", bloodGroup=" + bloodGroup
				+ "]";
	}
	
	
}
