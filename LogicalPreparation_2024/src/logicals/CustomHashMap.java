package logicals;

/*
Implement a custom DataStructure to accommodate following dataset :
- Data should be stored as Key,Value pair
- Key can have multiple values
- New entry has to be done using "add" method
- "fetch" method should fetch all the values corresponding to the key
 
Example :
add("apple","red")  
add("cherry","red")  
add("apple","green") 
fetch("apple") -> should return ["red","green"]

*/
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CustomHashMap {

	// HashMap to store key-value pairs
    private HashMap<String, List<String>> map;

    // Constructor
    public CustomHashMap() {
        map = new HashMap<>();
    }

    // Add method to insert a key-value pair
    public void add(String key, String value) {
        // If the key does not exist, create a new list
        map.computeIfAbsent(key, k -> new ArrayList<>());

        // Add the value to the key's list
        map.get(key).add(value);
    }

    // Fetch method to retrieve values for a key
    public List<String> fetch(String key) {
        // Return the list of values or an empty list if the key does not exist
        return map.getOrDefault(key, new ArrayList<>());
    }

	
	
	
	
	public static void main(String[] args) {
		CustomHashMap customHashMap = new CustomHashMap();

        // Adding entries
		customHashMap.add("apple", "red");
		customHashMap.add("cherry", "red");
		customHashMap.add("apple", "green");

        // Fetching values
        System.out.println(customHashMap.fetch("apple")); // Output: [red, green]
        System.out.println(customHashMap.fetch("cherry")); // Output: [red]
        System.out.println(customHashMap.fetch("banana")); // Output: []

	}

}
