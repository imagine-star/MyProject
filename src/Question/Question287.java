package Question;

/*
* 给定一个包含n + 1 个整数的数组nums，其数字都在 1 到 n之间（包括 1 和 n），可知至少存在一个重复的整数。假设只有一个重复的整数，找出这个重复的数。
* 示例 1:
*               输入: [1,3,4,2,2]
*               输出: 2
* 示例 2:
*               输入: [3,1,3,4,2]
*               输出: 3
* 说明：
*               1.不能更改原数组（假设数组是只读的）。
*               2.只能使用额外的 O(1) 的空间。
*               3.时间复杂度小于 O(n2) 。
*               4.数组中只有一个重复的数字，但它可能不止重复出现一次。
* */

public class Question287 {

    public static void main(String[] args) {
        int[] intNum = new int[]{
                1, 3, 4, 2, 2
        };
    }

}

class Solution {
    public int findDuplicate(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int retrunNum = 0;
        int[] numCount = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {

        }
        return retrunNum;
    }
}
