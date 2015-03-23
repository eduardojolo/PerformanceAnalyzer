package br.jolo.performance.test;

import junit.framework.Test;
import junit.textui.TestRunner;

import com.clarkware.junitperf.ConstantTimer;
import com.clarkware.junitperf.LoadTest;
import com.clarkware.junitperf.TestMethodFactory;
import com.clarkware.junitperf.TimedTest;
import com.clarkware.junitperf.Timer;

public class QuicksortTest {

public static Test suite() {
		
		int maxUsers = 10;
		long maxElapsedTime = 1000;
		Timer timer = new ConstantTimer(100);
		 
        Test factory = new TestMethodFactory(QuicksortTestCase.class, "testSort");
        Test timedTest = new TimedTest(factory, maxElapsedTime);
        Test loadTest = new LoadTest(timedTest, maxUsers, 100, timer); 
 
        return loadTest;
	}
	
	public static void main(String[] args) {
		TestRunner.run(suite());
	}
}
