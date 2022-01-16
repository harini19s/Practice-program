package assessment;

public class exceptions {
	  
	  
	   static void validate(int age)throws InvalidAgeException
	   {  
	     if(age<18)  
	      throw new InvalidAgeException("Not valid");  
	     else  
	      System.out.println("Valid to vote");  
	   }  
	     
	   public static void main(String args[])
	   {  
	      try
	      {  
	        validate(21);  
	      }
	      catch(Exception m)
	      {
	    	  System.out.println("Exception occured: "+ m.getMessage());
	      } 
	      finally
		  {
			  System.out.println("Finally block is always executed");
		  } 
	  
	      System.out.println("Rest of the code...");  
	  }  
	}  

class InvalidAgeException extends Exception
{ 
	
	InvalidAgeException(String s)
	{  
	  super(s);  
	 }  
}