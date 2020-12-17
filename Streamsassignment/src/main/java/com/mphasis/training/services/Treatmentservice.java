package com.mphasis.training.services;

import java.util.List;



import com.mphasis.training.entity.Treatment;
import com.mphasis.training.exceptions.StreamsException;



public interface Treatmentservice {
	
	public List<Treatment> getTreatmentdetails() throws StreamsException;
	public Treatment getTreatmentById(int id) throws StreamsException ;
	public List<Treatment> getTreatmentByTreatmenttype() throws StreamsException;
	public List<Treatment> getTreatmentByAccNo() throws StreamsException;

}
