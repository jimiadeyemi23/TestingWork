package com.qa.myblackjack;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BlackjackTest 
{
	static int x = 0;
	
	@BeforeClass
	public static void before()
	{
		x = 1;
		System.out.print("Welcome to my test");
	}
	
	@Before
	public void setup()
	{
		System.out.println("Test " + x + "/17");
	}
	
	@After
	public void teardown()
	{
		System.out.println("Test " + x + "/17");
		x++;
	}
	
	@AfterClass
	public static void ending()
	{	
		System.out.println("Test class Complete");
	}
	
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
	@Test
	public void test9()
	{
		Blackjack b  = new Blackjack();	
		assertEquals("2 low invalid entries", 0, b.play(10, 32));
	}
	
	
	@Test
	public void test10()
	{
		Blackjack b  = new Blackjack();	
		assertEquals("2 low invalid entries", 0, b.play(30, -10));
	}
	
	@Test
	public void test11()
	{
		Blackjack b  = new Blackjack();	
		assertEquals("2 low invalid entries", 10, b.play(30, 10));
	}
	@Test
	public void test12()
	{
		Blackjack b  = new Blackjack();	
		assertEquals("2 low invalid entries", 0, b.play(30, 30));
	}
	@Test
	public void test13()
	{
		Blackjack b  = new Blackjack();	
		assertEquals("2 low invalid entries", 0, b.play(30, 50));
	}
	
	@Test
	public void test14()
	{
		Blackjack b  = new Blackjack();	
		assertEquals("2 low invalid entries", 10, b.play(10, 30));
	}
	@Test
	public void test15()
	{
		Blackjack b  = new Blackjack();	
		assertEquals("2 low invalid entries", 0, b.play(35, 10));
	}
	@Test
	public void test16()
	{
		Blackjack b  = new Blackjack();	
		assertEquals("2 low invalid entries", 0, b.play(30, 25));
	}
	@Test
	public void test17()
	{
		Blackjack b  = new Blackjack();	
		assertEquals("2 low invalid entries", 0, b.play(35, 25));
	}
}
