
public class op3
{
    
    public void CarsAvailable(String CarName[],String CarModel[],int CarPrice[],String CarStatus[]){
        System.out.println("Manufacturer\t| Model\t\t|Price\t\t|Status");
        for(int i=0;i<CarName.length;i++){
            if(i!=2)
                System.out.print(CarName[i]+"\t\t"+CarModel[i]+"\t\t"+CarPrice[i]+"\t\t"+CarStatus[i]);
            else
                System.out.print(CarName[i]+"\t"+CarModel[i]+"\t"+CarPrice[i]+"\t\t"+CarStatus[i]);
            System.out.println();
        }
    }
}
