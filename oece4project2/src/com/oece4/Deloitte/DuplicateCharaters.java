package com.oece4.Deloitte;

public class DuplicateCharaters {

	public static void main(String[] args) {
	      String str="Great Responsibility";
	      int count;
	      char String[]=str.toCharArray();
	      System.out.println("Duplicate characters in a given string:");
	      for(int i=0;i<str.length();i++) {
	    	  count=1;
	    	  for (int j=i+1;j<str.length();j++) {
	    		  if(String[i]==String[j]&&String[i]!=' ') {
	    			  count++;
	    			  String[j]='0';
	    			  
	    		  }
	    	  }
	    	  if (count>1 && String[i]!='0')
	    		  System.out.println(String[i]);
	      }

	}

}
