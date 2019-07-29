package gocdtest;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SimpleServiceTest {
	
	@InjectMocks
	private SimpleService service;
	
//	@Before
//	public void setUp() {
//		service = new SimpleService();
//	}

	@Test
	public void test() {
		assertTrue(service.run());
	}

}
