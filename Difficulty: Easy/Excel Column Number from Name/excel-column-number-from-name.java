class Solution {
    public int excelColumnNumber(String s) {
        // code here
        int n=0;
        for(int i=0;i<s.length();i++){
            int value=s.charAt(i)-'A'+1;
            n=n*26+value;
        }
        return n;
    }
}