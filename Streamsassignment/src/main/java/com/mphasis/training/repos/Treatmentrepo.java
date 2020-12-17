package com.mphasis.training.repos;

import java.util.List;

import com.mphasis.training.entity.Treatment;


public interface Treatmentrepo {
	
	public List<Treatment> getTreatmentdetails();
	public Treatment getTreatmentById(int id);
	public List<Treatment> getTreatmentByTreatmenttype();
	public List<Treatment> getTreatmentByAccNo();

}
