package LinkedList;
////15. Write a Java program to test an LinkedList is Empty or Not
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;
public class Program12 {
public static void main(String[] args) {
	List<Object>p=new LinkedList<>();
	p.add("Abhi");
	p.add(2);
Predicate<Object>t=u->p.isEmpty();
System.out.println("It is contains "+t.test(p));
}

}
