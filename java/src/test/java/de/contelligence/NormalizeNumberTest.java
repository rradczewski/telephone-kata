package de.contelligence;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class NormalizeNumberTest {
	private TelephoneValidator validator;

	@Before
	public void setupValidator() {
		this.validator = new TelephoneValidator();
	}

	@Test
	@Ignore
	public void itShouldRemoveSlashes() {
		assertThat(validator.normalizeNumber("0251/39591529"),
				is(equalTo("025139591529")));
	}

	@Test
	@Ignore
	public void itShouldRemoveDashes() {
		assertThat(validator.normalizeNumber("0251-39591529"),
				is(equalTo("025139591529")));
	}

	@Test
	@Ignore
	public void itShouldRemoveSpaces() {
		assertThat(validator.normalizeNumber("0251 39591529"),
				is(equalTo("025139591529")));
	}

	@Test
	@Ignore
	public void itShouldUsePlusInsteadOfTwoLeadingZeroes() {
		assertThat(validator.normalizeNumber("001925139591643"),
				is(equalTo("+1925139591643")));
	}

	@Test
	@Ignore
	public void itShouldNotUseACountryPrefixForNationalTelephoneNumbers() {
		assertThat(validator.normalizeNumber("004925139591629"),
				is(equalTo("025139591629")));
	}
}
