package LinkedList;
//7. Write a Java Program to Get the First and Last Occurrence of the Specified Elements in a LinkedList
import java.util.List;
import java.util.LinkedList;
public class Program5 {
public static void main(String[] args) {
	List<Integer>p=new LinkedList<>();
	p.add(4);
	p.add(5);
	p.add(9);
	p.add(9);
	System.out.println(p);
	System.out.println(p.indexOf(5));
	System.out.println(p.lastIndexOf(9));
}
}
