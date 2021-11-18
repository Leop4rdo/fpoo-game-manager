package br.senai.sp.jandira.repository;

import java.util.ArrayList;

import br.senai.sp.jandira.model.Game;

public class GameRepository {
	private ArrayList<Game> gameList;
	
	public GameRepository() {
		gameList = new ArrayList<Game>();
	}
	
	public ArrayList<Game> getGameList() {
		return gameList;
	}
	
	public Game getGame(int index) {
		return gameList.get(index);
	}
	
	public void addGame(Game g) {
		gameList.add(g);
	}
}
