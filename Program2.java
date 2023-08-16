package LinkedList;

import java.util.LinkedList;
import java.util.List;

//4. Write a Java Program to Append the Specified Element to the end of a LinkedList
public class Program2 {
public static void main(String[] args) {
	List<Integer>p=new LinkedList<Integer>();
	p.add(0,1);
	p.add(1,2);
	p.add(2,1);
	p.add(3,4);
	p.add(4,4);
	System.out.println(p);
}
}
