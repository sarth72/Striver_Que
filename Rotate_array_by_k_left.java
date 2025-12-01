package Array_Striver;

public class Rotate_array_by_k_left {
    public static void main(String[] args) {
        int[]nums={1,2,3,4,5,6};
        dsply(nums);
        rotate(nums,3);
        dsply(nums);
    }

    private static void dsply(int[] nums) {
        for (int i:nums){
            System.out.print(i+" ");

        }
        System.out.println();
    }
    public static void rotate(int[] nums, int k) {
        int len=nums.length;
        System.out.println("length:"+len);


        for(int i=0;i<k;i++){
            int temp=nums[0];
            System.out.println("temp ="+temp);
            for(int j=0;j<len-1;j++){

                nums[j]=nums[j+1];
                dsply(nums);

            }
            nums[len-1]=temp;
            System.out.println("afreter first iterartion");
            dsply(nums);
        }
    }
    }

