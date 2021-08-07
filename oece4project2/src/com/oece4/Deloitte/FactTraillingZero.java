package com.oece4.Deloitte;

import java.io.*;

public class FactTraillingZero {

	public static void main(String[] args) {
		int num=5;
		System.out.println(factorial(num));
		System.out.println(numZeros(num));
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int fact;
		int answer;
		try {
		int number=Integer.parseInt(br.readLine());
		fact=factorial(number);
		answer=numZeros(fact);
		}
		catch(NumberFormatException|IOException e) {
			e.printStackTrace();
			
			
		}

	}

     public static int factorial(int num) {
    	 int total=1;
    	 for(int i=1;i<=num;i++) {
    		 total*=i;
    		 
    	 }
    	 return total;
     }
    	 public static int numZeros(double fact) {
    		 int count=0;
    		 int last=0;
    		 while(last==0) {
    			 last=(int)(fact%10);
    			 fact=fact/10;
    			 count++;
    		 }
    		 return count;
    	 }
     }

