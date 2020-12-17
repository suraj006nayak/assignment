package com.mphasis.training.repos;

import java.util.List;

import com.mphasis.training.entity.TreatmentTable1;



public interface Treatment1repo {
	
	public List<TreatmentTable1> getTreatment1details();
	public List<TreatmentTable1> getTreatmentByAccNo();
	public List<TreatmentTable1> getByHolidayStartDate();
	public List<TreatmentTable1> getByHolidayEndDate();


}
