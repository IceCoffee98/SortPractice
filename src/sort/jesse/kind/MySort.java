package sort.jesse.kind;

public class MySort {

    //冒泡排序
    public static int[] bubbleSort(int[] arrayInt) {
        for (int i = 0; i < arrayInt.length - 1; i++) {
            int flag = 0;//帮助判定该次冒泡是否有数据交换

            for (int j = 0; j < arrayInt.length - 1 - i; j++) {
                if (arrayInt[j] > arrayInt[j + 1]) {//若j>j+1,交换元素
                    int temp;
                    temp = arrayInt[j];
                    arrayInt[j] = arrayInt[j + 1];
                    arrayInt[j + 1] = temp;
                    flag = 1;
                }
            }
            if (flag == 0) break;
        }
        return arrayInt;
    }

    //选择排序：
    public static int[] selectionSort(int[] arrayInt) {
        for (int i = 0; i < arrayInt.length - 1; i++) {
            int min = i;
            int max = 0;
            for (int j = i + 1; j < arrayInt.length; j++) {
                if (arrayInt[j] < arrayInt[min]) min = j;
            }
            int temp = arrayInt[i];
            arrayInt[i] = arrayInt[min];
            arrayInt[min] = temp;
        }

        return arrayInt;
    }


    //插入排序
    public static int[] insertionSort(int[] arrayInt) {
        for (int i = 0; i < arrayInt.length - 1; i++) {
            if (arrayInt[i + 1] < arrayInt[i]) {
                int j = i, temp = arrayInt[i + 1];
                while (j >= 0 && arrayInt[j] > temp) {
                    arrayInt[j + 1] = arrayInt[j];
                    j--;
                }
                arrayInt[j + 1] = temp;
            }
        }
        return arrayInt;
    }

    public static int[] shellSort(int[] arrayInt) {


        return arrayInt;
    }

    public static int[] mergeSort(int[] arrayInt) {


        return arrayInt;
    }

    public static int[] quickSort(int[] arrayInt) {


        return arrayInt;
    }

    public static int[] heapSort(int[] arrayInt) {


        return arrayInt;
    }

    public static int[] countingSort(int[] arrayInt) {


        return arrayInt;
    }

    public static int[] bucketSort(int[] arrayInt) {


        return arrayInt;
    }

    public static int[] radixSort(int[] arrayInt) {


        return arrayInt;
    }


}
