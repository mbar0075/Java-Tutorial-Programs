public class Person
{
    public String name,surname;
    public String idNum;

    public Person(String initialName,String initialSurname, String ID_num)
    {
        name=initialName;
        surname=initialSurname;
        idNum=ID_num;
    }

    public void setPerson(String newName, String newSurname, String newID){
        name=newName;
        surname=newSurname;
        idNum=newID;
    }

    public void setPerson(Person p){
        name=p.name;
        surname=p.surname;
        idNum=p.idNum;
    }

    public void setName(String newName){
        name=newName; 
    }

    public String getName(){
        return name;
    }

    public void setSurname (String newSurname){
        surname=newSurname;
    }

    public String getSurname(){
        return surname;
    }

    public void setID_no (String newID_no){
        idNum= newID_no;
    }

    public String getID_no(){
        return idNum;
    }

    public String toString(){
        return name+"  "+surname+"  "+idNum;
    }
}
