package LinkedList;
//6. Write a Java Program to Iterate through all Elements in a LinkedList
import java.util.List;
import java.util.Iterator;
import java.util.LinkedList;
public class Program4 {
public static void main(String[] args) {
	List<Integer>p=new LinkedList<Integer>();
	p.add(3);
	p.add(5);
	p.add(6);
	Iterator<Integer>t=p.iterator();
	while(t.hasNext()) {
		System.out.println(t.next());
	}
	for(Integer i:p) {
		System.out.println(i);
	}
}
}
