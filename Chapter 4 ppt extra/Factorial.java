class Factorial {
// This is a recursive function.
	int factR(int n) {
		if(n==1) return 1;
		return n* factR(n-1) ;
		
	}

// This is an iterative equivalent.
	 int factI(int n) {
		int t, result;
		
		result = 1;
		for(t=1; t <= n; t++) result *= t;
			return result;
		}	
}
