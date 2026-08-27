class Solution {
    public char nonRepeatingChar(String s) {
        // code here
        int[]freq =new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int index=ch-'a';
            freq[index]++;
            
        }
        for(char ch:s.toCharArray()){
            int index=ch-'a';
            if(freq[index]==1) return ch;
        }
        return '$';
    }
}
