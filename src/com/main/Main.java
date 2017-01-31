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

	public static void main(String[] args) {
	
		// OBIEKT TESTOWY
		MonkeyWarior test = new MonkeyWarior(0,"test");
		MonkeyWarior test1 = new MonkeyWarior(1,"test1");
		MonkeyWarior test2 = new MonkeyWarior(2,"test2");
		Main m = new Main();
		warriorsList.add(test);
		warriorsList.add(test1);
		warriorsList.add(test2);
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
		
		System.out.println("a");
		char option = keyboard.nextLine().charAt(0);
		
			switch (option){
			case 'a' : System.out.println("adding monkey, follow instructions");
					   if (warriorsList.size()==maxSizeOfGymnasium){
						   
						   System.out.println("Max size reached remove to add ");
					   }else{
						    MonkeyWarior m1 = MonkeyWarior.addMoneky();
					   warriorsList.add(m1);
					   }
					   return;
			case 'r' : System.out.println("removing monkey, follow instructions");break; //removing
			case 's' : System.out.println("checking status: ");break; // status of group full /not full 
			default: System.out.println("MOROAN you had just 3 choices and somehow you managed to press the wrong " +
					"\nbutton When i will finally figure a way to rule the world i will execute people like you");
			}
			System.out.println("List of all warriors");
			for(int i = 0; i < warriorsList.size(); i++) {   
			    System.out.print("id= "+ warriorsList.get(i).getId() + " name: " + warriorsList.get(i).getName());
			} 
			System.out.println("\nstatus summary: " + warriorsList.size());
	}

	

	public void removeMonkey(){
		System.out.println("podaj imie małpy którą chcesz usunąć");
		String name = keyboard.next();
		//int pos = warriorsList.indexOf(name);
		public int checkWhich(){
		 for (int i=0; i<warriorsList.size();i++){
			if (name.equals(warriorsList.get(i).getName())){
				return i;
			}
		 } 
		 return 0;
	    }
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
