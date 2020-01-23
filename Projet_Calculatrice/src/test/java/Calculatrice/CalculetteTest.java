package Calculatrice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
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
		assertAll(()-> assertEquals(8, maCalculette.addition(3,5),"Opération de addition"),
				()-> assertEquals(1, maCalculette.addition(3,5),"Opération de addition fail")
				);
		System.out.println("testAddition is done !");
	}
	
	@Test
	public void testSoustraction() 
	{
		assertAll(()-> assertEquals(2, maCalculette.soustraction(5,3),"Opération de soustraction"),
				()-> assertEquals(1, maCalculette.soustraction(3,5),"Opération de soustraction fail")
				);
		System.out.println("testSoustraction is done !");
	}
	
	@Test
	public void testMultiplication() 
	{
		assertAll(()-> assertEquals(15, maCalculette.multiplication(3,5),"Opération de multiplication"),
				()-> assertEquals(12, maCalculette.multiplication(3,5),"Opération de multiplication fail")
				);
		System.out.println("testMultiplication is done !");
	}
	
	@Test
	public void testDivision() 
	{
		assertAll(()-> assertEquals(2, maCalculette.division(10,5),"Opération dde division"),
				()-> assertEquals(12, maCalculette.division(10,2),"Opération de division fail")
				);
		System.out.println("testDivision is done !");
	}

}
