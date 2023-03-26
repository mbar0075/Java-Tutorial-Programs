import java.util.*;
public class Book
{
    private String title,author;
    private double price,rating;

    public Book(String title , String author , double rating , double price)
    {
        this.title=title;
        this.author=author;
        this.rating=rating;
        this.price=price;
    }

    public double getRating(){
       return rating; 
    }
    
    public String getTitle(){
       return title; 
    }
    
    public double getPrice(){
       return price; 
    }
    
    public String toString(){
        return title+"\t"+author+"\t"+rating+"\t"+price;
    }
}
