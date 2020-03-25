package com.example.demo.algorithm;

import java.time.Instant;
import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 99, 3, 11};
        ArraySort as = new ArraySort();
        as.sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public void sort(int[] arr) {
        long startTime = Instant.now().toEpochMilli();
        quickSort(arr, 0, arr.length - 1);
        long endTime = Instant.now().toEpochMilli();
        System.out.println("耗时：" + (endTime - startTime));
    }

    public void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }

    }

    public void insertSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int tmp = arr[i];
            int j = i;
            for (; j > 0 && tmp < arr[j - 1]; j--) {
                arr[j] = arr[j - 1];
            }
            arr[j] = tmp;
        }
    }

    public void shellSort(int[] arr) {
        int h = 1;
        while (h < arr.length / 2) {
            h = h * 2 + 1;
        }
        while (h >= 1) {
            for (int i = h; i < arr.length; i++) {
                int j = i, tmp = arr[i];
                for (; j >= h && tmp < arr[j - h]; j -= h) {
                    arr[j] = arr[j - h];
                }
                arr[j] = tmp;
            }
            h /= 2;
        }
    }

    public int[] mergeSort(int[] a) {
        if (a.length <= 1) {
            return a;
        }
        int mid = a.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(a, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(a, mid, a.length));
        for (int i = 0, j = 0; i < left.length || j < right.length; ) {
            if (j == right.length || i < left.length && left[i] < right[j]) {
                a[i + j] = left[i];
                i++;
            } else {
                a[i + j] = right[j];
                j++;
            }
        }

        return a;
    }

    private void quickSort(int[] nums, int l, int r) {
        if (l >= r) {
            return;
        }
        int mid = partition(nums, l, r);
        quickSort(nums, l, mid);
        quickSort(nums, mid + 1, r);
    }

    private int partition(int[] nums, int l, int r) {
        int pivot = nums[l];
        while (l < r) {
            while (l < r && nums[r] >= pivot) {
                r--;
            }
            nums[l] = nums[r];
            while (l < r && nums[l] <= pivot) {
                l++;
            }
            nums[r] = nums[l];
        }
        nums[l] = pivot;
        return l;
    }
}
