import java.util.*;

	
public class Day3IntrotoConditionals {

	   public static void main(String[] args) {
	      Scanner scan = new Scanner(System.in);
	      int n = scan.nextInt(); 
	      scan.close();
	      String ans="";
	          
	      // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
	      if(n%2==1) // odd in general
	      {
	          ans = "Weird";
	      }
	       
	      if(n%2==0 && n>20) // even and greater than 20 
	      {
	          ans = "Not Weird";
	      }
	       
	      if(n%2==0 && 2 <= n && n <=5 ) // from 2 to 5 and even
	      {
	          ans = "Not Weird";
	      }
	       
	      if(n%2==0 && 6 <= n && n <=20) // from 6 to 20 and even
	      {
	          ans = "Weird";
	      }
	      else{
	         // Complete the code 
	      }
	      System.out.println(ans);
	   }
	}

