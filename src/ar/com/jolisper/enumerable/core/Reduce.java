package ar.com.jolisper.enumerable.core;

import java.util.Collection;

public abstract class Reduce<ResultType, ElementType> {
	
	public ResultType reduce( ResultType initValue, Collection<? extends ElementType> collection ) {
		
		ResultType result = initValue;
		
		for ( ElementType element : collection ) {
			result = logic( result , element );
		}
		
		return result;
	}

	protected abstract ResultType logic(ResultType result, ElementType element);

}
