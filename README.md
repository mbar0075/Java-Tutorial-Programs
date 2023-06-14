# Java-Tutorial-Programs
 
# Author
**Matthias Bartolo 0436103L**

## Preview:
```java
import java.util.*;
public class BinarySearch
{
    public static void main( String args[]){
        Scanner sc = new Scanner(System.in);
        int num[]= {1, 2, 4, 8, 16, 32, 64, 128, 256};
        int size = num.length;

        System.out.println("Input number ");
        int input = sc.nextInt();
        int check = search(num,0,8,input);
        if(check==-1)
            System.out.println("Not found ");
        else
            System.out.println("found in location "+check);
    }

    public static int search(int[] a, int first, int last, int key)
    {
        int result = 0;

        if (first > last)
            result = -1;
        else
        {
            int mid = (first + last)/2;

            if (key == a[mid])
                result = mid;
            else if (key < a[mid])
                result = search(a, first, mid - 1, key);
            else if (key > a[mid])
                result = search(a, mid + 1, last, key);
        }
        return result;
    }

}
```

## Description of Task:
This project involved a thorough investigation and practical application of diverse programming concepts, algorithms, and data structures. It aimed to enhance understanding and proficiency in fundamental programming principles. The tasks were completed using **Java** and were designed to provide practice and proficiency at both the **Ordinary** and **Advanced levels** examinations. The project focused on the following key areas:

**1. Arrays:** Understanding and manipulation of arrays, including indexing, element access, and array operations. <br>
**2. Searches:** Implementation of search algorithms to efficiently locate specific elements within arrays or data structures. <br>
**3. Sorting:** Application of sorting algorithms to arrange elements in a specific order, enhancing data organization and retrieval. <br>
**4. Classes and Objects:** Utilization of object-oriented programming principles through the creation and utilization of classes and objects. <br>
**5. Instantiation:** The process of creating instances (objects) of a class, allowing for multiple copies with their own unique characteristics. <br>
**6. Methods:** Implementation of methods within classes to encapsulate reusable code and perform specific tasks. <br>
**7. Method Overloading:** Defining multiple methods within a class with the same name but different parameters, providing versatility and flexibility in method usage. <br>
**8. Method Overriding:** Redefining inherited methods from parent classes in child classes to modify their behavior. <br>
**9. Inheritance:** Establishing relationships between classes to inherit properties and behaviors from a parent class to child classes. <br>
```java
public class Car extends Vehicle1
{
    private String fuel;

    public Car (Person theOwner, String brand, String mudel, String regno,String f_type) {
        super(theOwner,brand,mudel,regno);
        fuel=f_type;
    }

    public String toString(){
        return super.toString()+" \n"+fuel;
    }

    public void writeFuel(){
        System.out.println(fuel);
    }

    public void change_car_owner (Person owner){
        super.owner = this.owner;
    }
}
```
**10. Polymorphism:** Employing polymorphic behavior through method overriding and dynamic binding, enabling flexibility in method execution. <br>
**11. Abstract Classes:** Defining abstract classes with abstract methods that require implementation in derived classes, enforcing common behavior among related classes. <br>
**12. Exception Handling:** Implementing mechanisms to handle and manage exceptional situations or errors during program execution. <br>
**13. Constructor Overloading:** Defining multiple constructors within a class with different parameters, facilitating the creation of objects with various initializations. <br>
**14. Creation of Administrative Systems:** Developing administrative systems, such as *Class Marks* and *Booking* systems, to manage and organize data effectively. <br>
**15. Creation of Games:** Designing and implementing games, such as *Hangman*, to engage users and provide interactive experiences. <br>
**16. ArrayLists:** Utilizing ArrayLists, a dynamic data structure, to store and manipulate collections of objects efficiently. <br>

```java
import java.util.ArrayList;

public class Beatles
{
   //-----------------------------------------------------------------
   //  Stores and modifies a list of band members.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      ArrayList band = new ArrayList();

      band.add ("Paul");
      band.add ("Pete");
      band.add ("John");
      band.add ("George");

      System.out.println (band);

      int location = band.indexOf ("Pete");
      band.remove (location);

      System.out.println (band);
      System.out.println ("At index 1: " + band.get(1));

      band.add (2, "Ringo");

      System.out.println (band);
      System.out.println ("Size of the band: " + band.size());
   }
}
```
<br>

**Special recognition and appreciation** are extended to [Mr. Raymond Cuschieri](https://www.um.edu.mt/profile/raymondcuschieri) for his invaluable guidance, support, and dedication in imparting these fundamental programming principles and fostering the growth of programming skills. The knowledge and skills gained from this project have laid a strong foundation for further learning and application in practical programming scenarios.




## Deliverables:
The repository includes:<br />
Various Different Java Tutorial Programs constructed in practice for the Ordinary and Advanced level examinations.<br />
