package LinkedList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
//11. Write a Java Program to Retrieve but does not Remove, the Last Element of a LinkedList
public class Program9 {
public static void main(String[] args) {
	List<Integer>p=new LinkedList<>();
	p.add(3);
	p.add(6);
	p.add(4);
	System.out.println(p);
	System.out.println(p.get(p.size()-1));
	Deque<Integer>t= new LinkedList<>();
	t.add(3);
	t.add(6);
	t.add(4);
	System.out.println(t.getLast());
}
}
