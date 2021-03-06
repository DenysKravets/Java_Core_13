package ua.lviv.lgs;

import java.util.*;
import java.util.stream.Collectors;

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
	
	public Party searchParty(String name)
	{
		return parties.stream().filter(b -> name.equals(b.getName())).findFirst().get();
	}
	
	public void showTAllDeputiesInParty()
	{
		System.out.println("\nIn order to show you all deputies of the party please enter following information.");
		
		System.out.println("Enter party name: ");
		Scanner scan = new Scanner(System.in);
		
		String name = scan.next();
		
		searchParty(name).showMembers();
		
	}
	
	public void clearParty()
	{
		System.out.println("\nYou are clearing a party, please enter following information..");
		
		System.out.println("Enter party name: ");
		Scanner scan = new Scanner(System.in);
		
		String name = scan.next();
		
		searchParty(name).extermination();
		
	}
	
	public void showTheBiggestBribeTakerInParty()
	{
		System.out.println("\nIn order to show you the biggest briber taker of the party please enter following information.");
		
		System.out.println("Enter party name: ");
		Scanner scan = new Scanner(System.in);
		
		String name = scan.next();

		searchParty(name).showTheBiggestBribeTaker();
		
	}
	
	public void showAllBribeTakersOfParty()
	{
		System.out.println("\nIn order to show you all briber takers of the party please enter following information.");
		
		System.out.println("Enter party name: ");
		Scanner scan = new Scanner(System.in);
		
		String name = scan.next();

		searchParty(name).showAllBribeTakers();
		
	}
	
	public void removeDeputyFromParty()
	{
		System.out.println("\nYou are removing a deputy from a party, please enter following information.");
		
		System.out.println("Enter party name: ");
		Scanner scan = new Scanner(System.in);
		
		String name = scan.next();

		searchParty(name).removeDeputy();
		
	}
	
	public void addDeputyToParty()
	{
		System.out.println("\nYou are adding a deputy to a party, please enter following information.");
		
		System.out.println("Enter party name: ");
		Scanner scan = new Scanner(System.in);
		
		String name = scan.next();

		searchParty(name).addDeputy();
		
	}
	
	public void showParty()
	{
		System.out.println("\nTo search party by it's name enter following information:");
		
		System.out.println("Enter name: ");
		Scanner scan = new Scanner(System.in);
		
		String name = scan.next();

		System.out.println(searchParty(name));
	}
	
	public void showParties()
	{
		parties.stream().forEach(b -> System.out.println(b));
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
		
		parties = (ArrayList<Party>) parties.stream().filter(b -> !(name.equals(b.getName()))).collect(Collectors.toList());
	}
}
