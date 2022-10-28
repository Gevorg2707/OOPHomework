package Task4;

public class Main {
    public static void main(String[] args) {
        int value1;
        int indexOfelement1;
        int index1;
        int size1;
//        int DynamicIntegerArray1[];
        A a=new A();
        a.setIndex(10);
        a.setIndexOfelement(3);
        a.setSize(15);
        a.setValue(15);
        //public A(int value, int indexOfelement, int index, int size, int[] dynamicIntegerArray)
        A a1=new A(a.getValue(),a.getIndexOfelement(), a.getIndex(), a.getSize(),a.getDynamicIntegerArray());
        a1.initArray(a1.getSize());
        a1.printArray();
    }
}
