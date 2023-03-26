
public class op5
{
    op4 o = new op4();
    public void ReOrder(String CarName[],String CarModel[],int CarPrice[],String CarStatus[]){
        for(int i=0;i<CarStatus.length;i++){
            CarStatus[i]="Not taken";  
        }
        o.RentCar(CarName,CarModel,CarPrice,CarStatus); 
    }
}
