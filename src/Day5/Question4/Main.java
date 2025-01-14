package Day5.Question4;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

/*
Create a program to create PriorityQueque to store product information
Product class : consist of fields: productId, productName, productPrice. Create and store 5 product into
PriorityQueque
You need to use Comparator for custom priority (as per productPrice)
 */

public class Main {
    public static void main(String[] args) {
        Queue<Product> pq = new PriorityQueue<>();

        Product p1 = new Product(1, "Jersey", 7000.0);
        Product p2 = new Product(2, "Shoes", 5200.0);
        Product p3 = new Product(3, "Cap", 5700.0);
        Product p4 = new Product(4, "Jeans", 3500.0);
        Product p5 = new Product(5, "Shirt", 4000.0);
        Product[] tempProducts = {p1, p2, p3, p4, p5};

        Collections.addAll(pq, tempProducts);

        System.out.println("Printing out products as per priority queue");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll().toString());
        }
    }
}
