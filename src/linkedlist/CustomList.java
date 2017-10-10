package linkedlist;

public interface CustomList {

	int size();

	boolean contains(Object o);

	boolean add(Page page);

	boolean addFirst(Page page);

	boolean addLast(Page page);

	boolean remove();

	boolean removeFirst();

	boolean removeLast();

	Page getFirst();

	Page getLast();

}
