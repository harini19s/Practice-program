package assessment;

public class Innerclasses {

	private int data=45; 
	private int t,c=23;
	
	void display()
	{
		System.out.println("i am inside the outer class method");
	}
	void add()
	{
		  t=data+c;
		  System.out.println("Total: "+t);
	  }
	 
	class Inner1{  		
	 private int data=21;
	  
	  void msg()
	  {
		  Innerclasses.this.display();
		  System.out.println("Value of data: "+data);
	  }  
	  

	  void display()
	  {
		  System.out.println("1st inner class method");
	  }
	  
	 }  
	class Inner2
	{
		int a=100;
		void msg()
		{
			Innerclasses.this.add();
			System.out.println("Value of a: "+a);
		}
		void display()
		{
			System.out.println("2nd inner class method");
		}
	}
	public static void main(String args[]){  
	  
		Innerclasses obj=new Innerclasses();   	// creating object of Outer class
	  
		Innerclasses.Inner1 in=obj.new Inner1();  	// creating object of Inner class
		Innerclasses.Inner2 i=obj.new Inner2();	// creating object of  2nd Inner class
	  in.msg();  
	  in.display(); 
	  i.msg();
	  i.display();
	  
	 }
	 
	}