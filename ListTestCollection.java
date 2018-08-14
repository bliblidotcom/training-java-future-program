import java.util.*;

public class ListTestCollection {
	public static void main (String[] args) {
		List<String> names = new ArrayList<>();
		names.add("ABC");
		names.add("Budi");
		names.add("Andy");

		for (String name : names) {
			System.out.println(name);
		}

		Set<String> stringSet = new HashSet<>();
		stringSet.add("String 1");
		stringSet.add("String 1");
		for (String string : stringSet) {
			System.out.println(string);
		}

		Map<String, Integer> scoreByName = new HashMap<>();
		scoreByName.put("Budi", 100);
		scoreByName.put(null, 2);
		scoreByName.put("Budi", 43);
		
		for(Map.Entry<String, Integer> entry : scoreByName.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
}