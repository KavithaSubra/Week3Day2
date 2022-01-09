package Week3.Day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
	public static void main(String[] args) {
		Set<String> names = new HashSet<String>();
		
		//boolean isPresent = names.add("Kavi");
		//System.out.println(isPresent);
		names.add("Raki");
		names.add("Kaushi");
		//names.add("Kavi");
		boolean isDuplicate = names.add("Kavi");
		System.out.println(names);
		System.out.println(isDuplicate);
		
		//If you want to retrieve a data, copy the data to List
		
		List<String> list = new ArrayList<String>(names);
		System.out.println(list);
		System.out.println(list.get(0));
	}

}
