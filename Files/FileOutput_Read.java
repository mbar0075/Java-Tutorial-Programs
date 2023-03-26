import java.io.*;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

import java.util.Scanner;

public class FileOutput_Read
{
  public static void main( String[] args ) throws FileNotFoundException
   {
       File inFile = new File ("average3.txt");
       String line= null;
       
       if (inFile.exists())
       {
           Scanner input = new Scanner (inFile);
           line = input.nextLine();  // to read a complete line
        }
      System.out.println (line);
    }
}
