package com.mphasis.training.entity;

public class TreatmentTable2 {
	
	private String AccNo;
	private String PayeeAccountName;
	private int PayeeTerm;
	private TreatmentTable1 treatmenttable1;
	
	
	public TreatmentTable2() {
		super();
		// TODO Auto-generated constructor stub
	}


	public TreatmentTable2(String accNo, String payeeAccountName, int payeeTerm, TreatmentTable1 treatmenttable1) {
		super();
		AccNo = accNo;
		PayeeAccountName = payeeAccountName;
		PayeeTerm = payeeTerm;
		this.treatmenttable1 = treatmenttable1;
	}


	public String getAccNo() {
		return AccNo;
	}


	public void setAccNo(String accNo) {
		AccNo = accNo;
	}


	public String getPayeeAccountName() {
		return PayeeAccountName;
	}


	public void setPayeeAccountName(String payeeAccountName) {
		PayeeAccountName = payeeAccountName;
	}


	public int getPayeeTerm() {
		return PayeeTerm;
	}


	public void setPayeeTerm(int payeeTerm) {
		PayeeTerm = payeeTerm;
	}


	public TreatmentTable1 getTreatmenttable1() {
		return treatmenttable1;
	}


	public void setTreatmenttable1(TreatmentTable1 treatmenttable1) {
		this.treatmenttable1 = treatmenttable1;
	}


	@Override
	public String toString() {
		return "TreatmentTable2 [AccNo=" + AccNo + ", PayeeAccountName=" + PayeeAccountName + ", PayeeTerm=" + PayeeTerm
				+ ", treatmenttable1=" + treatmenttable1 + "]";
	}


	public Object contentEquals(String payeeAccountName2) {
		// TODO Auto-generated method stub
		return getPayeeAccountName();
	}
	
	
	
	
	
	
	

}
