package com.LiKou.simple.sansiyuefen2022;

import java.util.ArrayList;
import java.util.List;

public class title283 {
    public static void main(String[] args) {
        int[] nums={0,1,0,3,12};
        int[] ints = moveZeroes(nums);
        for (int i : ints) {
            System.out.println(i);
        }
    }

    /**
     * 新建两个指针，先把所有的非0元素移动到数组的前端，然后后面部分设为0
     * @param nums
     * @return
     */
    public static int[] moveZeroes(int[] nums) {
        int slow=0;
        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast]!=0){//不为0的需要移动
                nums[slow]=nums[fast];
                slow++;
            }
        }
        for (int i=slow;i<nums.length;i++){
            nums[i]=0;
        }
        return nums;
    }

    /**
     * 这个方法 是新建了一个新的数组，不可以
     * @param nums
     * @return
     */
    public static int[] moveZeroes2(int[] nums) {
        List<Integer> list = new ArrayList();
        for (int i : nums) {
            if (i != 0) {
                list.add(i);
            }
        }
        int[] num2 = new int[nums.length];
        for (int i = 0; i < list.size(); i++) {
            num2[i] = list.get(i);
        }
        return num2;
    }

}
