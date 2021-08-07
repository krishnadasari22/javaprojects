package com.oece4.cloneable;

public class Student18 implements Cloneable {  
		int rollno;  
		String name;  
		  
		Student18(int rollno,String name){  
		this.rollno=rollno;  
		this.name=name;  
		}  
		  
		public Object clone()throws CloneNotSupportedException{  
		return super.clone();  
		}  
		  
		public static void main(String args[]){  
		try{  
		Student18 s1=new Student18(101,"amit");  
		  
		Student18 s2=(Student18)s1.clone(); 
		Student18 s3=new Student18(308,"krishna");
		Student18 s4=(Student18)s3.clone();
		  
		System.out.println(s1.rollno+" "+s1.name);  
		System.out.println(s2.rollno+" "+s2.name);  
		System.out.println(s3.rollno+" "+s3.name);
		System.out.println(s4.rollno+" "+s4.name);
		  
		}catch(CloneNotSupportedException c){}  
		  
		}  
		}  

