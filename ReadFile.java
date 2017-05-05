package assessment;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

///////Task 5////////
public class ReadFile {

	static ArrayList<Person> people = new ArrayList<Person>();
	static ArrayList<Marina> marinas = new ArrayList<Marina>();
	static ArrayList<Boat> boats = new ArrayList<Boat>();
	
	static DateFormat df = new SimpleDateFormat("mm/dd/yyyy");
	
	public static void main(String [] args){
		
	String everything = readFile();	
	parseString(everything);
	//System.out.print(everything);
	}
	
	
	private static String readFile() {
		BufferedReader br = null; 
		String stage_5_input = "stage_5_input.txt";
		try {
			br = new BufferedReader(new FileReader(stage_5_input));
			
		} catch (FileNotFoundException e) { 

			e.printStackTrace();
		}
		
		String everything = null;
		
		try {
		    StringBuilder sb = new StringBuilder();
		    String line = br.readLine();

		    while (line != null) {
		        sb.append(line);
		        sb.append(System.lineSeparator()); 
		        line = br.readLine();
		    }
		    everything = sb.toString();
		    
		    
		} catch (IOException e) 
		{
			e.printStackTrace();
		} finally 
		{
		    try {
				br.close(); 
			} catch (IOException e) 
		    {
				e.printStackTrace();
			}
		}
		return everything;
	}	

////Assigning Objects
	
private static void parseString(String file){
	
	
	String[] objectType = file.split("\n\r"); 
	

	String [] marinaArray = objectType[1].split("\n"); 
	
	Marina monaco = new Marina(marinaArray[1],marinaArray[2],Integer.parseInt(marinaArray[3]));
	marinas.add(monaco);
	Marina venice = new Marina(marinaArray[5],marinaArray[6],Integer.parseInt(marinaArray[7]));
	marinas.add(venice);

	String [] boatArray = objectType[3].split("\n");
	
	Boat sm = new Boat(boatArray[1],boatArray[2],Double.parseDouble(boatArray[3]));
	boats.add(sm);
	Boat md = new Boat(boatArray[5],boatArray[6],Double.parseDouble(boatArray[7]));
	boats.add(md);
	Boat bmbf = new Boat(boatArray[9],boatArray[10],Double.parseDouble(boatArray[11]));
	boats.add(bmbf);
	Boat ah = new Boat(boatArray[13],boatArray[14],Double.parseDouble(boatArray[15]));
	boats.add(ah);
	
	String [] personArray = objectType[5].split("\n");
	String [] dgSplit =personArray[1].split(" ");
	String [] mjSplit =personArray[5].split(" ");
	String [] mwSplit =personArray[9].split(" ");
	String [] bkSplit =personArray[14].split(" ");
	String [] bjSplit =personArray[19].split(" ");
	String [] ltSplit =personArray[23].split(" ");
	String [] pjSplit =personArray[28].split(" ");
	String [] ewSplit =personArray[37].split(" ");
	String [] alSplit =personArray[41].split(" ");
	
	British dg = null;
	try {
		dg = new British(dgSplit[0],dgSplit[1],df.parse(personArray[2]),personArray[3]);
	} catch (ParseException e) {
		e.printStackTrace();
	}
	people.add(dg);
	
	British mj = null;
	try {
		mj = new British(mjSplit[0],mjSplit[1],df.parse(personArray[6]),personArray[7]);
	} catch (ParseException e) {
		e.printStackTrace();
	}
	people.add(mj);
	
	NotBritish mw = null;
	try {
		mw = new NotBritish(mwSplit[0],mwSplit[1],df.parse(personArray[10]),personArray[11],personArray[12]);
	} catch (ParseException e) {
		e.printStackTrace();
	}
	people.add(mw);
	
	NotBritish bk = null;
	try {
		bk = new NotBritish(bkSplit[0],bkSplit[1],df.parse(personArray[15]),personArray[16],personArray[17]);
	} catch (ParseException e) {
		e.printStackTrace();
	}
	
	people.add(bk);
	
	British bj = null;
	try {
		bj = new British(bjSplit[0],bjSplit[1],df.parse(personArray[20]),personArray[21]);
	} catch (ParseException e) {
		e.printStackTrace();
	}
	people.add(bj);
	
	NotBritish lt = null;
	try {
		lt = new NotBritish(ltSplit[0],ltSplit[1],df.parse(personArray[24]),personArray[25],personArray[26]);
	} catch (ParseException e) {
		e.printStackTrace();
	}
	people.add(lt);
	
	NotBritish pj = null;
	try {
		pj = new NotBritish(pjSplit[0],pjSplit[1],df.parse(personArray[29]),personArray[30],personArray[31]);
	} catch (ParseException e) {
		e.printStackTrace();
	}
	people.add(pj);
	
	British a = null;
	try {
		a = new British(personArray[33],null,df.parse(personArray[34]),personArray[35]);
	} catch (ParseException e) {
		e.printStackTrace();
	}
	
	people.add(a);
	
	British ew = null;
	try {
		ew = new British(ewSplit[0],ewSplit[1],df.parse(personArray[38]),personArray[39]);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	people.add(ew);
	
	NotBritish al = null;
	try {
		al = new NotBritish(alSplit[0],alSplit[1],df.parse(personArray[42]),personArray[43],personArray[44]);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	people.add(al);

	
////////Task6///////
	
	captainBy(pj,bmbf);
	ownedBy(ew,bmbf);
	crewBy(a,bmbf);
	crewBy(al,bmbf);
	crewBy(bj,bmbf);
	crewBy(pj,sm);
	ownedBy(mj,md);
	captainBy(lt,ah);
	ownedBy(bk,ah);
	captainBy(lt,ah);
	ownedBy(dg,ah);
	
	mooredAt(ah,venice);
	mooredAt(md,monaco);
	mooredAt(bmbf,monaco);
	mooredAt(sm,venice);
}


public static void ownedBy(Person p, Boat b){
	
	b.hasPerson(p);
}

public static void captainBy(Person p, Boat b){
	
	b.hasPerson(p);
}

public static void crewBy(Person p, Boat b){
	
	b.hasPerson(p);
}
	
public static void mooredAt(Boat b, Marina m){
	
	m.hasBoat(b);

}


///////Task 7//////

public static void oldestPerson(){
	
	for(Marina m:marinas){
		for(Boat b:boats){
			for(Person p:people)
			{
				
			}
			
			//for(int i=0 ; i<people.size(); i++){
			//	if (p.getDob()<i++ 
			}
		}
	}
}



