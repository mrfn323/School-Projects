package Project1;

import java.util.Iterator;

public class MyArrayList<E> extends MyAbstractList<E>{

	public static final int initialCapacity = 1<<10; //Starts from one and shifts 3 to the left
	E[] data = (E[]) new Object[initialCapacity];

	//Default Constructor for MyArrayList
	public MyArrayList(){

		size=0;

	}

	//This constructor will automatically fill the array with random numbers	
	//	MyArrayList(int length){
	//		
	//		this.data = (E[]) new Integer[length];
	//		int num = 0;
	//		
	//		for(int i =0; i<length; i++){
	//			
	//			num = (int) (Math.random() * 10);
	//			Integer nums = new Integer(num);
	//			add((E) nums);
	//			size++;
	//		
	//		}
	//	}

	MyArrayList(E[] objects){

		for(int i =0; i<objects.length; i++){

			add(i, objects[i]);

		}

	}

	@Override
	public void add(int index, E e) {

		ensureCapacity();

		for(int i = size-1; i>= index; i--){

			data[i+1] = data[i];

		}
		data[index] = e;
		size++;

	}

	public void ensureCapacity(){

		if(size>= data.length){
			
			E[] newData = (E[])(new Object[size<<1+1]);
			System.arraycopy(data, 0, newData, 0, size);
			data= newData;
			
		}

	}

	@Override
	public void clear() {

		E[] data = (E[]) new Object[initialCapacity];	

	}

	@Override
	public boolean contains(E e) {

		for(int i =0; i<size; i++){

			if(data[i] != null){

				return true;

			}

		}

		return false;

	}

	@Override
	public E get(int index) {

		return data[index];

	}

	@Override
	public boolean isEmpty() {

		if(size<0) return true;
		else return false;

	}

	@Override
	public int lastIndexOf(E e) {

		for(int i = size-1; i>0; i--){
			
			if(data[i] ==  e){
				
				return i;
				
			}
			
		}
		
		return (Integer) null;

	}

	@Override
	public boolean remove(E e) {

		return false;

	}

	@Override
	public int indexOf(E e) {
		
		for(int i = 0; i<size; i++){
			
			if(data[i] == e){
				
				return i;
				
			}
			
		}
		
		return (Integer) null;
	}

	@Override
	public int size() {

		return size;

	}
	public void setSize(int insertSize) {

		size = insertSize;

	}

	@Override
	public E remove(int index) {


		int i = 0;
		while(size<index){
			data[index+ i] = data[index + i + 1];
			i++;
		}
		size--;

		return data[index];

	}

	@Override
	public E set(int index, E e) {

		return data[index] = e;

	}


	@Override
	public Iterator<E> iterator() {

		return new MyArrayListIterator();

	}

	private class MyArrayListIterator implements java.util.Iterator<E>{

		private int current = 0;

		@Override
		public boolean hasNext(){

			return(current<size);

		}

		@Override
		public E next(){

			if(hasNext()) return data[current++];
			else return null;

		}

		public void remove(){

			MyArrayList.this.remove(current);

		}

	}

}
