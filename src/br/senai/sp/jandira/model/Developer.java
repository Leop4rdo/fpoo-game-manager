package br.senai.sp.jandira.model;

public class Developer {
	private String name;
	private int yearOfFoundation;
	
	public Developer(String name, int yearOfFoundation) {
		this.name = name;
		this.yearOfFoundation = yearOfFoundation;
	}
	
	public String getName() {
		return name;
	}
	
	public int getYearOfFoundation() {
		return yearOfFoundation;
	}
	
	@Override
	public String toString() {
		return "Developer { \n"
				+ "    name : " + name + ",\n"
				+ "    yearOfFoundation : " + yearOfFoundation + "\n"
				+ "}";
	}
}
