import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestCodeLession {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void TestlivesInWater() {
		Animal testAnimal = new Animal();
		assertTrue(testAnimal.livesInWater("water"));
		assertFalse(testAnimal.livesInWater("earth"));
	}
	
	@Test
	public void TestHatesTheseAnimals() {
		Animal testAnimal = new Animal();
		testAnimal.setName("Chuccumo");
		assertEquals(testAnimal.getName(), "Chuccumo");
	}
	
	@Test
	public void TestsimpleCalc(){
		Animal testAnimal = new Animal();
		assertEquals(11, testAnimal.simpleCalc(5, 6));
	}

}
