public class Computation
{
    private double sum=0;

    public double Harmonic(int n){
        if(n==1) {
            return 1.0;
        }else {
            return (1.0/n)+ Harmonic(n-1);
        }
    }

    public double Harmonic1(int n){
        for(int i=1;i<=n;i++){
            sum+=(double)(1.0/i);
        }
        return sum;
    }

}
