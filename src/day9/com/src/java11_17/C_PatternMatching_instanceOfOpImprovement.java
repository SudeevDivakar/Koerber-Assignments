package java11_17;

public class C_PatternMatching_instanceOfOpImprovement {
    public static void main(String[] args) {
        Object name = "hello";
        if(name instanceof String string)
            System.out.println(string.length());
        else
            System.out.println("Not string");
    }
}
