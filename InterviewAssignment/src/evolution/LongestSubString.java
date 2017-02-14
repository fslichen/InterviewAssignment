package evolution;

import java.util.Set;
import java.util.TreeSet;

public class LongestSubString {
	public static String find(String string) {
		String longestStringWithoutDuplication = "";
		for (int i = 0; i < string.length(); i++) {
			for (int j = i; j < string.length(); j++) {
				String subString = string.substring(i, j + 1);
				if (noDuplicateCharacters(subString) && 
						longestStringWithoutDuplication.length() < subString.length()) {
					longestStringWithoutDuplication = subString;
				}
			}
		}
		return longestStringWithoutDuplication;
	}
	
	public static boolean noDuplicateCharacters(String string) {
		Set<String> set = new TreeSet<>();
		for (int i = 0; i < string.length(); i++) {
			if (set.contains(string.charAt(i) + "")) {
				return false;
			} else {
				set.add(string.charAt(i) + "");
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(find("java2novice"));
	}
}
