package example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class t1 {

	@Test
	public void testForDivisibleBy3() {
		exm junit = new exm(); 
		String result = junit.fizzBuzz(3);
		assertEquals("Fizz",result);
	}

	

}
