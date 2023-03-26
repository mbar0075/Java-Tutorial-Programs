//constant array has these numbers 1,2,5,5,6,6,7,2
// Tikteb code li turi d dublicates

public class ShowingDublicates
{
    public static void main(String args[]){
        final int array[]={1,2,5,5,6,6,7,2};
        for(int i= 0 ; i<array.length;i++){
            for(int j= 1 ; j<=i;j++){
                if(i!=j){
                    if(array[i]==array[j])
                        System.out.println(array[j]+" is a dublicate");
                }
            }
        }
    }
}
