




import java.awt.*;
import javax.swing.*;

public class ClassMarks {
    public static void main (String args[]){
        JFrame frame = new JFrame();
        frame.setVisible(true);
    int choice = 0;
    String name[] = new String[15];
    String location[] = new String[15];
    String classes[] = new String[15];
    int mark[] = new int[15]; 
    char grade[]= new char[15];
    int num= 0;
    int max = 0;
    int min = 1000;
    String l1 = "" ;
    String n1 = "" ;
    char g1 ='a';
    String l2 = "" ;
    String n2 = "" ;
    char g2= 'a';
    
    int a= 0;
    int b= 0;
    int m= 0;
    boolean found = false;
    
    JButton button1 = new JButton();
    button1.setText("I button");
    button1.setBackground(Color.BLUE);
    frame.add(button1);
    
    Class s0 = new Class();    
    Class s1 = new Class();
    Class s2 = new Class();
    Class s3 = new Class();
    Class s4 = new Class();
    Class s5 = new Class();
    Class s6 = new Class();
    Class totals = new Class();
    
    int c0 = 0;
    int c1 = 0;
    int c2= 0;
    int c3 = 0;
    int c4= 0;
    int c5 = 0;
    int c6 = 0;
   
    int sum0 = 0;
    int sum1 = 0;
    int sum2 = 0;
    int sum3 = 0;
    int sum4 = 0;
    int sum5 = 0;
    int sum6 = 0;
    int totalsum = 0;
    
    
    
    double a0= 0;
    double a1= 0;
    double a2= 0;
    double a3= 0;
    double a4= 0;
    double a5= 0;
    double a6= 0;
    double totalaverage = 0;
    
    do{    
     
      
      switch (choice) { 
          
        case 1: for (int i= 0; i< name.length;i++){
                 System.out.println("Input name " + (i+1));
                 name[i]= Keyboard.readString();
                 System.out.println("Input mark " + (i+1));
                 mark[i]= Keyboard.readInt();
                 System.out.println("Input class " + (i+1));
                 classes[i]= Keyboard.readString();
                 System.out.println("Input location " + (i+1));
                 location[i]= Keyboard.readString();
                }
                break;
        case 2:for (int i= 0; i< name.length;i++){
                  if((mark[i]>=0)&&(mark[i]<=48))
                    grade[i] ='F';
                  else if((mark[i]>=49)&&(mark[i]<=60))
                    grade[i] ='D';
                  else if((mark[i]>=60)&&(mark[i]<=70))
                    grade[i] ='C';
                  else if((mark[i]>=71)&&(mark[i]<=84))
                    grade[i] ='B';
                  else if((mark[i]>=85)&&(mark[i]<=100))
                    grade[i] ='A';
                }
               for (int i= 0; i< name.length;i++){
                   System.out.println(name[i] + "  from " + location[i] + " in  class " + classes[i] + "  got " + mark[i] + "  marks and the grade " + grade[i]);   
                }   
                  break;
        case 3: System.out.println("Input number of classes ");          
                num = Keyboard.readInt();  
                String  clas[]= new String[num];
                for (int i= 0 ; i< clas.length;i++ ){
                   System.out.println("Input class " + (i+1)); 
                   clas[i] = Keyboard.readString();  
                }  
                
                for (int i= 0; i< classes.length;i++){
                   if(num==7){
                   if(num>=6){ 
                   if(num>=5){
                   if(num>=4){
                   if(num>=3){
                   if(num>=2){
                   if(num>=1){
                   if(classes[i]==clas[0]){ 
                    s0.Add(mark[i],sum0); 
                    c0++;
                    System.out.println(name[i] + " is in class " + classes[i]);
                    totals.Add(totalsum,mark[i]);
                     }
                    }
                   else if(classes[i]==clas[1]){ 
                    s1.Add(mark[i],sum1); 
                    c1++;
                    System.out.println(name[i] + " is in class " + classes[i]);
                    totals.Add(totalsum,mark[i]);
                     }
                    }
                   else if(classes[i]==clas[2]){ 
                    s2.Add(mark[i],sum2); 
                    c2++;
                    System.out.println(name[i] + " is in class " + classes[i]);
                    totals.Add(totalsum,mark[i]);
                     }
                   else if(classes[i]==clas[3]){ 
                    s3.Add(mark[i],sum3); 
                    c3++;
                    System.out.println(name[i] + " is in class " + classes[i]);
                    totals.Add(totalsum,mark[i]);
                     }
                    }
                   else if(classes[i]==clas[4]){ 
                    s4.Add(mark[i],sum4); 
                    c4++;
                    System.out.println(name[i] + " is in class " + classes[i]);
                    totals.Add(totalsum,mark[i]);
                     }
                    }
                   else if(classes[i]==clas[5]){ 
                    s5.Add(mark[i],sum5); 
                    c5++;
                    System.out.println(name[i] + " is in class " + classes[i]);
                    totals.Add(totalsum,mark[i]);
                     } 
                    }
                   else if(classes[i]==clas[6]){ 
                    s6.Add(mark[i],sum6); 
                    c6++;
                    System.out.println(name[i] + " is in class " + classes[i]);
                    totals.Add(totalsum,mark[i]);
                     }
                    }
                }
            }
                a0 = sum0/(c0);
                a1 = sum1/(c1);
                a2 = sum2/(c2);
                a3 = sum3/(c3);
                a4 = sum4/(c4);
                a5 = sum5/(c5);
                a6 = sum6/(c6);

                System.out.println("There were " + c0 + " students in class " + clas[0] + " and their sum is " + sum0 + " and the average of the class was  " + a0);
                System.out.println("There were " + c1 + " students in class " + clas[1] + " and their sum is " + sum1 + " and the average of the class was  " + a1 );
                System.out.println("There were " + c2 + " students in class " + clas[2] + " and their sum is " + sum2 + " and the average of the class was  " + a2 );
                System.out.println("There were " + c3 + " students in class " + clas[3] + " and their sum is " + sum3 + " and the average of the class was  " + a3);
                System.out.println("There were " + c4 + " students in class " + clas[4] + " and their sum is " + sum4 + " and the average of the class was  " + a4);
                System.out.println("There were " + c5 + " students in class " + clas[5] + " and their sum is " + sum5 + " and the average of the class was  " + a5);
                System.out.println("There were " + c6 + " students in class " + clas[6] + " and their sum is " + sum6 + " and the average of the class was  " + a6);
                
                System.out.println("The sum of all the classes is  " + totalsum);
                totalaverage = totalsum/15;
                System.out.println("The average of all the classes is  " + totalaverage);
                 break;
                
          case 4 : for ( int i= 0; i < name.length ; i++){       
                  if(mark[i]> max){
                   max =mark[i];
                   n1 = name[i];   
                   l1 = location[i];
                   g1 = grade[i];
                  }
                  if(mark[i]< min){
                   min =mark[i];
                   n2 = name[i];   
                   l2 = location[i];
                   g2 = grade[i];
                  }
                 }
                 
                   System.out.println( n1 + " from  " + l1 + "  got the highest mark of  "  + max + "  and a grade of " + g1 );
                   System.out.println( n2 + " from  " + l2 + "  got the lowest mark of  "  + min + "  and a grade of " + g2 );  
                   break; 
                   
         case 5: for ( int i= 0; i < mark.length;i++){ 
                 if (mark[i] > totalaverage ){
                   a++;
                   System.out.println(name[i] + "  from " + location[i] + " in  class " + classes[i] + "  got " + mark[i] + "  marks and the grade " + grade[i] + " was above total average ");
                 }
                 if (mark[i] < totalaverage ){
                   b++;
                   System.out.println(name[i] + "  from " + location[i] + " in  class " + classes[i] + "  got " + mark[i] + "  marks and the grade " + grade[i] + " was below total average ");
                 }
                }
                System.out.println("There were " + a + " students above total average ");
                System.out.println("There were " + b + " students below total average ");
                
                 break;
                 
         case 6 : System.out.println("Input mark to search for ");
                 m = Keyboard.readInt();
                 for( int i= 0; i < mark.length; i++){
                   if(m == mark[i] ){ 
                    found = true;
                    System.out.println("Found in location " + (i+1));
                    System.out.println(name[i] + "  from " + location[i] + " in  class " + classes[i] + "  got this mark of  " + mark[i]+ "  marks and the grade " + grade[i]);
                    
                     
                    }   
                 }
                 
                 if(found = false)
                  System.out.println("Not found");
                 break;
                 
         case 7 :System.out.println("Thank you for using the program" );
                 break;
                 
         default: System.out.println("Invalid");
        }  
        
    }while(choice!=7);   
        
    }
}