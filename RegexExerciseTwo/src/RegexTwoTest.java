import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RegexTwoTest {

	@Test
	void nameValid30Test() {
		String actual = "ABCDEFGHIJKLMNOPQRSTUVWYZabcde";
		assertTrue(RegexTwo.validateName(actual));
	}
	
	@Test
	void nameNotValid31Test() {
		String actual = "ABCDEFGHIJKLMNOPQRSTUVWYZabcdef";
		assertFalse(RegexTwo.validateName(actual));
	}
	
	@Test
	void nameNotValidCapsTest() {
		String actual = "aBCDEFGHIJKLMNOPQRSTUVWYZabcde";
		assertFalse(RegexTwo.validateName(actual));
	}
	
	@Test
	void nameNotValidNumbersTest() {
		String actual = "ABCDEFGHIJKLMNOPQRSTUVWYZabcd9";
		assertFalse(RegexTwo.validateName(actual));
	}
	
	@Test
	void emailNotValidTest4Length() {
		String actual = "abcd@gmail.com";
		assertFalse(RegexTwo.validateEmail(actual));
	}
	
	@Test
	void emailValidTest5Length() {
		String actual = "abcde@gmail.com";
		assertTrue(RegexTwo.validateEmail(actual));
	}
	
	@Test
	void emailNotValidTest31Length() {
		String actual = "ABCDEFGHIJKLMNOPQRSTUVWYZabcdef@gmail.com";
		assertFalse(RegexTwo.validateEmail(actual));
	}
	
	@Test
	void emailValidTest30Length() {
		String actual = "ABCDEFGHIJKLMNOPQRSTUVWYZabcde@gmail.com";
		assertTrue(RegexTwo.validateEmail(actual));
	}
	
	@Test
	void emailValidTest30LengthWithNumbers() {
		String actual = "ABCDE1234JKLMNOPQRSTUVWYZabcde@gmail.com";
		assertTrue(RegexTwo.validateEmail(actual));
	}
	
	@Test
	void emailNotValidTestATsymbol() {
		String actual = "ABCDE1234JKLMNOPQRSTUVWYZabcde$gmail.com";
		assertFalse(RegexTwo.validateEmail(actual));
	}
	
	@Test
	void emailNotValidTest3and10Length2() {
		String actual = "ABCDE1234JKLMNOPQRSTUVWYZabcde@gm.com";
		assertFalse(RegexTwo.validateEmail(actual));
	}
	
	@Test
	void emailNotValidTest3and10Length11() {
		String actual = "ABCDE1234JKLMNOPQRSTUVWYZabcde@gmailgmail1.com";
		assertFalse(RegexTwo.validateEmail(actual));
	}
	
	@Test
	void emailNotValidTestDot() {
		String actual = "ABCDE1234JKLMNOPQRSTUVWYZabcde@gmail@com";
		assertFalse(RegexTwo.validateEmail(actual));
	}
	
	@Test
	void emailNotValidTestCom1() {
		String actual = "ABCDE1234JKLMNOPQRSTUVWYZabcde@gmail.c";
		assertFalse(RegexTwo.validateEmail(actual));
	}
	
	@Test
	void emailNotValidTestCom4() {
		String actual = "ABCDE1234JKLMNOPQRSTUVWYZabcde@gmail.comm";
		assertFalse(RegexTwo.validateEmail(actual));
	}
	
	@Test
	void phoneNotValidTestArea2() {
		String actual = "88-123-4567";
		assertFalse(RegexTwo.validatePhone(actual));
	}
	
	@Test
	void phoneNotValidTestArea4() {
		String actual = "8888-123-4567";
		assertFalse(RegexTwo.validatePhone(actual));
	}
	
	@Test
	void phoneNotValidTest1Plus() {
		String actual = "1-888-123-4567";
		assertFalse(RegexTwo.validatePhone(actual));
	}
	
	@Test
	void phoneNotValidTestFirstDash() {
		String actual = "888_123-4567";
		assertFalse(RegexTwo.validatePhone(actual));
	}
	
	@Test
	void phoneNotValidTestTwoAfterDash() {
		String actual = "888-12-4567";
		assertFalse(RegexTwo.validatePhone(actual));
	}
	
	@Test
	void phoneNotValidTestFourAfterDash() {
		String actual = "888-1233-4567";
		assertFalse(RegexTwo.validatePhone(actual));
	}
	
	@Test
	void phoneNotValidTestSecondDash() {
		String actual = "888-123=4567";
		assertFalse(RegexTwo.validatePhone(actual));
	}
	
	@Test
	void phoneNotValidTestLastIs3() {
		String actual = "888-123-456";
		assertFalse(RegexTwo.validatePhone(actual));
	}
	
	@Test
	void phoneNotValidTestLastIs5() {
		String actual = "888-123-45678";
		assertFalse(RegexTwo.validatePhone(actual));
	}
	
	@Test
	void dateNotValidTestMonthGreaterThan12() {
		String actual = "13/12/2000";
		assertFalse(RegexTwo.validateDate(actual));
	}
	
	@Test
	void dateNotValidTestMonthSingleDigit() {
		String actual = "1/12/2000";
		assertFalse(RegexTwo.validateDate(actual));
	}
	
	@Test
	void dateNotValidTestFirstSlashMissing() {
		String actual = "12$12/2000";
		assertFalse(RegexTwo.validateDate(actual));
	}
	
	@Test
	void dateNotValidTestDaySingleDigit() {
		String actual = "12/1/2000";
		assertFalse(RegexTwo.validateDate(actual));
	}
	
	@Test
	void dateNotValidTestDayGreaterThan31() {
		String actual = "12/32/2000";
		assertFalse(RegexTwo.validateDate(actual));
	}
	
	@Test
	void dateNotValidTestSecondSlashMissing() {
		String actual = "12/12@2000";
		assertFalse(RegexTwo.validateDate(actual));
	}

	@Test
	void dateNotValidTestYearOnly3() {
		String actual = "12/12/200";
		assertFalse(RegexTwo.validateDate(actual));
	}
	
	@Test
	void dateNotValidTestYear5Digits() {
		String actual = "12/12/20000";
		assertFalse(RegexTwo.validateDate(actual));
	}
	
	@Test
	void dateNotValidTestYearBefore1900() {
		String actual = "12/12/1899";
		assertFalse(RegexTwo.validateDate(actual));
	}
	
	@Test
	void dateNotValidTestYearAfter2099() {
		String actual = "12/12/2100";
		assertFalse(RegexTwo.validateDate(actual));
	}
}
