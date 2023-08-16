package LinkedList;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
//13. Write a Java Program to Convert a LinkedList to ArrayList
public class Program11 {
public static void main(String[] args) {
	List<Integer>p=new LinkedList<>();
	p.add(3);
	p.add(6);
	p.add(4);
List<Integer>t=new ArrayList<>(p);
System.out.println(t);
}
}
