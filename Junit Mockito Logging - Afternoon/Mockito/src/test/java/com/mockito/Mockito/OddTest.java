package com.mockito.Mockito;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class OddTest {
	OddController oc;
	@Before
	public void setup(){
		OddChecker oc1 = mock(OddChecker.class);
		when(oc1.isOdd(1)).thenReturn(false);
		when(oc1.isOdd(2)).thenReturn(true);
		oc = new OddController();
		oc.setObj(oc1);
	}	
	@Test
	public void test1() {
		Assert.assertEquals(true, oc.Odd(1));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(true, oc.Odd(2));
	}
}
