package tester;

import java.util.Scanner;

public class FindEvenNoModDiv {
	
	static String checkOddEven(char[] ch){
		for(int i = 0; i < 5; i++){
			if(Character.getNumericValue(ch[ch.length-1]) == (2*i)){
//				System.out.println("its Even");
				return "EVEN";
			}
			
		}
		return "ODD";
	}

	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Enter a num to find Even/Odd: ");
			Integer num = sc.nextInt();
			
			char []ch = num.toString().toCharArray();			
			System.out.println("its: "+checkOddEven(ch));
			
			//another way to do it is using bitwise operator
			//if((num & 1) != 0)
			//	System.out.println("odd");
			//else 
			//	System.out.println("even");
		}
	}

}
