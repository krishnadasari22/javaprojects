package com.oece4.Deloitte;

import java.util.Scanner;

public class MaxRevenue {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		int row=t.nextInt();
		int col=t.nextInt();
		int arr[][]=new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j]=t.nextInt();
			}
		}
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				for(int k=0;k<col-j;k++) {
					if(arr[i][k]>arr[i][k+1]) {
						int l=arr[i][k];
						arr[i][k]=arr[i][k+1];
						arr[i][k+1]=l;
					}
				}
			}
		}
		for(int i=0;i<row;i++) {
			System.out.print(arr[i][col-1]+" ");
		}

	}

}
