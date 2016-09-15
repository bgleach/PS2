package base;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyInteger_Test {

	/*@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}*/

	@Test
	public void test1() {
		MyInteger x = new MyInteger(6);
		assertTrue(x.isEven());
		assertTrue(x.isOdd()==false);
		assertFalse(x.isOdd());
		assertFalse(x.isPrime());
	}
	
	@Test
	public void test2() {
		MyInteger j = new MyInteger(6);
		assertTrue(MyInteger.isEven(j));
		assertFalse(MyInteger.isOdd(j));
		assertFalse(MyInteger.isPrime(j));
	}
	
	@Test
	public void test3() {
		assertTrue(MyInteger.isOdd(3));
		assertTrue(MyInteger.isEven(6));
		assertFalse(MyInteger.isPrime(6));
	}
	
	@Test
	public void test4() {
		MyInteger n = new MyInteger(6);
		MyInteger x = new MyInteger(2);
		assertTrue(n.equals(n));
		assertFalse(x.equals(n));
	}
	
	@Test
	public void test5() {
		MyInteger n = new MyInteger(6);
		MyInteger x = new MyInteger(2);
		assertTrue(n.equals(6));
		assertFalse(x.equals(5));
	}

}
