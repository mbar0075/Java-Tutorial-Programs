
public class Call_by_value
{
    public static void main(String args[]) {
		By_Value ob = new By_Value();
		
		int a = 15, b = 20;
		
		System.out.println("a and b before call: " +	a + " " + b);
		
		ob.meth(a, b);
		System.out.println("a and b after call: " +  a + " " + b);
	}
}
