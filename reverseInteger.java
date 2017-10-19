class Solution {
    public int reverse(int x) {
        int r = 0;
        
        while(x != 0){
            int nr = r*10 + x%10;
            if((nr - x%10)/10 != r)
                return 0;
            r = nr;
            x = x/10;  
        }
        
            return r;
    }
}
