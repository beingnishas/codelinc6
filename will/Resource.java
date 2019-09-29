

import java.util.ArrayList;

public class Resource {
	
	private String name;
	private String zip;
	private ArrayList<String> contact = new ArrayList<>();
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setZip(String zip) {
		this.zip = zip;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getZip() {
		return this.zip;
	}
	
	public void addContact(String contact) {
		this.contact.add(contact);
	}
	
	public ArrayList<String> getContact(){
		return this.contact;
	}
}