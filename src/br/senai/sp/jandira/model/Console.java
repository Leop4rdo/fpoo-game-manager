package br.senai.sp.jandira.model;

public enum Console {
	PS5("Playstation 5", 2020),
	XBOX_SERIES_X("Xbox series X", 2020),
	SWITCH("Nintendo Switch", 2017),
	PS4("Playstation 4", 2013),
	XBOX_ONE("Xbox One", 2013),
	PS3("Playstation 3", 2006),
	XBOX360("Xbox 360", 2005),
	PC("PC", 1974);
	
	private String name;
	private int releaseYear;
	
	private Console(String name, int releaseYear) {
		this.name = name;
		this.releaseYear = releaseYear;
	}
	
	public String getName() {
		return name;
	}
	
	public int getReleaseYear() {
		return releaseYear;
	}
}
