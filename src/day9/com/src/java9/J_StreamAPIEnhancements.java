package java9;

import java.util.List;
import java.util.stream.Stream;

public class J_StreamAPIEnhancements {
    public static void main(String[] args) {
        Stream.iterate(1, n -> n <= 10, n -> n + 1)
                .forEach(System.out::println);

        List<String> items = List.of("A", null, "B", null, "C");

        items.stream()
                .flatMap(Stream::ofNullable)
                .forEach(System.out::println);
    }
}
