package ar.com.jolisper.enumerable.test;

import java.util.LinkedList;
import java.util.List;

import ar.com.jolisper.enumerable.core.Selector;

public class MainTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<TestBean> list = new LinkedList<TestBean>();
		
		list.add( new TestBean().setName("Jorge") );
		list.add( new TestBean().setName("Fran") );
		list.add( new TestBean().setName("Valen") );
		
		List<? extends TestBean> select = new Selector<TestBean>() {
			@Override
			protected boolean criteria(TestBean element) {
				return element.getName().equals("Jorge");
			}
		}.select(list);
		
		for (TestBean bean : select) {
			System.out.println(bean.getName());
		}
		
	}

}
