package org.newdawn.slick.util;

import java.util.ListIterator;

public class ReverseListIterator<T> implements ListIterator<T> {
	private final ListIterator<T> iter;

	public ReverseListIterator(ListIterator<T> iter) {
		this.iter = iter;
	}

	public boolean hasNext() {
		return iter.hasPrevious();
	}

	public T next() {
		return iter.previous();
	}

	public void remove() {
		iter.remove();
	}

	@Override
	public boolean hasPrevious() {
		return iter.hasNext();
	}

	@Override
	public T previous() {
		return iter.next();
	}

	@Override
	public int nextIndex() {
		return iter.previousIndex();
	}

	@Override
	public int previousIndex() {
		return iter.nextIndex();
	}

	@Override
	public void set(T e) {
		iter.set(e);
	}

	@Override
	public void add(T e) {
		iter.add(e);
	}
}
