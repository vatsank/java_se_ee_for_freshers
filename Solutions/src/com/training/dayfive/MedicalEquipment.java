package com.training.dayfive;

public class MedicalEquipment {

	private long id;
	private String equipmentName;
	private String description;
	private long quantity;
	
	public MedicalEquipment(long id, String equipmentName, String description, long quantity) {
		super();
		this.id = id;
		this.equipmentName = equipmentName;
		this.description = description;
		this.quantity = quantity;
	}
	public MedicalEquipment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getEquipmentName() {
		return equipmentName;
	}
	public void setEquipmentName(String equipmentName) {
		this.equipmentName = equipmentName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public long getQuantity() {
		return quantity;
	}
	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((equipmentName == null) ? 0 : equipmentName.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + (int) (quantity ^ (quantity >>> 32));
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
		MedicalEquipment other = (MedicalEquipment) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (equipmentName == null) {
			if (other.equipmentName != null)
				return false;
		} else if (!equipmentName.equals(other.equipmentName))
			return false;
		if (id != other.id)
			return false;
		if (quantity != other.quantity)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "MedicalEquipment [id=" + id + ", equipmentName=" + equipmentName + ", description=" + description
				+ ", quantity=" + quantity + "]";
	}
	
	

}
