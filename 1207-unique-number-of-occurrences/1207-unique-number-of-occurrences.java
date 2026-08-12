class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> occ=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(int key:map.values()){
            occ.add(key);
        }

        boolean found=true;
        for(int i=0;i<occ.size();i++){
            for(int j=i+1;j<occ.size();j++){
                if(occ.get(i).equals(occ.get(j))) found=false;
            }
        }
        return found;
    }
}