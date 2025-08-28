package ArrayPack;
import java.util.Stack;
public class Stack1 {

  public static void main(String[] args) {
	        Stack<Integer> stack = new Stack<>();
	        stack.push(10);
	        stack.push(20);
	        stack.push(30);
	        System.out.println("Stack : " + stack);

	   
	        System.out.println("Top element: " + stack.peek());

	       
	        System.out.println("Popped: " + stack.pop());
	        System.out.println("Stack after pop: " + stack);

	 
	        System.out.println("Is empty " + stack.isEmpty());


	        System.out.println("Position: " + stack.search(10));
	   }
}