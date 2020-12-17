package com.mphasis.training.services;


import java.time.LocalDate;

import java.util.ArrayList;
import java.util.List;

import com.mphasis.training.entity.Treatment;
import com.mphasis.training.entity.TreatmentTable1;
import com.mphasis.training.exceptions.StreamsException;


public class Treatment1ServiceImpl implements Treatment1Service {
	
	static List<TreatmentTable1> treatments1 =new ArrayList<TreatmentTable1>();
	static{
		
		Treatment t1=new Treatment(1, "Ortho", "MPH1234");
		Treatment t2=(new Treatment(2, "Cardiac" , "MPH1235"));
	

		treatments1.add(new TreatmentTable1("MPH123", LocalDate.of(1993, 05, 04), LocalDate.of(1993, 05, 05),t1 ));
		treatments1.add(new TreatmentTable1("MPH124", LocalDate.of(1993, 05, 04), LocalDate.of(1993, 05, 05),t2));
	
	}

	
	@Override
	public List<TreatmentTable1> getTreatment1details() throws StreamsException {
		// TODO Auto-generated method stub
		return treatments1;
	}
	@Override
	public List<TreatmentTable1> getTreatmentByAccNo() throws StreamsException {
		// TODO Auto-generated method stub
		return treatments1;
	}
	@Override
	public List<TreatmentTable1> getByHolidayStartDate() throws StreamsException {
		// TODO Auto-generated method stub
		return treatments1;
	}
	@Override
	public List<TreatmentTable1> getByHolidayEndDate() throws StreamsException {
		// TODO Auto-generated method stub
		return treatments1;
	}
	
}
