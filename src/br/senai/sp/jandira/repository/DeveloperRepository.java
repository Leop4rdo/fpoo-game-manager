package br.senai.sp.jandira.repository;

import java.util.ArrayList;

import br.senai.sp.jandira.model.DevListChangeListener;
import br.senai.sp.jandira.model.Developer;

public class DeveloperRepository {
	private ArrayList<Developer> developerList;
	private DevListChangeListener changeListener;
	
	public DeveloperRepository() {
		developerList = new ArrayList<Developer>();
		
		developerList.add(new Developer("Nintendo", 1889));
		developerList.add(new Developer("Rockstar", 1998));
		developerList.add(new Developer("Valve", 1996));
		developerList.add(new Developer("Eletronic Arts (EA)", 1982));
		developerList.add(new Developer("Activision Blizzard", 2008));
		developerList.add(new Developer("Ubisoft", 1986));
		developerList.add(new Developer("Sega", 1940));
		developerList.add(new Developer("BioWare", 1995));
		developerList.add(new Developer("Naughty Dog", 1984));
		developerList.add(new Developer("Capcom", 1979));
		developerList.add(new Developer("Unknown", 2000));
	}
	
	public ArrayList<Developer> getDeveloperList() {
		return developerList;
	}
	
	public Developer getDeveloper(int index) {
		return developerList.get(index);
	}
	
	public Developer getDeveloper(String developerName) {
		for ( Developer d : developerList ) {
			if ( d.getName().equalsIgnoreCase(developerName) ) {
				return d;
			}
		}
		return null;
	}
	
	public void addDeveloper(Developer dev) {
		developerList.add(dev);
		changeListener.changePerformed();
	}
	
	public int getIndexOf(Developer developer) {
		for (int i = 0; i < developerList.size(); i++) {
			if (developerList.get(i).equals(developer)) {
				return i;
			}
		}
		
		return 0;
	}
	
	public void addChangeListener(DevListChangeListener changeListener) {
		this.changeListener = changeListener;
	}
}
