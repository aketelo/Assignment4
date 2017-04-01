package Encapsulation_pckg;

/**
 * Created by student on 2017/03/23.
 */
public class Person
{

    private String firstName;
    private String lastName;
    private int age;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString()
    {
        return String.format("First name :" + getFirstName()+"Surname"+getLastName()+"Age" + getAge());
    }
}
