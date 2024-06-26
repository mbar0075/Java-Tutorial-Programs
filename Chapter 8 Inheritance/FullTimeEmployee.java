
public class FullTimeEmployee extends Employee
{
 private double annualSalary;

 public FullTimeEmployee(String numberIn,String nameIn, double salaryIn)
     {
     super(numberIn,nameIn);
     annualSalary = salaryIn;
 }


 public void setAnnualSalary(double salaryIn)
 {
     annualSalary = salaryIn;
 }
 

 public double getAnnualSalary()
 {
     return annualSalary;
 }

 public double calculateMonthlyPay()
 {
     return annualSalary/12;
 }

 // the abstract method is overridden
 public String getStatus()
 {
     return "Full-Time";
 }
 
 public String toString()
 {
     return super.toString()+" Annual Salary  "+getAnnualSalary() + " Status  "+getStatus();
}
}


