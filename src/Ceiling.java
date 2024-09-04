import java.util.Scanner;

public class Ceiling {
    public static void main(String[] args) {
        int [] arr1 ={2,3,5,9,14,16,18};
        //if the target value is present then return index in other case return the index of least grater value
        Scanner s=new Scanner(System.in);
        int target=s.nextInt();
        int ans=ceiling(arr1,target);
        System.out.println(ans);

    }
    static int ceiling(int[] arr,int target){
        //if target is more than gratest number than
        if(target>arr[arr.length-1]) return -1;
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }
}
