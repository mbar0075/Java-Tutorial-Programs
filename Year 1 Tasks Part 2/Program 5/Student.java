
/*Program 5 Stastistics
 * Calculate statistics of students
 * Enter data of 20 students , name and marks of 3 subjects(every mark needs a validation)
 * 1.Average,subject,overall
 * 2.Min and Max , subject overall and output name
 * 3.Histogram by subject only
 * 4.Progress Report , the user can search for the student by name and the progress report come sup
 * based on 4 brackets , it will assign a feedback on every subject
 * 85-100 keep it up
 * 70-84 focus on detail
 * 50-69 thourouhg study required
 * 0-49 personal appoitment
 * 5.Exit
 */
public class Student
{
    // instance variables - replace the example below with your own
    public String name;
    public int mark1,mark2,mark3;
    public Student(String name,int mark1,int mark2,int mark3)
    {
        this.name = name;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }
}
