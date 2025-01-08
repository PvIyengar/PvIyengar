package DSA;

public class ConcatenationOfArrays {
    static int[] solve(int[] nums){
        int n=nums.length;
        int[] result=new int[2*n];
        for(int i=0;i<n;i++){
            result[i]=nums[i];
            result[i+n]=nums[i];
        }
        return result;
    }
    public static void main(String[] args){
        int[] nums={1,2,1};
        int[] result=solve(nums);
        for(int i:result){
            System.out.print(i+" ");
        }
    }
}
