package com.assignment;

public class EmployeeWageFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int wage_per_hr=20; 
         int emp_hr=0;
         int totalhr=0;
         int totalworkingdays=0;
         int total_emp_wages ;
         
         while(totalhr<=100 && totalworkingdays<20) {
        	 totalworkingdays++;
		     int attendance= (int)(Math.random() *3)+1;
	
		      switch(attendance) {
		      case 1:
		      {
			   System.out.println("Employee is present");
			   emp_hr=8;
			   break;
		       }
		       case 2:
		       {
			   System.out.println("Employee is in parttime");
			   emp_hr=4;
			   break;
		
		       }
		       case 3:
		       {
			   System.out.println("Employee is absent");
			   emp_hr=0;
			   break;
		       }
		      }
		      totalhr +=emp_hr;
		      System.out.println("Total working days"+totalworkingdays);
		      System.out.println("Total hour "+totalhr);
		  
	}
         
		  total_emp_wages= totalhr * wage_per_hr;
		  System.out.println("total empoyee wage"+total_emp_wages);
	}
}
	


