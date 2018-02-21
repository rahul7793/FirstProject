package tester;

public class ArrayProductForEachElement {

	public static void main(String[] args) {

		int [] arr = {1,2,5,6};
		
		int []newArr = new int[arr.length];
		int c = -1;
		for(int i=0; i<arr.length; i++){
			int mul = 1;
			
			for(int j=0; j<arr.length; j++){
				if( i != j ){
					mul = mul * arr[j];
					
				}
			}
			newArr[++c] = mul;
			System.out.println(mul);
		}
		

	}

}
