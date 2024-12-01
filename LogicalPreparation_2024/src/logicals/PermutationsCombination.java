package logicals;

import java.util.HashSet;
import java.util.Set;

public class PermutationsCombination {

	public static void main(String[] args) {

		String input = "ABC";
		Set<String> permutations = new HashSet<>();

		// Generate permutations
		generatePermutations(input, "", permutations);

		// Print each permutation
		for (String permutation : permutations) {
			System.out.println(permutation);
		}
	}

	private static void generatePermutations(String str, String prefix, Set<String> result) {
		if (str.length() == 0) {
			result.add(prefix);
			return;
		}

		for (int i = 0; i < str.length(); i++) {
			// Choose the current character
			char currentChar = str.charAt(i);

			// Remaining characters after excluding the current one
			String remaining = str.substring(0, i) + str.substring(i + 1);

			// Recursive call with the new prefix and remaining string
			generatePermutations(remaining, prefix + currentChar, result);
		}
	}


}
