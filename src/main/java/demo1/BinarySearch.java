package demo1;

/**
 * 二分查找
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9};
        // 待查找的元素
        int target=9;
        int index=binarySearch(arr,0,arr.length-1,target);
        System.out.println("index: "+index);
    }

    public static int binarySearch(int arr[],int begin,int end,int target) {
        if (begin <= end){
            int mid = (begin+end)/2;
            if (arr[mid] == target){
                return mid;
            } else if (arr[mid] > target){
                return binarySearch(arr,begin,mid-1,target);
            } else if (arr[mid] < target){
                return binarySearch(arr,mid+1,end,target);
            }
        }
        return -1;
    }
}
