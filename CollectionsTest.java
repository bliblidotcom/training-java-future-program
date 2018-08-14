import java.util.*;

public class CollectionsTest {
	public static void main(String[] args){
		//ArrayList
		List<String> names = new ArrayList<>();
		names.add("ABC");
		names.add("Budi");
		names.add("Andy");
		names.add(null);
		//names.add(stringSet);	//Compile error due to different object type

		for(String name : names){
			System.out.println(name);
		}

		//Set
		Set<String> stringSet = new HashSet<>();
		stringSet.add("String 1");
		stringSet.add("String 1");
		stringSet.add("String 2");
		stringSet.add(null);
		//stringSet.add(names);	//Compile error due to different object type
		for(String str : stringSet){
			System.out.println(str);
		}

		//Map
		Map<String, Integer> scoreByName  = new HashMap<>();
		scoreByName.put("Oliver", 100);
		scoreByName.put(null, 19);
		//scoreByName.put(names, 21);	//Compile error due to different object type
		for (Map.Entry<String, Integer> entry : scoreByName.entrySet()){	//Prints from last item
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
}