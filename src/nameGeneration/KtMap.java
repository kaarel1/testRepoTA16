package Kontrollt��;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KtMap {

	public static void main(String[] args) {
		Map<String, Integer> people = new HashMap<String, Integer>();
		people.put("Aadam", 1);
		people.put("Anna", 2);
		people.put("Mari", 3);
		people.put("J�ri", 4);
		people.put("Asta", 5);
		System.out.println();
		
		containsKeyStartingWith(people);
	}

	// 1.
	public static List<String> containsKeyStartingWith(Map<String, Integer> map) {
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println("V�ti: " + entry.getKey() + " v��rtus: " + entry.getValue());
		
		if(  entry.getKey);	
		}

		return null;
	}

}