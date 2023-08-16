package LinkedList;
//12. Write a Java Program to Check if a Particular Element exists in a LinkedList
import java.util.LinkedList;
import java.util.List;
public class Program10 {
public static void main(String[] args) {
	List<Integer>p=new LinkedList<>();
	p.add(3);
	p.add(6);
	p.add(4);
	System.out.println(p);
	System.out.println(p.contains(4));
}
}
