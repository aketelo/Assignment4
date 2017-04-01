package za.ac.cput.Composition_pckg;

/**
 * Created by student on 2017/03/24.
 */
public class Person
{
    private Job job;

    public Person()
    {
        this.job = new Job();
        job.setSalary(1000l);
    }

    public long getSalary()
    {
        return job.getSalary();
    }



}
