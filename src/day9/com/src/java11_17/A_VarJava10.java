package java11_17;

import java.util.HashMap;
import java.util.Map;

public class A_VarJava10 {
    public static void main(String[] args) {
        var a = 1;
        System.out.println(a);
        Map<Integer, String> map = new HashMap<>();
        map = Map.of(1, "S", 2 , "T", 3, "U");
        for(var entry : map.entrySet())
            System.out.println(entry.getKey() + " " + entry.getValue());
    }
}