import static org.junit.Assert.*;

import java.io.File;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestFileOperationUtilities {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSaveFile() throws Exception {
		File fileToSave = new File("fileToSave.txt");
		assertTrue(FileOperationUtilities.saveAs(fileToSave, "drinne"));
	}

}
