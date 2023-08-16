package LinkedList;
//5. Write a Java Program to Insert the Specified Element at the Front of a LinkedList
import java.util.List;
import java.util.LinkedList;
public class Program3 {
public static void main(String[] args) {
	List<Integer>p=new LinkedList<>();
	p.add(9);
	p.add(7);
	System.out.println(p);
	p.add(0,2);
	System.out.println(p);
}
}
