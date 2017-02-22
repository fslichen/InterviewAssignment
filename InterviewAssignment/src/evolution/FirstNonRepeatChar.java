package evolution;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatChar {
	public static String find(String string) {
		Map<String, Integer> count = new HashMap<>();
		for (int i = 0; i < string.length(); i++) {
			String c = string.charAt(i) + "";
			if (count.containsKey(c)) {
				count.put(c, count.get(c) + 1);
			} else {
				count.put(c, 1);
			}
		}
		for (int i = 0; i < string.length(); i++) {
			String c = string.charAt(i) + "";
			if (count.get(c) > 1) {
				continue;
			} else {
				return c;
			}
		}
		return null; 
	}
	
	public static void main(String[] args) {
		System.out.println(find("stress"));
	}
}
