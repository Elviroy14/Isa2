package basics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class add2numTest {
	 static add2num obj;
	    static add2num obj1;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		obj = new add2num(2,2);
		obj1 = new add2num(3,3);
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
		int tes1=obj.sum;
		assertEquals(4,tes1);
	}
	@Test
	void test2() {
		int tes1=obj1.sum;
		assertEquals(6,tes1);
	}

}
