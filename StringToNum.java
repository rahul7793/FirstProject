package tester;

public class StringToNum {

	public static void main(String[] args) {

		String str = "456321";
		int a = 0;
		char[] num = str.toCharArray();
		for(int i = 0; i< num.length; i++){
			a = 10*a + Character.getNumericValue(num[i]);
		}
//		int x = a+10;//just to confirm if 'a' is a number, added any number to it and checked
//		System.out.println(x);
		System.out.println(a);
	}

}
