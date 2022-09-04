/*
 * @lc app=leetcode.cn id=26 lang=java
 *
 * [26] 删除有序数组中的重复项
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        int length=0;
        int[]s=new int [nums.length];

        for (int i=0,j=0;i<nums.length;++i){
            if(i==0){
                s[j]=nums[i];
                ++j;
                ++length;
                continue;
            }
            if(i!=0&&nums[i]!=nums[i-1]){
                s[j]=nums[i];
                ++j;
                ++length;
            }
        }
        for(int i=0;i<length;++i){
            nums[i]=s[i];
        }
        return length;
    }
}
// @lc code=end

