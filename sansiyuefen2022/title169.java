package com.LiKou.simple.sansiyuefen2022;

/**
 * 给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
 *
 * 思路：1  暴力搜索  见下面方法2  自己想的
 * 思路：2  巧解：设 result=nums[0]   count=1
 *         遍历数组，如果值等于result  count++
 *         否则  count--  如果count为0了，那么换个数，即为令result=nums[i]
 */
public class title169 {
    public static void main(String[] args) {

        int nums[] = {6,5,5};
//        int result = majorityElement1(nums);
        int result = majorityElement2(nums);
        System.out.println(result);
    }

    public static int majorityElement2(int[] nums) {
        int result=nums[0];
        int count=1;
        for (int i = 1; i < nums.length; i++) {
            if (result==nums[i]){
                count++;
            }else {
                count--;
                if (count==0){
                    result=nums[i];
                    count=1;
                }
            }
        }
        return result;
    }

    /**
     * 暴力搜索
     * @param nums
     * @return
     */
    public static int majorityElement1(int[] nums) {
        int a;
        int max = 0;
        int index=-1;
        if (nums.length==1){
            return nums[0];
        }
        while (max < (nums.length / 2)+1) {//当数组长度为奇数时，多数元素出现的次数要比nums.length / 2大，所以要+1
            for (int j = 0; j < nums.length; j++) {
                int result = 0;//用来记录出现的次数
                a = nums[j];//用来作为标杆的元素
                for (int i = 0; i < nums.length; i++) {
                    if (nums[i] == a) {
                        result++;
                        if (result>=nums.length / 2+1){//当出现次数达标时，直接返回该值
                            return nums[j];
                        }
                    }
                }
                if (result > max) {//如果出现的次数比之前大，则赋值给max，并且记录下标
                    max = result;
                    index=j;
                }
            }
        }
        return nums[index];
    }

}
