package day7.question2;
import java.lang.annotation.*;

/*
Now write an program to makes use of the new API to read the Annotation related information that are applied on various Java
Elements. Write an utility method called readAnnotation() takes a parameter of type AnnotationElement which can represent a
Class, method or Constructor. Then it queries for a list of Annotations of that particular element by calling the getAnnotations()
method. Then the array is iterated to get the individual element, then made a downcast to extract the exact information –
Author.name() and Version.number().
 */

@Target(value = { ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface Author {
    String name() default "unknown";
}