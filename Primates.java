package com.ssa.zoo;

public class Primates extends Animals{
	
	private boolean walksOnTwoLegs = false;
	private boolean hasHair = false;
	
	
	public Primates(String species, int legs, int age, String name, boolean isWarmBlooded, int numberInExhibit, String food,
			boolean walksOnTwoLegs, boolean hasHair) {
		super(species, legs, age, name, isWarmBlooded, numberInExhibit, food);
		this.walksOnTwoLegs = walksOnTwoLegs;
		this.hasHair = hasHair;
	}


	@Override
	public String toString() {
		return "A " + species +  " They each have " + legs + " legs" + " They varied in age, but the Alpha is\n"
	+ age + " his name is " + name + "," + " They are warm blooded." + " There were " + numberInExhibit + " in the exhibit\n"
	+ " they are " + food + " they walk on 2 legs from time to time \n"
	+ "and they have course hair.";
	}





}
