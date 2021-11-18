package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Console;
import br.senai.sp.jandira.model.Developer;
import br.senai.sp.jandira.model.Game;
import br.senai.sp.jandira.repository.DeveloperRepository;
import br.senai.sp.jandira.repository.GameRepository;

public class App {
	
	public static void main(String[] args) {
		GameRepository games = new GameRepository();
		DeveloperRepository developers = new DeveloperRepository();
		
		Game zelda = new Game("Zelda - Breath of the Wild", "An adventure game with a big open world and lots of places"
					+ " to explore", developers.getDeveloper("Nintendo"), Console.SWITCH, false, 200);
		
		Game gta = new Game("GTA V", "An open world game where you can steal cars and kill people", 
					developers.getDeveloper("Rockstar"), Console.PS4, true, 80);
		
		games.addGame(zelda);
		games.addGame(gta);
		
		games.getGameList().forEach((n) -> System.out.println(n.toString() + "\n"));
		
		System.out.println(developers.getDeveloper("Rockstar").toString());
	}
}