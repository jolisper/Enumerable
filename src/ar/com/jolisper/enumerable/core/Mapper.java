package ar.com.jolisper.enumerable.core;

import java.util.LinkedList;
import java.util.List;

public abstract class Mapper<ResultType, CollectionType> {
	
	public List<ResultType> map(List<? extends CollectionType> collection) {
		
		List<ResultType> result = new LinkedList<ResultType>();
		
		for ( CollectionType element : collection ) {
			result.add( logic( element ) );
		}
		
		return result;
	}

	protected abstract ResultType logic( CollectionType element );

}