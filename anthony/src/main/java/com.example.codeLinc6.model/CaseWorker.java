package model;

import java.util.ArrayList;
 
public class CaseWorker 
{
	String name;
    String organization;

    ArrayList<Veteran> veteranList = new ArrayList<Veteran>();

    
    // setter annotation here...
    public void setName(String name)
    {
        this.name = name;
    }

    public void setOrganization(String organization)
    {
        this.organization = organization;
    }

    public void setVeteranList(ArrayList<Veteran> veteranList)
    {
        this.veteranList = veteranList;
    }


    // getter annotation here...
    public String getName()
    {
        return this.name;
    }

    public String getOrganization()
    {
        return this.organization;
    }

    public ArrayList<Veteran> getVeteranList()
    {
        return this.veteranList;
    }
    
}