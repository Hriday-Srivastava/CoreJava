package logicals;

public class PrefixLongest {

	public static void main(String[] args) {
		String[] strs = {"flower", "flow", "flight", "flowest"};
        System.out.println("Longest Common Prefix: " + findLongestCommonPrefix(strs));

	}
	
	public static String findLongestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) { // The method indexOf() returns 0 if prefix is matched  . If the string doesn't contain the prefix, it returns -1.
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;

}
	
}

