package holding;

import java.util.LinkedList;

public class Stack<T>{
	private LinkedList<T> storage = new LinkedList<T>();
	//��ջ
	public void push(T v){
		storage.addFirst(v);
	}
	public T peek(){
		return storage.getFirst();
	}
	//��ջ
	public T pop(){
		return storage.removeFirst();
	}
	//�ж�ջ��
	public boolean empty(){
		return storage.isEmpty();
	}
	public String toString(){
		return storage.toString();
	}

}
