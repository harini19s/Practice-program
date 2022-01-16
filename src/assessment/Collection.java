package assessment;

import java.util.*;

public class Collection {

	public static void main(String[] args) {
		//arraylist
		System.out.println("ArrayList");
		ArrayList<String> city=new ArrayList<String>();   
	      city.add("chennai");//
	      city.add("cuddalore");    	   
	      System.out.println(city);  
		
		// vector
	      System.out.println("\n");
	      System.out.println("Vector");
	      Vector<Integer> vec = new Vector();
	      vec.addElement(15); 
	      vec.addElement(30); 
	      System.out.println(vec);
		
		// linkedlist
	      System.out.println("\n");
	      System.out.println("LinkedList");
	      LinkedList<String> names=new LinkedList<String>();  
	      names.add("harini");  
	      names.add("pavi");  	      
	      Iterator<String> itr=names.iterator();  
	      while(itr.hasNext()){  
	       System.out.println(itr.next());  }
	       
	       //hashset
	       System.out.println("\n");
	       System.out.println("HashSet");
	       HashSet<Integer> set=new HashSet<Integer>();  
	       set.add(101);  
	       set.add(103);  
	       set.add(102);
	       set.add(104);
	       System.out.println(set);
	       
	       //linkedhashset
	       System.out.println("\n");
	       System.out.println("LinkedHashSet");
	       LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
	       set2.add(1);  
	       set2.add(2);  
	       set2.add(3);
	       set2.add(4);	       
	       System.out.println(set2);
	      	} 
	      }  
	
