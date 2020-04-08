public class TwoSum {

    /**
     * Given nums = [2, 7, 11, 15], target = 9,
     *
     * Because nums[0] + nums[1] = 2 + 7 = 9,
     * return [0, 1].
     */

    public static void main(String[] args) {
        int[] ints = twoSum(new int[]{2,5,5,11}, 10);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }



    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[]{};
        for (int i = 0; i < nums.length; i++) {
            if (result.length > 0) break;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result = new int[]{i,j};
                    break;
                }
            }
        }
        return result;
    }
}
