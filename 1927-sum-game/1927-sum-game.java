class Solution {
    public boolean sumGame(String num) {
        int mid= num.length()/2;
        int sumbeforemid=0;
        int sumaftermid=0;
        int q1=0,q2=0;
        for(int i=0;i<mid;i++){
            if(num.charAt(i)=='?') q1++;
            else sumbeforemid=sumbeforemid+num.charAt(i)-'0';
        } 
        for(int i=mid;i<num.length();i++){
            if(num.charAt(i)=='?') q2++;
            else sumaftermid=sumaftermid+num.charAt(i)-'0';
        }
        int diff=sumbeforemid-sumaftermid;
        int questionmarkdiff=q1-q2;
        if(2*diff+9*questionmarkdiff!=0) return true;
        return false;
    }
}