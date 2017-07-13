package fizzbuzz;

import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class FizzBuzzTest {

	
	private FizzBuzz underTest;
	
	@Before
	public void setup() {
//		arrange
		underTest = new FizzBuzz();
	}
	@Test
	public void shouldSay1() {
//		act
		String response = underTest.say(1);
		
//		assert
		Assert.assertEquals("Should have responded 1", "1", response);
	}
	
	@Test
	public void shouldSay2() {
		String response = underTest.say(2);
		
		assertThat("should have responded 2", response, is("2"));
	}
	
	
	@Test 
	public void shouldSayFizzInsteadOf3() {
		assertThat(underTest.say(3), is("Fizz"));
	}
	
	@Test 
	public void shouldSayBuzzInsteadOf5() {
		assertThat(underTest.say(5), is("Buzz"));
	}
	
	@Test
	public void shouldSayFizzInsteadOf6() {
		assertThat(underTest.say(6), is("Fizz"));
	}
	
	@Test
	public void shouldSayBuzzInsteadOf10() {
		assertThat(underTest.say(10), is("Buzz"));
	}
	
	@Test
	public void shouldSayFizzBuzzInsteadOf15() {
		assertThat(underTest.say(15), is("FizzBuzz"));
	}
	
	@Test 
	public void shouldGiveMeTheSequence() {
		List<String> sequence = underTest.countUpTo(3);
		
//		with matchers
		assertThat(sequence, contains("1", "2", "Fizz"));
		
//		with assertEquals
		List<String> expected = Arrays.asList("1", "2", "Fizz");
		assertEquals(expected, sequence);
	}
}
