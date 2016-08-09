package com.ssa.zoo;

public class BigCats extends Animals{
	
	private String huntingMethod = null;
	private String livingSituation = null;
	private String pattern = null;
	
	
	public BigCats(String species,int legs, int age, String name, boolean isWarmBlooded, int numberInExhibit, String food,
			String huntingMethod, String livingSituation, String pattern) {
		super(species, legs, age, name, isWarmBlooded, numberInExhibit, food);
		this.huntingMethod = huntingMethod;
		this.livingSituation = livingSituation;
		this.pattern = pattern;
	}


	@Override
	public String toString() {
		return "A " + species + " they have " + legs + " he is " + age + " and his name is " + name + ".\n"
				+ " They are Warm blooded meaning they regulate their own internal body temperature. \n"
				+ " Their were " + numberInExhibit + "," + " they are " + food + " they hunt in " + huntingMethod + "\n"
				+ " they live " + livingSituation + "," + " their coat is a" + pattern + "pattern.";
	}




	
	
	
}
