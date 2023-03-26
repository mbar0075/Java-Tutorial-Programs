import java.util.*;
public class CeaserCipher
{
    public static  void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String sentence="" ;
        String input2="";
        SubClass Cipher = new SubClass();
        int choice =-1;

        do{
            System.out.println("Choose from the following Options\n1.Decode\n2.Encode\n3.Exit");
            try{
                 choice = sc.nextInt();
            }
            catch(Exception e){
                System.out.println(e);
            }
            sc.nextLine();
            switch(choice){
                case 1:System.out.println("Please enter phrase to decode ");
                sentence = sc.nextLine();
                Cipher.Decryption(sentence);
                break;
                case 2:
                sentence="";
                System.out.println("Please enter phrase to encode ");
                sentence = sc.nextLine();
                Cipher.Encryption(sentence);
                break;
                case 3: System.out.println("Goodbye");
                break;
                default:System.out.println("Invalid");
            }
        }
        while(choice!=3);

    }
}
