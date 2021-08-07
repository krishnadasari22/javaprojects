package whatsappgroupquestions;

import java.util.Scanner;

public class OddEvenString {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		System.out.println("enter a string");
		String str=t.next();
		String even="";
		String odd="";
		char ch[]=str.toCharArray();
		for(int i=0;i<str.length();i++) {
			if(i%2==0) {
				even +=ch[i];
			}
			else {
				odd +=ch[i];
			}
		}
		System.out.println(even+" "+odd);

	}

}
