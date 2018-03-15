package tester;

import java.util.Scanner;

public class ReverseStringRecursive {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		reverseStr(sc.nextLine());
		
	}

	private static void reverseStr(String str) {
		
		
		if(str == null || (str.length()<=1))
			System.out.println(str);
			else{
			System.out.print(str.charAt(str.length()-1));
//			System.out.println(str.length());
			reverseStr(str.substring(0, str.length()-1));
		}
	}

}
