package tester;

public class SplitStringOddEven {
	
	static boolean checking(String str){
		
		String arr[]  = str.split(":");
		
		int even=0, odd=0;
		
		String num = arr[1];
//		System.out.println(num.length());
		
		for(int i = 1; i<=num.length(); i++){
//			System.out.println(num.charAt(i-1));
			if(i%2 == 0)
				even = even + Character.getNumericValue(num.charAt(i-1)) ;
			else
				odd = odd + Character.getNumericValue(num.charAt(i-1));
//			System.out.println(odd+" -- "+even);
		}
		if(even == odd)
			return true;
		
		
		return false;
	}

	public static void main(String[] args) {

		String str = "jacob:446711";
		
		if(checking(str) == true)
		System.out.println("equals");
		else
			System.out.println("not equals");

	}

}
