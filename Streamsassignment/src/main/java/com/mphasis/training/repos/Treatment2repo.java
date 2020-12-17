package com.mphasis.training.repos;

import java.util.List;

import com.mphasis.training.entity.TreatmentTable2;



public interface Treatment2repo {
	
	public List<TreatmentTable2> getTreatment2details();
	public List<TreatmentTable2> getTreatmentByAccNo();
	public List<TreatmentTable2> getByPayeeAccountName();
	public List<TreatmentTable2> getByPayeeTerm();

}
