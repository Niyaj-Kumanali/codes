package JspiderCodes.EmployeeList;

public class Employee {
    private int eid;
    private String ename;
    private double esal;
    private String edesignation;
    private long ephno;

    public Employee(int eid, String ename, double esal, String edesignation, long ephno) {
        this.eid = eid;
        this.ename = ename;
        this.esal = esal;
        this.edesignation = edesignation;
        this.ephno = ephno;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public double getEsal() {
        return esal;
    }

    public void setEsal(double esal) {
        this.esal = esal;
    }

    public String getEdesignation() {
        return edesignation;
    }

    public void setEdesignation(String edesignation) {
        this.edesignation = edesignation;
    }

    public long getEphno() {
        return ephno;
    }

    public void setEphno(long ephno) {
        this.ephno = ephno;
    }

    @Override
    public String toString() {
        return "Employee {" +
                "eid=" + eid +
                ", ename='" + ename + '\'' +
                ", esal=" + esal +
                ", edesignation='" + edesignation + '\'' +
                ", ephno=" + ephno +
                '}';
    }
}
