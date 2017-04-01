package za.ac.cput.Composition_pckg;

/**
 * Created by student on 2017/03/24.
 */
public class Job
{
    private String role;
    private long salary;
    private int id;

    public String getRole()
    {
        return role;
    }

    public long getSalary()
    {
        return salary;
    }

    public int getId()
    {
        return id;
    }

    public void setRole(String role)
    {
        this.role = role;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public void setSalary(long salary)
    {
        this.salary = salary;
    }


}
