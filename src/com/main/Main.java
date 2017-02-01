package com.main;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * trzeba dodać try-catch do switch bo program wywala się gdy wciskam enter
 * trzeba dodać przy opcji usuwania możliwość usuwanie przez podanie id lub
 * imienia
 * 
 */

public class Main {
	private static int maxSizeOfGymnasium = 3; //
	static ArrayList<MonkeyWarior> warriorsList = new ArrayList<MonkeyWarior>(maxSizeOfGymnasium);
	static Scanner keyboard = new Scanner(System.in);
	static Main m = new Main();
	public static void main(String[] args) {
	
		// OBIEKT TESTOWY
		MonkeyWarior test = new MonkeyWarior(0,"test");
		MonkeyWarior test1 = new MonkeyWarior(1,"test1");
		MonkeyWarior test2 = new MonkeyWarior(2,"test2");
		//Main m = new Main();
		warriorsList.add(test);
		warriorsList.add(test1);
		//warriorsList.add(test2);
		System.out.print("Current size of gymnasium is: " + m.checkIfFull()+"\n");
		System.out.println("TEST OBJECT: ");
		System.out.println("Id= "+ warriorsList.get(0).getId() + " Name: " + 
		warriorsList.get(0).getName()+"\n");
	    //==========================================================================
		StringBuffer greetings = new StringBuffer("\nWelcome to program that " +
				"maintains monkey war gymnasium");
		
	
		greetings.append("\nYou can press: ");
		greetings.append("\n\"a\" for adding next competitor");
		greetings.append("\n\"r\" for removing one of competitors");
		greetings.append("\n\"s\" for checking status of the group (is it full or not)");
		
		System.out.println(greetings);
		
		
		char option = 'z';
		do {
			 System.out.print("waiting for input: ");
			 option = keyboard.nextLine().charAt(0);
			switch (option){
			// ADDING
			case 'a' : System.out.println("adding monkey, follow instructions");
					   if (warriorsList.size()==maxSizeOfGymnasium){
						   
						   System.out.println("Max size reached remove to add ");
						   
					   }else{
						    MonkeyWarior m1 = MonkeyWarior.addMoneky();
					   warriorsList.add(m1);
					   }
			           break;
			// REMOVING		   
			case 'r' : 
				System.out.println("removing monkey, follow instructions");
				int removedId = m.findMonkey();
				warriorsList.remove(removedId);
				break;
			// PRINTING LIST
			case 's' : 
				System.out.println("checking status: ");
				m.statusCheckUp();
				break; 
			// DEFAULT
			default: System.out.println("MOROAN you had just 3 choices and somehow you managed to press the wrong " +
					"\nbutton When i will finally figure a way to rule the world i will execute people like you");
			}
		}while(option !='e');
			
		
			/*System.out.println("List of all warriors");
			for(int i = 0; i < warriorsList.size(); i++) {   
			    System.out.print("id= "+ warriorsList.get(i).getId() + " name: " + warriorsList.get(i).getName());
			} 
			System.out.println("\nstatus summary: " + warriorsList.size()); */
	}
	public void statusCheckUp(){ 
		System.out.println("Number of competitors: "+ warriorsList.size() + "  of " + maxSizeOfGymnasium);
		for (int i = 0 ; i<warriorsList.size();i++){
			System.out.println(i+1 + ". id: " + warriorsList.get(i).getId() + " name: " + warriorsList.get(i).getName());
		}
	}
	

	public int findMonkey(){
		System.out.print("Insert monkey name: ");
		String name = new Scanner(System.in).next();
		 for(int i = 0; i < warriorsList.size(); i++){
			if (warriorsList.get(i).getName().equals(name)){
				
				System.out.println("Małpa o imieniu "+warriorsList.get(i).getName() +
						" ma id = "+warriorsList.get(i).getId()  );
				return i;
			}
		}		
		return 0;
		
	}
	
	public String checkIfFull() {
		Integer size = warriorsList.size();
		if (size == 3) {
			return "Max limit has been achieved";
		} else {
			return (size.toString());
		}

	}

}
