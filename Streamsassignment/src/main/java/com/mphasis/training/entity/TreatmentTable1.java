package com.mphasis.training.entity;


import java.time.LocalDate;


public class TreatmentTable1 {
	
	private String AccNo;
	private LocalDate HolidayStartDate;
	private LocalDate HolidayEndDate;
	private Treatment treatment;
	
	
	public TreatmentTable1() {
		super();
		// TODO Auto-generated constructor stub
	}


	public TreatmentTable1(String accNo, LocalDate holidayStartDate, LocalDate holidayEndDate, Treatment treatment) {
		super();
		AccNo = accNo;
		HolidayStartDate = holidayStartDate;
		HolidayEndDate = holidayEndDate;
		this.treatment = treatment;
	}


	public String getAccNo() {
		return AccNo;
	}


	public void setAccNo(String accNo) {
		AccNo = accNo;
	}


	public LocalDate getHolidayStartDate() {
		return HolidayStartDate;
	}


	public void setHolidayStartDate(LocalDate holidayStartDate) {
		HolidayStartDate = holidayStartDate;
	}


	public LocalDate getHolidayEndDate() {
		return HolidayEndDate;
	}


	public void setHolidayEndDate(LocalDate holidayEndDate) {
		HolidayEndDate = holidayEndDate;
	}


	public Treatment getTreatment() {
		return treatment;
	}


	public void setTreatment(Treatment treatment) {
		this.treatment = treatment;
	}


	@Override
	public String toString() {
		return "TreatmentTable1 [AccNo=" + AccNo + ", HolidayStartDate=" + HolidayStartDate + ", HolidayEndDate="
				+ HolidayEndDate + ", treatment=" + treatment + "]";
	}
	
	
	
	
	

}
