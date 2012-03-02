package ar.com.jolisper.enumerable.core;

import java.util.Collection;
import java.util.LinkedList;

public abstract class Mapper<ResultType, ElementType> {
	
	public Collection<ResultType> map( Collection<? extends ElementType> collection ) {
		
		Collection<ResultType> result = new LinkedList<ResultType>();
		
		for ( ElementType element : collection ) {
			result.add( logic( element ) );
		}
		
		return result;
	}

	protected abstract ResultType logic( ElementType element );

}