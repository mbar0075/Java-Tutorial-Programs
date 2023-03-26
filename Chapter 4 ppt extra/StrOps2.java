
class StrOps2 {
    public static void main(String args[]) {
	String str1 = "When it comes to Web programming, Java is #1.";
	String str2 = new String(str1);
	String str3 = "Java strings are powerful.";
	int result, idx;
	char ch;
	
	result = str1.compareTo(str3);
		if(result == 0)
		    System.out.println("str1 and str3 are equal");
		else if(result < 0)
		    System.out.println("str1 is less than str3");
		else
		    System.out.println("str1 is greater than str3"); 
		  }
}