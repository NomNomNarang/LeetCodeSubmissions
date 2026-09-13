class Solution {
    public int maximumSwap(int num) {
       // convert it into array
       // atmost two swaps are required means 0, 1,2 
       // approach=> get the max value and comapre via loops
       String s = String.valueOf(num);
       int[] arr = new int[s.length()];
       for (int i = 0;i<s.length(); i++) {
        arr[i] = s.charAt(i)-'0';
        }
    
        for(int i=0;i<arr.length;i++){
            int max=arr[i];
            int index=i;
            for(int j=i+1;j<arr.length;j++){
               if(arr[j]>=max){
                  max=arr[j];
                  index=j;
               }
            }
            if(max>arr[i]){
                //swap 
                int temp =arr[i];
                arr[i]=arr[index];
                arr[index]=temp;
                break;
            }
        }
    int result=0;
        for(int i:arr){
        result=result*10+i;
    }
       return result;
    }
}