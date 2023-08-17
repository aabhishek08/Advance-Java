package LinkedList;
//18. Write a Java Program to Remove and Return the First Element of a LinkedList
import java.util.LinkedList;
import java.util.Deque;
public class Program16 {
public static void main(String[] args) {
Deque<Integer>p=new LinkedList<>();
	p.add(3);
	p.add(7);
	System.out.println(p.poll());
	System.out.println(p);
}
}
