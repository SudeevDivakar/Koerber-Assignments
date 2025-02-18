package java9;

import  java.util.*;
import java.util.stream.Stream;

public class F_StreamEnhancement {
    public static void main(String[] args) {
//  take while
        List<Integer> list=List.of(4,6,8,9,50);
        list.stream().filter(n->n%2==0).forEach(System.out::println);
        list.stream().takeWhile(n->n%2==0).forEach(System.out::println);

//	drop while
        list.stream().dropWhile(n->n%2==0).forEach(System.out::println);
        Stream.iterate(1, x->x+1).limit(5).forEach(System.out::println);
        Stream.iterate(1, x->x<=5, x->x+1).forEach(System.out::println);
    }
}
