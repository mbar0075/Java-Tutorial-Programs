/*Hotel booking system 5 options
 * 1.create a booking
 * 2.edit
 * 3.delete
 * 4.search
 * 5.exit
 * option1;name,surname, contact number, choose luxury or economy , or single or double
 * prompts the user we are full if there are no spaces left
 * always :search for a booking ;use arrays;
 * search by any you want
 */

import java.util.*;
import java.lang.*;

public class HotelBookings{
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        int menu = 0;
        Hotel hotel = new Hotel();    
        do {
            System.out.println("\f\nWelcome to Hotel booking System \nChoose form the following Menu:\n1. Book \n2. Edit \n3. Delete \n4. Search \n5. Exit");
            menu = sc.nextInt();
            switch (menu) {
                case 1:hotel.Book(); 
                break;
                case 2:hotel.Edit(); 
                break;
                case 3:hotel.Delete(); 
                break;
                case 4:hotel.Search(); 
                break;
                case 5:System.out.println("\f\n\n\n\n\n\n\n\n\n\n\n\t\t\t\t\t\t\t\tGoodbye\n\t\t\t\t\t\t\tThank you for using our System"); 
                break;
                default:System.out.println("Invalid Input");
            }
        } while (menu != 5);
    }
}