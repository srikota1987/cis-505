import java.util.LinkedList;

/*
    Srilakshmi, K. (2022). Intermediate Java Programming - GenericQueue class the products.
    Created by Srilakshmi Kota
*/
public class GenericQueue<E> {
	
	private LinkedList<E> list = new LinkedList<E>();
	
	public void enqueue(E item) {
		list.addFirst(item);
	}
	
	public E dequeue() {
		return list.removeFirst();
	}
	
	public int size() {
		return list.size();
	}
	

}
