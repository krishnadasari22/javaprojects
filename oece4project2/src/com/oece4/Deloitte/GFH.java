package com.oece4.Deloitte;

//Simple java program to count
//number of elements with
//values in given range.
import java.io.*;

class GFH
{
	// function to count elements within given range
	static int countInRange(int arr[], int n, int x, int y)
	{
		// initialize result
		int count = 0;
		for (int i = 0; i < n; i++) {
	
			// check if element is in range
			if (arr[i] >= x && arr[i] <= y)
				count++;
		}
		return count;
	}

	// driver function
	public static void main (String[] args)
	{
		int arr[] = { 1, 3, 4, 9, 10, 3 };
		int n = arr.length;

		// Answer queries
		int i = 1, j = 4;
		System.out.println ( countInRange(arr, n, i, j)) ;
	
		i = 9;
		j = 12;
		System.out.println ( countInRange(arr, n, i, j)) ;
		
		
	}
}

//This article is contributed by vt_m
