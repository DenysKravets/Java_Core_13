package ua.lviv.lgs;

import java.util.*;

public class Deputy extends Person
{

	private String name;
	private String surname;
	private int age;
	private boolean bribeTaker;
	private int bribe;
	
	public Deputy(int height, int weight, String name, String surname, int age, boolean bribeTaker) 
	{
		super(height, weight);
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.bribeTaker = bribeTaker;
		this.bribe = 0;
	}
	
	public void bribe()
	{
		if(!this.bribeTaker)
		{
			System.out.println("\nThis deputy doesn't take bribes.");
		}
		else 
		{
			Scanner scan = new Scanner(System.in);
			int bribe = scan.nextInt();
			
			scan.close();
			
			if(bribe > 5000)
			{
				System.out.println("‘ß•ß‚µ‚¿‚á‚¤‚¼!");
			}
			else
			{
				this.bribe += bribe;
			}
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isBribeTaker() {
		return bribeTaker;
	}

	public void setBribeTaker(boolean bribeTaker) {
		this.bribeTaker = bribeTaker;
	}

	public int getBribe() {
		return bribe;
	}

	public void setBribe(int bribe) {
		this.bribe = bribe;
	}

	@Override
	public String toString() {
		return "Deputy [name=" + name + ", surname=" + surname + ", age=" + age + ", bribeTaker=" + bribeTaker
				+ ", bribe=" + bribe + ", getHeight()=" + getHeight() + ", toString()=" + super.toString() + "]";
	}

}
