package LinkedList;
//9. Write a Java Program to Iterate a LinkedList in Reverse Order
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
public class Program7 {
public static void main(String[] args) {
	List<Integer>p=new LinkedList<>();
	p.add(2);
	p.add(4);
	p.add(8);
	System.out.println(p);
	ListIterator<Integer>i=p.listIterator(p.size());
	while(i.hasPrevious()) {
		System.out.println(i.previous());
	}
	for(int t=p.size()-1;t>=0;t--) {
		System.out.println(p.get(t));
	}
}
}
