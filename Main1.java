package com.hcl;

import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
		
		String name;
		String country;
		String skill;
		Scanner s = new Scanner(System.in);
		System.out.println("Player Name:");
		name = s.nextLine();
		System.out.println("Country Name:");
		country = s.nextLine();
		System.out.println("Player Skills:");
		skill = s.nextLine();
		Player p = new Player(name, country, skill);
		System.out.println("player Details:");
		System.out.println("Player Name:"+p.getName());
		System.out.println("Country Name:"+p.getCountry());
		System.out.println("Player Skills:"+p.getSkill());

	}
}
