package Task4;

import java.util.Arrays;

public class DynamicArray {
    private Integer [] array=new Integer[6];
    private int currentSize=0;


    public void add(int element){
        if (currentSize== array.length){
        }
        array[currentSize]=element;
        currentSize++;
    }

    private void scaleArray(){
        Integer[] tempArray=new Integer[array.length*2];
        for (int i = 0; i < tempArray.length; i++) {

        }
        array=tempArray;
    }

    public int removeAt(int index){
        if(index>currentSize){
            throw new ArrayIndexOutOfBoundsException("HAjox bro");
        }
        int value=array[index];
        for (int i = 0; i < currentSize-1; i++) {
            array[i]=array[i+1];
        }
        array[currentSize-1]=null;
        currentSize--;
        return value;
    }
    public void remove(int value) {
        Integer[] tempArray = new Integer[array.length];
        int index = 0;
        for (int i = 0; i < currentSize; i++) {
            if (array[i] != value) {
                tempArray[index] = array[i];
                index++;
            }
        }
        currentSize=index;
        array=tempArray;
    }

        @Override
        public String toString () {
            String string = " ";
            for (int i = 0; i < currentSize; i++) {
                string += array[i] + " ";
            }
            return string;
        }
}
