package ar.com.jolisper.enumerable.core;

import java.util.LinkedList;
import java.util.List;

public abstract class Selector <T> {
	
	public List<? extends T > select(List<? extends T> collection) {
		
		List<T> selection = new LinkedList<T>();
		
		for (T element : collection) {
			if ( criteria(element) ) {
				selection.add(element);
			}
		}
		
		return selection;
	}

	protected abstract boolean criteria(T element);

}
