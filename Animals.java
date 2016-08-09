package com.ssa.zoo;

public class Animals {
	
	protected String species = null;
	protected int legs = 0;
	protected int age = 0;
	protected String name = null;
	protected boolean isWarmBlooded = false;
	protected int numberInExhibit = 0;
	protected String food = null;
	
	
	
	public Animals(String species, int legs, int age, String name, boolean isWarmBlooded, int numberInExhibit, String food) {
		super();
		this.species = species;
		this.legs = legs;
		this.age = age;
		this.name = name;
		this.isWarmBlooded = isWarmBlooded;
		this.numberInExhibit = numberInExhibit;
		this.food = food;
	}
	
	
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public int getLegs() {
		return legs;
	}
	public void setLegs(int legs) {
		this.legs = legs;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isWarmBlooded() {
		return isWarmBlooded;
	}
	public void setWarmBlooded(boolean isWarmBlooded) {
		this.isWarmBlooded = isWarmBlooded;
	}
	public int getNumberInExhibit() {
		return numberInExhibit;
	}
	public void setNumberInExhibit(int numberInExhitbit) {
		this.numberInExhibit = numberInExhitbit;
	}
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	
	
	

}
