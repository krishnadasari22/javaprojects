package com.oece2.BinarySearchTree;



public class BinarySearch {



public static void main(String[] args) { 

int[] a= {3,6,8,13,14,17,20}; 

System.out.println(binarySearch(a,14)); 

System.out.println(binarySearch(a,15)); 

} 



static int binarySearch(int[] a, int x) { 

int first = 0; 

int last = a.length-1; 

int middle = 0; 

while(first<=last) { 

middle = (first+last)/2; 

if(a[middle]==x) return middle; 

else if(a[middle]<x) first=middle+1; 

else last=middle-1; 

} 

return -1; 

}



}
