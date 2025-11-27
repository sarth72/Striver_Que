package Array_Striver;

import java.util.Scanner;

public class Rotate_Array {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the size of array");
//        int a=sc.nextInt();
//        int [] nums=new int[a];
//        System.out.println("enter the element of arayy "+a);
//        for(int i=0;i<a;i++){
//            nums[i]=sc.nextInt();
//        }
        int[]nums={1,2,3,4,5,6};
        dsply(nums);
        rotate(nums,3);
        dsply(nums);
    }
    public static void rotate(int[] nums, int k) {
        int len=nums.length;
        System.out.println("length:"+len);


        for(int i=0;i<k;i++){
            int temp=nums[len-1];
            System.out.println("temp ="+temp);
            for(int j=len-2;j>=0;j--){

                nums[j+1]=nums[j];
                dsply(nums);

            }
            nums[0]=temp;
            System.out.println("afreter first iterartion");
            dsply(nums);
        }
    }

    private static void dsply(int[] nums) {
        for (int i:nums){
            System.out.print(i+" ");

        }
        System.out.println();
    }
}
