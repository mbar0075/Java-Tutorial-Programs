import java.util.Scanner;

	public class Directory{
		public static void main(String args[]){
		    Scanner Keyboard = new Scanner(System.in);
		String names[] =  new String[10]; //array to store the names
		int tel_nos[] = new int[10]; //array to store the telephone numbers
		int option=0,size=0;
		String n;
		do{
			System.out.println("1.  New Entry");
			System.out.println("2.  Edit Entry");
			System.out.println("3.  Search");
			System.out.println("4.  Delete Entry");
			System.out.println("5.  List  All");
			System.out.println("6. Exit");
			System.out.println("Choose your option");
			option  = Keyboard.nextInt();
			switch (option){
			case 1 :
			/*the user is asked to enter the name and a  telephone number and they are stored  18			in location size of the arrays.  The size is then incremented .*/
				if (size <10) {
					System.out.println("Enter name");
					 n = Keyboard.next();
					System.out.println("Enter telephone number");
					int t = Keyboard.nextInt();
					names[size]=n;
					tel_nos[size] = t;
					size++;
				} else System.out.println("Directory Full");	
				break;
			case 2 :
			/* The user is asked to enter a name whose telephone number needs to be
			changed. This name is searched in the array of names.  If it is found then the user 
			is asked to enter the new telephone number.  This new number is stored in place 33			of the old one. */
			 if (size!=0) {
		 		System.out.println("Enter name to edit");
				n = Keyboard.next();
				boolean found = false;
				for (int i =0;i<size;i++){
				      if (names[i].equals(n)){
						System.out.println("Enter new telephone number");
						int newtel  = Keyboard.nextInt();
						tel_nos[i] = newtel;
						found = true;
					     }		
					}
					if (found ==false) System.out.println("Name not found");
			} else System.out.println ("Directory empty");
			break;
			case 3 :
			/* The user is asked to enter the name to search.  If it is found in the array of 51				names then the corresponding telephone number is displayed on screen*/
			 if (size !=0){
				System.out.println("Enter name to search");
				n = Keyboard.next();
				boolean found = false;
				for (int i =0;i<size;i++){
				     if (names[i].equals(n)){
				         	System.out.println("tel number  : "+tel_nos[i]);
					found = true;
     	                                                }
			           }
				if (found ==false) 
					System.out.println("Name not found");
				} else System.out.println("Directory empty");
				break;
			case 4 :
			/* The user is asked to enter the name of the person to delete from the directory.  67			The name is searched in the array of names.  If it is found then this name is
			overwritten by the last name in the array, and correspondingly, the telephone 
			number of this person is also overwritten by the last entry in the array of
			telephones.  The size is then decremented.*/
			 if (size!=0){
				System.out.println("Enter name to delete");
				n = Keyboard.next();
				boolean found = false;
				for (int i =0;i<size;i++){
				      if (names[i].equals(n)){
					names[i] = names[size-1];
					tel_nos[i] = tel_nos[size-1];
					size--;
					found = true;
                                                     }	
				}
				if (found ==false) 
					System.out.println("Name not found");
				} else System.out.println("Directory empty");
				break;
			case 5 : 
			// If the arrays are not empty then their contents are displayed on screen.
			if (size !=0){
				for (int i=0;i<size;i++)
					System.out.println(names[i] +"      "+tel_nos[i]);
				} else System.out.println("Directory empty");
			break;
			default : if (option !=6)
					System.out.println("Invalid entry");
		}
	        } while (option!=6);
	}
    }


