import java.util.*;
public class Employee1 {
    private int id;
    private double payRate, hrs, gross, tax, net, hrsTD = 0, grossTD = 0, taxTD = 0, netTD = 0, taxRate = 0.15;
    private String name, surname, type;

    public Employee1 (int id, String name, String surname, int type) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        if (type == 1) {
            this.type = "FT";
            this.payRate = 8.2;
        } else if (type == 2) {
            this.type = "PT";
            this.payRate = 7.15;
        } 
    }

    public int getID() {
        return id;
    }

    public void inputDetails (double h) {
        hrs = h;
        gross = h * payRate;
        tax = taxRate * gross;
        net = gross - tax;
        hrsTD += hrs;
        grossTD += gross;
        taxTD += tax;
        netTD += net;
    }

    public String getDetails() {
        return id+"\t"+name+"\t"+surname;
    }

    public void getFinancialDetails() {
        System.out.println();
        System.out.println(getDetails());
        System.out.println("Hours: \t" +hrs);
        System.out.println("Gross: \t" +gross);
        System.out.println("Tax \t" +tax);
        System.out.println("Net \t" +net);
        System.out.println("Hours To Date:\t" +hrsTD);
        System.out.println("Gross To Date:\t" +grossTD);
        System.out.println("Tax To Date\t" +taxTD);
        System.out.println("Net To Date\t" +netTD);
    }

    public void printPayslip() {
        System.out.println("ID:\t" +id);
        System.out.println("Name:\t" +name);
        System.out.println("Surname\t" +surname);
        System.out.println("Type\t" +type);
        System.out.println("Hours:\t" +hrs);
        System.out.println("Gross:\t" +gross);
        System.out.println("Tax\t" +tax);
        System.out.println("Net\t" +net);
        System.out.println();
    }
}