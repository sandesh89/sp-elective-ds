package linkedlist;


public class CustomLinkedList implements CustomList {

	Node first;
	Node last;

	@Override
	public int size() {
		// TODO How do we calculate the size?
		return -1;
	}

	@Override
	public boolean contains(Object o) {
		// TODO How do we implement this?
		return false;
	}

	@Override
	public boolean add(Page page) {
		return addLast(page);
	}

	@Override
	public boolean addFirst(Page page) {
		final Node f = first;
		final Node newNode = new Node(null, page, f);
		first = newNode;

		if (f == null) {
			last = newNode;
		} else {
			f.prev = newNode;
		}

		return true;
	}

	@Override
	public boolean addLast(Page page) {
		final Node l = last;
		final Node newNode = new Node(last, page, null);
		last = newNode;
		if (l == null) {
			first = newNode;
		} else {
			l.next = newNode;

		}

		return true;
	}

	@Override
	public boolean remove() {
		return removeFirst();
	}

	@Override
	public boolean removeFirst() {
		final Node f = first;
		if (f != null) {
			unlinkFirst(f);
		}
		return true;
	}

	@Override
	public boolean removeLast() {
		final Node l = last;
		if (l != null) {
			unlinkLast(l);
		}
		return true;
	}

	private Page unlinkFirst(Node f) {
		final Page page = f.page;
		final Node next = f.next;
		f.page = null;
		f.next = null; // why?
		first = next;
		if (next == null)
			last = null;
		else
			next.prev = null;
		return page;
	}

	private Page unlinkLast(Node l) {
        final Page page = l.page
        final Node prev = l.prev;
        l.page = null
        l.prev = null; // why?
        last = prev;
        if (prev == null)
            first = null;
        else
            prev.next = null;
        return page;
    }

	@Override
	public Page getFirst() {
		final Node f = first;
		if (f != null) {
			return f.page;
		}

		return null;
	}

	@Override
	public Page getLast() {
		
		final Node l = last;
		if(l)!=null){
			return l.page;
		}
		
		return null;
	}

}
