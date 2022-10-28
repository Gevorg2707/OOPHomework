package Task4;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class A {
    private int value;
    private int indexOfelement;
    private int index;
    private int size;
    private int DynamicIntegerArray[];
    Scanner scanner = new Scanner(System.in);

    public A() {
    }

    public A(int value, int indexOfelement, int index, int size, int[] dynamicIntegerArray) {
        this.value = value;
        this.indexOfelement = indexOfelement;
        this.index = index;
        this.size = size;
        this.DynamicIntegerArray = dynamicIntegerArray;
    }

    public int getValue() {
        return value;
    }

    public int getIndexOfelement() {
        return indexOfelement;
    }

    public int getIndex() {
        return index;
    }

    public int getSize() {
        return size;
    }

    public int[] getDynamicIntegerArray() {
        return DynamicIntegerArray;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setIndexOfelement(int indexOfelement) {
        this.indexOfelement = indexOfelement;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setDynamicIntegerArray(int[] dynamicIntegerArray) {
        DynamicIntegerArray = dynamicIntegerArray;
    }

    public  int initArray(int size) {
        for (int i = 0; i < size; i++) {
            DynamicIntegerArray[i] = scanner.nextInt();
        }
      return size-1;
    }
    public void printArray(){
        for (int i = 0; i < DynamicIntegerArray.length; i++) {
            System.out.println("DynamicIntegerArray = " + DynamicIntegerArray[i]);
        }
    }
}
