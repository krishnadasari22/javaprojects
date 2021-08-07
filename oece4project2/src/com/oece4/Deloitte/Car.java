package com.oece4.Deloitte;

import java.util.Scanner;
public class Car {

	public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	String[] Strarr=new String[6];
	System.out.println("enter values");
	for(int i=0;i<Strarr.length;i++) {
	Strarr[i]=scn.next(); } 
	String s2=" ";
	int count=0;
	for(String str:Strarr) {
		
	if(s2.indexOf(str)==-1) 
		s2+=str;
	else {
		
	count++;
		System.out.println(str+" ");
	}
	}
	if(count==0) {
		System.out.println("NA");
	}
	}
}