class Solution {
    int top=0;
    public boolean isValid(String s) {
        //valid parenthesis
        char[] arr= new char[s.length()];
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{'||s.charAt(i)=='['){
                push(s.charAt(i), arr);
            }
            else{
              if(top==0) return false;
              char x= pop(arr);
              if((s.charAt(i)==')'&& x!='(') || (s.charAt(i)=='}'&& x!='{')||(s.charAt(i)==']'&& x!='[')) return false;
            }
            
        }
        return top==0;
    }
    void push(char s, char[] arr){
        arr[top++]=s;
    }
     char pop(char[] arr){
        return arr[--top];
    }
}