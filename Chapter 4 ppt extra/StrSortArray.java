
public class StrSortArray {
	public static void main (String args []) {
		String a [] = {"orange", "apple", "banana", "lemon", "tomato"};
		
		int n = a.length - 1;
		for (int i = 0; i < (n - 1); i ++) 
			for (int j = 0; j < (n - i); j ++) {
				if (a[j].compareTo(a[j+1]) > 0) {
					String t = a[j];
					a[j] = a[j+1];
					a[j+1] = t;
				}
			}
			
		for (int i = 0; i < a.length; i ++) 
			System.out.println (a[i]);
	}
}
