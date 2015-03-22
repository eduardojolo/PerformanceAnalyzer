package br.jolo.performance.test;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.textui.TestRunner;
import br.jolo.sort.impl.BubblesortImpl;
import br.jolo.util.Util;

public class BubblesortTestCase extends TestCase {

	private int[] array;
	
	public BubblesortTestCase(String name) {
		super(name);
		
		array = Util.fillArray(1000);
	}
	
	public void testSort() {
		BubblesortImpl bubblesortImpl = new BubblesortImpl();
		
		bubblesortImpl.sort(array);
	}
	
	public static Test suite() {
		return new TestSuite(BubblesortTestCase.class);
	}
	
	public static void main(String[] args) {
		TestRunner.run(suite());
	}
}
