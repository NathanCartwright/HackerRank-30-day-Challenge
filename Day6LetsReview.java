import java.util.*;
public class Day6LetsReview 
{
	
	    public static void main(String[] args)
	    {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        
	        
	        Scanner get = new Scanner(System.in);
	        int testcases = get.nextInt();
	        get.nextLine(); // allow for reading of string after reading int
	        
	       
	        String space = " ";
	        
	        while(testcases > 0)
	        {
	            
	         // word variables
	        String input = get.nextLine(); // get the string
	        char[] word = input.toCharArray();
	        int size = input.length();
	        
	        get.close();
	         // get the evens
	        
		     for(int i = 0; i < size; i = i + 2) 
		     {
		  
		      System.out.print(word[i]);
		                
		     }
		                    
		       System.out.print(space);
		        
		     // get the odds
		     for(int i = 1; i < size; i = i + 2)     
		        
		      {
		             
		        System.out.print(word[i]);
		            
		      }
		                
		         System.out.println();
		            
	            testcases--;
	        }
	          
	    }
	}
