class Solution {
    public int minAddToMakeValid(String s) {
        //check for the parenthesis
        int counter=0;
        int add=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(') counter++;
            else{
                if(counter>0) counter--;
                else add++;
            }
        }
        return add+counter;
    }
}