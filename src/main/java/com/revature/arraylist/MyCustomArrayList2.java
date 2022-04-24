package com.revature.arraylist;
//https://www.youtube.com/watch?v=fTMXP_IMXDo
public class MyCustomArrayList2<T> {
    public static final int DEFAULT_SIZE = 2;
    private Object[] arr;
    private int size = 0;

    public MyCustomArrayList2() {
        arr = new Object[DEFAULT_SIZE];
    }

    public void add(T item){
        if(size+1 > arr.length){
            Object[] temp = arr;
            arr = new Object[size*2];
            for(int index=0; index<temp.length; index++){
                arr[index]=temp[index];
            }
        }
        arr[size++]=item;
    }

    public int size(){
        return size;
    }

    public T getItem(int index) {
        return (T) arr[index];
    }

    public void removeByIndex(int index) {
        for (int i = index; i <size-1 ; i++) {
            arr[i]=arr[i+1];
        }
        size--;
    }

    public void removeByValue(T item) {
        for (int index = 0; index < size; index++) {
            if(item.equals(arr[index])){
                removeByIndex(index);
            }
        }
    }
}
