package LinkedList;
// Write a Java Program to Replace an Element in a LinkedList
import java.util.List;
import java.util.LinkedList;
public class Program14 {
public static void main(String[] args) {
	List<Integer>p=new LinkedList<>();
	p.add(3);
	p.add(7);
	p.add(2);
	System.out.println(p);
	p.set(2,6);
	System.out.println(p);
}
}
