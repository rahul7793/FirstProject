class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;
        int temp = x;
        long r,d = 0;
        while(temp != 0)
        {
            r = temp % 10;
            d = d * 10 + r;
            temp = temp / 10;
        }
        if(d == x)
            return true;
        else 
            return false;
    }
}
