class StrOps {
    public static void main(String args[]) {
	String str1 = "When it comes to Web programming, Java is #1.";
	String str2 = new String(str1);
	String str3 = "Java strings are powerful.";
	int result, idx;
	char ch;
	String str4 = "Peter";
	String str5 = "Paul";
		
	System.out.println("Length of str1: " +str1.length());

	// display str1, one char at a time.
	for(int i=0; i < str1.length(); i++)
	   System.out.print(str1.charAt(i));
	   System.out.println();

		if(str1.equals(str2))
		    System.out.println("str1 == str2");
		else
		    System.out.println("str1 != str2");
		if(str1.equals(str3))
		    System.out.println("str1 == str3");
		else
		    System.out.println("str1 != str3");

		result = str4.compareTo(str5);
		if(result == 0)
		    System.out.println("str4 and str5 are equal");
		else if(result < 0)
		    System.out.println("str4 is less than str5");
		else
		    System.out.println(str4+ " is greater than "+str5); 

		// assign a new string to str2
		  str2 = "One Two Three One";
		  idx = str2.indexOf("One");
		  System.out.println("Index of first occurrence of One: " + idx);
		  idx = str2.lastIndexOf("One");
		System.out.println("Index of last occurrence of One: " + idx);
		}
}
