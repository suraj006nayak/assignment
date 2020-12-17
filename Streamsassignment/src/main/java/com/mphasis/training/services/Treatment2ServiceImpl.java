package com.mphasis.training.services;

import java.time.LocalDate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.mphasis.training.entity.Treatment;
import com.mphasis.training.entity.TreatmentTable1;
import com.mphasis.training.entity.TreatmentTable2;
import com.mphasis.training.exceptions.StreamsException;


public class Treatment2ServiceImpl implements Treatment2Service {
	
	static List<TreatmentTable2> treatments2 =new ArrayList<TreatmentTable2>();
	static{
		
		Treatment t1=new Treatment(1, "Ortho", "MPH1234");
		Treatment t2=(new Treatment(2, "Cardiac" , "MPH1235"));
	

		TreatmentTable1 t11=new TreatmentTable1("MPH123", LocalDate.of(1993, 05, 04), LocalDate.of(1993, 05, 05),t1 );
		TreatmentTable1 t12=new TreatmentTable1("MPH124", LocalDate.of(1993, 05, 04), LocalDate.of(1993, 05, 05),t2);
		
		treatments2.add(new TreatmentTable2("MPH12", "Suraj" ,5,t11));
		treatments2.add(new TreatmentTable2("MPH13", "Janani" ,8,t12));
	
	}
	
//	static Map<String , String> treatments3 = new HashMap<>();
//	static {
//		treatments3.put("MPH12", "ORTHO : REKHA ");
//		treatments3.put("MPH13", "General : JANANI ");
//	}

	@Override
	public List<TreatmentTable2> getTreatment2details() throws StreamsException {
		// TODO Auto-generated method stub
		return treatments2;
	}

	@Override
	public List<TreatmentTable2> getTreatmentByAccNo() throws StreamsException {
		// TODO Auto-generated method stub
		return treatments2;
	}

	@Override
	public List<TreatmentTable2> getByPayeeAccountName() throws StreamsException {
		// TODO Auto-generated method stub
		return treatments2;
	}

	@Override
	public List<TreatmentTable2> getByPayeeTerm() throws StreamsException {
		// TODO Auto-generated method stub
		return treatments2;
	}

	@Override
	public Collection<TreatmentTable2> entrySet() {
		// TODO Auto-generated method stub
		return null;
	}

}
