package com.qa.myblackjack;

import static org.junit.Assert.*;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)

public class blackjacktest2 
{
	@Parameters	
	public static Collection<Object[]>data()
	{
		return Arrays.asList(new Object[][] { {0,-10,-10}, {0,-10,10}, 
			{0,-10,20} ,{10,30,10},{0,10,0},{12,10,12},{0,30,30},{12,12,10} });
	}
	
	private int inPut1;
	private int inPut2;
	private int expected;
	
	
	public blackjacktest2(int expected, int input1, int input2)
	{
		this.inPut1 = input1;
		this.inPut2 = input2;
		this.expected = expected;
	}
	
	@Test
	public void test()
	{
		Blackjack b = new Blackjack();
		assertEquals(expected, b.play(inPut1, inPut2) );
	}

}

