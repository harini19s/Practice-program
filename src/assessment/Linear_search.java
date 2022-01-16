package assessment;
public class Linear_search {
	   
public static int linearSearch(int[] arr, int key)
{    
		for(int i=0;i<arr.length;i++)
		{    
		if(arr[i] == key){    
		return i;    
		}    
		}    
		 return -1;    
}  
 public static void main(String a[])
 {    
	int[] a1= {11,23,35,61,12,1,7,};    
	int key = 11;    
	System.out.println(key+" is found at index: "+linearSearch(a1, key));    
 }

}

























































































			











