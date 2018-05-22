package Project1;
import java.lang.Iterable;
/*
 * Interface for myArrayList and myLinkedList. Methods will be shared between these two classes.
 */
public interface MyList<E> extends Iterable<E>{
	
	void add(E e);
	void add(int index, E e);
	void clear();
	boolean contains(E e);
	E get(int index);
	int indexOf(E e);
	boolean isEmpty();
	int lastIndexOf(E e);
	boolean remove(E e);
	int size();
	E remove(int index);
	E set(int index, E e);

}
