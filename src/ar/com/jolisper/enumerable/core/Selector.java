package ar.com.jolisper.enumerable.core;

import java.util.Collection;
import java.util.LinkedList;

public abstract class Selector <ElementType> {
	
	public Collection<? extends ElementType > select( Collection<? extends ElementType> collection ) {
		
		Collection<ElementType> selection = new LinkedList<ElementType>();
		
		for ( ElementType element : collection ) {
			if ( criteria(element) ) {
				selection.add( element );
			}
		}
		
		return selection;
	}

	protected abstract boolean criteria( ElementType element );

}
