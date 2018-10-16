package com.qa.myblackjack;

public class Blackjack 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	}
	
	public int play(int player, int dealer)
	{
		//code functionality here
		if(player > 0 && dealer > 0 && dealer <= 31 && player <= 31)
		{
			if(player > 21 && dealer > 21)
			{
				return 0;
			}
			else if(player <= 21 && dealer > 21 )
			{
				return player;
			}
			else if(dealer <= 21 && player > 21)
			{
				return dealer;
			}
			else if(player > dealer)
			{
				return (player > dealer ? player : dealer);
			}
			else
			{
				return dealer;
			}
		}
		else
		{
			return 0;
		}
		
	}

}
