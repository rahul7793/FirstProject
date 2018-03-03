package tester;

public class ReverseString {

	public static String reverseString(String s) {

		int len = s.length();
		StringBuffer str = new StringBuffer();
		
		for(int i = len-1; i >= 0; i--){
			str.append(s.charAt(i));
		}
		
		return str.toString();

	}

	public static void main(String[] args) {

		System.out.println(reverseString("Hello"));

	}

}

/* other methods:
 *  1>	Converting String into Bytes: getBytes() method is used to convert the input string into bytes[].
 * 			String input = "GeeksforGeeks";
 
        // getBytes() method to convert string 
        // into bytes[].
        byte [] strAsByteArray = input.getBytes();
 
        byte [] result = 
                   new byte [strAsByteArray.length];
 
        // Store result in reverse order into the
        // result byte[]
        for (int i = 0; i<strAsByteArray.length; i++)
            result[i] = 
             strAsByteArray[strAsByteArray.length-i-1];
 
        System.out.println(new String(result));
 * 
 * ================================================================================
 * 
 * 	2>	Using built in reverse() method of the StringBuilder class:
 * 
 * 		String input = "Geeks for Geeks";
 
        StringBuilder input1 = new StringBuilder();
 
        // append a string into StringBuilder input1
        input1.append(input);
 
        // reverse StringBuilder input1
        input1 = input1.reverse();
 
        // print reversed String
        for (int i=0; i<input1.length(); i++)
            System.out.print(input1.charAt(i));
     =====================================================================================
     
            
 * 	3> Converting String to character array: 
 * 
 * 		String input = "GeeksForGeeks";
 
        // convert String to character array
        // by using toCharArray
        char[] try1 = input.toCharArray();
 
        for (int i = try1.length-1; i>=0; i--)
            System.out.print(try1[i]);
 * 
 * ================================================================================
 * 
 * 	4> Convert the input string into character array by using the toCharArray():
 * 
 * 		String input = "Geeks For Geeks";
        char[] temparray = input.toCharArray();
        int left, right=0;
        right = temparray.length-1;
 
        for (left=0; left < right ; left++ ,right--)
        {
            // Swap values of left and right
            char temp = temparray[left];
            temparray[left] = temparray[right];
            temparray[right]=temp;
        }
 
        for (char c : temparray)
            System.out.print(c);
        System.out.println();
 * ====================================================================
 * 
 * 	5>	Using ArrayList object:
 * 
 * 
 * 		 String input = "Geeks For Geeks";
        char[] hello = input.toCharArray();
        List<Character> trial1 = new ArrayList<>();
 
        for (char c: hello)
            trial1.add(c);
 
        Collections.reverse(trial1);
        ListIterator li = trial1.listIterator();
        while (li.hasNext())
            System.out.print(li.next());
 * 
 * 
 *  * 
 * 
 * */
