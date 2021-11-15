package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Console;
import br.senai.sp.jandira.model.Developer;
import br.senai.sp.jandira.model.Game;

public class App {
	
	public static void main(String[] args) {
		
		Game zelda = new Game("Zelda - Breath of the Wild", "An adventure game with a big open world and a lot of places"
					+ " to explore", new Developer("Nintendo"), Console.SWITCH, false, 200);
		
		Game gta = new Game("GTA V", "An open world game where you can steal cars and kill people", 
					new Developer("Rockstar"), Console.PS4, true, 80);
		
		System.out.println(zelda.toString());
		System.out.println();
		System.out.println(gta.toString());
	}
}