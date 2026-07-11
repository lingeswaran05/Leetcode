class Solution {
    
    public int minFlips(String target) {
        int flip=0;
        char curr='0';
        for(char c:target.toCharArray()){
            if(c!=curr){
                flip++;
                curr= (curr=='0')?'1':'0';
            }
        } 
        return flip;
    }
}