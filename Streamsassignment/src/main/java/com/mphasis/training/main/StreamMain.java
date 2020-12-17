package com.mphasis.training.main;

import java.util.List;


import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.mphasis.training.entity.Treatment;
import com.mphasis.training.entity.TreatmentTable1;
import com.mphasis.training.entity.TreatmentTable2;
import com.mphasis.training.exceptions.StreamsException;
import com.mphasis.training.services.Treatment1Service;
import com.mphasis.training.services.Treatment1ServiceImpl;
import com.mphasis.training.services.Treatment2Service;
import com.mphasis.training.services.Treatment2ServiceImpl;
import com.mphasis.training.services.Treatmentservice;
import com.mphasis.training.services.TreatmentserviceImpl;

interface Cal{
	public double calc (double num1, double d2);
}

public class StreamMain {

	public static <T> void main(String[] args) throws StreamsException {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		Treatmentservice treatmentservice=new TreatmentserviceImpl();
		Treatment1Service treatment1Service=new Treatment1ServiceImpl();
		Treatment2Service treatment2Service=new Treatment2ServiceImpl();
		
		do {
			System.out.println(" \n 1.Streams To get the Treatment list"
					+ "\n 2.Streams To get the Treatment1 list."
					+ "\n 3.Streams to get first Treatment with payee Account name as Rekha"
					+ "\n 4.Streams To get the more than one account list  ."
					+ "\n 5. Implementation of find first "
					+ "\n 6. Implementation of Map functionality "
					+ "\n 7. Implementation of Flat-Map functionality "
					+ "\n 8. Implementation of predicate functionality "
					+ "\n 9. Implementation of Funtional-Interface functionality "
					+ "\n 10. Exit");
			
			switch(sc.nextInt())
			{
			case 1: System.out.println("Streams To get the Treatment list");
			  List<Treatment> treatments= treatmentservice.getTreatmentdetails();
			  treatments.forEach((c)-> System.out.println(c.getId()+" "+c.getTreatmenttype()+ 
			 " " +c.getAccNo()+" "));
			  break;
			  
			case 2: System.out.println("Streams To get the Treatment list");
			  List<TreatmentTable1> treatments1= treatment1Service.getTreatment1details();
			  treatments1.forEach((c)-> System.out.println(c.getAccNo()+" "+c. getHolidayStartDate()+ 
			 " " +c.getHolidayEndDate()+" "+c.getTreatment()));
			  break;
			  
			 case 3: System.out.println("Streams to get first Treatment with payee Account name as Rekha");
			  String PayeeAccountName=sc.next();
			  List<TreatmentTable2> Payee= treatment2Service.getByPayeeAccountName()
					  .stream().filter((b)-> b.getPayeeAccountName()
							  .equalsIgnoreCase(PayeeAccountName))
							  .collect(Collectors.toList());
			  Payee.forEach(System.out::println);
				
					  break;
					  
			 case 4: System.out.println("Streams To get more than one account list");
			  List<Treatment> x= treatmentservice.getTreatmentByAccNo();
			  x.forEach((c)-> System.out.println(c.getId()+" "+c.getTreatmenttype()+ 
			 " " +c.getAccNo()+" "));
			  List<TreatmentTable1> y= treatment1Service.getTreatmentByAccNo();
			  y.forEach((f)-> System.out.println(f.getAccNo()+" "+f.getHolidayStartDate()+ 
			 " " +f.getHolidayEndDate()+" "+f.getTreatment()));
			  List<TreatmentTable2> z= treatment2Service.getTreatmentByAccNo();
			  z.forEach((v)-> System.out.println(v.getAccNo()+" "+v.getPayeeAccountName()+ 
			 " " +v.getPayeeTerm()+" "));
			  break;
			  
			  
			 case 5: System.out.println("Implementation of find first");
			 List<TreatmentTable2> Payee1= treatment2Service.getByPayeeAccountName();
			  Optional<TreatmentTable2> result= Payee1.stream().findFirst();
			  System.out.println(result);
			   break;
			   
			 case 6: System.out.println("Implementation of Map functionality");
			
			 Map<Object, List<Treatment>> treatmentx= treatmentservice.getTreatmentdetails()
	        		  .stream().collect(Collectors.groupingBy(
	        				  l->{
								try {
									return treatmentservice.getTreatmentdetails();
								} catch (StreamsException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
								Object treatments2 = null;
								return treatments2;
							}));
	          for (Entry<Object, List<Treatment>> tech:treatmentx.entrySet()) {
	        	  System.out.println(tech.getKey());
	        	  System.out.println("The Size of the index is "+" "  +tech.getValue().size());
        	  System.out.println(tech.getValue().get(0));
        	  System.out.println(tech.getValue().get(1));
	        	  
	          }
	         
			 break;


			 case 7: System.out.println("Implementation of Flat-Map functionality");
			 List<TreatmentTable1> treatmentsy= treatment1Service.getTreatment1details();
			 treatmentsy.stream().flatMap(py -> treatmentsy.stream()) 
             .collect(Collectors.toList());
			 System.out.println("Output after using flat-map" +" " +treatmentsy);
			 break;
			 
case 8: System.out.println("Implementation of predicate functionality");
			 
//			 Predicate<T> predicatestarts= str -> str.equals("Rekha");
//			 List<TreatmentTable2> treatmentpredicate= treatment2Service.getByPayeeAccountName();
//			    List<TreatmentTable2> predicate = treatmentpredicate.stream()
//			      .filter((Predicate<? super TreatmentTable2>) predicatestarts)
//			      .collect(Collectors.toList());
			 
				
				Treatment t1=new Treatment(1, "Ortho", "MPH1234");
				Treatment t2=(new Treatment(2, "Cardiac" , "MPH1235"));
			 
			    Predicate<Treatment> predicate = (Treatment) -> (Treatment.getAccNo() == "MPH1235");
			    System.out.println("Is Account Number is = "+predicate.test(t1));
		        System.out.println("Is Account Number is = "+predicate.test(t2));
//			 
			 break;
			 
             case 9: System.out.println("Implementation of Funtional-Interface functionality");
             
             
           //anonymous class
     		Cal c1=new Cal() {
     			public double calc(double num1, double num2) {
     				return num1+num2;
     			}
     		};
     		
     		System.out.println(c1.calc(12,34));
     		
     		Cal c2=new Cal() {
     			public double calc(double num1 , double num2) {
     				return num1*num2;
     			}
     		};
     		
     		System.out.println(c2.calc(12, 34));

     	     break;
			 
			  
			
			case 10:System.out.println("Thank You");
			  sc.close();
			  System.exit(0);
			  
			
			  

			  default: System.out.println("invalid option");
			  }
		}while(true);
			  }

}
	
