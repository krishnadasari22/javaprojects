package com.oece4.Deloitte;

import java.util.Scanner;
public class Energy {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int s=scn.nextInt();
		int b=scn.nextInt();
		int c=scn.nextInt();
		int i=1;
		while(i<c) {
			s+=b;
			i++;
	}
		System.out.println(s);

}
}