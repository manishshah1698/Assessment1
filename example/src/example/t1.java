package example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class t1 {

	@Test
	// Divisible by 3
	public void testForDivisibleBy3() {
		exm junit = new exm(); 
		String result = junit.fizzBuzz(3);
		assertEquals("Fizz",result);
	}
	
	@Test
	// Divisible by 5
	public void testForDivisibleBy5() {
		exm junit = new exm(); 
		String result = junit.fizzBuzz(5);
		assertEquals("Buzz",result);
	}
	
	@Test
	// Divisible by 3 and 5
	public void testForDivisibleBy15() {
		exm junit = new exm(); 
		String result = junit.fizzBuzz(15);
		assertEquals("FizzBuzz",result);
	}
	
	@Test
	// Not divisible by 5 or 3
	public void testForNotDivisibleByAny() {
		exm junit = new exm(); 
		String result = junit.fizzBuzz(16);
		assertEquals("16",result);
	}
	

}
