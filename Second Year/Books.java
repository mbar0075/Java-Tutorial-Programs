import java.util.*;
public class Books
{
    public static void main( String args[]){
        Scanner sc = new Scanner(System.in);
        long num[]= {9781406366846L,9781409523383L,9781848102392L,9781607749769L,9781760340834L,9780241199107L};
        String title[] ={"Get Coding!","Space","Shipwrecks","Women in Science","Epic Bike Rides of the World","The Rough Guide to London"};
        double price[]={10.77,10.59,4.09,14,35.28,15.7};

        int input =0;
        boolean found=false;

        do  {
            System.out.println("1. Book Statistics \n2. Search by ISBN \n3. Search by first title letter \n4 .Quit");
            input = sc.nextInt();
            switch (input) {
                case 1: System.out.println("There are "+num.length+" books in stock");
                System.out.println("The most expensive book is  "+title[4]);
                System.out.println("The cheapest expensive book is  "+title[2]);
                break;
                case 2:
                System.out.println("Input ISBN ");
                long isbn = sc.nextLong();
                found = false;
                for ( int i =0; i<5;i++){
                    if(isbn==num[i]){
                        System.out.println(title[i]+"  "+price[i]);
                        found=true;
                    }
                }

                if ( found==false)
                    System.out.println("Not found");
                break;
                case 3:System.out.println("Input first letter of book ");
                char letter = sc.next().charAt(0);
                 found = false;
                for ( int i =0; i<5;i++){
                    if(letter==(title[i].charAt(0))){
                        System.out.println(title[i]);
                        found=true;
                    }
                }

                if ( found==false)
                    System.out.println("Not found");
                break;
                case 4:System.out.println("Goodbye");
                break;
                default:
                System.out.println("Invalid input");
            }
        }while (input != 4);
    }
}
