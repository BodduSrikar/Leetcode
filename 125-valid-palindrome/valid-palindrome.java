class Solution {
    public boolean isPalindrome(String s) {
        s=s.trim();
        s=s.toLowerCase();
        s=s.replaceAll("[^a-z0-9]","");
        int left=0;
        int right=s.length()-1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(left++)!=s.charAt(right--)) return false;
        }
        return true;
    }
}
