class Solution {
    public int maxArea(int[] height) {
        //calculate the area 
        int area=0;
        int start=0;
        int end=height.length-1;
        while(start<end){
          int width=end-start;
          int h=Math.min(height[start],height[end]);
          area=Math.max(area,width*h);
          if(height[start]<height[end]) start++;
          else end--;
        }
        return area;
    }
}