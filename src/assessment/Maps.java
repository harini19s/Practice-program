package assessment;
import java.util.*;
public class Maps {

    public static void main(String[] args) {
	        
	         HashMap<Integer,String> hm=new HashMap<Integer,String>();      
	          hm.put(1,"harini");    
	          hm.put(2,"pavi");    
	          hm.put(3,"nithya");   
	           
	          System.out.println("Hashmap Contains: ");  
	          for(Map.Entry m:hm.entrySet())
	          {    
	           System.out.println(m.getKey()+" "+m.getValue());    
	          }
	              
	          Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	          ht.put(4,"banglore");  
	          ht.put(5,"Hosur");  
	          ht.put(6,"Panruti");  
	          ht.put(7,"Chennai");  

	          System.out.println("\nHashTable Contains: ");  
	          for(Map.Entry n:ht.entrySet())
	          {    
	           System.out.println(n.getKey()+" "+n.getValue());    
	          }
	          
	          TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	          map.put(8,"kerala");    
	          map.put(9,"Pune");    
	          map.put(10,"hyderabad");       
	          
	          System.out.println("\nTreeMap  Contains: ");  
	          for(Map.Entry l:map.entrySet())
	          {    
	           System.out.println(l.getKey()+" "+l.getValue());    
	          }    
	          
	       }  
}