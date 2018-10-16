package com.qa.myblackjack;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class Normal 
{
	@Test
	public void test6()
	{
		Blackjack b  = new Blackjack();	
		assertEquals("2 low invalid entries", 12, b.play(10, 12));
	}
	@Test
	public void test7()
	{
		Blackjack b  = new Blackjack();	
		assertEquals("2 low invalid entries", 12, b.play(12, 10));
	}
	@Test
	public void test8()
	{
		Blackjack b  = new Blackjack();	
		assertEquals("2 low invalid entries", 10, b.play(10, 22));
	}
}
