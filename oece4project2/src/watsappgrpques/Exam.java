package watsappgrpques;

import java.util.Arrays;
import java.util.Scanner;

public class Exam {
	static int Croma=0;
	static int VGP=0;
	static int Vivek=0;
	static int Giria=0;
	static int Pal=0;
	
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String item="";
		System.out.println("Dear Mr.Ahmed the list of items available are:");
		System.out.println("LED TV");
		System.out.println("Home Theatre");
		System.out.println("Multi Door Refrigerator");
		System.out.println("Music System");
		System.out.println("Dear Mr.Ahmed, kindly list the items you want to buy");
		do
		{
			switch(item)
			{
			case "LED TV":
				Croma+=250000;
				VGP+=175000;
				Vivek+=225000;
				Giria+=255000;
				Pal+=240000;
				 break;
			case "Home Theatre":
				Croma+=600000;
				VGP+=625000;
				Vivek+=550000;
				Giria+=700000;
				Pal+=650000;
				 break;
			case "Multi Door Refrigerator":
				Croma+=150000;
				VGP+=250000;
				Vivek+=175000;
				Giria+=142000;
				Pal+=165000;
				 break;
			case "Music System":
				Croma+=90000;
				VGP+=99999;
				Vivek+=115000;
				Giria+=125000;
				Pal+=97000;
				 break;
				 
		}
			item="";
			item=scn.nextLine();
		}while(!item.equals(""));
		
		long[] arr= {Croma,VGP,Vivek,Giria,Pal}; 
		
		
		Arrays.sort(arr);
		
		if(arr[4]==Croma)
		{
			System.out.println("Mr.Ahmed,you can buy from Croma at cost of"+arr[4]);
		}
		if(arr[4]==VGP)
		{
			System.out.println("Mr.Ahmed,you can buy from VGP at cost of"+arr[4]);
		}
		if(arr[4]==Vivek)
		{
			System.out.println("Mr.Ahmed,you can buy from Vivek at cost of"+arr[4]);
		}
		if(arr[4]==Giria)
		{
			System.out.println("Mr.Ahmed,you can buy from Giria at cost of"+arr[4]);
		}
		if(arr[4]==Pal)
		{
			System.out.println("Mr.Ahmed,you can buy from Pal at cost of"+arr[4]);
		}
		
	
	
	}
	
}