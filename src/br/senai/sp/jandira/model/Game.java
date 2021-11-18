package br.senai.sp.jandira.model;

public class Game {
	private String title;
	private String observations;
	
	private Developer developer;
	private Console console;
	
	private boolean finished;
	private double estimatedPrice;
	
	
	// Constructors
	public Game() {}
	
	public Game(String title, String observations, Developer developer, Console console, boolean finished, double estimatedPrice) {
		this.title = title;
		this.observations = observations;
		this.developer = developer;
		this.console = console;
		this.finished = finished;
		this.estimatedPrice = estimatedPrice;
	}
	
	// Setters & Getters;
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getObservations() {
		return observations;
	}
	
	public void setObservations(String observations) {
		this.observations = observations;
	}
	
	public Developer getDeveloper() {
		return developer;
	}
	
	public void setDeveloper(Developer developer) {
		this.developer = developer;
	}
	
	public Console getConsole() {
		return console;
	}
	
	public void setConsole(Console console) {
		this.console = console;
	}
	
	public boolean isFinished() {
		return finished;
	}
	
	public void setFinished(boolean finished) {
		this.finished = finished;
	}
	
	public double getEstimatedPrice() {
		return estimatedPrice;
	}
	
	public void setEstimatedPrice(double estimatedPrice) {
		this.estimatedPrice = estimatedPrice;
	}
	
	public void setEstimatedPrice(String estimatedPrice) {
		this.estimatedPrice = Integer.parseInt(estimatedPrice);
	}

	// Behaviors
	@Override
	public String toString() {
		return "Game { \n"
				+ "    title : " + this.title + ",\n"
				+ "    observations : " + this.observations + ",\n"
				+ "    developer : " + this.developer.getName() + ",\n"
				+ "    console : " + this.console.getName() + ",\n"
				+ "    finished : " + this.finished + ",\n"
				+ "    estimatedPrice : " + this.estimatedPrice + ",\n"
				+ "}";
	}
}
