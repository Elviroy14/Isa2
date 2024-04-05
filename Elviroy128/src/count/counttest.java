package count;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class counttest {

	static digitscount obj1;
	static digitscount obj2;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		obj1 = new digitscount(12345);
		obj2 = new digitscount(1232);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test1() {
		int tes=obj1.i;
		assertEquals(5,tes);
	}

	@Test
	void test2() {
		int tes=obj2.i;
		assertEquals(4,tes);
	}

}
