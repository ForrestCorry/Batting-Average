package com.ssa.zoo;

import java.util.ArrayList;

public class Zoo {

	public static void main(String[] args) {
		
		ArrayList<Animals>myZoo = new ArrayList<>();
		
		Primates Chimp = new Primates("Chimpanzee",2, 12, "Rodger", true, 10, "Omnivour", true, true);
		Primates Orangetane = new Primates("Orangetane",2, 23, "Steve", true, 2, "Herbavour", true, true);
		Primates Gorilla = new Primates("Gorilla",2, 14, "Hercules", true, 6, "Herbavour", true, true);
		Primates Baboon = new Primates("Baboon",2, 10, "Billy", true, 10, "Omnivours", true, true);
		
		Reptiles Snake = new Reptiles("Snake",0, 5, "Slither", false, 1, "Carnivour", true, 3, "Desert");
		Reptiles Lizard = new Reptiles("Lizard",4, 2, "George", false, 1, "Carnivour", false, 3, "Rain Forest");
		Reptiles Turtle = new Reptiles("Turtle",4, 30, "Cal", false, 4, "Omnivour", true, 5, "Wet Lands");
		
		BigCats Lion = new BigCats("Lion",4, 6, "Simba", true, 8, "Carnivour", "Pack Hunting", "In a Pride", "Solid");
		BigCats Tiger = new BigCats("Tiger",4, 4, "Shircahn", true, 1, "Carnivour", "Lone Stalker", "Loner", "Stripes");
		BigCats Cheetah = new BigCats("Cheetah",4, 5, "Speedy", true, 2, "Carnivour", "Stalker", "Loner", "Spots");

		
		myZoo.add(Chimp);
		myZoo.add(Orangetane);
		myZoo.add(Gorilla);
		myZoo.add(Snake);
		myZoo.add(Lizard);
		myZoo.add(Turtle);
		myZoo.add(Tiger);
		myZoo.add(Lion);
		myZoo.add(Cheetah);
		myZoo.add(Baboon);
		
		
		System.out.println("Today at the zoo I saw: ");
		for (int i = 0; i < myZoo.size(); i++) {
			System.out.println(myZoo.get(i));
			 
			
		}
		
	}
	
	

}
