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
	public int feetD1;
	public int inchesD1;
	
	public int feetD2;
	public int inchesD2;
	
	public int expectedfeet;
	public int expectedinches;
	
	Distance D1;
	Distance D2;
	Distance D3;
	
	
	@Before
	public void setUp() throws Exception {
		
		D1 = new Distance();
		D2 = new Distance();
		D3 = new Distance(); 
		
	}

	
	
	public DistanceTest(int feetD1, int inchesD1, int feetD2, int inchesD2, int expectedfeet, int expectedinches) {
		super();
		this.feetD1 = feetD1;
		this.inchesD1 = inchesD1;
		this.feetD2 = feetD2;
		this.inchesD2 = inchesD2;
		this.expectedfeet = expectedfeet;
		this.expectedinches = expectedinches;
	}


	@Parameterized.Parameters
	public static Collection Numbers() {
		return Arrays.asList(new Object[][]{
			{10, 10, 20, 30, 33, 400},// correct
			{25, 300, 10, 600, 110, 1320},// correct
			{300, 100, 205, 30, 350, 600},// incorrect
			{100, 15, 70, 95, 90, 300}// incorrect
			
			
		});
	
	}
	@Test
	public void DistanceTest() {
		
		D1.setFeet(feetD1);
		D1.setInches(inchesD1);
		
		D2.setFeet(feetD2);
		D2.setInches(inchesD2);
		
		D3.addDistance(D1, D2);
		
		System.out.println("Feet	- Expected VS Total is: "+D3.feet+" VS "+ expectedfeet);
		System.out.println("Inches 	- Expected VS Total is: "+D3.inches+" VS "+ expectedinches);
		System.out.println();
		
		assertEquals(expectedfeet, D3.getFeet());
		assertEquals(expectedinches, D3.getInches());		
	}
}
