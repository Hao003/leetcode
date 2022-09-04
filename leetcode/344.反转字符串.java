/*
 * @lc app=leetcode.cn id=344 lang=java
 *
 * [344] 反转字符串
 */

// @lc code=start
class Solution {
    public void reverseString(char[] s) {
        char [] a=new char[s.length];
        for(int i=s.length-1,j=0;i>=0;--i,++j){
            a[j]=s[i];
        }
        for(int j=0;j<s.length;++j){
            s[j]=a[j];
        }
    }
}
// @lc code=end

