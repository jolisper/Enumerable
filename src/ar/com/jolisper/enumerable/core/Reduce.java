package ar.com.jolisper.enumerable.core;

import java.util.LinkedList;
import java.util.List;

public abstract class Reduce<T> {
	
public <R> R reduce(R result, List<? extends T> collection) {
		
		List<T> selection = new LinkedList<T>();
		
		return result;
	}

	protected abstract boolean criteria(T element);

}
