/* 
*  Author: Dustin Kerrigan 
*  Title  : Stat calculator
*  
*  Calculates number statistics.Runs until user chooses "exit".  
*/ 
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
/** 
 * Calculates number statistics. 
*/
public class Project1_n01492251 {
	/** 
	   * Calculates lowest value in array. 
	* @param user given array.  
	* @return Lowest value in the array. 
	*/ 
	public static int minValue(int []nums) {
		int minimum =  nums[0];
			
			for(int i = 0; i < nums.length; i++)
			{
				if(nums[i] < minimum)
				{
						minimum = nums[i];
				}
			}
		return minimum;
	}
	/** 
	   * Calculates highest value in array. 
	* @param user given array. 
	* @return Highest value in array. 
	*/ 
	public static int maxValue(int []nums) {
		int maximum =  0;
				
			for(int i = 0; i < nums.length; i++)
			{
					if(nums[i] > maximum)
					{
						maximum = nums[i];
					}
			}
		return maximum;
	}
	/** 
	   * Counts amount of integers in array. 
	* @param user given array. 
	* @return Amount of integers in array. 
	*/ 
	public static int listCounter(int []nums) {
		int count = 0;
		
			for(int i = 0; i < nums.length; i++)
			{ 
				count++; 
			}
			
	    return count;	
	}
	/** 
	   * Calculates the distance between highest value and lowest value. 
	* @param user given array. 
	* @return Range of the array. 
	*/ 
	public static int calcRange(int[]nums) {
		int range = 0; 
		int minimum = nums[0]; 
		int maximum = 0; 
		
			for(int i = 0; i < nums.length; i++) //uses minimum value loop
			{
				if(nums[i] < minimum)
				{
				minimum = nums[i];
				}
			}
		
			for(int i = 0; i < nums.length; i++) //uses maximum value loop
			{
				if(nums[i] > maximum)
				{
				maximum = nums[i];
				}
			}
		
		range = maximum - minimum; 
		
		return range; 
	}
	/** 
	   * Calculates the median of the number list. 
	* @param user given array. 
	* @return Median. 
	*/ 
	public static double calcMedian(int []nums) {
		double median = 0; 
		int size = nums.length; 
		
		Arrays.sort(nums); //sort method puts array in order for straight forward calculation
		
		median = (nums[size/2] + nums[(size-1)/2]) / 2.0;
			
		return median; 
	}
	/** 
	   * Calculates the average of the number list. 
	* @param user given array. 
	* @return Mean. 
	*/ 
	public static double calcMean(int []nums) {
		double count = 0.0; 
		double sum = 0.0; 
		
			for(int i = 0; i < nums.length; i++) //counts number of integers
			{
				count++; 
			}
			
			for(int i = 0; i < nums.length; i++) //calculates sum
			{
				sum += nums[i]; 
			}
	    
		double mean = sum / count; 
		
		return mean; 
	}
	/** 
	   * Calculates the integer that occurs most in the number list."No mode" displayed if numbers occur same amount. 
	* @param user given array. 
	* @return Mode if number occurs more than once."No mode" if no number occurs more than once. 
	*/ 
	public static String calcMode(int []nums) {
		 String m = "None";
		 int k = 0;
		 int n = 0;
		 
		    for (int i = 0; i < nums.length; i++)
		    {
		        n = 1;
		        for (int j = i; j < nums.length; j++)
		        {
		            if (nums[i] == nums[j]) //checks each element to see if equal
		            {
		                n = n+1;
		            }
		        }
		        if (n > k)
		        {
		            m = "" + nums[i]; //string return type requires ""
		            k = n;
		        }
		        else if (k == n)
		        {
		            m = m + ", " + nums[i];
		        }
		    }
		    
		    if(k == 2)
		    {
		    	return "No Mode"; //String return type allows no mode to be directly returned
		    }
		    
		 return m;
	      
	}
	/** 
	   * Calculates the population variance. 
	* @param user given array. 
	* @return Variance. 
	*/ 
	public static double calcVariance(int []nums) {
		double mean = 0.0;
		
			for (int i = 0; i < nums.length; i++)
			{
		        mean += nums[i];
			}
			
		mean /= nums.length;

		double variance = 0;
		
			for (int i = 0; i < nums.length; i++)
			{
		    variance += Math.pow(nums[i] - mean, 2); //subtracts average from range and squares it
			}
			
		variance /= nums.length;  
		
		return variance; 
	}
	/** 
	   * Calculates the standard deviation. 
	* @param user given array. 
	* @return Standard deviation. 
	*/ 
	public static double calcStd(int []nums) {
		double mean = 0.0;
		
			for (int i = 0; i < nums.length; i++) //uses variance method to allow for easy deviation calculation
			{
				mean += nums[i];
			}
		
	    mean /= nums.length;

	    double variance = 0;
	
			for (int i = 0; i < nums.length; i++)
			{
				variance += Math.pow(nums[i] - mean, 2);
			}
		
		variance /= nums.length;   
		
		double std = Math.sqrt(variance); //standard deviation = the square root of variance
		
		return std;
	}
	/** 
	   * Displays list in order from least to greatest. 
	* @param user given array. 
	* @return Array sorted as a string. 
	*/ 
	public static String orderedList(int []nums) {
		Arrays.sort(nums);
		
		String result = Arrays.toString(nums); 
		
		return result; 
	}
	/** 
	   * Calculates amount of even numbers in array. 
	* @param user given array. 
	* @return Even number count. 
	*/ 
	public static int evenCount(int []nums) {
		int count = 0;
		
			for(int i = 0; i < nums.length; i++)
			{
				if(nums[i] % 2 == 0)
				{
					count++; 
				}
			}
		
		return count;
	}
	/** 
	   * Calculates amount of odd numbers in the array. 
	* @param user given array. 
	* @return Odd number count. 
	*/ 
	public static int oddCount(int []nums) {
        int count = 0;
		
			for(int i = 0; i < nums.length; i++)
			{
				if(nums[i] % 2 != 0)
				{
				count++; 
				}
			}
		
		return count;
	}
	/** 
	   * Counts amount of prime numbers in the array. 
	* @param user given array. 
	* @return Prime number count. 
	*/ 
	public static int primeCount(int []nums, int n) {
		int primeCount = 0;
	    boolean flag = true;
	    
	    	for (int i = 0; i < n; i++) //loop checks each element
	    	{
	    		if (nums[i] == 2)
	    		{
	    			primeCount++;
	    		}
	    		else if (nums[i] > 2)
	    		{
	    			flag = false; //boolean flag keeps track of primes
	        	
	    			for (int j = 2; j < nums[i]; j++) //begins at 2 since 0 and 1 are not prime 
	    			{
	    				if (nums[i] % j == 0)
	    				{
	    					break; 
	    				}
	    				else
	    				{
	    					flag = true; //if not divisible flag is set to true which increments prime count
	    				}
	    			}
	            if (flag == true)
	                primeCount++;
	           }
	        }

	    return primeCount;
	
	}

	public static void main(String[] args) { //main method
		Scanner scnr = new Scanner(System.in);	
			
		System.out.println("Enter list of integers seperated by spaces");
		
		String input = scnr.nextLine();  //Declares users array as input 
		
		StringTokenizer strToken = new StringTokenizer(input); //Allows input to be taken as a string
		
		int count = strToken.countTokens(); //counts amount of elements in users array
		
		int[] userNums = new int[count]; 
		
		for(int i = 0; i < count;i++) //loop parses each string into integer 
		{ 
			userNums[i] = Integer.parseInt((String)strToken.nextElement()); 
		}
		
		String menuSelect = ""; 
		
		while(!menuSelect.equals("exit")) //menu loops until user selects "exit"
		{  
		System.out.println();
		System.out.println("Please make a selection:");
		System.out.println("1) Display List Statistics ");
		System.out.println("2) Display List Ordered");
		System.out.println("3) Number of Odd/Even");
		System.out.println("4) Check for Prime Numbers");
		System.out.println("5) Enter New List");
		System.out.println("exit) Quit Program ");
		
		menuSelect = scnr.next(); //users menu selection is assigned 
		

		switch (menuSelect) //Displays menu options
		{
		
		  case "1":  //option calls all statistics methods
		    System.out.println("Min: " + minValue(userNums));
		    System.out.println("Max: "+ maxValue(userNums)); 
		    System.out.println("Count: "+ listCounter(userNums));
		    System.out.println("Range: "+ calcRange(userNums)); 
		    System.out.println("Median: "+ calcMedian(userNums));
		    System.out.printf("Mean: "+ "%.3f",calcMean(userNums)); 
		    System.out.println(); 
		    System.out.println("Mode: "+calcMode(userNums));
		    System.out.printf("Variance: "+ "%.2f",calcVariance(userNums));
		    System.out.println(); 
		    System.out.printf("Standard Deviation: "+ "%.2f", calcStd(userNums));
		    System.out.println();
		    break;
		  case "2": //calls ordered list method 
		     System.out.println(orderedList(userNums));
		    break;
		  case "3": //calls even / odd methods
		    System.out.println("Number Even: "+ evenCount(userNums));
		    System.out.println("Number Odd: "+ oddCount(userNums));
		    break;
		  case "4": //calls prime number counter method
		    System.out.println("Number of Prime in list: "+primeCount(userNums, userNums.length));
		    break;
		  case "5":  //uses same process as original user input to store new into userNums and allows all options to be executed with new list
		    System.out.println("Enter list of integers seperated by spaces");
		    
		    input = "" + scnr.nextInt();
		    
		    input += scnr.nextLine(); 
		  
		    strToken = new StringTokenizer(input); 
		    
		    count = strToken.countTokens();
		    
		    userNums = new int[count]; 
		    
		    for(int i = 0; i < count;i++) 
			{ 
				userNums[i] = Integer.parseInt((String)strToken.nextElement()); 
			}
		    break;
		  case "exit": //option terminates program and displays closing message
		  System.out.println("Program Exiting");
		    break;
		 
		}
		}
		
		scnr.close(); 
	}

}
