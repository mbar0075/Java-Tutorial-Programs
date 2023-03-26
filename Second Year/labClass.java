import java.util.*;
public class labClass
{
    private String day,time,lecturer,room;
    private int num;
    private Student[] student = new Student[10];

    public labClass()
    {

    }

    public labClass(String day,String time,String lecturer , String room)
    {
        this.day=day;
        this.time=time;
        this.lecturer=lecturer;
        this.room=room;
        num=0;
    }

    public int numberOfStudents(){
        return num;
    }

    public void printDetails(){
        System.out.println(day+"  "+time+"  "+lecturer+"  "+room); 
    }

    public void printList(){
        for( int i=0;i<student.length;i++){
            System.out.println(student[i]);
        }
        System.out.println("Total number of students in class  "+num); 
    }

    public void enrollStudents(Student s){
        student[num]=s;
        num++;
    }
}
