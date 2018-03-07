/*Given a 6*6 2D Array, A:

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
We define an hourglass A in  to be a subset of values with indices falling in this pattern in A's graphical representation:

a b c
  d
e f g
There are 16 hourglasses in A, and an hourglass sum is the sum of an hourglass' values.

Task 
Calculate the hourglass sum for every hourglass in , then print the maximum hourglass sum.

Note: If you have already solved the Java domain's Java 2D Array challenge, you may wish to skip this challenge.

Input Format

There are 6 lines of input, where each line contains 6 space-separated integers describing 2D Array A ; every value in A will be in the inclusive range of -9 to 9.


Output Format

Print the largest (maximum) hourglass sum found in .

Sample Input

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0
Sample Output

19
Explanation

A contains the following hourglasses:

1 1 1   1 1 0   1 0 0   0 0 0
  1       0       0       0
1 1 1   1 1 0   1 0 0   0 0 0

0 1 0   1 0 0   0 0 0   0 0 0
  1       1       0       0
0 0 2   0 2 4   2 4 4   4 4 0

1 1 1   1 1 0   1 0 0   0 0 0
  0       2       4       4
0 0 0   0 0 2   0 2 0   2 0 0

0 0 2   0 2 4   2 4 4   4 4 0
  0       0       2       0
0 0 1   0 1 2   1 2 4   2 4 0
The hourglass with the maximum sum (19) is:

2 4 4
  2
1 2 4

*/

package tester;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoDArrayDS {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A[][] = new int[6][6];
		int sum = Integer.MIN_VALUE;
		int sumOld = 0;
		for(int i = 0; i < 6; i++){
			String[] str = br.readLine().split(" ");
			for(int j=0; j<str.length; j++){
				A[i][j] = Integer.parseInt(str[j]);
			}
		}
		
		for(int i = 0; i <= 3; i++){
			for(int j=0; j <= 3; j++){
				sumOld = A[i][j] + A[i][j+1] + A[i][j+2] + A[i+1][j+1] + A[i+2][j] + A[i+2][j+1] + A[i+2][j+2];
				sum = Math.max(sum, sumOld);
			}
		}
		
		System.out.println(sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		
//		for(int i = 0; i < 6; i++){
//			for(int j=0; j<6; j++){
//				System.out.print(A[i][j] + "\t");
//			}
//			System.out.println();
//		}

	}

}
