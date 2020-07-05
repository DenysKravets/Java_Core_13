package ua.lviv.lgs;

import java.util.*;

public class Party 
{
	private String name;
	private ArrayList<Deputy> deputies = new ArrayList<Deputy>();
	
	Party(String name)
	{
		this.name = name;
	}
	
	public void extermination()
	{
		Iterator<Deputy> iterator = this.deputies.iterator();
		
		while(iterator.hasNext())
		{
			iterator.next();
			iterator.remove();
		}
	}
	
	public void showTheBiggestBribeTaker()
	{
		System.out.println(Collections.max(this.deputies, new DeputyBribeComparator()));
	}
	
	public void showAllBribeTakers()
	{
		Iterator<Deputy> iterator = this.deputies.iterator();
		
		while(iterator.hasNext())
		{
			Deputy deputy = iterator.next();
			
			if(deputy.isBribeTaker())
			{
				System.out.println(deputy);
			}
		}
	}
	
	public void showMembers()
	{
		Iterator<Deputy> iterator = this.deputies.iterator();
		
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}
	
	public void addDeputy(Deputy deputy)
	{
		this.deputies.add(deputy);
	}
	
	public void addDeputy()
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nYou are adding a deputy to party " + this.name + ", please enter following information.");
		
		System.out.println("Enter height: ");
		int height = scan.nextInt();
		System.out.println("Enter weight: ");
		int weight = scan.nextInt();
		System.out.println("Enter name: ");
		String name = scan.next();
		System.out.println("Enter surname: ");
		String surname = scan.next();
		System.out.println("Enter age: ");
		int age = scan.nextInt();
		System.out.println("Enter whether the deputy is a bribe taker: ");
		boolean bribeTaker = scan.nextBoolean();
		
		
		this.deputies.add(new Deputy(height, weight, name, surname, age, bribeTaker));
	}
	
	public void sortDeputyByBribe()
	{
		Collections.sort(deputies, new DeputyBribeComparator());
	}
	
	public void removeDeputy()
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("You are removing a deputy from party " + this.name + ", please enter following information.");
		
		System.out.println("Enter name: ");
		String name = scan.nextLine();
		System.out.println("Enter surname: ");
		String surname = scan.nextLine();
		
		
		Iterator<Deputy> iterator = this.deputies.iterator();
		
		while(iterator.hasNext())
		{
			Deputy deputy = iterator.next();
			if(deputy.getName().equals(name) && deputy.getSurname().equals(surname))
			{
				iterator.remove();
				System.out.println("You successfully removed a deputy.");
			}
		}
	}
	
	public String getName()
	{
		return this.name;
	}

	@Override
	public String toString() {
		return "Party [name=" + name + ", deputies=" + deputies + "]";
	}


	
	
}
