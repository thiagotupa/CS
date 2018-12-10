package ie.gmit.dip;

import static org.junit.Assert.assertEquals;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class DistanceTest {
	public int feet;
	public int inches;
	
	private int expectedfeet;
	private int expectedinches;
	
	public Distance d;
	public AddTwoDistance a;
	
	Distance D1;
	Distance D2;
	
	
	@Before
	public void setUp() throws Exception {
		d = new Distance();
		a = new AddTwoDistance();
		D1 = new Distance();
		D2 = new Distance();
		
		AddTwoDistance D3=new AddTwoDistance();
	}

	public DistanceTest(int feet, int inches) {
		super();
		this.feet = feet;
		this.inches = inches;
		this.expectedfeet = feet+(inches/12);
		this.expectedinches = inches+(feet*12);
	}
	
	@Parameterized.Parameters
	public static Collection Numbers() {
		return Arrays.asList(new Object[][] {
			{10, 0},
			{20 ,0}
			
		});
	
	}
	@Test
	public void DistanceTest() {
		
		/*D1.setFeet(feet);
		D1.setInches(inches);
		System.out.println( "D1: f "+ D1.feet+ " i " + D1.inches);
		
	
		D2.setFeet(feet);
		D2.setInches(inches);
		System.out.println( "D2: f "+ feet+ " i " +inches);*/
		
				
		d.getDistance(feet, inches);
		System.out.println(" f "+feet+ " i " +inches);
		a.addDistance(d.feet, d.inches);
		//a.addDistance(D1, D2);
		
		assertEquals(expectedfeet, a.getFeet());
		assertEquals(expectedinches, a.getInches());	
	}
}
