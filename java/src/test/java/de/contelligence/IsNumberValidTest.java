package de.contelligence;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class IsNumberValidTest {
	private TelephoneValidator validator;

	@Before
	public void setupValidator() {
		this.validator = new TelephoneValidator();
	}
	
	
	@Test
	@Ignore
	public void itShouldAcceptACommonTelephoneNumber() {
		assertThat(this.validator.isNumberValid("0123456789"), is(true));
	}
	
	@Test
	@Ignore
	public void itShouldRejectANumberWithoutLeadingZero() {
		assertThat(this.validator.isNumberValid("1234567890"), is(false));
	}
	
	@Test
	@Ignore
	public void itShouldAcceptANumberWithLeadingPlusSign() {
		assertThat(this.validator.isNumberValid("+1234567890"), is(true));
	}
	
	@Test
	@Ignore
	public void itShouldAcceptALocalNumberWithACountryPrefix() {
		assertThat(this.validator.isNumberValid("+4925139591629"), is(true));
	}
	
	@Test
	@Ignore
	public void itShouldAcceptANumberWithDashes() {
		assertThat(this.validator.isNumberValid("0251-39591643"), is(true));
	}
	
	@Test
	@Ignore
	public void itShouldAcceptANumberWithSlashes() {
		assertThat(this.validator.isNumberValid("0251/39591643"), is(true));
	}
	
	@Test
	@Ignore
	public void itShouldAcceptANumberWithBrackets() {
		assertThat(this.validator.isNumberValid("0 (251) 3959 16 43"), is(true));
	}


	@Test
	@Ignore
	public void itShouldRejectANumberWithAMissingBracket() {
		assertThat(this.validator.isNumberValid("0 (251 39 69 16 43"), is(false));
	}

	@Test
	@Ignore
	public void itShouldRejectANumberWithAMissingBracketButWithAValidGroup() {
		assertThat(this.validator.isNumberValid("0 (251) 39 69 16 43)"), is(false));
	}
}
