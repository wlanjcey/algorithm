public class FibonacciStairs {

    public static void main(String[] args) {
        System.out.println(climbStairs(6));
    }


    //斐波拉契数列, 当前项 = 前两项之和
    //cur = last + lastLast;
    //然后将前两个值重新赋值
    public static int climbStairs(int n) {
        int cur = 0, last = 1, lastLast = 0;
        for (int i = 0; i < n; i++) {
            cur = last + lastLast;
            lastLast = last;
            last = cur;
        }
        return cur;
    }
}
