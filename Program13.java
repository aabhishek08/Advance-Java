package LinkedList;
import java.util.LinkedList;
import java.util.List;
//14. Write a Java Program to Compare Two LinkedList
public class Program13 {
public static void main(String[] args) {
	List<Integer>p=new LinkedList<>();
	List<Integer>t=new LinkedList<>();
	p.add(4);
	p.add(5);
	t.add(4);
	t.add(5);
if(p.equals(t)) {
	System.out.println("Two list are equal");
}else {System.out.println("Two list are not equal");
}
}}
