import java.util.Arrays;

public class MoveZeros {

    public static void main(String[] args) {
        int[] nums = new int[]{0,1,0,3,12};
        moveZeroes(nums);
        Arrays.stream(nums).forEach(e -> System.out.print(e + ","));
    }

    public static void moveZeroes(int[] nums) {
        /*int j = 0;
        //1. 使用i, j快慢双指针
        //2. 快指针i向后移动, 发现非0元素
        //3. 将非0元素换给慢指针j
        //4. 慢指针j往后移动
        //5. 快指针继续遍历, 返回第二步
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j++] = temp;
            }
        }*/

        //method 2. 快慢指针, 直接替换, 后补0
        int dest = 0;
        for (int cur = 0; cur < nums.length; cur++) {
            if(nums[cur] != 0) {
                nums[dest++] = nums[cur];   //先替换, 再移动慢指针
            }
        }

        //第二步直接补0, 从慢指针的下一个元素开始补起
        for (int i = dest; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

}
