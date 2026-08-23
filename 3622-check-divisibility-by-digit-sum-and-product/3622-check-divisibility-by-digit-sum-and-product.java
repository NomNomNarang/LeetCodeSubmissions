class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int product=1;
        int temp=n;
        boolean bool=false;
        while(n>0){
            int r= n%10;
            sum=sum+r;
            product=product*r;
            n=n/10;
        }
       
        if(temp%(sum+product)==0) bool= true;
        return bool;
        
    }
}