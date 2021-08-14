package marianne;

import java.util.Arrays;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		int [] ages = {3,9,23,64,2,8,28,93};
		
		//Subtract the value of the first element from the value of the last element
		
		int subtraction1 = ages[ages.length-1] - ages[0];
		System.out.println(subtraction1);
		
		// Add a new element to the ages array 
	
		int [] newArray = new int [ages.length + 1];	
		for (int i =0; i< ages.length; i++)
		{
			newArray[i] = ages[i];		
		}
	     newArray[8] = 50;
	     
	     /* check of subtraction we calculated in the first array still working after
	      * changing the length of the array 
	      */
	   
	     int subtraction2 = newArray[newArray.length-1] - ages[0];
		 System.out.println(subtraction2);
		 
		 // Calculate the average of the new age array (after adding the element)
		 
		 int sum = 0;
		 for (int x : newArray)
		 {
	    	 sum+=x;   	 
	     }
	 
		int average = sum/newArray.length;
	    System.out.println(average); 
    
	    // create an array of strings, calculate the average number of letters per name, and concatenate all names with space between them
	    
	    String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
	    int total =0;
	    int averagePerName = 0;
	    for (String name : names)
	    {
	    	total+= name.length();
	    	averagePerName = total/names.length;
	    }
	    System.out.println(averagePerName);
	    
	    for (String name : names) {
	    	System.out.print (name + " ");
	    }
	    
	    // Access the last and first element of the names array
	    
	    System.out.println(names[names.length -1]);
	    System.out.println(names[0]);
	    
	    // Create a new array of int called nameLengths. Iterate over the previously created names array and add the length of each name to the nameLengths array
	    
	    int [] namesLengths = new int[names.length];
	    
	    for (int i=0; i<names.length;i++) 
	    {
	    	namesLengths[i] = names[i].length();
	    }
	    
	    //Iterate over the nameLengths array and calculate the sum of all the elements in the array
	    
	    int sumOfElements =0;
	    for (int i=0; i< namesLengths.length; i++) {
	    	sumOfElements+=namesLengths[i];
	    }
	    
	    // Local variables
	    
	    double [] elements = {4.3, 3.1, 2.6};
	    double [] numbers = {5.0, 6.8};
	    boolean isHotOutside = true;
	    double moneyInPocket = 11.50;
	    String [] words = {"apple", "banana","oranges"};
	    
	    // Calling methods
	    
	    System.out.println(sumOfElements);    
	    System.out.print(repeatString("Hello",3));
	    System.out.println(fullName("Michael", "Thomas"));
	    System.out.println(isSum(namesLengths));
	    System.out.println (average(elements));
	    System.out.println (isAverage(elements, numbers));
	    System.out.println (willBuyDrink(isHotOutside, moneyInPocket));
	    System.out.println(longestWord(words));
	    
	}	
	
	// a method that returns a string concatenated to itself n number of times
	
	public static String repeatString(String word, int n) {
		String result ="";
		while (n > 0) {
			result+= word;
			n--;
		}
		return result;
	}
	
	// a method that takes first and last name and returns a full name 
	
	static String fullName (String firstName, String lastName) {
		return firstName + " " + lastName;
	}
	
	// a method that takes an array of int and returns true if the sum of all elements of the array is greater than 100
	
	static boolean isSum (int[] nums) {
		int sum =0;
		for (int num : nums) {
			sum+=num;
		}
		if (sum > 100) {
			return true;
		}
		else {
			return false;
		}
	}
	
	// a method that returns an average of all elements in an array of double 
	
	static double average (double[] doubles) {
		double sum = 0;
		for (double x : doubles) {
			sum += x;
		}
		return sum/doubles.length;
	}
	
	// a method that compares the average of all elements in 2 arrays of double and returns true if the average of the first array is greater than the average of the second array
	
	static boolean isAverage (double[] arr1, double[] arr2) {
		int sum1 =0;
		int average1 =0;
		for (double x : arr1) {
			sum1 += x;
			average1 += (sum1 /arr1.length);			
		}
		
		int sum2 =0;
		int average2 =0;
		for (double y: arr2) {
			sum2 += y;
			average2 += (sum2/arr2.length);
		}
		
		if (average1 > average2) {
			return true;
		} else {
			return false;
		}
		
	}
	
	// a method that checks if two variables meet the conditional statement
	
	static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside && moneyInPocket > 10.50) {
			return true;
		} else {
			return false;
		}
	}
	
	// a method that returns the longest word in an array of words
	
	static String longestWord (String [] words) {
		String longestWord = "";
		for (String word : words) {
			if (word.length() > longestWord.length()) {
				longestWord = word;
			}
		}
		return longestWord;
	}
}
	

 
