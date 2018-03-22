package tester;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LongestSubString {

	public static void main(String[] args) {

		String s = "abcaabacbac";

		char[] str = s.toCharArray();

//		map of key as substring from the main string and value as length of that substring
		Map<String, Integer> map = new HashMap<>();
		
//		iterates on each cahracter of string in 'k' loop and checks whether the next char
//		is already in new substring or not in 'j' loop
		for (int k = 0; k < str.length - 1; k++) {

			List<Character> charList = new ArrayList<>();
			charList.add(0, str[k]);
			
			StringBuilder builder = new StringBuilder();
			builder.append(str[k]);
			
			for (int j = k + 1; j < str.length; j++) {

				if (charList.contains(str[j]) != true) {
					charList.add(str[j]);
					builder.append(str[j]);
				} else {
					map.put(builder.toString(), charList.size());
//					tostring converts stringbuilder to string
				}
			}
		}
		
//		to find max length of substring in the map in value field
		int maxLen = Integer.MIN_VALUE;

		for (Integer len : map.values()) {
			maxLen = Math.max(maxLen, len);
//			System.out.println(maxLen);
		}

//		to print the corresponding string for max length of length in map
		for (Map.Entry<String, Integer> e : map.entrySet()) {
			if (e.getValue() == maxLen) {
				System.out.println( e.getKey());
			}
		}

	}

}
