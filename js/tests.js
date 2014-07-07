// To enable a test: Replace "xit" with "it"
// To disable a test: Replace "it" with "xit"

describe("the telephone number validator", function() {
	xit("should accept a common telephone number", function() {
		expect(is_number_valid("0123456789")).toBe(true);
	});

	xit("should reject a number without leading zero", function() {
		expect(is_number_valid("1234567890")).toBe(false);
	});

	xit("should accept a number with leading plus sign", function() {
		expect(is_number_valid("+1234567890")).toBe(true);
	});

	xit("should accept a local number with a country prefix", function() {
		expect(is_number_valid("+4925139591629")).toBe(true);
	});

	xit("should accept a number with dashes", function() {
		expect(is_number_valid("0251-39591643")).toBe(true);
	});

	xit("should accept a number with slashes", function() {
		expect(is_number_valid("0251/39591643")).toBe(true);
	});

	xit("should accept a number with brackets", function() {
		expect(is_number_valid("0 (251) 3959 16 43")).toBe(true);
	});

	xit("should reject a number with a missing bracket", function() {
		expect(is_number_valid("0 (251 39 69 16 43")).toBe(false);
	});

	xit("should reject a number with a missing bracket but with a valid group", function() {
		expect(is_number_valid("0 (251) 39 69 16 43)")).toBe(false);
	});
})

describe("the telephone number normalizer", function() {
	xit("should remove slashes", function() {
		expect(normalize_number("0251/39591529")).toBe("025139591529");
	});

	xit("should remove dashes", function() {
		expect(normalize_number("0251-39591529")).toBe("025139591529");
	});

	xit("should remove spaces", function() {
		expect(normalize_number("0251 39591529")).toBe("025139591529");
	});

	xit("should use plus instead of two leading zeroes", function() {
		expect(normalize_number("001925139591643")).toBe("+1925139591643");
	});

	xit("should not use a country prefix for national telephone numbers", function() {
		expect(normalize_number("004925139591629")).toBe("025139591629");
	});
})