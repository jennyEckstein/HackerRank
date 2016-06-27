import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MinimumDistancesTest {
	
	private MinimumDistances minDistances;

	@Before
	public void setUp() throws Exception {
		this.minDistances = new MinimumDistances();
	}

	@After
	public void tearDown() throws Exception {
		this.minDistances = null;
	}
	

	@Test
	public void testCase() {		
		int array[] = {1,7,3,3,7,1};		
		assertEquals(minDistances.findMinimumDistance(array), 1);
	}
	
	@Test
	public void testEmpty(){
		int array[] = {};
		assertEquals(minDistances.findMinimumDistance(array), -1);
	}
	
	@Test
	public void testSingleElement(){
		int array[] = {1};
		assertEquals(minDistances.findMinimumDistance(array), -1);
	}

}
