package Calculatrice;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;


public class calculetteTest {

	static calculette maCalculette;
	
	@BeforeClass
	public static void ini() {
		maCalculette = new calculette();
		if(maCalculette == null) {
			System.out.println("maCalculette is null");
			System.exit(0);
		}
		else {
			System.out.println("maCalculette has been initate");
		}
	}
	
	@Before
	public void space() {
		System.out.println("\n");
	}
	
	@Test
	public void testAddition() 
	{
		assertEquals(8, maCalculette.addition(3,5));
		System.out.println("testAddition is good !");
	}
	
	@Test
	public void testSoustraction() 
	{
		maCalculette = new calculette();
		assertEquals(2, maCalculette.soustraction(5,3),"Opération de soustraction");
		System.out.println("testSoustraction is good !");
	}
	
	@Test
	public void testMultiplication() 
	{
		assertEquals(15, maCalculette.multiplication(3,5),"Opération de multiplication");
		System.out.println("testMultiplication is good !");
	}
	
	@Test
	public void testDivision() 
	{
		assertEquals(2, maCalculette.division(10,5),"Opération dde division");
		System.out.println("testDivision is good !");
	}
}
