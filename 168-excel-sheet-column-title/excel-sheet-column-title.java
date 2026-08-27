class Solution {
    public String convertToTitle(int cn) {
        StringBuilder res=new StringBuilder();
        while(cn>0){
            cn--;
            int rem=cn%26;
            char ch=(char)('A'+rem);
            res.append(ch);
            cn/=26;
        }
        return res.reverse().toString();
    }
}