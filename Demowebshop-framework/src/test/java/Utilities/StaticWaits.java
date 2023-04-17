package Utilities;

import Constants.Constant;

public class StaticWaits {

	 
			public void staticShortWait()
			{
				try 
				{
					Thread.sleep(Constant.SHORT_WAIT);
				} 
				catch(InterruptedException e) 
				{
					e.printStackTrace();
				}
			}
			
			public static void staticMediumWait()
			{
				try 
				{
					Thread.sleep(Constant.MEDIUM_WAIT);
				} 
				catch(InterruptedException e) 
				{
					e.printStackTrace();
				}
			}
			
			public static void staticLongWait()
			{
				try 
				{
					Thread.sleep(Constant.LONG_WAIT);
				} 
				catch(InterruptedException e) 
				{
					e.printStackTrace();
				}
			}
		
	}
