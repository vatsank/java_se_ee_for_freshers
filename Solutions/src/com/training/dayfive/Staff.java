package com.training.dayfive;

import java.util.HashMap;

public class Staff  implements Comparable<Staff> {

	private long id;
	private String staffName;
	private String designation;
	private long phoneNumber;

	private HashMap<String,MedicalEquipment> apparatusList;

	public Staff() {
		super();

		apparatusList =new HashMap<>();
	}

	public Staff(long id, String staffName, String designation, long phoneNumber) {
		this();
		this.id = id;
		this.staffName = staffName;
		this.designation = designation;
		this.phoneNumber = phoneNumber;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Staff [id=" + id + ", staffName=" + staffName + ", designation=" + designation + ", phoneNumber="
				+ phoneNumber + ", apparatusList=" + apparatusList + "]";
	}
	
	public Object addApparatus(MedicalEquipment element) {
		
		return this.apparatusList.put(element.getEquipmentName(),element);
	}

	@Override
	public int compareTo(Staff otherObject) {
		return this.designation.compareTo(otherObject.designation);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((designation == null) ? 0 : designation.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Staff other = (Staff) obj;
		if (designation == null) {
			if (other.designation != null)
				return false;
		} else if (!designation.equals(other.designation))
			return false;
		if (id != other.id)
			return false;
		return true;
	}

	public HashMap<String, MedicalEquipment> getApparatusList() {
		return apparatusList;
	}
	
}
