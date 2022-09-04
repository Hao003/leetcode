import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=31 lang=java
 *
 * [31] 下一个排列
 */

// @lc code=start
class Solution {
    public void nextPermutation(int[] nums) {
        //如果是升序如1234，那么最后位与倒数第二位交换
        //即1243
        //再如4123，变后即4132
        //如果是降序如1432，那么后3位先排成1234
        //2再与1交换编程2134
        //如果是2134呢，2143
        //如果是2143呢 2134再2314
        //特殊情况4321 变成1234
        //从最后一位开始，先找降序，特殊情况就是都是降序，直接输出升序
        //然后将降序的排成升序，将不是降序的第一位与刚好大于这个数字的交换
        //如果没有降序，还是一样将不是降序的第一位与刚好大于这个数字的交换
        int n=nums.length-1;
        while(n>0&&nums[n]<=nums[n-1]){
            --n;
        }
        if(n==0)Arrays.sort(nums);
        else{
            Arrays.sort(nums,n,nums.length);
            for(int j=n;j<nums.length;++j){
                if(nums[j]>nums[n-1]){
                    int temp=nums[j];
                    nums[j]=nums[n-1];
                    nums[n-1]=temp;
                    break;
                }
            }
        }
    }
}
// @lc code=end

