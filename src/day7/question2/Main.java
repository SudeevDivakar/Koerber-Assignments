package day7.question2;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;

/*
Now write an program to makes use of the new API to read the Annotation related information that are applied on various Java
Elements. Write an utility method called readAnnotation() takes a parameter of type AnnotationElement which can represent a
Class, method or Constructor. Then it queries for a list of Annotations of that particular element by calling the getAnnotations()
method. Then the array is iterated to get the individual element, then made a downcast to extract the exact information –
Author.name() and Version.number().
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Class Annotations:");
        readAnnotation(AnnotatedClass.class);
        System.out.println();

        for (Method method: AnnotatedClass.class.getDeclaredMethods()) {
            System.out.println(new StringBuilder("Method Annotations for ").append(method.getName()).append(":").toString());
            readAnnotation(method);
            System.out.println();
        }
    }

    public static void readAnnotation(AnnotatedElement element) {
        for (Annotation annotation : element.getAnnotations()) {
            if (annotation instanceof Author) {
                Author author = (Author) annotation;
                System.out.println(new StringBuilder("Author: ").append(author.name()).toString());
            }
            else if (annotation instanceof Version) {
                Version version = (Version) annotation;
                System.out.println(new StringBuilder("Version: ").append(version.number()));
            }
        }
    }
}
