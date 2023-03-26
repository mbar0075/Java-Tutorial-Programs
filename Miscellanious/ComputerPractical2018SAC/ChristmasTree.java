public class ChristmasTree{
    public static void main (String args[]){
        int rows = 5;
        int k=0;
        System.out.println("");
        for (int i= 1;i<=rows;i++){ 
            k=0; 
            //printing spaces in each row. each row has rows-1 spaces.
            for (int space=1;space<=rows-i;space++){ 
                System.out.print(" ");   
            }
            //printing the* in each row

            while(k!=2*i-1){
                System.out.print("*"); 
                ++k;
            }
            System.out.println("");
        }
    }
}