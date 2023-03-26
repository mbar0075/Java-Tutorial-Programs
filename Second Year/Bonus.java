import java.util.*;
public class Bonus{
    public final static int UNITS_PT = 250;
    public final static int UNITS_FT = 700;
    public final static double SALES_BONUS = 5000.0;
    public final static double SALES_BONUS_RATE = 0.05;
    public final static double SALES_UNIT_REG = 20.0;
    public final static double SALES_UNIT_EXTRA = 10.0;
    public final static int SALES_UNIT_BONUS = 25;
    public final static double PARTS_BONUS = 0.1;

    public static void main(String[] args) {
        Scanner keysIn = new Scanner(System.in);
        System.out.println("Enter department: ");
        int dept = keysIn.nextInt();
        double bonus = 0;
        switch (dept){
            case 1:
            System.out.print("Enter sales: ");
            double sales = keysIn.nextDouble();
            bonus = getBonus(sales);
            break;
            case 2:
            System.out.print("Enter number of units sold: ");
            int numUnits = keysIn.nextInt();
            bonus = getBonus(numUnits);
            break;
            case 3:
            System.out.print("Enter # of pieces completed: ");
            int pieces = keysIn.nextInt();
            System.out.print("Full-time (1) or Part-Time (2)? ");
            int empType = keysIn.nextInt();
            int bonusLimit = (empType == 1) ? UNITS_FT : UNITS_PT;
            bonus = getBonus(pieces, bonusLimit);
            break;
            default:
            System.out.print("Error! ");
        }
        System.out.printf("Bonus Amount: €%.2f%n", bonus);
    }

    private static double getBonus(double sales){
        double bonus=0;
        if(sales>5000)
            bonus=sales*0.05;
        return bonus;
    }

    private static double getBonus(int NumUnits){
        double bonus=0;
        if(NumUnits>=25)
            bonus=NumUnits*30;
        else if(NumUnits!=0)
            bonus=NumUnits*20;  
        return bonus;
    }

    private static double getBonus (int pieces, int bonusLimit) {
        double bonus=0;
        if (bonusLimit == UNITS_FT) {
            System.out.println("ok");
            System.out.println(pieces);
            if (pieces >= UNITS_FT) {
                System.out.println("ok");
                bonus = (PARTS_BONUS) * pieces;
            } 
        } else if (bonusLimit == UNITS_PT) {
            if (pieces >= 250) {
                bonus = (PARTS_BONUS) * pieces;
            } 
        }
        return bonus;
    }
}