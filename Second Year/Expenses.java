import java.util.*;
public class Expenses {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        
        double arrayR[][] = new double [4][4];
        for (int i = 0; i < 4; i++) {
            System.out.println("Quarter: " +(i + 1));
            System.out.println("Production: ");
            arrayR[0][i] = sc.nextDouble();
            System.out.println("Research: ");
            arrayR[1][i] = sc.nextDouble();
            System.out.println("Marketing: ");
            arrayR[2][i] = sc.nextDouble();
            System.out.println("Human Resources: ");
            arrayR[3][i] = sc.nextDouble();
        }
        
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                System.out.print(arrayR[i][j] +"   ");
            }
            System.out.println();
        }
        
        System.out.println("Per department: ");
        for (int i = 0; i <= 3; i++) {
            int counter = 0;
            for (int j = 0; j <= 3; j++) {
                counter += arrayR[i][j];
            }
            System.out.print(counter +"  ");
        }
        System.out.println("\nPer quarter: ");
        for (int i = 0; i <= 3; i++) {
            int counter = 0;
            for (int j = 0; j <= 3; j++) {
                counter += arrayR[j][i];
            }
            System.out.print(counter +"  ");
        }
    }
}