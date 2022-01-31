import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		System.out.println("A");
		
		LinkedList<Integer> x = new LinkedList();
		x.add(2);
		x.add(5);
		
		
		x.forEach((s) -> System.out.println(s));
		x.removeIf(s -> s.intValue() > 3);
		x.forEach((s) -> System.out.println(s));
		
		
		
	}
	
}
