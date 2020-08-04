package ua.lviv.lgs;

import java.util.*;
import java.util.stream.*;

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
		deputies = new ArrayList<Deputy>();
	}
	
	public void showTheBiggestBribeTaker()
	{
		Stream<Deputy> stream = deputies.stream();
		System.out.println(stream.max(new DeputyBribeComparator()).get());
	}
	
	public void showAllBribeTakers()
	{
		Stream<Deputy> stream = deputies.stream();
		stream.filter(Deputy::isBribeTaker).forEach(b -> System.out.println(b));
	}
	
	public void showMembers()
	{
		deputies.stream().forEach(b -> System.out.println(b));
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
		deputies = (ArrayList<Deputy>) deputies.stream().sorted(new DeputyBribeComparator()).collect(Collectors.toList());
	}
	
	public void removeDeputy()
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("You are removing a deputy from party " + this.name + ", please enter following information.");
		
		System.out.println("Enter name: ");
		String name = scan.nextLine();
		System.out.println("Enter surname: ");
		String surname = scan.nextLine();
		
		deputies = (ArrayList<Deputy>) deputies.stream().
				filter(b -> !(name.equals(b.getName()) && surname.equals(b.getSurname()))).
				collect(Collectors.toList());
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
