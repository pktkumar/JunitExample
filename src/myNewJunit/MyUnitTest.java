package myNewJunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import myNewClass.MyUnit;

class MyUnitTest {

	 @Test
	    public void testConcatenate() {
	        MyUnit myUnit = new MyUnit();

	        String result = myUnit.concatenate("one", "two");

	        assertEquals("onetwo", result);

	    }

}
