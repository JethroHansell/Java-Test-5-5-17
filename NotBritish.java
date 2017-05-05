package assessment;

import java.util.Date;


public class NotBritish extends Person {

//Attributes
	
	private String visa;
	
//Constructors	
	
	public NotBritish(String forename, String surname, Date dob, String nationality, String visa) 
	{
		super(forename, surname, dob, nationality);
		this.visa=visa;
		}
	
//Methods		

	public String getVisa()
	{return this.visa;}
	public void setVisa(String newVisa)
	{this.visa = newVisa;}
	
}
 

