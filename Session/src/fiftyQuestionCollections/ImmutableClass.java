package fiftyQuestionCollections;

import java.util.HashMap;

final class Immutable {

	private final Integer id;
	private final String name;
	private final HashMap<Integer, String> map;

	public Immutable(Integer id, String name, HashMap<Integer, String> map) {
		this.id = id;
		this.name = name;

		this.map = new HashMap<Integer, String>(map);
	}

	public Integer getId() {

		return id;
	}

	public String getName() {

		return name;
	}

	@SuppressWarnings("unchecked")
	public HashMap<Integer, String> getMap() {

		return (HashMap<Integer, String>) map.clone();
	}

}

public class ImmutableClass {
	public static void main(String[] args) {

		Integer localId = new Integer(1);

		String localName = new String("Car");

		HashMap<Integer, String> localMap = new HashMap<Integer, String>();
		localMap.put(11, "Toyota");

		Immutable immutableClass = new Immutable(localId, localName, localMap);

		System.out.println("----ImmutableClass members before changing----");
		System.out.println(immutableClass.getName());
		System.out.println(immutableClass.getId());
		System.out.println(immutableClass.getMap());

		System.out.println(localName == immutableClass.getName());
		System.out.println(localId == immutableClass.getId());
		System.out.println(localMap == immutableClass.getMap());

		localId = new Integer(2);
		localName = new String("New Car");
		localMap.put(12, "Ferarri");

		System.out.println("\n----ImmutableClass members after changing----");
		System.out.println(immutableClass.getName());
		System.out.println(immutableClass.getId());
		System.out.println(immutableClass.getMap());

		System.out.println(localName == immutableClass.getName());
		System.out.println(localId == immutableClass.getId());
		System.out.println(localMap == immutableClass.getMap());

	}

}
