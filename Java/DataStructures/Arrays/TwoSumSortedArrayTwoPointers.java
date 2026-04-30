import java.util.*;
public class TwoSumSortedArrayTwoPointers{
    public static int[] twosum(int[] nums,int target){
        if(nums==null || nums.length<2) return new int[]{-1,-1};
        int left=0;
        int right=nums.length-1;
        while(left<right){
            int sum=nums[left]+nums[right];
            if(sum==target){
                return new int[]{left,right};
            }else if(sum<target){
                left++;
            }else{
                right--;
            }
        }
        System.out.println("target sum not found!");
        return new int[]{-1,-1};
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size :");
        int N=sc.nextInt();
        int[] arr=new int[N];
        System.out.printf("Enter %d elements: ",N);
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Array Sorted");
        System.out.print("Enter target sum: ");
        int target=sc.nextInt();
        int[] result=twosum(arr,target);
        System.out.println("Indices: "+result[0]+", "+result[1]);
        sc.close();
    }
}