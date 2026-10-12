public class zerocase {
    public static void moveZeros(int nums[]){
        int k=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=0){
                nums[k]= nums[i];
                k++;
             }

        }
        for (int i = k; i < nums.length; i++) {
    nums[i] = 0;
        }
    }
    public static void main(String[] args) {
        int nums[] ={0};
       moveZeros(nums);


       for(int i=0; i<nums.length; i++){
        System.out.print( + nums[i] + " " );
       }
       System.out.println();
    }
    
}
