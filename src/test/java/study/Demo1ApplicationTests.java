package study;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Demo1ApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
	public void testInputIsEven(){
	 assertTrue(Demo1Application.checkIfInputIsAnEvenNumber(2)); // Assertion
	 }

}
