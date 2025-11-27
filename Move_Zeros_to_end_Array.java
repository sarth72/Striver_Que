package Array_Striver;

public class Move_Zeros_to_end_Array {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the size of array");
//        int a=sc.nextInt();
//        int [] nums=new int[a];
//        System.out.println("enter the element of arayy "+a);
//        for(int i=0;i<a;i++){
//            nums[i]=sc.nextInt();
//        }
        int[]nums={1,1,0,1,1,12,0,78};
        dsply(nums);
        zerotoEnds(nums);
        dsply(nums);

    }

    private static void zerotoEnds(int[] nums) {
        int index=0;
        for(int no:nums){
            if(no!=0){
                nums[index]=no;
                index++;
            }

        }
        for(int i=index;i<nums.length;i++){
            nums[i]=0;
        }
    }

    private static void dsply(int[] nums) {
        for (int i:nums){
            System.out.print(i+" ");

        }
        System.out.println();
    }
}
