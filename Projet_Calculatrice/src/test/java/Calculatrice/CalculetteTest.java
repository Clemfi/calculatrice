package Calculatrice;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Color;

import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculetteTest {
	
	static calculette maCalculette;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {

		maCalculette = new calculette();
		if(maCalculette == null) {
			System.out.println("maCalculette is null");
			System.exit(0);
		}
		else {
			System.out.println("maCalculette has been initate");
		}
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("\n");
	}

	
	@BeforeClass
	public static void ini() {
	}

	
	@Test
	public void testAddition() 
	{
		assertEquals(8, maCalculette.addition(3,5));
		System.out.println("testAddition is done !");
	}
	
	@Test
	public void testSoustraction() 
	{
		assertEquals(2, maCalculette.soustraction(5,3),"Opération de soustraction");
		System.out.println("testSoustraction is done !");
	}
	
	@Test
	public void testSoustractionFail() 
	{		
		assertEquals(2, maCalculette.soustraction(18,3),"Opération de soustraction");
		System.out.println("testSoustraction is fail !");
	}
	
	@Test
	public void testMultiplication() 
	{
		assertEquals(15, maCalculette.multiplication(3,5),"Opération de multiplication");
		System.out.println("testMultiplication is done !");
	}
	
	@Test
	public void testDivision() 
	{
		assertEquals(2, maCalculette.division(10,5),"Opération dde division");
		System.out.println("testDivision is done !");
	}
	
	@Test
	public void testCalcul() {
		assertEquals("6", maCalculette.calculOperation(3, 3, "+"));
		System.out.println("Test result displayed on the screen is done !");
	}
	
	@Test
	public void testEcran() {
		assertEquals("0",maCalculette.getJlabel().getText());
		System.out.println("Test text from calculette's label done ! ");
	}
	
	@Test
	public void testColorJLabel() {
		assertEquals(Color.BLUE, maCalculette.getJlabelColor());
		System.out.println("Test JLabel's color is done !");
	}

}
