package com.oece2.Arrays;

import java.util.Arrays;


import java.util.Scanner;



public class Demo1 {



public static void main(String[] args) { 

Scanner scn=new Scanner(System.in); 

System.out.println("enter element and index "); 

int ele = scn.nextInt(); 

int index=scn.nextInt(); 

int[] a= {4,5,6,7,8,9,0,0,0}; 



System.arraycopy(a, index, a, index+1, a.length-index-1); 

a[index]=ele; 

System.out.println(Arrays.toString(a)); 

scn.close(); 

scn=null;



}



}