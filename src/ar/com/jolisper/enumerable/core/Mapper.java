package ar.com.jolisper.enumerable.core;

import java.util.LinkedList;
import java.util.List;

public abstract class Mapper<ResultType, ElementType> {
	
	public List<ResultType> map( List<? extends ElementType> collection ) {
		
		List<ResultType> result = new LinkedList<ResultType>();
		
		for ( ElementType element : collection ) {
			result.add( logic( element ) );
		}
		
		return result;
	}

	protected abstract ResultType logic( ElementType element );

}