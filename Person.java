package assessment;

import java.util.Date;

public class Person {
	
////////////////////////////Attributes/////////////////////////
private String forename;
private String surname;
private Date dob ;
private String nationality;


////////////////////////Constructors///////////////////////////
public Person(String forename, String surname, Date dob, String nationality)
{
this.forename = forename;
this.surname = surname;
this.dob = dob;
this.nationality = nationality;
}

/////////////////////////Methods///////////////////////////////

public String getForename()
{return this.forename;}
public void setForename(String newForename)
{this.forename = newForename;}

public String getSurname()
{return this.surname;}
public void setSurname(String newSurname)
{this.surname = newSurname;}

public Date getDob()
{return this.dob;}
public void setDob(Date newDob)
{this.dob = newDob;}

public String getNationality()
{return this.nationality;}
public void set(String newNationality)
{this.nationality = newNationality;}

}


