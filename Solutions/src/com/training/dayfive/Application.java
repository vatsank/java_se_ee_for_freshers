package com.training.dayfive;

import java.util.Map;


public class Application {

	public static void printInstruments(Staff staff) {
		
		for(Map.Entry<String, MedicalEquipment> eachItem : staff.getApparatusList().entrySet())
			
			System.out.println(eachItem.getValue());
		
	}
	public static Doctor  searchDoctor(Hospital hospital,long doctorCode) {
 
		Doctor foundDoctor = null;
		for(Doctor eachDoctor:hospital.getDoctors()) {
			 
			 if(eachDoctor.getId() == doctorCode) {
				  foundDoctor= eachDoctor;
				   }
		 }
		
 return foundDoctor;
	}
	public static void main(String[] args) {
		
		
		MedicalEquipment bp = new MedicalEquipment(400, "Bp", "Manual BP Apparatus",1);
		MedicalEquipment steth = new MedicalEquipment(402, "seth", "Stehescope",1);
		
		
		Staff sheela = new Staff(300, "Sheela", "Nurse", 49499555L);
		
		sheela.addApparatus(steth);
		sheela.addApparatus(bp);
		
		
		Doctor  ramesh = new Doctor(200, "Ramesh Khanna", "Heart", 78488233);
		
		
		Hospital narayana = new Hospital("Narayana Hrudayala", "whitefield", 108);
		
		 narayana.addStaff(sheela);
		
			ramesh.addStaff(sheela);

		 narayana.addDoctor(ramesh);
	
		 
	
		 
		 long doctorCode = 200;
		 
		 System.out.println(searchDoctor(narayana,doctorCode).getStaffList());
		 
		 
		printInstruments(sheela);
	}
	
			
}
