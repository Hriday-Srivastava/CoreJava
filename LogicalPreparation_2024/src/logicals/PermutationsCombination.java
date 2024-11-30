package logicals;

import java.util.HashSet;
import java.util.Set;

public class PermutationsCombination {

	public static void main(String[] args) {
		
		String input = "ABC";
        Set<String> result = new HashSet<>();
        generatePermutations("", input, result);

        // Print the result
        System.out.println("Permutations: " + String.join(" ", result));
    }

    private static void generatePermutations(String prefix, String remaining, Set<String> result) {
        if (remaining.isEmpty()) {
            result.add(prefix); // Add the permutation to the set
            return;
        }

        for (int i = 0; i < remaining.length(); i++) {
            // Generate permutations with the current character fixed at the prefix
            generatePermutations(
                prefix + remaining.charAt(i), 
                remaining.substring(0, i) + remaining.substring(i + 1), 
                result
            );
        }
    

	}

}
