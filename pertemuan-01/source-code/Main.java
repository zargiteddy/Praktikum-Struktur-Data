import java.util.regex.Pattern;

class Main
{

	private static final String PASSWORD_REGEX =
			"AKAKOM";

	private static final String COMPLEX_PASSWORD_REGEX =
			"AKAKOM";


	private static final Pattern PASSWORD_PATTERN = Pattern.compile(COMPLEX_PASSWORD_REGEX);

	public static void main(String[] args)
	{
		String password = "AKAKOM";

		// Validate a password
		if (PASSWORD_PATTERN.matcher(password).matches()) {
			System.out.print("The Password " + password + " is valid");
		}
		else {
			System.out.print("The Password " + password + " isn't valid");
		}
	}
}