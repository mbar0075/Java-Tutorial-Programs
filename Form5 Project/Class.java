public class Class {
  int mark[]=new int[15];
  char grade[]=new char [15];
  void Grade(){  
   for (int i= 0; i< 15;i++){   
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
      
      
    } 
  int Add ( int n1 , int n2){ 
    return n1+n2;
     }   
  }