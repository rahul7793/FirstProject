package tester;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortNumFreq {
	
	
	void SortFreq(int arr[]){
		
		int len = arr.length;
		
		Map<Integer, Integer> sortFreq = new HashMap<Integer, Integer>();
		Integer frequency = 0; 
		for(int i = 0; i < len; i++){
			
			frequency = sortFreq.get(arr[i]);
			if(frequency == null){
				sortFreq.put(arr[i], 1);
			}
			else
			{
				sortFreq.put(arr[i], ++frequency);
			}
			
		}
		
//		Iterator<Map.Entry<Integer, Integer>> itr  = sortFreq.entrySet().iterator();
//		
//		while(itr.hasNext()){
//			Map.Entry<Integer, Integer> entry = itr.next();
//			
//			System.out.println("Num: "+ entry.getKey() + ", count: "+ entry.getValue());
//		}

		SortMapValue(sortFreq);
				
	}

	private void SortMapValue(Map<Integer, Integer> sortFreq) {

		List<Map.Entry<Integer, Integer>> list = new LinkedList<>(sortFreq.entrySet());
		
		Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {

			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {

				return (o1.getValue()).compareTo(o2.getValue());
			}
			
		});
		
		Map<Integer, Integer> resultMap = new LinkedHashMap<>();
		for(Map.Entry<Integer, Integer> entry : list){
			resultMap.put(entry.getKey(), entry.getValue());
		}
		
		for(Map.Entry<Integer, Integer> ent: resultMap.entrySet()){
			System.out.println("Num: "+ ent.getKey() + ", count: "+ ent.getValue());
		}
		
	}

	public static void main(String[] args) {
		SortNumFreq freq = new SortNumFreq();
		int arr[] = {2,3,5,3,7,9,5,3,7};
		freq.SortFreq(arr);

	}

}
