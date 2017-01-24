package com.main;

import java.util.ArrayList;
import java.util.Scanner;



public class Main {
	ArrayList <MonkeyWarior> warriorsList = new ArrayList<MonkeyWarior>();
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <MonkeyWarior> warriorsList = new ArrayList<MonkeyWarior>();
		
		Scanner keyboard = new Scanner(System.in);
		StringBuffer greetings = new StringBuffer("Welcome to program that " +
				"maintains monkey war gymnasium");
	
		greetings.append("\nYou can press: ");
		greetings.append("\n\"a\" for adding next competitor");
		greetings.append("\n\"r\" for removing one of competitors");
		greetings.append("\n\"s\" for checking status of the group (is it full or not)");
		
		System.out.println(greetings);
		
		System.out.println("what you want to do ?");
		char option = keyboard.nextLine().charAt(0);
		Main m = new Main();
			switch (option){
			case 'a' : System.out.println("adding monkey, follow instructions");
					   m.addMoneky();
					   warriorsList.add(newWarrior);
					   break; //adding
			case 'r' : System.out.println("removing monkey, follow instructions");break; //removing
			case 's' : System.out.println("checking status: ");break; // status of group full /not full 
			default: System.out.println("MOROAN you had just 3 choices and somehow you managed to press the wrong " +
					"\nbutton When i will finally figure a way to rule the world i will execute people like you");
			}
			System.out.println("Up to date warrior list" + warriorsList.size());
			for(int i = 0; i < warriorsList.size(); i++) {   
			    System.out.print(warriorsList.get(i));
			} 
	}
	public  MonkeyWarior addMoneky(){
		
		Scanner wprowadzaneDane = new Scanner(System.in);
		System.out.println("Podaj id:");
		int id= wprowadzaneDane.nextInt();
		System.out.println("Podaj imie: ");
		String name = wprowadzaneDane.next();
		
		MonkeyWarior newWarrior  = new MonkeyWarior(id, name);
		warriorsList.add(newWarrior);
		
		System.out.println("Stworzyłeś obiekt o danych: " + id + " "+ name);
		System.out.println("warriorList size inside method is: " + warriorsList.size());
		return newWarrior;
		
	}

}
