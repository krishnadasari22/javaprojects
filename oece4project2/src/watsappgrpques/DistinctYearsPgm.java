package watsappgrpques;

import java.util.HashSet;
import java.util.Set;

// Java Program to find the total
// number of distinct years
public class DistinctYearsPgm {

// function to find the total
// number of distinct years
	static int distinct_year(String str) {
		String str2 = "";

		Set<String> uniqueDates = new HashSet<>();

		for (int i = 0; i < str.length(); i++) {

			if (Character.isDigit(str.charAt(i))) {
				str2 += (str.charAt(i));
			}

			// if we found - then clear the str2
			if (str.charAt(i) == '-') {
				str2 = "";
			}

			// if length of str2 becomes 4
			// then store it in a set
			if (str2.length() == 4) {
				uniqueDates.add(str2);
				str2 = "";
			}
		}

		// return the size of set
		return uniqueDates.size();
	}

// Driver code
	static public void main(String[] args) {
		String str = "UN was established on 24-10-1945."
				+ "India got freedom on 15-08-1947.";

		System.out.println(distinct_year(str));
	}
}
