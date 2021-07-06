import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JupiterTest {

	@Test
	void testAdd() {
		Calculator calc = new Calculator();
		if (calc.add(1, 5)  != 6) {
			fail("Not yet implemented");	
		}
	}
	@Test
	void testSubtract() {
		assertEquals(Calculator.subtract(7, 5),2);
//		if (Calculator.subtract(7, 5)  != 2) {
//			fail("Not yet implemented");	
//		}
	}

	
	/*
	 * @BeforeAll
	 * @AfterAll
	 * @BeforeEach
	 * @AfterEach
	 */
}
