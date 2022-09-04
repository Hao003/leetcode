/*
 * @lc app=leetcode.cn id=11 lang=java
 *
 * [11] 盛最多水的容器
 */

// @lc code=start
class Solution {
    public int maxArea(int[] height) {
        int a=0,b=height.length-1,max=0;
        while(a<b){
            max=Math.max(max,(b-a)*Math.min(height[a],height[b]));
           if(height[a]>height[b])--b;
           else{
            ++a;
           }
        }
        return max;
    }
}
// @lc code=end

