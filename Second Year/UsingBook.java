import java.util.*;
public class UsingBook
{
    private static Scanner sc = new Scanner(System.in);
    
    public static void main( String args[]){
        Book b[]= new Book[10];
        
        Input(b);
        
        System.out.println("The best rated book is  "+ getBestRated(b));
        System.out.println("The worst rated book is  "+ getWorstRated(b));
        System.out.println("The most expensive book is  "+ getMostExpensive(b));
    }
    
    public static void Input(Book c[]){
        for( int i =0 ;i<c.length;i++){
          System.out.println("Input title "+(i+1));  
          String title = sc.next();
          System.out.println("Input author "+(i+1));  
          String author = sc.next();
          System.out.println("Input rating "+(i+1));  
          double rating = sc.nextDouble();
          System.out.println("Input price "+(i+1));  
          double price = sc.nextDouble();
          c[i]= new Book(title,author,rating,price);
        }
        System.out.println();
        for( int i =0 ;i<c.length;i++){
            System.out.println(c[i]);
        }
    }
    
    public static String getBestRated(Book b[]){
        String name="";
        double max =0;
        for( int i =0 ;i<b.length;i++){
          if(max<b[i].getRating())
              max =b[i].getRating();
        }
        for( int i =0 ;i<b.length;i++){
          if(max==b[i].getRating())
              name =b[i].getTitle();
        }
        return name;
    }
    
    public static String getWorstRated(Book b[]){
        String name="";
        double min =100;
        for( int i =0 ;i<b.length;i++){
          if(min>b[i].getRating())
              min =b[i].getRating();
        }
        for( int i =0 ;i<b.length;i++){
          if(min==b[i].getRating())
              name =b[i].getTitle();
        }
        return name;
    }
    
    public static String getMostExpensive(Book b[]){
        String name="";
        double max =0;
        for( int i =0 ;i<b.length;i++){
          if(max<b[i].getPrice())
              max =b[i].getPrice();
        }
        for( int i =0 ;i<b.length;i++){
          if(max==b[i].getPrice())
              name =b[i].getTitle();
        }
        return name;
    }
}
