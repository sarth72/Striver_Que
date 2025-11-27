package Array_Striver;

public class Max_Consecutive_Ones {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the size of array");
//        int a=sc.nextInt();
//        int [] nums=new int[a];
//        System.out.println("enter the element of arayy "+a);
//        for(int i=0;i<a;i++){
//            nums[i]=sc.nextInt();
//        }
        int[]nums={1,1,0,1,1,1};
        dsply(nums);
        System.out.println(findMaxConsecutiveOnes(nums));

    }

    private static void dsply(int[] nums) {
        for (int i:nums){
            System.out.print(i+" ");

        }
        System.out.println();
    }
        public static int findMaxConsecutiveOnes(int[] nums) {
            int len=nums.length;
            int finalcount=0;
            int count=0;
            for(int i =0;i<len;i++){

                int tempc=0;
                if(nums[i]==1){

                    count++;System.out.println(count);
                }

                else{
                    tempc=count;
                    System.out.println("count :"+count);
                    System.out.println("tempc :"+tempc);
                    count=0;
                }

                if(tempc>finalcount){
                    finalcount=tempc;

                }

            }
            if(count>finalcount){
                finalcount=count;
            }

            return finalcount;

        }

}
