package com.qa.myblackjack;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Invalid 
{
	@Test
	public void test1()
	{
		Blackjack b  = new Blackjack();	
		assertEquals("2 low invalid entries", 0, b.play(-10, -10));
	}
	@Test
	public void test2()
	{
		Blackjack b  = new Blackjack();	
		assertEquals("2 low invalid entries", 0, b.play(-10, 10));
	}
	@Test
	public void test3()
	{
		Blackjack b  = new Blackjack();	
		assertEquals("2 low invalid entries", 0, b.play(-10, 20));
	}
	@Test
	public void test4()
	{
		Blackjack b  = new Blackjack();	
		assertEquals("2 low invalid entries", 0, b.play(-10, 50));
	}
	@Test
	public void test5()
	{
		Blackjack b  = new Blackjack();	
		assertEquals("2 low invalid entries", 0, b.play(10, 0));
	}
	@Test
	public void test10()
	{
		Blackjack b  = new Blackjack();	
		assertEquals("2 low invalid entries", 0, b.play(30, -10));
	}
	@Test
	public void test15()
	{
		Blackjack b  = new Blackjack();	
		assertEquals("2 low invalid entries", 0, b.play(35, 10));
	}
	@Test
	public void test13()
	{
		Blackjack b  = new Blackjack();	
		assertEquals("2 low invalid entries", 0, b.play(30, 50));
	}
}
