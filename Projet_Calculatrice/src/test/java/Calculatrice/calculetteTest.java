package Calculatrice;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.JRE;

import CalculatriceSimple.test;

public class calculetteTest {

	calculette macalculette;
	@BeforeEach
	void ini() {
		macalculette = new calculette();
	}
	
	@Test
	@EnabledOnJre(JRE.JAVA_15)
	
	void testaddition() 
	{
		double expected = 0;
		double actual = macalculette.addition(3,1);
		assertEquals(expected, actual,"Opération d'addition");
	}
	
	void testsoustraction() 
	{
		double expected = 4;
		double actual = macalculette.soustraction(3,1);
		assertEquals(expected, actual,"Opération d'addition");
	}
	
	void testmultiplication() 
	{
		double expected = 4;
		double actual = macalculette.multiplication(3,1);
		assertEquals(expected, actual,"Opération d'addition");
	}
	
	void testdivision() 
	{
		double expected = 4;
		double actual = macalculette.division(3,1);
		assertEquals(expected, actual,"Opération d'addition");
	}
}
