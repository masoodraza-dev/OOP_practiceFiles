public class Main {
    public static void main(String[] args) {
        DynamicArray myArr = new DynamicArray();

        myArr.add(10);
        myArr.add(20);
        myArr.add(30);
        myArr.add(40);

        myArr.print();
        System.out.println("size: " + myArr.size());
        System.out.println("Element at index 2:" + myArr.get(2));
    }
    
}
