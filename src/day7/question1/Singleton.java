package day7.question1;

/*
Implement singleton design pattern, to ensure that a class have only one instance
and provide global point of access to it
While designing singleton pattern consider following factors, what is good progamming
practice about singleton pattern?
 */

public class Singleton {
    public static Singleton singletonInstance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (singletonInstance == null) {
            singletonInstance = new Singleton();      // Lazy Initialization
        }
        return singletonInstance;
    }

    protected Object readResolve(){    // Fixing Serialization Issue
        return singletonInstance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {    // Prevent cloning
        throw new CloneNotSupportedException("Singleton cannot be cloned");
    }
}
