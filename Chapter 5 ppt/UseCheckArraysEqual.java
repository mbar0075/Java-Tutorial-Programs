
public class UseCheckArraysEqual
{
    public static void main (String args[])
    {
        CheckArraysEqual ce =  new CheckArraysEqual();
        int[] lista1 = { 5, 10, 15, 20};
        int[] lista2 = { 5, 10, 15, 20};
         int[] lista3 = { 25, 10, 75, 20};
         int[] lista4 = {};
         
         boolean ok = ce.isEqualArrays(lista1,lista2);
         System.out.println("list are equal? "+ok);
         ok = ce.isEqualArrays(lista2,lista3);
         System.out.println("list are equal? "+ok);
         ok = ce.isEqualArrays(lista1,lista4);
         System.out.println("list are equal? "+ok);
        }
}

