package com.mphasis.training.services;

import java.util.Collection;

import java.util.List;

import com.mphasis.training.entity.Treatment;
import com.mphasis.training.entity.TreatmentTable2;
import com.mphasis.training.exceptions.StreamsException;


public interface Treatment2Service {
	
	public List<TreatmentTable2> getTreatment2details() throws StreamsException;
	public List<TreatmentTable2> getTreatmentByAccNo() throws StreamsException;
	public List<TreatmentTable2> getByPayeeAccountName() throws StreamsException;
	public List<TreatmentTable2> getByPayeeTerm() throws StreamsException;
	public Collection<TreatmentTable2> entrySet();


}
