package com.springboot.dependencycheck;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Prescription {
    
	private int id;
	private String patientName;
	private List<String> medicines;

	public int getId() {
		return id;
	}
    
	//we can use required annotation only on setter methods not on variables
	@Required
	public void setId(int id) {
		this.id = id;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public List<String> getMedicines() {
		return medicines;
	}

	@Override
	public String toString() {
		return "Prescription [id=" + id + ", patientName=" + patientName + ", medicines=" + medicines + "]";
	}

	public void setMedicines(List<String> medicines) {
		this.medicines = medicines;
	}
}
