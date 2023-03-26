
public class Use_Dog
{
	public static void main (String args[])
	{
	    Dog myDog = new Dog();
	    myDog.setName("Fido");
	    
	    System.out.println (myDog.getName() + " says: ");
	    System.out.println(myDog.speak());  // inherits method speak() no overriding occurs
	    System.out.println(myDog.fetch());
	   }
}	


