package lession_2;

interface I_QueueBehaviour<T> {
	boolean add(T element);
	boolean offer(T element);
	T remove();
	T poll();
	T element();
	T peek();
}