class Solution {
    public boolean isValid(String s) {
        Stack stack1 = new Stack();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) =='{' || s.charAt(i) =='[')
                stack1.push(s.charAt(i));
            else if(s.charAt(i) == ')' || s.charAt(i) =='}' || s.charAt(i) ==']'){
                //char match = stack1.pop();
                if(stack1.empty()){
                    return false;
                }
                if(!isMatchingPair((Character) stack1.pop(), (Character) s.charAt(i)))
                    return false;
            }
            else
                return false;
        }
        if(stack1.empty()){
            return true;
        }
        else
            return false;
    }
    
    static boolean isMatchingPair(char character1, char character2)
    {
       if (character1 == '(' && character2 == ')')
         return true;
       else if (character1 == '{' && character2 == '}')
         return true;
       else if (character1 == '[' && character2 == ']')
         return true;
       else
         return false;
    }
}
