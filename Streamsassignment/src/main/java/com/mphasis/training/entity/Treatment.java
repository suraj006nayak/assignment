package com.mphasis.training.entity;


public class Treatment {
	
	private int id;
	private String treatmenttype;
	private String AccNo;
	
	
	public Treatment() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Treatment(int id, String treatmenttype, String accNo) {
		super();
		this.id = id;
		this.treatmenttype = treatmenttype;
		AccNo = accNo;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTreatmenttype() {
		return treatmenttype;
	}


	public void setTreatmenttype(String treatmenttype) {
		this.treatmenttype = treatmenttype;
	}


	public String getAccNo() {
		return AccNo;
	}


	public void setAccNo(String accNo) {
		AccNo = accNo;
	}


	@Override
	public String toString() {
		return "TreatmentTable [id=" + id + ", treatmenttype=" + treatmenttype + ", AccNo=" + AccNo + "]";
	}


	
	
	
	
	

}
