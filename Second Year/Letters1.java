import java.util.*;
public class Letters1
{
    public static void main( String args[]){
        Scanner sc = new Scanner (System.in);
        ArrayList <Character> letters = new ArrayList <Character>();

        char temp ;
        do{
            System.out.println("Input how many letters you wish to add , enter 0 to quit");
            temp = sc.next().charAt(0);
            if(temp!='0')
                letters.add(temp);
        } while(temp!='0');

        int input;
        int pos =-1;
        boolean found;
        do{
            System.out.println("Choose from the folowing Menu:\n1.Input letter at end\n2.Input letter at specified location\n3.Remove letter\n4.Remove letter at specific location\n5. Search for a letter\n6.Edit a letter\n7.List the letters in the list and size of the list\n8.Get the position of a letter\n9. Empty the list\n10.Remove specific letters from the list\n11.Quit");

            input = sc.nextInt();
            switch(input){
                case 1:System.out.println("Input letter to add");
                temp = sc.next().charAt(0);
                letters.add(temp);
                break;

                case 2:System.out.println("Input position");
                pos = sc.nextInt();
                System.out.println("Input letter to add");
                temp = sc.next().charAt(0);
                letters.add(pos,temp);
                break;

                case 3:System.out.println("Input letter to remove");
                temp = sc.next().charAt(0);
                for(int i =0; i<letters.size();i++){
                    if(temp==letters.get(i)){
                        letters.remove(i);
                    }
                }
                break;

                case 4:System.out.println("Input location of letter to remove");
                int p = sc.nextInt();
                letters.remove(p);
                break;

                case 5:System.out.println("Input letter to search for");
                temp = sc.next().charAt(0);
                pos =-1;
                found = false;
                for(int i =0; i<letters.size();i++){
                    if(temp==letters.get(i)){
                        found = true;
                        pos=i;
                        System.out.println("Found in position "+pos);
                    }
                }
                if ( found ==false)
                    System.out.println("not found");
                break;

                case 6:System.out.println("Input letter to search for");
                temp = sc.next().charAt(0);
                for(int i =0; i<letters.size();i++){
                    if(temp==letters.get(i)){
                        found = true;
                        System.out.println("Input letter to add");
                        temp = sc.next().charAt(0);
                        letters.set(i,temp);
                    }
                }
                break;

                case 7:System.out.println("size of list is "+letters.size());
                for (char i : letters) {
                    System.out.println(i);
                }
                break;

                case 8:System.out.println("Input letter to search for");
                temp = sc.next().charAt(0);
                pos =-1;
                found = false;
                for(int i =0; i<letters.size();i++){
                    if(temp==letters.get(i)){
                        found = true;
                        pos=i;
                        System.out.println("Found in position "+pos);
                    }
                }
                if ( found ==false)
                    System.out.println("not found");
                break;

                case 9:letters.removeAll(letters);
                for (char i : letters) {
                    System.out.println(i);
                }
                break;

                case 10:
                do{
                    System.out.println("Input letter to remove for,Press 0 to quit");
                    temp = sc.next().charAt(0);
                    for(int i =0; i<letters.size();i++){
                        if(temp==letters.get(i)){
                            letters.remove(i);
                        }
                    }
                } while (temp!=0);
                break;

                case 11:System.out.println("Goodbye");
                break;
                default:System.out.println("Invalid Entry");   
            }
        }while (input!=11);
    }
}
