class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        int maxlap=0;
        int n= img1.length;
        //shift can be negative number as well/ / -1, 0 means up row 0,-1 means col left
        // 1, 0 row down 0,1 col right and 1,1 means right down and -1,-1 left up
        // -1,1 up right 1,-1 down left
        for(int rshift=-(n-1) ;rshift<n;rshift++){
            for(int colshift=-(n-1);colshift<n;colshift++){
            int count=0;
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    //shiftings
                    int x=i+rshift;
                    int y=j+colshift;
                    if((x>=0 && x<n) && (y>=0 && y<n)) {
                        if(img1[i][j]==1 && img2[x][y]==1) count++;
                    }
                    if(count>maxlap) maxlap=count;
                }
            }
        }
     }
        return maxlap;
    }
}

