package nameGeneration;

import java.util.Random;

public class NameGenerator {

	private String[] firstNames = {"Kati", "Mati", "Jaanus", "Peeter", "Mari" };
	private String[] lastNames = {"Tamm", "Kask", "Pilv", "Saar", "Oja", "Luts" };
	private String[] alfabeet={"a","b","c","d","e","e","f","g","h"};
	Random random = new Random();
	
	/*TODO Kui ülesanded on valmis, siis teha need ümbes selliselt, 
	et oleks võimalik valida mehe ja naiste nimedele vahel. */
	
	public String getRandomFirstName() {
		return firstNames[random.nextInt(firstNames.length)];
	}
	
	public String getRandomLastName() {
		//TODO
		return lastNames[random.nextInt(lastNames.length)];
	}
	
	public String getRandomFullName() {
		//TODO
		return getRandomFirstName()+" "+getRandomLastName();
	}
	
	public String generateRandomName(int charNumber) {
		//TODO
		return alfabeet[random.nextInt(alfabeet.length)];
	}
	
	public Integer generateRandomNumberBetween(int beg, int end) {
		//TODO
		return 0;
	}
	
	public boolean flipPenny() {
		//TODO
		return true;
	}
}
