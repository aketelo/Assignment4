package za.ac.cput.Ocp.Ocp_Violation;

/**
 * Created by Scorpian on 2017-03-27.
 */
public class Student extends Person {

    private String name;
    private String surname;
    private String idnum;
    private String telnum;

    public Student(String name, String surname, String idnum,String telnum)
    {
        this.name = name;
        this.surname = surname;
        this.idnum = idnum;
        this.telnum = telnum;
    }

    public void createStudent(String name, String surname, String idnum,String telnum)
    {
        this.name = name;
        this.surname = surname;
        this.idnum = idnum;
        this.telnum = telnum;

    }

    @Override
    public String toString()
    {
        return name +  surname +  idnum +  telnum;
    }

}
