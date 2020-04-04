package sort.jesse.run;

import sort.jesse.kind.MySort;

import java.util.Arrays;
import java.util.Random;

public class RunMySort {
    public static void main(String[] args) {
        //testSort("bubbleSort");
        //testSort("selectionSort");
        testSort("insertionSort");
        //testSort("shellSort");
        //testSort("mergeSort");
        //testSort("quickSort");
        //testSort("heapSort");
        //testSort("countingSort");
        //testSort("bucketSort");
        //testSort("radixSort");

    }

    //判断是否排序正确
    public static void testSort(String sortType) {
        for (int i = 0; i < 10; i++) {//用十组随机数据测试10次
            int[] array1, array2;
            System.out.println(sortType + " ==============================");
            array1 = createRandomArray();//产生一个随机数组
            array2 = array1.clone();//用来形成正确排序数组判断正误，在后面通过Arrays.sort(array2)实现
            System.out.println("Before:   " + Arrays.toString(array1));

            if (sortType.equals("bubbleSort")) MySort.bubbleSort(array1);
            else if (sortType.equals("selectionSort")) MySort.selectionSort(array1);
            else if (sortType.equals("insertionSort")) MySort.insertionSort(array1);
            else if (sortType.equals("shellSort")) MySort.shellSort(array1);
            else if (sortType.equals("mergeSort")) MySort.mergeSort(array1);
            else if (sortType.equals("quickSort")) MySort.quickSort(array1);
            else if (sortType.equals("heapSort")) MySort.heapSort(array1);
            else if (sortType.equals("countingSort")) MySort.countingSort(array1);
            else if (sortType.equals("bucketSort")) MySort.bucketSort(array1);
            else if (sortType.equals("radixSort")) MySort.radixSort(array1);
            else System.out.println("sort type input error!");

            System.out.println("After:    " + Arrays.toString(array1));
            Arrays.sort(array2);
            System.out.println("Std Sort: " + Arrays.toString(array2));
            boolean flag = cmpArray(array1, array2);
            if(flag==true) System.out.println("pass\n");
            else {
                System.out.println("fail\n");
                break;
            }
        }
    }

    //产生随机数组用于测试
    public static int[] createRandomArray() {
        Random rd = new Random();
        int num = rd.nextInt(6) + 10;//数组长度在10～20中取随机值，可自行修改
        int[] array = new int[num];
        for (int i = 0; i < num; i++) {
            array[i] = rd.nextInt(101);//数组中的数在0～100中取随机值，可自行修改
        }
        return array;
    }

    //比较两个数组是否完全一致
    public static boolean cmpArray(int[] stdSort, int[] mySort) {
        boolean flag = true;
        for (int i = 0; i < mySort.length; i++) {
            if (stdSort[i] != mySort[i]) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
