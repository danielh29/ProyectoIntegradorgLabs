package mvc.modelo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class datosAreasTest {
	static datosAreas da;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		da = new datosAreas(1, "daw");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetID_Area() {
		assertEquals(1,da.getID_Area());
	}

	@Test
	public void testGetDESCRIPCION() {
		assertEquals("daw",da.getDESCRIPCION());
	}

}
