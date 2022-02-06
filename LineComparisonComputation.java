package com.assignment;

import java.util.Scanner;

public class LineComparisonComputation {
	
	
	
     public  double calculateLengthLine(double x1,double x2,double y1,double y2) {
    	   double length_of_line=Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
		   return  length_of_line;
    	 
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scan= new Scanner(System.in);
       System.out.println("enter points of first line");
       System.out.println("Enter firstLine point a: ");
       double a=scan.nextDouble();
       System.out.println("Enter first point b: ");
       double b=scan.nextDouble();
       System.out.println("Enter first point c: ");
       double c=scan.nextDouble();
       System.out.println("Enter first point d: ");
       double d=scan.nextDouble();
       
       System.out.println("enter points of second line");
       System.out.println("Enter  point x1: ");
       double w=scan.nextDouble();
       System.out.println("Enter  point y1: ");
       double x=scan.nextDouble();
       System.out.println("Enter  point x2: ");
       double y=scan.nextDouble();
       System.out.println("Enter point y2: ");
       double z=scan.nextDouble();
       
       
       
       
    	   LineComparisonComputation  firstline = new LineComparisonComputation();
           LineComparisonComputation  secondline = new LineComparisonComputation();
           double length1=  firstline.calculateLengthLine(a,b,c,d);
           double length2= secondline.calculateLengthLine(w,x,y,z);
           
           System.out.println("Length of First line is"+length1 );
           System.out.println("Length of second line is"+length2);
           
           if(length1 == length2) {
        	   System.out.println("equal length of both lines");
           }
           else if(length1>length2){
        	   System.out.println("length of line1 is greater than line2");
           }
           else {
        	   System.out.println("length of line2 is greater than line1");
           }
       }
       
       
       
	}


