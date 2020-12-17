package com.mphasis.training.services;

import java.util.ArrayList;


import java.util.List;

import com.mphasis.training.entity.Treatment;
import com.mphasis.training.exceptions.StreamsException;


public class TreatmentserviceImpl implements Treatmentservice {
	
	static List<Treatment> treatments =new ArrayList<Treatment>();
	static{

		treatments.add(new Treatment(1, "Ortho", "MPH1234"));
		treatments.add(new Treatment(2, "Cardiac" , "MPH1235"));
//		treatments.add(new Treatment(2, "Cardiac" , "CNB1235"));
//		treatments.add(new Treatment(2, "Cardiac" , "CNB1235"));
//		treatments.add(new Treatment(2, "Cardiac" , "CNB1235"));
//		treatments.add(new Treatment(2, "Cardiac" , "CNB1235"));
//		treatments.add(new Treatment(2, "Cardiac" , "CNB1235"));
//		treatments.add(new Treatment(2, "Cardiac" , "CNB1235"));
//		treatments.add(new Treatment(2, "Cardiac" , "CNB1235"));
//		treatments.add(new Treatment(2, "Cardiac" , "CNB1235"));
//		treatments.add(new Treatment(2, "Cardiac" , "CNB1235"));
//		treatments.add(new Treatment(2, "Cardiac" , "CNB1235"));
//		treatments.add(new Treatment(2, "Cardiac" , "CNB1235"));
//		treatments.add(new Treatment(2, "Cardiac" , "CNB1235"));
//		treatments.add(new Treatment(2, "Cardiac" , "CNB1235"));
//		treatments.add(new Treatment(2, "Cardiac" , "CNB1235"));
//		treatments.add(new Treatment(2, "Cardiac" , "CNB1235"));
//		treatments.add(new Treatment(2, "Cardiac" , "CNB1235"));
//		treatments.add(new Treatment(2, "Cardiac" , "CNB1235"));
//		treatments.add(new Treatment(2, "Cardiac" , "CNB1235"));
	}

	@Override
	public List<Treatment> getTreatmentdetails() throws StreamsException {
		// TODO Auto-generated method stub
		return treatments;
	}

	@Override
	public Treatment getTreatmentById(int id) throws StreamsException {
		// TODO Auto-generated method stub
		return (Treatment) treatments;
	}

	@Override
	public List<Treatment> getTreatmentByTreatmenttype() throws StreamsException {
		// TODO Auto-generated method stub
		return treatments;
	}

	@Override
	public List<Treatment> getTreatmentByAccNo() throws StreamsException {
		// TODO Auto-generated method stub
		return treatments;
	}

}
