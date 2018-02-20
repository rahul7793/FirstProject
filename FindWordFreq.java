package tester;

import java.util.HashMap;
import java.util.Map;

public class FindWordFreq {
	
	void CheckFreq(String str){
		
		String StrArr[] = str.split(" ");
		
//		System.out.println(StrArr.toString());
		
		Map<String, Integer> wordMap = new HashMap<String, Integer>();
		
		for(int i=0; i<StrArr.length; i++){
			
			Integer count = wordMap.get(StrArr[i]);
			
			if(count == null){
				wordMap.put(StrArr[i], 1);
			}
			else
				wordMap.put(StrArr[i], ++count);
		}
		
		for(Map.Entry<String, Integer> word: wordMap.entrySet()){
			System.out.println("word: " + word.getKey() + ", frequency: " + word.getValue());
		}
		
		
	}
	
	

	public static void main(String[] args) {

		FindWordFreq findWordFreq = new FindWordFreq();
		findWordFreq.CheckFreq("do you know you are not what you think you are");

	}

}
