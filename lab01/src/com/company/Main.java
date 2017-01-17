package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
// 6. proc.loop.matrix_mul
        int[][] arr1 = {{2, 6, 3, 9},{1, 4, 8, 7}};
        int[][] arr2 = {{1, 4},{2, 6},{3, 9},{4, 0}};
        int[][] result = new int [arr1.length][arr2[0].length];

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i].length != arr1[0].length) {thrownewIllegalArgumentException();}
        }
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i].length != arr2[0].length) {thrownewIllegalArgumentException();}
        }
        if (arr1[0].length != arr2.length) {thrownewIllegalArgumentException();}

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                result[i][j] = 0;
                for (int n = 0; n < arr1[0].length; n++) {
                    if (arr1[i][n] == (Integer) null || arr2[n][j] == (Integer) null) {thrownewIllegalArgumentException();}
                    else {result[i][j]+=arr1[i][n]*arr2[n][j];}

                }
            }

        }

        System.out.println(Arrays.deepToString(result));
    }

    private static void thrownewIllegalArgumentException() {
    }
}
/*
// 1. proc.loop.array_inverter_optimized
public class ArrayInverter {
    public static void invert(int[] arr) {
        for (int k = arr.length / 2; k > 0; k--) {
            int tmp = arr[k];
            arr[k] = arr[arr.length - k - 1];
            arr[arr.length - k - 1] = tmp;
        }
    }
}

// 2. proc.loop.array_merger_fixed

public class Merger {
    public static int[] merge(int[] fst, int[] snd) {
        int[] result = new int[fst.length + snd.length];
        int fstIndex = 0;
        int sndIndex = 0;
        while (fstIndex + sndIndex != result.length) {
            if (fst[fstIndex] <snd[sndIndex]) {
                result[fstIndex + sndIndex] = fst[fstIndex];
                if (fstIndex == fst.length - 1) {System.arraycopy(snd, sndIndex, result, fstIndex+sndIndex+1, snd.length - sndIndex); break;}
                    else {fstIndex++;}
                }
             else {
                result[fstIndex + sndIndex] = snd[sndIndex];
                if (sndIndex == snd.length - 1) {System.arraycopy(fst, fstIndex, result, fstIndex+sndIndex+1, fst.length - fstIndex); break;}
                    else {sndIndex++;}
            }
        }
        return result;
    }
}

// 3. proc.loop.bubble_sort_inverted

public class BubbleSorter {
public static void sort(int[] arr) {
        for (int barrier = 0; barrier <= arr.length - 1; barrier++) {
            for (int index = barrier; index > 0; index--) {
                if (arr[index] <arr[index - 1]) {
                    int tmp = arr[index];
                    arr[index] = arr[index - 1];
                    arr[index - 1] = tmp;
                }
            }
        }
    }
}

// 4. proc.loop.selection_sort_optimized

public class SelectionSorter {
public static void sort(int[] arr) {
        for (int barrier = 0; barrier <arr.length - 1; barrier++) {
            int tmp = arr[barrier];
            int tmpindex = barrier;
            for (int index = barrier + 1; index <arr.length; index++) {
                if (tmp >arr[index]) {
                    tmp = arr[index];
                    tmpindex = index;

                }
            }
            arr[tmpindex] = arr[barrier];
            arr[barrier] = tmp;
        }
    }
}

// 5. proc.loop.insertion_sort_optimized -- couldn't resolve

public classInsertionSorter {
public static void sort(int[] arr) {
        for (int k = 1; k <arr.length; k++) {
            int newElement = arr[k];
            int location = 0;
            int pos = Arrays.binarySearch(arr, newElement);
            if (pos <0 ) {location = (-1 * pos) - 1 ;}
            else {location = pos;}
            if (k >= location) {System.arraycopy(arr, location, arr,location + 1,k-location);
                arr[location] = newElement;}
            else {System.arraycopy(arr, k+1, arr, k,location-k);
                arr[location] = newElement;}
        }
    }
}

*/
