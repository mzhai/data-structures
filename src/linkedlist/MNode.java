package linkedlist;

public class MNode<T> {

	private T data;
	private MNode<T> next;
	
	public MNode(T data){
		this.data = data;
		next = null;
	}
	
	public T getData() {
		return data;
	}
	
	public MNode<T> getNext(){
		return next;
	}
	
	public void setNext(MNode<T> node){
		this.next = node;
	}
}
