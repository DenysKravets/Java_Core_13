package ua.lviv.lgs;

import java.util.*;

public class Main {

	public static void main(String[] args) 
	{
		/*
		Deputy po4ka = new Deputy(10, 10, "Ivan", "Ivanov", 10, true);
		Deputy po4e4ka = new Deputy(10, 10, "Po4ka", "Ivanov", 10, false);

		Party ka4ka = new Party("ka4ka");
		
		po4ka.setBribe(600);
		
		ka4ka.addDeputy(po4e4ka);
		ka4ka.addDeputy(po4e4ka);
		ka4ka.addDeputy(po4e4ka);
		ka4ka.addDeputy(po4e4ka);
		ka4ka.addDeputy(po4ka);
		ka4ka.addDeputy(po4ka);
		ka4ka.addDeputy(po4e4ka);
		ka4ka.addDeputy(po4ka);
		
		
		ka4ka.showMembers();
		ka4ka.sortDeputyByBribe();
		
		System.out.println("\n\n\n\n");
		ka4ka.showTheBiggestBribeTaker();
		
		System.out.println("\n\n\n\n");
		
		Party ko4ka = new Party("ko4ka");
		
		VerkhovnaRada verkhovnaRada = VerkhovnaRada.getInstance();
		
		verkhovnaRada.addParty();
		verkhovnaRada.addDeputyToParty();
		
		verkhovnaRada.showParties();
	
		*/
		
		VerkhovnaRada verkhovnaRada = VerkhovnaRada.getInstance();
		
		boolean key = true;
		Scanner scan = new Scanner(System.in);
		
		while(key)
		{
			System.out.println("\nWelcome to Verkhovna Rada Menu."
					+ "\nEnter 1 to add a party;"
					+ "\nEnter 2 to remove a party;"
					+ "\nEnter 3 to show all parties;"
					+ "\nEnter 4 to clear a party;"
					+ "\nEnter 5 to show a party by name;"
					+ "\nEnter 6 to add deputy to a party;"
					+ "\nEnter 7 to remove deputy from a party;"
					+ "\nEnter 8 to see list of bribe takers"
					+ "\nEnter 9 to see the biggest bribe taker"
					+ "\nEnter 0 to leave menu;");
			
			int decision = scan.nextInt();
			
			switch(decision)
			{
			case 1:
			{
				verkhovnaRada.addParty();
				break;
			}
			case 2:
			{
				verkhovnaRada.removeParty();
				break;
			}
			case 3:
			{
				verkhovnaRada.showParties();
				break;
			}
			case 4:
			{
				verkhovnaRada.clearParty();
				break;
			}
			case 5:
			{
				verkhovnaRada.showParty();
				break;
			}
			case 6:
			{
				verkhovnaRada.addDeputyToParty();
				break;
			}
			case 7:
			{
				verkhovnaRada.removeDeputyFromParty();
				break;
			}
			case 8:
			{
				verkhovnaRada.showAllBribeTakersOfParty();
				break;
			}
			case 9:
			{
				verkhovnaRada.showTheBiggestBribeTakerInParty();
				break;
			}
			case 0:
			{
				key = false;
				break;
			}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
