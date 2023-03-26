import java.util.*;
public class usingTemperature {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        Temperature T1 = new Temperature();
        int menu = 0;
        boolean check = false;
        while (menu != 4) {
            System.out.println("1. Input Temperature \n2. Convert to Fahrenheit \n3. Convert to Celsius \n4. Quit");
            menu = sc.nextInt();
            switch (menu) {
                case 1: 
                check = true;
                System.out.println("Input Temperature: ");
                T1.setTemp(sc.nextDouble());
                break;
                case 2: 
                if (check = true) {
                    System.out.println(T1.toF());
                }
                break;
                case 3: 
                if (check = true) {
                    System.out.println(T1.toC());
                }
                break;
                case 4:
                break;
                default:
                System.out.println("Invalid input");
            }
        }
    }
}