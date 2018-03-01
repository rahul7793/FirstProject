package tester;

import java.util.*;

public class Solution {

	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in)){

			//    	The first line contains , the number of strings.
			int noOfStrings = sc.nextInt();

			Map<String, Integer> map = new HashMap<String, Integer>();
			Integer count = 0;
			//    	The next  lines each contain a string.
			for (int i = 0; i < noOfStrings; i++) {
				String str = sc.next();
				if(map.containsKey(str)){
					count = map.get(str);
					map.put(str, ++count);
				}
				else{
					map.put(str, 1);
				}

			}

			List<Integer> list = new ArrayList<>();

			//    	The line contains , the number of queries.
			int noOfQuery = sc.nextInt();
	
			//    	The following  lines each contain a query string.
			for (int i = 0; i < noOfQuery; i++) {
				String query = sc.next();

				if(map.containsKey(query))
					list.add(map.get(query));
				else
					list.add(0);
			}

			for (Integer r : list ) {
				System.out.println(r.intValue());
			}
		}
	}
}
