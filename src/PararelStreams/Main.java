package PararelStreams;

import java.util.*;

public class Main {


    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9);
        long t1  = System.currentTimeMillis();
        list.stream()
                .parallel()
                .map(n -> n * 2)
                .forEach(System.out::println);
        long t2 = System.currentTimeMillis();

        long t3 = System.currentTimeMillis();
        list
                .parallelStream()
                .map(n -> n * 2)
                // if you use forEachOrdered it will slow it due sorting
                .forEachOrdered(System.out::println);
        long t4 = System.currentTimeMillis();

        System.out.println(t2 - t1);
        System.out.println(t4-t3);
    }
}
