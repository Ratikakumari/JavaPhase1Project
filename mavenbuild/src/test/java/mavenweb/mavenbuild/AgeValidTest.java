package mavenweb.mavenbuild;

import static org.junit.Assert.*;

import org.junit.Test;

public class AgeValidTest {
//expectedoutput = actual output assertEqual(EO,AO)
	@Test
	public void test1() {
		Agevalidator valid=new Agevalidator();
		assertEquals("right to vote",valid.ageVerify(19));
	}
	@Test
	public void test2() {
		Agevalidator valid=new Agevalidator();
		assertEquals("no right to vote",valid.ageVerify(9));
}}
