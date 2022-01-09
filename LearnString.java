package Week3.Day2;

public class LearnString {
	public static void main(String[] args) {
		String s="Welcome";//String literal
		String s1="Welcome";
		String s3 = "WELCOME TO JAVA SESSION";
		String s2=new String("Welcome");
		String s4 = " Welcome   ";
		char[] ch = new char[7];
		
		//Validate if both the strings s and s1 holds the same memory
		
		System.out.println("Validate if both the strings hold the same memory");
		System.out.println(s==s1);
		System.out.println(s==s2);
		
		//Compare the value
		System.out.println("Validate if both the strings hold the same value");
		System.out.println(s.equals(s1));
		System.out.println(s.equals(s2));
		
		//Compare the value ignoring the case
		System.out.println("Validate if both the strings hold the same value ignoring the case");
		System.out.println(s.equalsIgnoreCase(s3));
		System.out.println(s.equalsIgnoreCase(s2));
		
		//Find the length of the string
		int length = s.length();
		System.out.println(length);
		
		//to convert the string to character array
		char[] charArray = s.toCharArray();
		System.out.println(charArray[0]);
		System.out.println(charArray[length-1]);
		
		//to get a specific character
		char charAt=s.charAt(2);
		System.out.println(charAt);
		
		//to get index of the specific character
		int index = s.indexOf('c');
		System.out.println(index);
		
		int index1 = s.indexOf('e');
		System.out.println(index1);//will return index of 1st e when there is duplicate
		
		//How to get part of string
		
		String substring = s.substring(3);
		System.out.println(substring);
		
		System.out.println(s.substring(3,5));
		System.out.println(s.substring(3,4));
		
		//trim the space
		System.out.println(s4.trim());
		
		//Convert string to uppercase
		System.out.println(s1.toUpperCase());
		//Convert string to lowercase
		System.out.println(s3.toLowerCase());
		
		//Split the string
		
		String[] split = s.split("");
		System.out.println(split[1]);
		
		//How to replace something in String
		
		System.out.println(s3.replace("SESSION", "class"));
		
	}

}
