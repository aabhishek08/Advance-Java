package LinkedList;
//10. Write a Java Program to Iterate through all Elements in a LinkedList starting at the specified position
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
class Program8{
	public static void main(String[] args) {
		List<Integer>p=new LinkedList<>();
		p.add(3);
		p.add(6);
		p.add(4);
		System.out.println(p);
	ListIterator<Integer>t=p.listIterator(2);
	while(t.hasNext()) {
		System.out.println(t.next());
	}
	}
}