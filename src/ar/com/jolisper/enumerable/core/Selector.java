package ar.com.jolisper.enumerable.core;

import java.util.LinkedList;
import java.util.List;

public abstract class Selector <ElementType> {
	
	public List<? extends ElementType > select( List<? extends ElementType> collection ) {
		
		List<ElementType> selection = new LinkedList<ElementType>();
		
		for ( ElementType element : collection ) {
			if ( criteria(element) ) {
				selection.add( element );
			}
		}
		
		return selection;
	}

	protected abstract boolean criteria( ElementType element );

}
