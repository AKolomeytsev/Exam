package pro.sky.java.course2;
import java.util.Arrays;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    static void arrayReverce(Integer[] arr){
        int len = arr.length % 2 == 0 ? arr.length/2:arr.length%2;
        for(int i = 0;i<len; i++){
            arr[i] = arr[i]+arr[(arr.length-1)-i];
            arr[(arr.length-1)-i] = arr[i] - arr[(arr.length-1)-i];
            arr[i] = arr[i] - arr[(arr.length-1)-i];
        }
    }

    static void printArray(Integer[] arr){
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);

        }
    }

    public static void main(String[] args) {
        Integer[] arrayOfInteger = {1,2,3,4,5,6,7,8,9};
        printArray(arrayOfInteger);
        System.out.println("------");
        arrayReverce(arrayOfInteger);
        printArray(arrayOfInteger);
        System.out.println("------");


        List list = Arrays.asList(arrayOfInteger);
        Collections.reverse(list);

        list.stream().forEach(i-> System.out.println(i));


    }


}
