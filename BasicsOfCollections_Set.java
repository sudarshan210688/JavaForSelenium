package RND_AdvanceSelenium;


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class BasicsOfCollections_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Set  Synopsis
		  
		  
		 *Set --Interface
		 *Package --java.util.Set
		 *Set --Not arranged in Orderly fashion 
		 *Set-- Values should be unique
		 *Types of Set --->Hash set , Linked Set and Tree Set (Classes that implements the Interface Set)
		 *import java.util.HashSet--->Hash Set -- Displays the result in  random way  --> Null value is accepted in HashSet
		 *Hash Set--->Duplicate value is printed only once
		 *import java.util.LinkedHashSet---->Linked Hash Set --Displays the result in the inserted order --->Null value is accepted in LinkedHashSet
		 *LinkedHashset-->Duplicate value is printed only once
		 *import java.util.TreeSet---->Tree set-- Displays the result in specified order--Null value is accepted in TreeSet
		 *TreeSet-->Duplicate value is printed only once
		 
		 */
		 

		Set<String> books=new HashSet<String> ();
	    books.add("book1");
		books.add("book6");
		books.add("book9");
		books.add("book10");
		books.add("book10");
		books.add("book10");
		books.add("");
		for (String book : books) {
			System.out.println("value of books are displayed in random order ---->" +book);
			
		}
		
		Set<String> books1=new LinkedHashSet<String> ();
		
		books1.add("book1");
		books1.add("book3");
		books1.add("book5");
		books1.add("book10");
		books1.add("book10");
		books1.add("book10");
		books1.add("");
		for (String book : books1) {
			System.out.println("value of books are dispalyed in inserted order ---->" +book);
			
		}
		
	Set<String> books2=new TreeSet<String> ();
		
		books2.add("book1");
		books2.add("book2");
		books2.add("book5");
		books2.add("book9");
		books2.add("book3");
		books2.add("book6");
		books2.add("book8");
		books2.add("book8");
		books2.add("");
		books2.add("");
		for (String book : books2) {
			System.out.println("value of books are dispalyed in Specified order ---->" +book);
			
	
		}	

	}

}
