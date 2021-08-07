package com.oece4.Deloitte;

public class CountVowelConsonant {    
    public static void main(String[] args) {    
            
        //Counter variable to store the count of vowels and consonant    
        int vowCount = 0, conCount = 0;    
            
        //Declare a string    
        String str = "This is is a really simple sentence";    
            
        //Converting entire string to lower case to reduce the comparisons    
        str = str.toLowerCase();    
            
        for(int i = 0; i < str.length(); i++) {    
            //Checks whether a character is a vowel    
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {    
                //Increments the vowel counter    
                vowCount++;    
            }    
            //Checks whether a character is a consonant    
            else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {      
                //Increments the consonant counter    
                conCount++;    
            }    
        }    
        System.out.println("Number of vowels: " + vowCount);    
        System.out.println("Number of consonants: " + conCount);    
    }    
}   