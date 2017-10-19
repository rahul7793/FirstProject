class romanToNumeral {

    public static void main(String[] args){
        System.out.println(romanToInt("MCMXCVI"));
    }

    public static int romanToInt(String s) {
        int num = 0;
        for(int i = 0; i< s.length(); i++){
            int x = value(s.charAt(i));
            
            if ((i+1)<s.length()) {
                if(x >= value(s.charAt(i+1))) {
                    num = num + x;
                }
                else {
                    num = num + value(s.charAt(i+1)) - x;
                    i = i + 1;
                }    
            }
            else {
                num = num + value(s.charAt(i));
            }System.out.println(num);
        }
        return num;
    }
    
    public static int value(char ch){
        if(ch == 'I'){
            return 1;
        }
        if(ch == 'V'){
            return 5;
        }
        if(ch == 'X'){
            return 10;
        }
        if(ch == 'L'){
            return 50;
        }
        if(ch == 'C'){
            return 100;
        }
        if(ch == 'D'){
            return 500;
        }
        if(ch == 'M'){
            return 1000;
        }
        return -1;
    }
}
