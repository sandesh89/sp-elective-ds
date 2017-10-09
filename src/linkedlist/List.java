package linkedlist;

public interface List {

	int size();

	boolean isEmpty();

	boolean contains(Object o);

	boolean add(Page page);

	boolean addFirst(Page page);

	void addLast(Page page);

	boolean remove(Page page);

	Page removeFirst();

	Page removeLast();

	boolean get(Page page);

	Page getFirst();

	Page getLast();

}
