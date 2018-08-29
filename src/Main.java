import java.util.Arrays;
import java.util.HashMap;


public class Main {
    public static void main(String[] args){
        int[] nums={5,3,9,6,7,1,2,8,25,36,100};

//        System.out.println(Arrays.toString(insertsort(nums)));
//        System.out.println(Arrays.toString(binarysort(nums)));
//        System.out.println(Arrays.toString(insertsort(nums)));
//        System.out.println(Arrays.toString(bubblesort(nums)));

        quicksort(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }

    //直接插入
    public static int[] insertsort(int[] nums){
        for(int i=0;i<nums.length-1;i++){
            for (int j=i+1;j>0;j--){
                if (nums[j-1]<nums[j])
                    break;
                int temp=nums[j-1];
                nums[j-1]=nums[j];
                nums[j]=temp;
            }
        }
        return nums;
    }
    //折半插入
    public static int[] binarysort(int[] nums){
        int n=nums.length;
        int i,j;
        for (i=1;i<n;i++){
            int temp=nums[i];
            int low=0;
            int high=i-1;
            while (low<=high){
                int mid=(low+high)/2;
                if (nums[i]<mid)
                    high=mid-1;
                else
                    low=mid+1;
            }
            for (j=i-1;j>high;j--)
                nums[j+1]=nums[j];
            nums[j+1]=temp;
        }
        return nums;
    }
    //简单选择
    public static int[] selectsort(int[] nums){
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            for (int j=i+1;j<n;j++){
                int temp;
                if (nums[i]>nums[j]){
                    temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        return nums;
    }
    //冒泡排序
    public static int[] bubblesort(int[] nums){
        int i,j;
        int n=nums.length;
        for (i=n;i>0;i--){
            for (j=0;j<i&&j+1<i;j++){
                if (nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }

        }
        return nums;
    }
    //快速排序
    public static void quicksort(int[] nums,int left,int right){

        if (left<right){
            int i=left,j=right,povit=nums[left];
            while (i<j){
                while (i<j&&nums[j]>=povit)
                    j--;
                if (i<j){
                    nums[i]=nums[j];
                    i++;
                }
                while (i<j&&nums[i]<povit)
                    i++;
                if (i<j){
                    nums[j]=nums[i];
                    j--;
                }
            }
            nums[i]=povit;
            quicksort(nums,left,i-1);
            quicksort(nums,i+1,right);
        }
    }
}
