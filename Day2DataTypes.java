import java.util.Scanner;

public class Day2DataTypes {
	
	public static void main(String[] args)
	{
		int i = 4;
		double d = 4.0;
		String s = "HackerRank ";
	
		Scanner scan = new Scanner(System.in);
		
		
    /* Declare second integer, double, and String variables. */
    int j;
    double f;
    String p;
    /* Read and save an integer, double, and String to your variables.*/
    // Note: If you have trouble reading the entire String, please go back and review the Tutorial close
    
    j = scan.nextInt();
    f = scan.nextDouble();
    scan.nextLine();
    p = scan.nextLine();
    
    scan.close();
    
    /* Print the sum of both integer variables on a new line. */
    System.out.println(i + j);
    /* Print the sum of the double variables on a new line. */
	System.out.println(d + f);
    /* Concatenate and print the String variables on a new line; 
    	the 's' variable above should be printed first. */
    System.out.println(s += p);
    
	}
}
