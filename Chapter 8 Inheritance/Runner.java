public class Runner
{
	public static void main (String args[])
	{
	    // create a FullTimeEmployee object
	    FullTimeEmployee fte = new FullTimeEmployee ("100", "James", 15000);
	    // create a PartTimeEmployee object
	    PartTimeEmployee pte = new PartTimeEmployee("101", "Robert", 5);
	    
	    System.out.println(fte);
	    System.out.println(pte);
	    // changing annual salary
	    System.out.println("Annual salary changed ");
	    fte.setAnnualSalary(20000);
	     System.out.println(fte);
	   }
	   
}