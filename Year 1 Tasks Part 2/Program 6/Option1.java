import java.util.*;
import java.util.concurrent.TimeUnit;
public class Option1
{
    Scanner sc = new Scanner (System.in);
    private int input = 0;
    private int userChoice2 = 0;
    private int space = 0 ;
    private int star = 0;
    private int donutCentreSpaces = 0;
    private boolean forLoopSkip = true;
    public void PaintDonut (){
        System.out.println ("Draw donut has been selected\n");
        do{
            System.out.println ("\n\nWhich size of donut would you like to see?\n1.Small\n2.Medium\n3.Large\n4.Menu\n\n");
            userChoice2 = sc.nextInt();

            switch (userChoice2) {
                case 1 : System.out.println ("Small donut has been selected\nHere You go\n");
                printdonut (userChoice2);
                break;
                case 2 : System.out.println ("Medium donut has been selected\nHere You go\n");
                printdonut (userChoice2);
                break;
                case 3 : System.out.println ("Large donut has been selected\nHere You go\n");
                printdonut (userChoice2);
                break;
                case 4 : System.out.println ("\nReturning to menu.....\n");
                try{
                    TimeUnit.SECONDS.sleep(2);
                }
                catch(InterruptedException ex)  
                {
                    Thread.currentThread().interrupt();
                }//Programm is set to sleep to give the user time to read the text
                System.out.println ("\f");
                break;
                default : System.out.println ("Invalid input, input a number corresponding to the ones provided in the menu");
                break;
            }
        }
        while (userChoice2!=4);
    }

    public void printdonut (int userChoice2) {
        int space = 0;
        int star = 0;
        int donutCentreSpaces = 0;
        int rows = 0;
        boolean forLoopSkip= true ;
        //based on user input
        if (userChoice2==1) {
            space = 3;
            rows = 6;
        }
        else if (userChoice2==2) {
            space = 5;
            rows = 8;
        }
        else if (userChoice2==3){
            space = 9;
            rows = 12;
        }

        for (int i = 1; i<rows;i++) {
            //spaces before circle
            for (int c = 0 ; c<space;c++) {
                System.out.print (" ");
            }

            switch (i) {
                case 1 : 
                if (userChoice2 ==1) {
                    star = 3;
                    space-=2;
                }
                else if (userChoice2 ==2) {
                    star = 6;
                    space-=2;
                }
                else if (userChoice2 ==3) {
                    star = 9;
                    space-=2;
                }
                break;
                case 2 : 
                if (userChoice2 ==1) {
                    star = 7;
                    space-=2;
                }
                else if (userChoice2 ==2) {
                    star = 10;
                    space-=2;
                }
                else if (userChoice2 ==3) {
                    star = 13;
                    space-=2;
                }
                break;
                case 3 : 
                if (userChoice2 ==1) {
                    star = 2;
                    donutCentreSpaces = 5;
                    space=1;
                    forLoopSkip = false;
                }
                else if (userChoice2 ==2) {
                    star = 4;
                    donutCentreSpaces = 6;
                    space-=2;
                    forLoopSkip = false;
                }
                else if (userChoice2 ==3) {
                    star = 17;
                    space-=2;
                }
                break;
                case 4: 
                if (userChoice2 ==1) {
                    star = 7;
                    space+=2;
                }
                else if (userChoice2 ==2) {
                    star = 4;
                    donutCentreSpaces = 8;
                    forLoopSkip = false;
                    space+=2;
                }
                else if (userChoice2 ==3) {
                    star = 5;
                    space-=2;
                    donutCentreSpaces = 11;
                    forLoopSkip = false;
                }
                break;
                case 5 : 
                if (userChoice2 ==1) {
                    star = 3;
                }
                else if (userChoice2 ==2) {
                    star = 4;
                    donutCentreSpaces = 6;
                    forLoopSkip = false;
                    space+=2;
                }
                else if (userChoice2 ==3) {
                    star = 5;
                    space-=2;
                    donutCentreSpaces = 15;
                    forLoopSkip = false;
                }
                break;
                case 6 : 
                if (userChoice2 ==2) {
                    star= 10;
                    space+=2;
                }
                else if (userChoice2 ==3) {
                    star = 5;
                    space+=2;
                    donutCentreSpaces = 17;
                    forLoopSkip = false;
                }
                break;
                case 7 : 
                if (userChoice2 ==2) {
                    star = 6;
                }
                else if (userChoice2 ==3) {
                    star = 5;
                    space+=2;
                    donutCentreSpaces = 15;
                    forLoopSkip = false;
                }
                break;
                case 8 : 
                star = 5;
                forLoopSkip = false;
                donutCentreSpaces = 11;
                space+=2;
                break;
                case 9 :
                star = 17;
                space+=2;
                break;
                case 10 : 
                star = 13;
                space+=2;
                break;
                case 11 : 
                star = 9;
                space+=2;
                break;
            }
            if (forLoopSkip==true){
                for (int x = 0 ; x<star;x++){ 
                    System.out.print ("*");
                }
            }
            else {
                for (int y = 0 ; y <star;y++) {
                    System.out.print ("*");
                }
                for (int o = 0 ; o<donutCentreSpaces;o++) {
                    System.out.print (".");
                }
                for (int y = 0 ; y <star;y++) {
                    System.out.print ("*");
                }

            }
            forLoopSkip = true;    
            System.out.println ();
        }
    }
}
