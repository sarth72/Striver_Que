package Array_Striver;

public class Remove_duplicates_from_Sorted_array {
    public static void main(String[] args) {
        int[]nums={1,2,2,0,0,3,3,4,4,5,5,5,8,8,8};
        dsply(nums);
        System.out.println(findDuplicate(nums));
        dsply(nums);

    }

    private static int findDuplicate(int[] nums) {
        int index=1;
        int len=nums.length;
        if(len==0)return 0;
        for (int i = 1; i < nums.length; i++) {
            // if new unique number found
            if (nums[i] != nums[i - 1]) {
                nums[index] = nums[i];
                index++;
            }
        }

        return index;
    }

    private static void dsply(int[] nums) {
        for (int i:nums){
            System.out.print(i+" ");

        }
        System.out.println();
    }
}
