import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=16 lang=java
 *
 * [16] 最接近的三数之和
 */

// @lc code=start
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        //指针+双指针 接近即绝对值，如果有绝对值小的，
        //把和换一下
        Arrays.sort(nums);
        int min=Math.abs(nums[0]+nums[1]+nums[nums.length-1]-target);
        int sum=nums[0]+nums[1]+nums[nums.length-1];
        for(int i=0;i<nums.length-2;++i){
            
            if(i!=0&&nums[i]==nums[i-1]){
                continue;
            }
            int left=i+1,right=nums.length-1;
            while(left<right){
                if(Math.abs(nums[i]+nums[left]+nums[right]-target)<min){
                    min=Math.abs(nums[i]+nums[left]+nums[right]-target);
                    sum=nums[i]+nums[left]+nums[right];
                }else {
                    if(nums[i]+nums[left]+nums[right]-target>0)--right;
                    else ++left;
                }
            }
        }
        return sum;
    }
}
// @lc code=end

