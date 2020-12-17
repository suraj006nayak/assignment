package com.mphasis.training.services;

import java.util.List;


import com.mphasis.training.entity.TreatmentTable1;
import com.mphasis.training.exceptions.StreamsException;


public interface Treatment1Service {
	
	
	public List<TreatmentTable1> getTreatment1details() throws StreamsException;
	public List<TreatmentTable1> getTreatmentByAccNo() throws StreamsException;
	public List<TreatmentTable1> getByHolidayStartDate() throws StreamsException;
	public List<TreatmentTable1> getByHolidayEndDate() throws StreamsException;


}
