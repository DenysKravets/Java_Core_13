package ua.lviv.lgs;

import java.util.*;

public class VerkhovnaRada 
{
	private static VerkhovnaRada single_instance = null;
	
	private ArrayList<Party> parties = new ArrayList<Party>();
	
	private VerkhovnaRada()
	{
		
	}
	
	public static VerkhovnaRada getInstance()
	{
		if (single_instance == null) 
		{
			single_instance = new VerkhovnaRada(); 
		}
	  
		return single_instance; 
	}
	
	//Methods
	
	public void showTAllDeputiesInParty()
	{
		System.out.println("\nIn order to show you all deputies of the party please enter following information.");
		
		System.out.println("Enter party name: ");
		Scanner scan = new Scanner(System.in);
		
		String name = scan.next();
		
		Iterator<Party> iterator = this.parties.iterator();
		
		while(iterator.hasNext())
		{
			Party party = iterator.next();
			
			if(party.getName().equals(name))
			{
				party.showMembers();
			}
		}
		
	}
	
	public void clearParty()
	{
		System.out.println("\nYou are clearing a party, please enter following information..");
		
		System.out.println("Enter party name: ");
		Scanner scan = new Scanner(System.in);
		
		String name = scan.next();
		
		Iterator<Party> iterator = this.parties.iterator();
		
		while(iterator.hasNext())
		{
			Party party = iterator.next();
			
			if(party.getName().equals(name))
			{
				party.extermination();
			}
		}
		
	}
	
	public void showTheBiggestBribeTakerInParty()
	{
		System.out.println("\nIn order to show you the biggest briber taker of the party please enter following information.");
		
		System.out.println("Enter party name: ");
		Scanner scan = new Scanner(System.in);
		
		String name = scan.next();
		
		Iterator<Party> iterator = this.parties.iterator();
		
		while(iterator.hasNext())
		{
			Party party = iterator.next();
			
			if(party.getName().equals(name))
			{
				party.showTheBiggestBribeTaker();
			}
		}
		
	}
	
	public void showAllBribeTakersOfParty()
	{
		System.out.println("\nIn order to show you all briber takers of the party please enter following information.");
		
		System.out.println("Enter party name: ");
		Scanner scan = new Scanner(System.in);
		
		String name = scan.next();
		
		Iterator<Party> iterator = this.parties.iterator();
		
		while(iterator.hasNext())
		{
			Party party = iterator.next();
			
			if(party.getName().equals(name))
			{
				party.showAllBribeTakers();
			}
		}
		
	}
	
	public void removeDeputyFromParty()
	{
		System.out.println("\nYou are removing a deputy from a party, please enter following information.");
		
		System.out.println("Enter party name: ");
		Scanner scan = new Scanner(System.in);
		
		String name = scan.next();
		
		Iterator<Party> iterator = this.parties.iterator();
		
		while(iterator.hasNext())
		{
			Party party = iterator.next();
			
			if(party.getName().equals(name))
			{
				party.removeDeputy();
			}
		}
		
	}
	
	public void addDeputyToParty()
	{
		System.out.println("\nYou are adding a deputy to a party, please enter following information.");
		
		System.out.println("Enter party name: ");
		Scanner scan = new Scanner(System.in);
		
		String name = scan.next();
		
		Iterator<Party> iterator = this.parties.iterator();
		
		while(iterator.hasNext())
		{
			Party party = iterator.next();
			
			if(party.getName().equals(name))
			{
				party.addDeputy();
			}
		}
		
	}
	
	public void showParty()
	{
		System.out.println("\nTo search party by it's name enter following information:");
		
		System.out.println("Enter name: ");
		Scanner scan = new Scanner(System.in);
		
		String name = scan.next();
		
		Iterator<Party> iterator = this.parties.iterator();
		
		while(iterator.hasNext())
		{
			Party party = iterator.next();
			
			if(party.getName().equals(name))
			{
				System.out.println(party);
			}
		}
	}
	
	public void showParties()
	{
		Iterator<Party> iterator = this.parties.iterator();
		
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}
	
	public void addParty(Party party)
	{
		this.parties.add(party);
	}
	
	public void addParty()
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nYou are adding a party to VerkhovnaRada, please enter following information.");
		System.out.println("Enter name of the party: ");
		String name = scan.next();
		

		
		this.parties.add(new Party(name));
	}
	
	public void removeParty()
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nYou are removing a party from VerkhovnaRada, please enter following information.");
		System.out.println("Enter name of the party: ");
		String name = scan.next();
		

		
		Iterator<Party> iterator = this.parties.iterator();
		
		while(iterator.hasNext())
		{
			Party party = iterator.next();
			if(party.getName().equals(name))
			{
				iterator.remove();
				System.out.println("You successfully removed a party.");
			}
		}
	}
}
