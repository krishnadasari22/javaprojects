package com.oece4.Deloitte;

import java.util.Scanner;

public class Range {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int l=scn.nextInt();
		int[] a=new int[1];
		
		for(int i=0;i<a.length;i++) {
			a[i]=scn.nextInt();
			}
		int s=scn.nextInt();
		int e=scn.nextInt();
		for(int i=0;i<a.length;i++) {
			if(a[i]>s && a[i]<e)
			System.out.println(a[i]);
		}
	}
	}