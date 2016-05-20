package stack;


public class Stack<T> {

	private Node head;
	
	protected class Node{
	    protected T element = null;
	    protected Node next = null;

	    public Node(T e, Node n){
	        element = e;
	        next = n;
	    }
	}
	
	public Stack(){}
	
	public boolean isEmpty(){
		return (head == null);
	}
	
	public T peek(){
		if (!isEmpty()){
			return head.element;
		}
		return null;
	}
	
	public T pop(){
		if (!isEmpty()){
			T top = head.element;
			head = head.next;
			return top;
		}
		return null;
	}
	
	public void push(T element){
		Node second = head;
		head = new Node(element, second);
	}
}
