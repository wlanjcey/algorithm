public class MaxArea {

    public static void main(String[] args) {
        int i = maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7});
        System.out.println(i);
    }

    public static int maxArea(int[] height) {
        //区域问题, 继续使用双指针来做
        //起始指针和结束指针 start, end, 相向移动
        //比对两者的高度, 以x轴差值(end - start) * Min(y轴)来计算围绕的面积既可
        //当两个指针重合时, 将循环打断既可
        int max = 0;
        for (int start = 0, end = height.length - 1; start < height.length; start++) {
            if(start == end) break;
            max = Math.max(max, (end - start) * Math.min(height[start], height[end]));
        }
        return max;

    }

}
