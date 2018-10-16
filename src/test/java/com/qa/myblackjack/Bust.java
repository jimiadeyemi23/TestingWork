package com.qa.myblackjack;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Bust 
{
	@Test
	public void test9()
	{
		Blackjack b  = new Blackjack();	
		assertEquals("Bust", 0, b.play(10, 32));
	}
	@Test
	public void test11()
	{
		Blackjack b  = new Blackjack();	
		assertEquals("Bust", 10, b.play(30, 10));
	}
	@Test
	public void test12()
	{
		Blackjack b  = new Blackjack();	
		assertEquals("Bust", 0, b.play(30, 30));
	}
	@Test
	public void test16()
	{
		Blackjack b  = new Blackjack();	
		assertEquals("Bust", 0, b.play(30, 25));
	}
	@Test
	public void test14()
	{
		Blackjack b  = new Blackjack();	
		assertEquals("Bust", 10, b.play(10, 30));
	}
	@Test
	public void test17()
	{
		Blackjack b  = new Blackjack();	
		assertEquals("Bust", 0, b.play(35, 25));
	}
}
