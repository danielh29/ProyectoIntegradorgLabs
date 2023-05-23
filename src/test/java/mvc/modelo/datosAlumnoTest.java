package mvc.modelo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class datosAlumnoTest {

	static datosAlumno da;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		da = new datosAlumno(2,290,"Jasmin",3);
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
	public void testGetID_Alumno() {
		assertEquals(2,da.getID_Alumno());
	}

	@Test
	public void testGetNumero_exp() {
		assertEquals(290,da.getNumero_exp());
	}

	@Test
	public void testGetNombre() {
		assertEquals("Jasmin",da.getNombre());
	}

	@Test
	public void testGetID_Proyecto() {
		assertEquals(3,da.getID_Proyecto());
	}

}
