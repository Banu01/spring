package com.kgisl.servletjdbc;

public class Employee {

    private int eno;
    private String ename;
    private String emob;
    private String eemail;
    
    
    //constructor
    private Employee(int eno,String ename,String emob,String eemail)
    {
        this.eno=eno;
        this.ename=ename;
        this.emob=emob;
        this.eemail=eemail;
    }
    /**
     * @return the eno
     */
    public int getEno() {
        return eno;
    }
    /**
     * @param eno the eno to set
     */
    public void setEno(int eno) {
        this.eno = eno;
    }
    /**
     * @return the ename
     */
    public String getEname() {
        return ename;
    }
    /**
     * @param ename the ename to set
     */
    public void setEname(String ename) {
        this.ename = ename;
    }
    /**
     * @return the emob
     */
    public String getEmob() {
        return emob;
    }
    /**
     * @param emob the emob to set
     */
    public void setEmob(String emob) {
        this.emob = emob;
    }
    /**
     * @return the eemail
     */
    public String getEemail() {
        return eemail;
    }
    /**
     * @param eemail the eemail to set
     */
    public void setEemail(String eemail) {
        this.eemail = eemail;
    }
    @Override
    public String toString() {
        return eno+" "+ename+" "+emob+" "+eemail;
    }


}