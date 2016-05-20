package specialstack;

import queue.Queue;
import stack.Stack;

public class SpecialStack<T>{
	
	Queue q = new Queue();
	Stack s = new Stack();
	
	public SpecialStack(){}
	
	public boolean isEmpty(){
		return (s.isEmpty()&&q.isEmpty());
	}
	
	public T peek(){
		if (!s.isEmpty())
			return (T) s.peek();
		return (T) q.peek();
	}
	
	public T pop(){
		if (!s.isEmpty()){
			return (T) s.pop();
		}
		return (T) q.dequeue();
	}
	
	public void push(T element){
		s.push(element);
	}
	
public void specialPush(T element){
		q.enqueue(element);
	}
}
