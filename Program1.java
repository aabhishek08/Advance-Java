package LinkedList;
//3. Write a Java Program to Insert Elements into the LinkedList at the First and Last position
import java.util.Deque;
import java.util.LinkedList;
public class Program1 {
    public static void main(String[] args) {
    	Deque<Integer> p = new LinkedList<>();
        p.add(20);
        p.add(3);
        p.add(22);
        p.add(45);
        System.out.println("Original LinkedList: " + p);

        p.addFirst(3);

        System.out.println("LinkedList after insertion at the first position:");
        for (Integer element : p) {
            System.out.println(element);
        }
    }
}
