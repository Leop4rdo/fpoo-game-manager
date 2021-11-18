package br.senai.sp.jandira.repository;

import br.senai.sp.jandira.model.Developer;

public class DeveloperRepository {
	private Developer[] developerList;
	
	public DeveloperRepository() {
		developerList = new Developer[11];
		
		developerList[0] = new Developer("Nintendo", 1889);
		developerList[1] = new Developer("Rockstar", 1998);
		developerList[2] = new Developer("Valve", 1996);
		developerList[3] = new Developer("Eletronic Arts (EA)", 1982);
		developerList[4] = new Developer("Activision Blizzard", 2008);
		developerList[5] = new Developer("Ubisoft", 1986);
		developerList[6] = new Developer("Sega", 1940);
		developerList[7] = new Developer("BioWare", 1995);
		developerList[8] = new Developer("Naughty Dog", 1984);
		developerList[9] = new Developer("Capcom", 1979);
		developerList[10] = new Developer("Unknown", 2000);
	}
	
	public Developer[] getDeveloperList() {
		return developerList;
	}
	
	public Developer getDeveloper(int index) {
		return developerList[index];
	}
	
	public Developer getDeveloper(String developerName) {
		for ( Developer d : developerList ) {
			if ( d.getName().equalsIgnoreCase(developerName) ) {
				return d;
			}
		}
		return null;
	}
}
