package default_packages;

public class String_methods {
	
	public static void main(String[] args) {
		
		String s="Trendnologies";
		
		int length = s.length();
		System.out.println(length); //To check the length of String values..
		
		boolean equals = s.equals("trendnologies"); //same string value is to be given no miss match in alphabets upper and lower case
		System.out.println(equals); //To check whether given string value is equal or not..
		
		boolean equalsIgnoreCase = s.equalsIgnoreCase("trendNOlogies"); //alphabets can be given in any form
		System.out.println(equalsIgnoreCase); //to check whether given value is correct
		
		String upperCase = s.toUpperCase();
		System.out.println(upperCase);//converts values into uppercase
		
		String lowerCase = s.toLowerCase();
		System.out.println(lowerCase);//converts value into lowercase
		
		boolean startsWith = s.startsWith("Tre");
		System.out.println(startsWith);//Checks whether given values present or not and it should be same as string value no miss match in upper and lower case
		
		boolean endsWith = s.endsWith("ies");
		System.out.println(endsWith);//Checks whether given values present or not and it should be same as string value no miss match in upper and lower case
		
		boolean contains = s.contains("tre");
		System.out.println(contains);//Checks whether given values present or not and it should be same as string value no miss match in upper and lower case
		
		int indexOf = s.indexOf("T");
		System.out.println(indexOf);//shows the index position of the valiue
		
		int lastIndexOf = s.lastIndexOf("e");
		System.out.println(lastIndexOf);//shows the index position of the valiue(Trendnologies)it will take the last index value
		
		char charAt = s.charAt(3);
		System.out.println(charAt);//displays by giving index number to the values
		
		String replace = s.replace("T", "F");
		System.out.println(replace);//replace the values with new one
		
		String substring = s.substring(3);
		System.out.println(substring);//to start from which index value
		
		boolean empty = s.isEmpty();
		System.out.println(empty);//checking whether it is empty or not
		
		String concat = s.concat("class");
		System.out.println(concat);//to join with the string value
		
		
		
		
	}

}
