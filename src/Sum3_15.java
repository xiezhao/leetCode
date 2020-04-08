import java.util.*;

public class Sum3_15 {

    /**
     * Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.
     *
     * Note:
     *
     * The solution set must not contain duplicate triplets.
     *
     * Example:
     *
     * Given array nums = [-1, 0, 1, 2, -1, -4],
     *
     * A solution set is:
     * [
     *   [-1, 0, 1],
     *   [-1, -1, 2]
     * ]
     * 数组里面的数字排序了
     * 先把值分为负数和整数两个数组
     * @param args
     */

    public static void main(String[] args) {
//        List<List<Integer>> lists = threeSum(new int[]{-1, 0, 1, 2, -1, -4});
//        for (List<Integer> list : lists) {
//            System.out.println(Arrays.toString(list.toArray()));
//        }
    }


    /**
     * 超时
     */
//    public static List<List<Integer>> threeSum(int[] nums) {
//        LinkedHashSet<List<Integer>> hashSet = new LinkedHashSet<>();
//        List<Integer> negative = new ArrayList<>();
//        List<Integer> positive = new ArrayList<>();
//        List<Integer> zero = new ArrayList<>();
//        for (int num : nums) {
//            if (num < 0) {
//                negative.add(num);
//            } else {
//                positive.add(num);
//                if (num == 0) {
//                    zero.add(num);
//                }
//            }
//        }
//
//        //0. 如果有3个零及以上，直接输出[0,0,0]
//        if (zero.size() >= 3) {
//            hashSet.add(Arrays.asList(0,0,0));
//        }
//
//        //1.1负数2正
//        for (Integer negativeOne : negative) {
//            for (int i = 0; i < positive.size(); i++) {
//                for (int j = i + 1; j < positive.size(); j++) {
//                    if (negativeOne + positive.get(i) + positive.get(j) == 0) {
//                        Integer[] tempList = {positive.get(i), positive.get(j), negativeOne};
//                        Arrays.sort(tempList);
//                        hashSet.add(Arrays.asList(tempList));
//                    }
//                }
//            }
//        }
//
//        //2.2负数1正
//        for (int i = 0; i < negative.size(); i++) {
//            for (int j = i + 1; j < negative.size(); j++) {
//                for (Integer positiveOne : positive) {
//                    if (positiveOne + negative.get(i) + negative.get(j) == 0) {
//                        Integer[] tempList = {negative.get(i), negative.get(j), positiveOne};
//                        Arrays.sort(tempList);
//                        hashSet.add(Arrays.asList(tempList));
//                    }
//                }
//            }
//        }
//
//
//
//        List<List<Integer>> listWithoutDuplicates = new ArrayList<>(hashSet);
//        return listWithoutDuplicates;
//    }


    /**
     * 超时
     */
//    public static List<List<Integer>> threeSum(int[] nums) {
//        List<List<Integer>> result = new ArrayList<>();
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                for (int k = j + 1; k < nums.length; k++) {
//                    if (nums[i] + nums[j] + nums[k] == 0) {
//                        Integer[] tempList = {nums[i], nums[j], nums[k]};
//                        Arrays.sort(tempList);
//                        //if (result.contains(Arrays.asList(tempList))) continue;
//                        result.add(Arrays.asList(tempList));
//                    }
//                }
//            }
//        }
//        LinkedHashSet<List<Integer>> hashSet = new LinkedHashSet<>(result);
//        List<List<Integer>> listWithoutDuplicates = new ArrayList<>(hashSet);
//        return listWithoutDuplicates;
//    }
}
