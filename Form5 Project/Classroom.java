import javax.swing.JOptionPane;
public class Classroom{
    //Creation of student array//  
    Student[] studentArray; 
    //Initial Variables // 
    int totalstudents=0;
    String name, Location, Class;
    int mark;
    char grade;
    //Variables for option 3//
    int sum= 0;
    double average;
    //Variables for option 4//
    int max = 0;
    int min = 100;
    String maxLocation ,maxName;
    String minLocation,minName ;
    char maxGrade , minGrade;
    //Variables for option 5//
    int a,b;
    //Variables for option 6//  
    int choice;
    boolean found = false;
    int searchMark;
    String searchName , searchClass;

    //This method is being used , as a user input //
    void Input(){
        //The user is requesting to enter the number of students in the class//
        String a1= JOptionPane.showInputDialog(null,"Please enter number of students" );
        totalstudents=Integer.parseInt(a1);
        //The student array is being created according to the value stored in the totalstudents variable//
        studentArray = new Student [totalstudents];
        //The for loop is being used to enter details in the student array//
        for (int i = 0 ; i< totalstudents ; i++){
            name= JOptionPane.showInputDialog(null,"Enter Student name " +(i+1));
            String a2= JOptionPane.showInputDialog(null,"Enter Mark  " +(i+1)); 
            mark =Integer.parseInt(a2);
            //The while loop is being used to check whether the  mark is invalid or correct//
            while((mark<0 )||(mark>100)){
                if ((mark<0 )||(mark>100))
                    JOptionPane.showMessageDialog(null,"Invalid mark , Re enter ");
                //The user is re entring the mark//
                mark =Integer.parseInt(a2);
            }
            Class = JOptionPane.showInputDialog(null,"Enter Class   " +(i+1));   
            Location =JOptionPane.showInputDialog(null, "Enter Location   " +(i+1));  
            //An object is being created to include the constructor//
            Student myStudent = new Student (name, Class, Location,mark,grade );
            //The object arraj ' studetnArray[] ' is being popoulated by the constructor //
            studentArray[i]= myStudent;  
        } 
        //Outputting //
        //The for loop is being used to output the Student Deatails //
        for (int i= 0; i< totalstudents; i++){  
            JOptionPane.showMessageDialog(null,"Name :" + studentArray[i].name +"\nMark :" + studentArray[i].mark +"\nClass :"
                + studentArray[i].Class + "\nLocation :" + studentArray[i].Location);

        }
    }
    //This method is being used to show information of students and output the grade obtained by each student//
    void Grades() {
        //This for loop is being used to output the student Details//
        for (int i= 0; i< totalstudents; i++){ 
            //This for loop is being used to find the student ' s grade //
            //The parametres determine the Studentś grade //
            for (int z = 0; z<totalstudents;z++){   
                if((studentArray[z].mark>=0)&&(studentArray[z].mark<=48))
                    studentArray[z].grade ='F';
                else if((studentArray[z].mark>=49)&&(studentArray[z].mark<=60))
                    studentArray[z].grade ='D';
                else if((studentArray[z].mark>=61)&&(studentArray[z].mark<=70))
                    studentArray[z].grade ='C';
                else if((studentArray[z].mark>=71)&&(studentArray[z].mark<=84))
                    studentArray[z].grade='B';
                else if((studentArray[z].mark>=85)&&(studentArray[z].mark<=100))
                    studentArray[z].grade ='A';  
            }   
            //The grade depending on the parametres is being outputted with the student details//
            JOptionPane.showMessageDialog(null,"Name :" + studentArray[i].name +"\nMark :" + studentArray[i].mark +"\nClass :"
                + studentArray[i].Class + "\nLocation :" + studentArray[i].Location + "\nGrade : " +  studentArray[i].grade );
        } 
    }
    //This method is used to calculate the total m ark of all students and to find the average //
    void AverageSum() {
        //This for loop is being used to add all the marks to the variable sum //
        for(int i= 0 ; i< totalstudents; i++){
            sum+=studentArray[i].mark;  
        }
        //The sum is then divided by the nuber of students to find the mean //
        average = sum/(double)(totalstudents);
        JOptionPane.showMessageDialog(null,"The sum is " + sum+ "\n The average is  is " + average); 
    }
    //This method is being used to find the Maximum and Minimum mark//
    void MaxMin() {
        //This for loop is being used to check all the marks for the maximum and minimum //
        for ( int i= 0; i < totalstudents ; i++){
            //T if statement is being used to check whether the student mark is greater then the previous student mark //
            if(studentArray[i].mark> max){
                //If the student mark is greater , the max variable will be populated by the current student mark//
                max =studentArray[i].mark;
                //These variables are used to output student details//
                maxName = studentArray[i].name;   
                maxLocation = studentArray[i].Location;
                maxGrade= studentArray[i].grade;
            }
            //The if statement is being used to check whether the student mark is smaller then the previous student mark //
            if(studentArray[i].mark< min){
                //If the student mark is smaller , the min variable will be populated by the current student mark//
                min =studentArray[i].mark;
                //These variables are used to output student details//
                minName = studentArray[i].name;   
                minLocation = studentArray[i].Location;
                minGrade = studentArray[i].grade;
            }
        } 
        //The student details of the highest and lowest mark are being outputted //
        JOptionPane.showMessageDialog(null, maxName + " from   " + maxLocation + "  got the highest mark of  "  + max + "  and a grade  " + maxGrade +"\n" +
            minName + " from   " + minLocation + "  got the lowest mark of  "  + min + "  and a grade  " + minGrade );
    }
    //This method is being used to check which students were above or below average , and how many there were //
    void ABAverage (){
        //This for loop is being used to check all the students //
        for ( int i= 0; i <totalstudents;i++){ 
            //The if statement is being used to check whether the mark is above average //
            if (studentArray[i].mark > average ){
                //This counter is being used to find how many students were above average //
                a++;
                //Student Details are being outputted and also  above average //
                JOptionPane.showMessageDialog(null,studentArray[i].name + "  from " + studentArray[i].Location + " in  class " + studentArray[i].Class + "  got " + studentArray[i].mark + 
                    "  marks and the grade " + studentArray[i].grade + " was above total average ");
            }
            //The if statement is being used to check whether the mark is below average //
            if (studentArray[i].mark < average ){
                //This counter is being used to find how many students were below average //
                b++;
                //Student Details are being outputted and also  below average //
                JOptionPane.showMessageDialog(null,studentArray[i].name + "  from " + studentArray[i].Location + " in  class " + studentArray[i].Class + "  got " 
                    + studentArray[i].mark + "  marks and the grade " + studentArray[i].grade + " was below total average ");
            }
        }
        //Outputting of how many students were above or below averge //
        JOptionPane.showMessageDialog(null,"There were " + a + " students above total average \n "+
            "There were " + b + " students below total average ");
    }
    //This method is being used to search //
    void Search(){
        //The do while loop is being used to execute a menu //
        do {
            choice = Integer.parseInt(JOptionPane.showInputDialog("Choose between the following options : \n1. Search by mark\n2. Search by name \n3. Search by class\n4. Quit"));
            //The switch statement is being used to execute all  options //
            switch(choice){

                case 1 : JOptionPane.showMessageDialog(null," 1. Search by mark ");
                //The user is being asked to enter mark//
                String a4 = JOptionPane.showInputDialog(null,"Input mark you want to search "); 
                searchMark = Integer.parseInt(a4);
                //found is being populated as false to avoid it from interfering in the for loop//
                found = false;
                //The for loop is being used to check all the students//
                for (int i = 0 ; i < totalstudents ; i++){
                    //The if statement is checking whether the searchMark is equal to the current mark //
                    if (searchMark == studentArray[i].mark) { 
                        //The mark requested by the user has been found and the students details are shown //
                        found = true ;
                        JOptionPane.showMessageDialog(null,"This/ese student/s obtained the following mark ");
                        JOptionPane.showMessageDialog(null,studentArray[i].name + "  from " + studentArray[i].Location + " in  class " + studentArray[i].Class + "  got  this mark" );
                    }  
                }
                //The if stement is showing a message to the user , that the mark wasn't found //
                if(found = false)
                    JOptionPane.showMessageDialog(null,"Not found");
                break;

                case 2 :JOptionPane.showMessageDialog(null," 2. Search by name ");
                //The user is being asked to enter name of student//

                searchName = JOptionPane.showInputDialog(null,"Input name you want to search ");
                //found is being populated as false to avoid it from interfering in the for loop//
                found = false;
                //The for loop is being used to check all the students//
                for (int i = 0 ; i < totalstudents ; i++){
                    //The if statement is checking whether the searchName is equal to the current name //
                    if (searchName.equals(studentArray[i].name)) { 
                        //The name requested by the user has been found and the students details are shown //
                        found = true ;
                        JOptionPane.showMessageDialog(null,"Student infromation :");
                        JOptionPane.showMessageDialog(null,studentArray[i].name + "  from " + studentArray[i].Location + " in  class " + studentArray[i].Class + "  got " 
                            + studentArray[i].mark + "  marks and the grade " + studentArray[i].grade );
                    }  
                }
                //The if stement is showing a message to the user , that the name wasn't found //
                if(found = false)
                    JOptionPane.showMessageDialog(null,"Not found");
                break;

                case 3 :JOptionPane.showMessageDialog(null," 3. Search by class ");
                //The user is being asked to enter //the class

                searchClass =JOptionPane.showInputDialog(null,"Input class you want to search "); 
                //found is being populated as false to avoid it from interfering in the for loop//
                found = false;
                //The for loop is being used to check all the students//
                for (int i = 0 ; i < totalstudents ; i++){
                    //The if statement is checking whether the searchClass is equal to the current Class //
                    if (searchClass.equals(studentArray[i].Class)) { 
                        //The Class requested by the user has been found and the students details are shown //
                        found = true ;
                        JOptionPane.showMessageDialog(null,"Student infromation  according to class :");
                        JOptionPane.showMessageDialog(null,studentArray[i].name + "  from " + studentArray[i].Location +  "  got " + studentArray[i].mark + "  marks and the grade " 
                            + studentArray[i].grade );
                    }  
                }
                //The if stement is showing a message to the user , that the Class wasn't found //
                if(found = false)
                    JOptionPane.showMessageDialog(null,"Not found");
                break;
                //The user has  terminated this menu back to main menu //
                case 4 : JOptionPane.showMessageDialog(null," Exit Search Menu - Back to Main Menu ");
                break;
                //Default is being used as an Invalid option  //
                default :JOptionPane.showMessageDialog(null,"Invalid Option ");
            }
        }
        while(choice!=4);
    }
}