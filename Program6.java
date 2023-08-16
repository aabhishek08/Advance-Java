package LinkedList;
import java.util.LinkedList;
import java.util.List;
//8. Write a Java Program to Insert the Specified Element at the end of a LinkedList
public class Program6 {
public static void main(String[] args) {
	List<Integer>p=new LinkedList<>();
	p.add(4);
	p.add(5);
	p.add(9);
	System.out.println(p);
	int a=p.size();
	p.add(a,6);
	System.out.println(p);
	
}
}
