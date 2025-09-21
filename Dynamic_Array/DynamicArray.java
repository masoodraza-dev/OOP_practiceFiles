public class DynamicArray {
    private int[] arr;
    private int size;
    private int capacity;

    public DynamicArray(){
        capacity = 2;
        arr = new int[capacity];
        size = 0;
    }

    public void resize(){
        capacity = capacity * 2;
        int[] newArr = new int[capacity];

        //purane Array ko copy krna
        for(int i = 0; i < size; i++){
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    public void add(int value){
        if(size == capacity){
            resize();
        }

        arr[size] = value;
        size++;
    }

    public int get(int index){
        if (index < 0 || index >=size){
            throw new IndexOutOfBoundsException("Invalid Index");
        }
        return arr[index];
    }

    public int size(){
        return size;
    }

    public void print(){
        for(int i = 0; i< size; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
    
}
