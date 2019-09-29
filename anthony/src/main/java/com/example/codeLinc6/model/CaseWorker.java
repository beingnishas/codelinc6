package com.example.codeLinc6.model;

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
    
    public Veteran getVeteran(ArrayList<Veteran> list, String ssn) {
    	for(int i = 0; i < list.size(); i++) {
    		if(list.get(i).getSSN().equals(ssn)) {
    			return list.get(i);
    		}
    	}
    }
    
}