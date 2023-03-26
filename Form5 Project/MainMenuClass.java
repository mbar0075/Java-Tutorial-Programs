import javax.swing.JOptionPane;
public class MainMenuClass {
    public static void main (String args[]){
        int choice = 0;
     //Creating an object of type Classroom//
     Classroom myClass = new Classroom();
    //The do while loop is being used to show the main menu options until the user quits//
     do{
        choice = Integer.parseInt(JOptionPane.showInputDialog("1. Input Student Details \n 2.  Grades \n 3.  Average and Sum \n "+
                     "4.  Max and Min  \n 5.  Above or Below Average \n 6.  Search  \n 7.  Exit"));

         //The switch statement is being used to show the main menu according the userś choice//
         switch (choice) {
             //These methhods are calling code from the Classroom Class//
             case 1 : myClass.Input();
                     break;
             case 2: myClass.Grades(); 
                     break;
             case 3 :myClass.AverageSum(); 
                     break;
             case 4 :myClass.MaxMin();
                     break;
             case 5 :myClass.ABAverage();
                     break;
             case 6 :myClass.Search(); 
                     break;
                     //The user has terminated the program//
             case 7 :JOptionPane.showMessageDialog(null,"Thank you , for using the program");
                     break;
                     //Default is being used as an invalid option //
             default :JOptionPane.showMessageDialog(null,"Invalid option , please try again");
            }
        
        }while(choice!=7);   
    }
}