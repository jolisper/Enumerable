package ar.com.jolisper.enumerable.test;

import java.util.LinkedList;
import java.util.List;

import ar.com.jolisper.enumerable.core.Reduce;
import ar.com.jolisper.enumerable.core.Selector;

public class MainTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Select test
		List<TestBean> list = new LinkedList<TestBean>();
		
		list.add( new TestBean().setName("Jorge") );
		list.add( new TestBean().setName("Fran") );
		list.add( new TestBean().setName("Valen") );
		
		List<? extends TestBean> select = new Selector<TestBean>() {
			@Override
			protected boolean criteria(TestBean element) {
				return element.getName().equals("Jorge");
			}
		}.select( list );
		
		for (TestBean bean : select) {
			System.out.println( bean.getName() );
		}
		
		// Reduce test
		List<Integer> intList = new LinkedList<Integer>();
		
		intList.add(2);
		intList.add(5);
		intList.add(6);
		
		Integer reduce = (Integer) new Reduce<Integer, Integer>(){
			@Override
			protected Integer logic(Integer result, Integer element) {
				return result + element;
			}
		}.reduce( 4, intList );		
		
		System.out.println( reduce.toString() );
	}

}
