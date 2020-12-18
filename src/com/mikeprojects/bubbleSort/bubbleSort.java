package com.mikeprojects.bubbleSort;

class BubbleSort {
    public static void main(String args[]) {
        bubbleSort2 ob = new bubbleSort2();
        printArrayList ob2 = new printArrayList();
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        ob.bubbleSort(arr);
        System.out.println("Sorted array");
        ob2.printArray(arr);
    }

}
