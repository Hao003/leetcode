import java.util.ArrayList;
import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=15 lang=java
 *
 * [15] 三数之和
 */

// @lc code=start
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //创建对象
        List<List<Integer>> ans=new ArrayList<>();
        //从小到大排序
        Arrays.sort(nums);
        //while循环
        for(int i=0;i<nums.length-2;++i){
            if(nums[i]>0) break;
            if(i!=0&&nums[i]==nums[i-1])continue;
            //双指针的创建
            int left=i+1,right=nums.length-1;
            while(left<right){
                int target=-nums[i];
                if(nums[left]+nums[right]==target){
                    ans.add(new ArrayList<>(Arrays.asList(nums[i],nums[left],nums[right])));
                
                ++left;
                --right;
                //去重
                while(left<right&&nums[left]==nums[left-1])++left;
                while(left<right&&nums[right]==nums[right+1])--right;}
                else if(left<right&&target>nums[left]+nums[right]){++left;}          
                        else{--right;}
            }
      
        }
       return ans;
        }

    }
// @lc code=end

