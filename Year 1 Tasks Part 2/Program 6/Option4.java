import java.io.*;
public class Option4
{
    Option2 op2;
    public Option4(Option2 o){
        op2 = o;
    }

    public void usingFileWriter() 
    {
        File file = new File("c:/temp/samplefile2.txt");
        try{ 
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("\nQuantities of small donuts " +op2.quantitys);
            fileWriter.write("\nQuantities of medium donuts " +op2.quantitym);
            fileWriter.write("\nQuantities of large donuts " +op2.quantityl);
            fileWriter.write("\nThe total is €" +op2.total);
            fileWriter.close();
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}
