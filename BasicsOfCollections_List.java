package RND_AdvanceSelenium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BasicsOfCollections_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* List Synopsis 
		 *Package --java.util.List
		 *List --Interface
		 *List-Arranged Orderly 
		 *List Allows Duplicate Value
		 *Array list & Linked List (Classes that implements the Interface List)
		 *Array -- Fixed Size for primitive datatypes (int,char) 
		 *Array-- can be single and Multi Dimension
		 *Array List --Dynamic Size (Resizeable) and allows (Object <String>,<Integer>)
		 *Array List--->Only single Dimension
		 *ArrayList --Example --> Shoes arranged in Shoe rack based on token number   ----->import java.util.ArrayList;
		 *LinkedList --Example -->Shoes arranged in order next to next  ----->import java.util.LinkedList;
		 *For removing and adding LinkedList is preferred( as per binary search it takes less time)
		 *For searching particular element Arraylist is preferred ( as per binary search it takes less time)
		 */
		 
		
		List <String> shoes = new LinkedList<>();
		shoes.add("nike");
		shoes.add("adidas");
		shoes.add("fila");
		shoes.add("adidas");
		System.out.println("Shoe rack has "  +shoes.get(0));
		for (String shoe : shoes) {
			System.out.println("Values from Linked List shoes is ---------->"+shoe);
			
		}
		
		List <String> shoes1 = new ArrayList<>();
		shoes1.add("nike");
		shoes1.add("adidas");
		shoes1.add("fila");
		shoes1.add("fila");
		System.out.println("Shoe rack has "  +shoes1.get(2));
		for (String shoe : shoes1) {
			System.out.println("Values from ArrayList  shoes1 is ---------->"+shoe);
			
		}
		
		
		

	}

}
