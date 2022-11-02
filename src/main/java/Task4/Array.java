package Task4;

public class Array {
    public static void main(String[] args) {
        DynamicArray dynamicArray=new DynamicArray();
        dynamicArray.add(1);
        dynamicArray.add(50);
        dynamicArray.add(50);

        dynamicArray.add(50);

        dynamicArray.add(60);

        dynamicArray.add(50);
        System.out.println(dynamicArray);
        dynamicArray.removeAt(0);
        System.out.println(dynamicArray);
        dynamicArray.remove(60);
        System.out.println(dynamicArray);

    }
}
