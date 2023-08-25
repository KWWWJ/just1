package PixyHands.Rate;

public class Rate {
	
	public int[] rate = new int[100];
	
	public void appeasement1()
	{
		for(int i = 0; i<rate.length; i++)
		{
			rate[i]=i;
			if(rate[i]<33) //33% 아이템 휙득
			{
				//아이템 휙득
			}
		}	
	}
	public void appeasement2()
	{
		for(int i = 0; i<rate.length; i++)
		{
			rate[i]=i;
			if(rate[i]<66) //66% 아이템 휙득
			{
				//아이템 휙득
			}
		}	
	}

	public void theat()
	{
		for(int i = 0; i<rate.length; i++)
		{
			rate[i]=i;
			if(rate[i]<99) //99% 아이템 휙득
			{
				//아이템 휙득
			}
			else
			{
				//hp가 7감소
			}
		}	
	}
}
