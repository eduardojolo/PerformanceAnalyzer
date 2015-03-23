package br.jolo.performance.test;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.textui.TestRunner;
import br.jolo.sort.impl.QuicksortImpl;
import br.jolo.util.Util;

public class QuicksortTestCase extends TestCase {

private int[] array;
	
	public QuicksortTestCase(String name) {
		super(name);
		
		array = Util.ARRAY;
	}
	
	public void testSort() {
		QuicksortImpl quicksortImpl = new QuicksortImpl();
		
		quicksortImpl.sort(array);
	}
	
	public static Test suite() {
		return new TestSuite(QuicksortTestCase.class);
	}
	
	public static void main(String[] args) {
		TestRunner.run(suite());
	}
}
