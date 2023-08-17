package LinkedList;
//Write  a Java Program to Retrieve but does not Remove, the First Element of a LinkedList
import java.util.LinkedList;
import java.util.List;
public class Program15 {
public static void main(String[] args) {
	List<Integer>p=new LinkedList<>();
	p.add(3);
	p.add(7);
	System.out.println(p.get(0));
}
}
