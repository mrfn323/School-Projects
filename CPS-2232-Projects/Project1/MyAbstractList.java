package Project1;

public abstract class MyAbstractList<E> implements MyList<E> {

	int size;

	MyAbstractList(){}

	MyAbstractList(E[] objects){

		for(E o: objects){

			this.add(o);

		}

	}

	public void add(E e){

		int index = size;
		this.add(index, e);

	}

	public boolean isEmpty(){

		if(size>0) return false;
		else return true;

	}

	public int size(){return size;}

	public boolean remove(E e){

		int index = this.indexOf(e);
		if(index>-1&&size>0){

			this.remove(index);
			return true;
		}
		else return false;

	}

}
