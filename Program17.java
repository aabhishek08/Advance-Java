package LinkedList;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

//19. Write a Java program to clone an linked list to another linked list
public class Program17 {
public static void main(String[] args) {
	List<Integer>p=new LinkedList<>();
	p.add(3);
	p.add(7);
	List<Integer>t=new LinkedList<>(p);
	System.out.println(t);
}
}
