package com.LiKou.simple.wuyuefen2022;

/**
 * 最大三角形面积
 * <p>
 * 思路：暴力解法  把所有的三个点算一遍   注意判断三边   然后取最大值
 */
public class title812 {
    public static void main(String[] args) {
        int[][] points = {{0, 0}, {0, 1}, {1, 0}, {0, 2}, {2, 0}};
        double v = largestTriangleArea(points);
        System.out.println(v);
    }

    public static double largestTriangleArea(int[][] points) {
        double area = 0;
        for (int i = 0; i < points.length - 2; i++) {
            for (int left = i + 1; left < points.length - 1; left++) {
                for (int right = left + 1; right < points.length; right++) {
                    //求三边
                    double a = Math.sqrt((points[i][0] - points[left][0]) * (points[i][0] - points[left][0]) + (points[i][1] - points[left][1]) * (points[i][1] - points[left][1]));
                    double b = Math.sqrt((points[i][0] - points[right][0]) * (points[i][0] - points[right][0]) + (points[i][1] - points[right][1]) * (points[i][1] - points[right][1]));
                    double c = Math.sqrt((points[right][0] - points[left][0]) * (points[right][0] - points[left][0]) + (points[right][1] - points[left][1]) * (points[right][1] - points[left][1]));
                    //判断三边是否能形成三角形
                    if (a + b > c && a + c > b && b + c > a) {
                        //求面积
                        double p = 1 / 2.0 * (a + b + c);
                        double temp = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                        if (temp > area) {
                            area = temp;
                        }
                    }
                }
            }
        }
        return area;
    }
}
