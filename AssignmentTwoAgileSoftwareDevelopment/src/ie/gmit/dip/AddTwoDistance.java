package ie.gmit.dip;

public class AddTwoDistance {
	public int feet; //made public for Test
	public int inches; //made public for Test
	
	
	
	public int getFeet() {
		return feet;
	}

	public int getInches() {
		return inches;
	}
	
	public void setFeet(int feet) {
		this.feet = feet;
	}

	public void setInches(int inches) {
		this.inches = inches;
	}

	public void showDistance()
	{
		System.out.println("Feet: "+ feet + "\tInches: "+ inches);
	}
	
	/*public void addDistance(Distance D1, Distance D2) //commented for test. test method created below
	{
		feet=D1.feet+D2.feet+((D1.inches+D2.inches)/12);
		inches=D1.inches+D2.inches+((D1.feet+D2.feet)*12);
	}*/
	
	public void addDistance(int feet, int inches) // test method
	{
		this.feet = feet+(inches/12);
		
		this.inches = inches+(feet*12);
	}


	public static void main(String []s)
	{
		/*try
		{

			Distance D1=new Distance();
			Distance D2=new Distance();
			AddTwoDistance D3=new AddTwoDistance();
			
			//read first distance
			System.out.println("Enter first distance: ");
			//D1.; // commented out for test
			
			//read second distance
			System.out.println("Enter second distance: ");
			//D2.getDistance(20,30); //commented out for test
			
			//add distances
			//D3.addDistance(D1,D2); // commented out for test
			//print distance
			System.out.println("Total distance is:" );
			//D3.showDistance();
		}
		catch (Exception e)
		{
			System.out.println("Exception occurred :"+ e.toString());
		}*/
	
	}

}

