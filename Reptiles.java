package com.ssa.zoo;

public class Reptiles extends Animals{
	
	private boolean isSunBathing = false;
	private int numberOfEggs = 0;
	private String habitat = null;
	
	
	public Reptiles(String species,int legs, int age, String name, boolean isWarmBlooded, int numberInExhibit, String food,
			boolean isSunBathing, int numberOfEggs, String habitat) {
		super(species, legs, age, name, isWarmBlooded, numberInExhibit, food);
		this.isSunBathing = isSunBathing;
		this.numberOfEggs = numberOfEggs;
		this.habitat = habitat;
	}


	@Override
	public String toString() {
		return "A" + species + "They have " + legs + "legs. He is " + age + " his name is " + name + ".\n"
				+ " They are Cold Blooded which means they need to get their warmth from the sun or another heat source.\n"
				+ "There was only" + numberInExhibit + " in the exhibit." + " They are " + food + " and they sunbath to keep warm\n"
				+ "they typically lay " + numberOfEggs + " and live in the " + habitat + "."; 
				
	}





}
