package assessment;

import java.util.ArrayList;

public class Boat implements Vehicle {

//Attributes
	
	private String name;
	private String country;
	private double size;
	private ArrayList <Person> people = new ArrayList <Person>();
	
//Constructors	
	
	public Boat(String name, String country, double size){
		this.name=name;
		this.country=country;
		this.size=size;
	}
	
	
//Methods		

		public String getName()
		{return this.name;}
		public void setName(String newName)
		{this.name = newName;}
		
		public String getCountry()
		{return this.country;}
		public void setCountry(String newCountry)
		{this.country = newCountry;}
		
		public double getSize()
		{return this.size;}
		public void setSize(double newSize)
		{this.size = newSize;}

		public int getSpeed() 
		{return 0;}

		public void accelerate() {}

		public void deccelerate() {}
		
		public void hasPerson(Person p) 
		{people.add(p);}
		public ArrayList<Person> getPeople()
		{return people;}
		public void setPeople(ArrayList<Person> people)
		{this.people = people;}
		
		/*
		 
		public void hasCaptain(Person p) 
		{people.add(p);}
		public ArrayList<Person> getPeople()
		{return people;}
		public void setPeople(ArrayList<Person> people)
		{this.people = people;}
		
		public void hasCrew(Person c) 
		{people.add(c);}
		public ArrayList<Person> getPeople()
		{return people;}
		public void setPeople(ArrayList<Person> people)
		{this.people = people;}
		
		*/
		
}
	

