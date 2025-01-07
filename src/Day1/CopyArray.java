package Day1;

/*
Write a method called copyOf(), which accept an int array and returns a copy of the given array.
The method's signature is as follows:
public static int[] copyOf(int[] array)
*/

public class CopyArray {
    public static int[] copyOf(int[] array) {
        int n = array.length;
        int newArray[] = new int[n];

        for (int i = 0; i < n; i++) {
            newArray[i] = array[i];
        }

        return newArray;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        System.out.println("Original Array Reference: " + arr);
        System.out.println("New Copy of Array Reference: " + copyOf(arr));
    }
}

