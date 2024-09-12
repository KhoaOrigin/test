 public class Solution {
    public Solution() {
    }
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            int digits = (int) (Math.log10(Math.abs(num)) + 1);
            if (digits % 2 == 0) {
                count++;
            }
            
        }
        return count;
    }

    public static void main (String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {123,224,4421,1289};
        System.out.println(solution.findNumbers(nums1));

        int[] nums2 = {111,2222,333,777};
        System.out.println(solution.findNumbers(nums2));

    }

}