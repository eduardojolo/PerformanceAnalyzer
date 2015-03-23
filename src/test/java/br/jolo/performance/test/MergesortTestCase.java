package br.jolo.performance.test;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.textui.TestRunner;
import br.jolo.sort.impl.MergesortImpl;
import br.jolo.util.Util;

public class MergesortTestCase extends TestCase {

private int[] array;
	
	public MergesortTestCase(String name) {
		super(name);
		
		array = Util.ARRAY;
	}
	
	public void testSort() {
		MergesortImpl mergesortImpl = new MergesortImpl();
		
		mergesortImpl.sort(array);
	}
	
	public static Test suite() {
		return new TestSuite(MergesortTestCase.class);
	}
	
	public static void main(String[] args) {
		TestRunner.run(suite());
	}
}
