package demo2;

import java.util.Arrays;

/**
 * 冒泡排序算法
 * @author xyt
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={9,3,8,10,3,5,1,4,7};
        System.out.println("arr: "+ Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("arr: "+ Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr) {
        // 限制循环的轮数，轮数为arr.length-1
        for (int i=0;i<=arr.length-1;i++){
            // 限制每轮中比对的次数，到下一轮上一轮移到最后的元素就不需要比较了
            for (int j=0;j<arr.length-1-i;j++){
                // 比较前一个与后一个的大小，如果前一个大于后一个则交换位置
                if (arr[j]>arr[j+1]){
                    int temp;
                    temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
