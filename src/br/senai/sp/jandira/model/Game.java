package br.senai.sp.jandira.model;

public class Game {
	private String title;
	private String observations;
	
	private Developer Developer;
	private Console console;
	
	private boolean finished;
	private double estimatedPrice;
	
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
		return Developer;
	}
	public void setDeveloper(Developer developer) {
		Developer = developer;
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
	
	
}
