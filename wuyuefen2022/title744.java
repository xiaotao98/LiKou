package com.LiKou.simple.wuyuefen2022;

public class title744 {
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char c = nextGreatestLetter(letters, 'c');
        System.out.println(c);

    }

    /**
     * 直接遍历  时间复杂度为O(n)
     */
    public static char nextGreatestLetter1(char[] letters, char target) {
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] - target > 0) {
                return letters[i];
            }
        }
        return letters[0];
    }

    /**
     *这里是二分法   时间复杂度为O(nlogn)
     */
    public static char nextGreatestLetter(char[] letters, char target) {
        int left = 0, right = letters.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (letters[mid] - target <= 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
//        return letters[0];
        return letters[left% letters.length];//这里是关键
    }
}
