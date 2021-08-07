package com.oece4.Deloitte;

import java.util.Scanner;
public class SumOfNumbers {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int i=scn.nextInt();
		int[] a=new int[i];
		for(int i=0;i<a.length;i++) {
			a[i]=scn.nextInt();
		}
		int sum=0;
		for(int b:a) {
			while(b>0) {
			int s=b%10;
			sum+=s;
			b/=10;
		}
			System.out.println(sum);
		}
	}

}