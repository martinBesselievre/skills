package com.mycompany.maths;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class OperationsTest 
{
	protected Operations op;

	@Before
	public void setUp(){
		op = new Operations();
	}
	@After
	public void tearDown(){
	}

    @Test
    public void add() 
    {
        int result = op.add(2,5);
        assertEquals(result, 7);
    }
    @Test
    public void sub() 
    {
    	int result = op.sub(3,1);
    	assertEquals(result, 2);
    }
    @Test
    public void mul() 
    {
    	int result = op.mul(6,3);
    	assertEquals(result, 18);
    }
    @Test
    public void div() 
    {
        int result = op.div(4,2);
        assertEquals(result, 2);
    }
    @Test(expected = ArithmeticException.class)
    public void divError() 
    {
        op.div(3,0);
    }
    @Test
    public void mod()
    {
        int result = op.mod(10,3);
        assertEquals(result, 1);
    }   
    @Test(expected = ArithmeticException.class)
    public void modError() 
    {
        op.mod(7,0);
    }
    
}
