
class CallByRef {
	public static void main(String args[]) {
	
	By_Ref ob = new By_Ref(15, 20);
	System.out.println("ob.a and ob.b before call: " + ob.a + " " + ob.b);
	ob.meth(ob);
	
	System.out.println("ob.a and ob.b after call: " + ob.a + " " + ob.b);
	}
}
