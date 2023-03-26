
public class Use_Cat
{
    public static void main (String args[])
    {
        Cat myCat = new Cat();
        myCat.setName("Cha Cha");  // method setName Inherited
        System.out.println("Hi, my name is "+ myCat.getName());
        System.out.println(myCat.speak());
        // using speak() method within Cat class not Pet class since
        // it overrides the Pet class method speak()
    }
}
