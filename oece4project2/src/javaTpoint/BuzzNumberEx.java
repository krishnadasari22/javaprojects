package javaTpoint;

import java.util.Scanner;

public class BuzzNumberEx {
static boolean checkNumber(int number) {
	if(number %10==7 ||number % 7==0)
		return true;
	else 
		return false;
	}
	public static void main(String[] args) {
	int   n;
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter a number");
	n=scn.nextInt();
	if(checkNumber(n))
		System.out.println(n +" is a Buzz number");
	else
		System.out.println(n + " is not a Buzz Number");

	}

}
