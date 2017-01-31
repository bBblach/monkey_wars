package com.main;

import java.util.Scanner;

// to do: 
// wbudować drugi zaawansowany konstruktor korzystając z  już stworzonego 
public class MonkeyWarior {
static Scanner wprowadzaneDane = new Scanner(System.in);
		private int id;
		private String name;
		private int wins;
		private int loses;
		private String weightclass;
		private int attack;
		private int deffence;
		private int health;
		public MonkeyWarior(int id, String name) {
			super();
			this.id = id;
			this.name = name;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		} 
		
		public static MonkeyWarior addMoneky() {

			System.out.println("Podaj id:");
			int id = wprowadzaneDane.nextInt();
			System.out.println("Podaj imie: ");
			String name = wprowadzaneDane.next();

			MonkeyWarior newWarrior = new MonkeyWarior(id, name);
			System.out.println("Stworzyłeś obiekt o danych: " + id + " " + name);

			return newWarrior;

		}
}
