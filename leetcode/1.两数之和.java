import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer>maps=new HashMap<Integer,Integer>();
        //填入i搜索是否有target-nums[i]
        for(int i=0;i<nums.length;++i){
            if(maps.containsKey(target-nums[i])){
                return new int[] {maps.get(target-nums[i]),i};
            }
            maps.put(nums[i],i);
        }
        return new int[0];
    }
}
// @lc code=end

