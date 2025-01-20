package Day7.Question2;

/*
Now write an program to makes use of the new API to read the Annotation related information that are applied on various Java
Elements. Write an utility method called readAnnotation() takes a parameter of type AnnotationElement which can represent a
Class, method or Constructor. Then it queries for a list of Annotations of that particular element by calling the getAnnotations()
method. Then the array is iterated to get the individual element, then made a downcast to extract the exact information –
Author.name() and Version.number().
 */

@Author(name = "Johny")
@Version(number = 1.0)
public class AnnotatedClass {
    @Author(name = "Author1")
    @Version(number = 2.0f)
    public void annotatedMethod1() {
    }
    @Author(name = "Author2")
    @Version(number = 4.0)
    public void annotatedMethod2() {
    }
}