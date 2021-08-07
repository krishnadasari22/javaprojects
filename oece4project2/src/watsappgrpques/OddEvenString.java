package watsappgrpques;

import java.util.Scanner;

public class OddEvenString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		int num=sc.nextInt();
		String sa=sc.next();
		String inp[]=new String[num];
		for(int k=0;k<num;k++) {
			String string =sc.next();
			inp[k]=string;
		}
			for(String str:inp) {
				String even="";
				String odd="";
				for(int i=0;i<str.length();i++) {
					if(i%2==0) {
						even +=str.charAt(i);
					}else {
						odd +=str.charAt(i);
					}
				}
				System.out.println();
				System.out.println(even+" "+odd);
		}
	}

}
