package org.hahan.javawraper.util;

import org.hahan.javawraper.lang.result.Equals;

public class ArrayRing<E> implements Ring<E> {

	private static final long serialVersionUID = 6105682346580524194L;

	private Object[] ring;
	private boolean isFull = false;
	private int cur=0;

	public ArrayRing(int size) {
		ring = new Object[size];
		cur = 0;
	}

	@Override
	public void add(E e) {
		if (cur == ring.length) {
			cur = 0;
		}
		ring[cur++] = e;
		if (cur == ring.length) {
			isFull = true;
		}
	}

	@Override
	public E next() {
		int i = cur;
		if (i>=ring.length) {
			i=0;
		}
		return (E)ring[i];
	}
	
	@Override
	public boolean isFull() {
		return isFull;
	}

	@Override
	public boolean equals(E[] anothers) {
		if (!isFull()) {
			return false;
		}
		if (ring.length != anothers.length) {
			return false;
		}
		int step = cur;
		for(int i=0; i<ring.length; i++,step++) {
			if (step == ring.length) {
				step=0;
			}
			if (!Equals.equals(ring[step], anothers[i])) {
				return false;
			}
		}
		return true;
	}

	public String toString() {
		byte[] dest = new byte[ring.length];
		System.arraycopy(ring, cur, dest, 0, ring.length-cur);
		System.arraycopy(ring, 0, dest, ring.length-cur, cur);
		return new String(dest);
	}
}
