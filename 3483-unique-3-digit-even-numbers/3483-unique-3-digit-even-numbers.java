class Solution {
    public int totalNumbers(int[] digits) {
        //using permutation and combinations 
        // no duplication is allowed. ]
        //first identufy the even numebvr of digits at unit place. then fill up the hunrdreds and tens place and zero dhould not be the preceeding ones
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<digits.length;i++){
            map.put(digits[i], map.getOrDefault(digits[i],0)+1);
        }
        int ans=0;
        for(int key:map.keySet()){
            if(key%2!=0) continue;
            //fill up last place
            map.put(key,map.get(key)-1);
            //hundreds and tens 
            for(int hundred:map.keySet()){
                if(hundred==0) continue;
                if(map.get(hundred)==0) continue;
                map.put(hundred,map.get(hundred)-1);
                for(int tens:map.keySet()){
                if(map.get(tens)>0) ans++;
               }
               map.put(hundred,map.get(hundred)+1);
            }
            map.put(key,map.get(key)+1);
        }
        return ans;
    }
}