package queue;

public class Queue<T> {

	private Node head, tail;
	
	protected class Node{
	    protected T element = null;
	    protected Node next = null;

	    public Node(T e, Node n){
	        element = e;
	        next = n;
	    }
	}
	
	public Queue(){}
	
	public boolean isEmpty(){
		return (head == null);
	}
	
	public T peek(){
		if (!isEmpty()){
			return head.element;
		}
		return null;
	}
	
	public T dequeue(){
		if (!isEmpty()){
			T top = head.element;
			head = head.next;
			return top;
		}
		return null;
	}

	public void enqueue(T element){
		if (isEmpty()){
			head = new Node(element, null);
		}else if (tail == null){
			tail = new Node(element, null);
			head.next = tail;
		}else{
			Node second = tail;
			tail = new Node(element, null);
			second.next = tail;
		}
	}
}
