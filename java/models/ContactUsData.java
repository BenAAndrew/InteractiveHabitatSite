package model;

public class ContactUsData extends SmartSerializable
{
	private static final long serialVersionUID = 1L;
	
	public String uniqueId;
	
	private String name;
	private String contactReason;
	private String email;
	
	public String getUniqueId()
	{
		return uniqueId;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getContactReason()
	{
		return contactReason;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public void setUniqueId(String id)
	{
		uniqueId=id;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public void setContactReason(String contactReason)
	{
		this.contactReason=contactReason;
	}
	
	public void setEmail(String email)
	{
		this.email=email;
	}
}