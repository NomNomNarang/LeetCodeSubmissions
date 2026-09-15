class Solution {
    public int maxPalindromes(String s, int k) {
        //returning max string and counting tehir occurences
        //start with first charcter and find its match, wheerever you find the match. stop. get that index and check fro palindrome give them start and end.
        // end-start >=k; 
        //and jump those values, start from next index of that.
        int count=0;
        if(k==1) return s.length();
        int i=0;
        while(i<=s.length()-k){
            if(check(s,i,i+k-1)){
                count++;
                i=i+k;
            }
            else if(i<s.length()-k && check(s,i,i+k)){
                count++;
                i=i+k+1;
            }
            else i++;
        }
        return count;
    }
    boolean check(String s, int start,int end){
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                  return false;
            }
            start++;
            end--;
        }
        return true;
    }
}