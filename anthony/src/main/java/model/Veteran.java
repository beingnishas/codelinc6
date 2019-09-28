package model;

import java.util.ArrayList;

public class Veteran 
{
	String name;
	String birthdate;
	int zip;
	String SSN;
	String branch;
	
	String serviceDates[] = new String[2];
	ArrayList<String> conflicts = new ArrayList<String>();
	ArrayList<String> disabilities = new ArrayList<String>();
	ArrayList<String> needs = new ArrayList<String>();
	
	ArrayList<String> history = new ArrayList<String>();
	
	
	// setter annotation here...
	public void setName(String name)
    {
        this.name = name;
    }

    public void setBirthdate(String birthdate)
    {
        this.birthdate = birthdate;
    }

    public void setZip(int zip)
    {
        this.zip = zip;
    }

    public void setSSN(String ssn)
    {
        this.SSN = ssn;
    }

    public void setBranch(String branch)
    {
        this.branch = branch;
    }

    public void setServiceDates(String startDate, String endDate)
    {
        this.serviceDates[0] = startDate;
        this.serviceDates[1] = endDate;
    }

    public void setConflicts(ArrayList<String> conflicts)
    {
        this.conflicts = conflicts;
    }

    public void setDisabilities(ArrayList<String> disabilities)
    {
        this.disabilities = disabilities;
    }

    public void setNeeds(ArrayList<String> needs)
    {
        this.needs = needs;
    }

    public void setHistory(ArrayList<String> history)
    {
        this.history = history;
    }


    // getter annotation here...
    public String getName()
    {
        return this.name;
    }

    public String getBirthdate()
    {
        return this.birthdate;
    }

    public int getZip()
    {
        return this.zip;
    }

    public String getSSN()
    {
        return this.SSN;
    }

    public String getBranch()
    {
        return this.branch;
    }

    public String [] getServiceDates()
    {
        return this.serviceDates;
    }

    public ArrayList<String> getConflicts()
    {
        return this.conflicts;
    }

    public ArrayList<String> getDisabilities()
    {
        return this.disabilities;
    }

    public ArrayList<String> getNeeds()
    {
        return this.needs;
    }

    public ArrayList<String> getHistory()
    {
        return this.history;
    }
}
