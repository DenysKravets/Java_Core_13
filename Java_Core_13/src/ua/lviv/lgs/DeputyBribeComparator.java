package ua.lviv.lgs;

import java.util.*;

public class DeputyBribeComparator implements Comparator<Deputy> 
{
	
	@Override
	public int compare(Deputy deputy1, Deputy deputy2) 
	{
		
		if(deputy1.getBribe() > deputy2.getBribe())
		{
			return 1;
		}
		else if(deputy1.getBribe() < deputy2.getBribe()) 
		{
			return -1;
		}
		
		return 0;
	}

}
