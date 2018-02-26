import java.util.*;


public class Day8Maps {
	//Complete this code or write your own from scratch
	


	    public static void main(String[] args)
	    {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	       Map<String, Integer> phonebook = new HashMap<>();
	        
	        for(int i = 0; i < n; i++)
	        {
	            String name = in.next();
	            int phone = in.nextInt();
	            
	            phonebook.put(name,phone); // build the map using name as key and phone as value
	            
	        // Write code here
	        }
	        while(in.hasNext()){
	            String s = in.next();
	            
	        if (phonebook.containsKey(s)) {
	            //key exists
	            System.out.printf("%s=%d\n", s , phonebook.get(s));
	        } 
	            else {
	            //key does not exists
	            System.out.println("Not found");
	        }
	            
	            
	            // Write code here
	        }
	        in.close();
	    }
	}


