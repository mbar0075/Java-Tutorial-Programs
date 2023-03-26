
public class staff
{
    private staffMember[] staffList;

    public staff()
    {
        staffList = new staffMember[6];
        staffList[0] = new Executive ("Sam", "123 Main Street Lija", "99112233", "123-45-6789", 2423.07);
        staffList[1] = new Employee ("Carla","45 St Joseph street Marsa", "79887755", "987-65-4321", 1246.15);
        staffList[2] = new Employee ("Wayne", "78 it-Trill San Pawl", "99884433", "010-20-3040", 1169.23);
        staffList[3] = new Hourly ("Diane", "12 Church Str Balzan", "79116633", "958-47-3625", 10.55);
        staffList[4] = new Volunteer ("Norm", "12 St Mary Str Attard", "99012345");
        staffList[5] = new Volunteer ("Cliff", "33 Well Street Mosta", "79843212"); 
        
        ((Executive)staffList[0]).awardBonus(500.00);
        ((Hourly)staffList[3]).addHours(40);
    }

    public void payday()
    {
        for(int i =0; i<staffList.length;i++){
            System.out.println(staffList[i].toString());
            double amount =staffList[i].pay();
            if(amount ==0)
                System.out.println("Thanks");
            else
                System.out.println(amount);
            System.out.println();
        }
    }
}
