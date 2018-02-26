	import java.io.*;
	import java.util.*;
	
	public class Day7Arrays {




	    public static void main(String[] args) 
	    {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int[] arr = new int[n];
	        String nums = "";         // create empty string that we put numbers into
	        for(int i = 0; i < n; i++)
	        {
	            arr[i] = in.nextInt();  
	            nums += arr[i]; // concatenate array elements into empty string to build string
	                    
	        }
	        
	        String rev = new StringBuilder(nums).reverse().toString();  // reverse the string
	        
	        char[] result = rev.toCharArray();  // add it to a char array so we can print the string with spaces
	        int size = result.length;  // establish size for the for loop
	        
	        
	        for(int i = 0; i < size; i++) // for each element until max is reached
	        {
	            System.out.print(result[i] + " "); // print the elements of the char array with spaces
	        }
	        
	        
	        in.close();
	    }
	}


