package com.yash.patient.Object;

public class PatientClass {

	String patientName;
	double height;
	double weight;

	public PatientClass(String patientName, double height, double weight) {

		this.patientName = patientName;
		this.height = height;
		this.weight = weight;
	}

	public double compBMI() {

		double BMI = (weight / (height * height));

		return BMI;
	}

	public static void main(String[] args) {
		PatientClass p = new PatientClass("Yash", 8.5, 50);
		System.out.println("Patient-Name :" + p.patientName + " BMI -" + p.compBMI());
	}
}