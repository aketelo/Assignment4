package za.ac.cput.Ocp.Ocp_Correction;

/**
 * Created by Scorpian on 2017-03-27.
 */
public class StaffmemberImpl  implements OCPSchoolInterface{

    private String name;
    private String surname;
    private String idnum;
    private String telnum;

    public StaffmemberImpl(String name, String surname, String idnum,String telnum)
    {
        this.name = name;
        this.surname = surname;
        this.idnum = idnum;
        this.telnum = telnum;
    }

    public StaffmemberImpl() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void createStaff(String name, String surname, String idnum,String telnum)
    {
        this.name = name;
        this.surname = surname;
        this.idnum = idnum;
        this.telnum = telnum;

    }

    @Override
    public String toString()
    {
        return name + surname + idnum + telnum;
    }


}
