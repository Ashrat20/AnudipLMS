package junitpack;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest 
{
	//Test method for Addition
	@Test
	public void testadd() 
	{
		assertEquals(12,Calculator.add(6,6));
		assertEquals(10,Calculator.add(6,4));
	}
	
	//Test method for Subtraction
	@Test
	public void testsub() 
	{
		assertEquals(3,Calculator.sub(6,3));
		assertEquals(-4,Calculator.sub(6,10));
	}
	
	//Test method for Multiplication
	@Test
	public void testMul() 
	{
		assertEquals(18,Calculator.Mul(6,3));
		assertEquals(-60,Calculator.Mul(6,-10));
	}
	
	//Test method for division
	@Test  
    public void testDiv()
	{   
		assertEquals(3,Calculator.div(6,2));
    }
	//Test method for divide by zero exception
	@Test
    public void testDivideByZero() 
	{
		try
		{
			Calculator.div(6, 0);
		}
        catch (ArithmeticException e) 
		{
            assertEquals("Cannot divide by zero", e.getMessage());
        }
    }
}
