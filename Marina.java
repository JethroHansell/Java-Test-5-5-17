package assessment;

import java.util.ArrayList;

public class Marina {

	//Attributes
		
		private String name;
		private String address;
		private int capacity;
		private ArrayList <Boat> boats = new ArrayList <Boat>();
		
	//Constructors	
		
		public Marina(String name, String address, int capacity){
			this.name=name;
			this.address=address;
			this.capacity=capacity;
		}
		
		
	//Methods		

			public String getName()
			{return this.name;}
			public void setName(String newName)
			{this.name = newName;}
			
			public String getAddress()
			{return this.address;}
			public void setAddress(String newAddress)
			{this.address = newAddress;}
			
			public int getCapacity()
			{return this.capacity;}
			public void setCapacity(int newCapacity)
			{this.capacity = newCapacity;}
			
			public void hasBoat(Boat b) 
			{boats.add(b);}
			public ArrayList<Boat> getBoats()
			{return boats;}
			public void setBoats(ArrayList<Boat> boats)
			{this.boats = boats;}
	
}
