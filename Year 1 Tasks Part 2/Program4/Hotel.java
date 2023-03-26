import java.util.*;
import java.lang.*;
public class Hotel {
    Scanner sc = new Scanner (System.in);

    int counter = 0;
    String ContactNum = "0";
    String PersonArray [] [] = new String [40] [5];
    String conts;
    String Name, Surname, SD, EL;
    int counterS = 0;
    String wait=null;
    boolean found = false;
    void Book(){
        System.out.println("Enter name: ");
        Name = sc.nextLine();
        PersonArray [counter] [0] = Name;
        System.out.println("Enter surname: ");
        Surname = sc.nextLine();
        PersonArray [counter] [1] = Surname;
        System.out.println("Enter contact number: ");
        ContactNum = sc.nextLine();
        PersonArray [counter] [2] = ContactNum;
        do {
            System.out.println("Single / Double Bed (Type S for Single, D for Double): ");
            SD = sc.nextLine().toUpperCase();
            if ((!SD.equals("S") && (!SD.equals("D")))) {
                System.out.println("Invalid Input");
            }
        } while ((!SD.equals("S") && (!SD.equals("D"))));
        PersonArray [counter] [3] = SD;
        do {
            System.out.println("Economy / Luxury (Type E for Economy, L for Luxury): ");
            EL = sc.nextLine().toUpperCase();
            if ((!EL.equals("E") && (!EL.equals("L")))) {
                System.out.println("Invalid Input");
            }
        } while ((!EL.equals("E") && (!EL.equals("L"))));
        PersonArray [counter] [4] = EL;
        System.out.println(Arrays.toString(PersonArray [counter]));
        System.out.println("Press any key to continue: ");
        String wait2 = sc.nextLine();
        counter++;
    }

    void Edit(){
        System.out.println("Input contact number: ");
        conts = sc.nextLine();
        for (counterS = 0; counterS < counter; counterS++) {
            if (PersonArray [counterS] [2] !=null) {
                if (PersonArray [counterS] [2].equalsIgnoreCase(conts)) {
                    System.out.println(Arrays.toString(PersonArray[counterS]));
                    System.out.println("Enter name: ");
                    Name = sc.nextLine();
                    PersonArray [counterS] [0] = Name;
                    System.out.println("Enter surname: ");
                    Surname = sc.nextLine();
                    PersonArray [counterS] [1] = Surname;
                    System.out.println("Enter contact number: ");
                    ContactNum = sc.nextLine();
                    PersonArray [counterS] [2] = ContactNum;
                    do {
                        System.out.println("Single / Double Bed (Type S for Single, D for Double): ");
                        SD = sc.nextLine().toUpperCase();
                        if ((!SD.equals("S") && (!SD.equals("D")))) {
                            System.out.println("Invalid Input");
                        }
                    } while ((!SD.equals("S") && (!SD.equals("D"))));
                    PersonArray [counterS] [3] = SD;
                    do {
                        System.out.println("Economy / Luxury (Type E for Economy, L for Luxury): ");
                        EL = sc.nextLine().toUpperCase();
                        if ((!EL.equals("E") && (!EL.equals("L")))) {
                            System.out.println("Invalid Input");
                        }
                    } while ((!EL.equals("E") && (!EL.equals("L"))));
                    PersonArray [counterS] [4] = EL;
                    System.out.println(Arrays.toString(PersonArray [counterS]));
                }
                if (PersonArray [counterS] [2].equalsIgnoreCase(conts)==false) 
                    found = true; 
            }
        }
        if(found==true)
            System.out.println("There is no Entry in our database ");
        System.out.println("Press any key to continue: ");
        wait = sc.nextLine();
    }

    void Delete(){
        System.out.println("Input contact number: ");
        conts = sc.nextLine();
        for (counterS = 0; counterS < counter; counterS++) {
            if (PersonArray [counterS] [2] != null) {
                if (PersonArray [counterS] [2].equals(conts)) {
                    System.out.println(Arrays.toString(PersonArray[counterS]));
                    PersonArray [counterS] [0] = null;
                    PersonArray [counterS] [1] = null;
                    PersonArray [counterS] [2] = null;
                    PersonArray [counterS] [3] = null;
                    PersonArray [counterS] [4] = null;
                    System.out.println("Succesfully deleted");
                }
            }
        }
        System.out.println(Arrays.toString(PersonArray [counterS]));
        System.out.println("Press any key to continue: ");
        wait = sc.nextLine();
    }

    void Search(){
        System.out.println("Input contact number: ");
        conts = sc.nextLine();
        for (counterS = 0; counterS < counter; counterS++) {
            if (PersonArray [counterS] [2] != null) {
                if (PersonArray [counterS] [2].equals(conts)) {
                    System.out.println(Arrays.toString(PersonArray[counterS]));
                    System.out.println("Succesfully found");
                }
                if (PersonArray [counterS] [2].equalsIgnoreCase(conts)==false) 
                    found = true;
            }
        }
        if (found==true)
            System.out.println("There is no Entry in our database ");
        System.out.println("Press any key to continue: ");
        wait = sc.nextLine();
    }
}