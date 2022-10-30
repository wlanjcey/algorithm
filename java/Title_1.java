import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Title_1 {

    public static void main(String[] args) {
        int[] ret = twoSum(new int[]{2, 7, 11, 15}, 9);
        Arrays.stream(ret).forEach(System.out::println);
    }

    public static int[] twoSum(int[] nums, int target) {

        //1. 暴力破解 O(n^2)
       /* for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length ; j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }*/

        //2. HashMap O(n)
        /*Map<Integer, Integer> dataMap = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            dataMap.put(nums[i], i);
        }

        for (int i = 0; i < nums.length - 1; i++) {
            int current = target - nums[i];
            if(dataMap.containsKey(current) && i != dataMap.get(current)) {
                return new int[]{i, dataMap.get(current)};
            }
        }*/

        //3. 单循环HashMap
        Map<Integer, Integer> dataMap = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            int current = target - nums[i];
            if (dataMap.containsKey(current) && i != dataMap.get(current)) {
                return new int[]{i, dataMap.get(current)};
            }
            dataMap.put(nums[i], i);
        }

        return new int[0];
    }

}

