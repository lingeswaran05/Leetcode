1class Solution {
2    public int maxArea(int[] height) {
3        int l=0,r=height.length-1,maxArea=0,area=1;
4        while(l<r){
5            int length=Math.min(height[l],height[r]);
6            int breadth=r-l;
7            area=length*breadth;
8            if(area > maxArea) maxArea=area;
9
10            if(height[l] < height[r]){
11                l++;
12            }
13            else r--;
14        }
15            return maxArea;
16    }
17}