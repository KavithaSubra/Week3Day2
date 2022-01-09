package Week3.Day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
	
		List<String> list = new ArrayList<String>();
		
		//Add values to the list
		list.add("Kavi");
		//list.add(25);
		list.add("Sari");
		list.add("Raki");
		//list.add('k');
		//list.add(true);
		
		
		System.out.println(list);
		
		//To find size of the list
		int size = list.size();
		System.out.println(size);
		
		//Retrieve data from the list
		String name = list.get(1);
		System.out.println(name);
		
		//Remove data from the list
		
		list.remove(2);
		System.out.println(list);
		
		//Verify if data is present in the list
		
		boolean isPresent = list.contains("Kavi");
		System.out.println(isPresent);
		
		//Remove all the data
	//	list.clear();
		System.out.println(list);
		
		//To confirm if the list is empty
		
		boolean empty = list.isEmpty();
		System.out.println(empty);
		
		
		List<String> newList = new ArrayList<String>();
		
		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		
		
		
}
}
