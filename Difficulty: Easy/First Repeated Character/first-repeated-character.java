class Solution {
    String firstRepChar(String s) {
        // code here
        boolean[]visited=new boolean[26];
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(visited[ch-'a']){
                return Character.toString(ch);
            }
            visited[ch-'a']=true;
        }
        return "-1";
    }
}