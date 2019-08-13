package RND_AdvanceSelenium;



import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import org.apache.commons.collections4.map.LinkedMap;


public class BasicsOfCollections_Maps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Map  Synopsis
		  
		  
		 *Map --Interface
		 *Package --java.util.Map
		 *Map --Key Value pair
		 *Map--Key value should be unique and can have duplicate values
		 *Map-->One Key can be Null 
		 *Types of Map --->Hash Map , Linked Map and Tree Map (Classes that implements the Interface Map)
		 *import java.util.HashMap--->Hash Map -- Displays the result in  random way  --> Null is accepted for key and value in HashMap 
		 *Hash Map-->Multiple Null values for key displays only one result
		 *HashMap--->Duplicate  values  for same key only one result is displayed
		 *import java.util.LinkedMap---->Displays the result in the inserted order --->Null is accepted for key and value in LinkedMap 
		 *LinkedHashset-->Multiple Null values for key displays only one result
		 *import java.util.TreeMap---->Tree set-- Displays the result in specified order--Null is not  accepted for key in Tree Map (only values can be null)
		 *Tree Map--java.lang.NullPointerException (when key value is null 
		 *TreeMap--->Multiple Null values for a key displays only one result 
		 
		*/
		 

	Map<String,String> books=new HashMap<String,String> ();
		books.put("Aristotle", "Jonathan Swift");
		books.put("Shakespeare", "Issac");
		books.put("Shakespeare", "Issac");
		books.put("Shakespeare1", "Issac1");
		books.put(null,"test123");
		books.put(null, null);
		System.out.println("Value for Hash Map is "+books.keySet()+"\n"+"--------->"+books.values());
		
		Map<String,String> books1=new LinkedMap<String,String> ();
		books1.put("Aristotle", "Jonathan Swift");
		books1.put("Shakespeare", "Issac");
		books1.put("Shakespeare", "Issac");
		books1.put("Shakespeare1", "Issac");
		books1.put(null,"test123");
		books1.put(null, null);
		System.out.println("Value for Hash Map is "+books1.keySet()+"\n"+"--------->"+books1.values());

		Map<String,String> books2=new TreeMap<String,String> ();
		books2.put("Aristotle", "Jonathan Swift");
		books2.put("Shakespeare", "Issac");
		books2.put("Shakespeare", "Issac");
		books2.put("Shakespeare1", "Issac");
		books2.put("test",null);
		books2.put("test",null);
		books2.put(null, null);
		System.out.println("Value for Hash Map is "+books2.keySet()+"\n"+"--------->"+books2.values());
		
		
		
	
		}	

	}
