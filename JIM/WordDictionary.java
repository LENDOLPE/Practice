import java.util.HashMap;

public class WordDictionary {
	HashMap<String, String> name = new HashMap<>();

	public void addWord(String animal, String value) {
		name.put(animal, value);

	}

	public String find(String count) {
		for (String key : name.keySet()) {
			if (key.toLowerCase().equals(count.toLowerCase())) {
				return name.get(key);
			}
		}
		return null;
	}

}
