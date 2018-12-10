package ie.gmit.dip;

import java.util.*;

//class Distance to read, print and add distance
// class Distance - commented out as it was not necessary
public class Distance
{
	
	
	public int feet; // made public for test
	public int inches; // made public for test
		
	
	public int getFeet() {
		return feet;
	}
	
	public int getInches() {
		return this.inches;
	
	}
	public void setFeet(int feet) {
		this.feet = feet;
	}

	public void setInches(int inches) {
		this.inches = inches;
	}
	public void getDistance(int feet, int inches) // parameters included for parameterised test
	{
		Scanner sc=new Scanner(System.in);
		
		//System.out.println("Enter feet: ");
		//feet=sc.nextInt(); // commented out for parameterised test implementation
		this.feet = feet; //include for parameterised test implementation
		//System.out.println("Enter inches: ");
		//inches=sc.nextInt(); //  commented out for parameterised test implementation
		this.inches = inches; // include for parameterised test implementation
	}
	
}
