package Calculatrice;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.JRE;


public class calculetteTest {

	calculette maCalculette;
	@BeforeEach
	void ini() {
		maCalculette = new calculette();
	}
	
	@Test
	void testAddition() 
	{
		assertEquals(4, maCalculette.addition(3,5),"Op�ration d'addition");
	}
	
	@Test
	void testSoustraction() 
	{
		assertEquals(4, maCalculette.soustraction(3,5),"Op�ration de soustraction");
	}
	
	@Test
	void testMultiplication() 
	{
		assertEquals(4, maCalculette.multiplication(3,5),"Op�ration de multiplication");
	}
	
	@Test
	void testDivision() 
	{
		assertEquals(4, maCalculette.division(3,5),"Op�ration dde division");
	}
}
