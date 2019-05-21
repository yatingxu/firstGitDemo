package demo3;

import java.util.Arrays;

/**
 * 快速排序
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {3, 4, 6, 7, 2, 7, 2, 8, 0};
        quickSort2(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int left, int right) {
        // 选择基准数，等于数组的第一个元素
        int stard = arr[left];
        // 如果left<right，说明排序还没结束
        if (left < right) {
            // 当right指向的元素>=stard时，right左移
            if (arr[right] >= stard) {
                right--;
            }
            arr[left] = arr[right];
            // 当left指向的元素<=stard时，left右移
            if (arr[left] <= stard) {
                left++;
            }
            arr[right] = arr[left];
        }
        if (left == right) {
            // 如果left=right，则将stard与left交换
            int temp = stard;
            stard = arr[left];
            arr[left] = temp;
        }
    }

    public static void quickSort2(int[] arr, int start, int end) {
        if (start < end) {
            // 把数组中的第0个数字作为标准数
            int stard = arr[start];
            // 记录需要排序的下标
            int low = start;
            int high = end;
            // 循环找比标准数大的数和比标准数小的数
            while (low < high) {
                // 右边的数比标准数大
                while (low < high && stard <= arr[high]) {
                    high--;
                }
                // 使用右边的数字替换左边的数
                arr[low] = arr[high];
                // 左边的数比标准数小
                while (low < high && stard >= arr[low]) {
                    low++;
                }
                // 使用右边的数字替换左边的数
                arr[high] = arr[low];
            }
            arr[low] = stard;
            // 处理所有小的数字
            quickSort2(arr, start, low);
            // 处理所有大的数字
            quickSort2(arr, low + 1, end);
        }
    }
}
