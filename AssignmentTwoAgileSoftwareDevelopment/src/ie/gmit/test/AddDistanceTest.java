package ie.gmit.test;

import static org.junit.Assert.assertEquals;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import ie.gmit.dip.Distance;

public class AddDistanceTest {
	
	
	Distance D1;
	Distance D2;
	Distance D3;
	
	
	@Before
	public void setUp() throws Exception {
		
		
		D1 = new Distance();
		D2 = new Distance();
		D3 = new Distance();
	}

	@Test
	public void DistanceTest() {
		
		D1.setFeet(10);
		D1.setInches(10);
		
		D2.setFeet(20);
		D2.setInches(30);
				
		D3.addDistance(D1, D2);		
		
		assertEquals(33, D3.getFeet());
		assertEquals(400, D3.getInches());	
	}
}
