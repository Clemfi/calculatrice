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
		assertEquals(4, maCalculette.addition(3,1),"Opération d'addition");
	}
	
	@Test
	void testSoustraction() 
	{
		double expected = 4;
		double actual = maCalculette.soustraction(3,1);
		assertEquals(expected, actual,"Opération d'addition");
	}
	
	@Test
	void testMultiplication() 
	{
		double expected = 4;
		double actual = maCalculette.multiplication(3,1);
		assertEquals(expected, actual,"Opération d'addition");
	}
	
	@Test
	void testDivision() 
	{
		double expected = 4;
		double actual = maCalculette.division(3,1);
		assertEquals(expected, actual,"Opération d'addition");
	}
}
