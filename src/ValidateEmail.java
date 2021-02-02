import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateEmail {
	private static String emailRegex = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
	
	public boolean CheckEmail(String email) {
		Pattern p = Pattern.compile(emailRegex);
		Matcher m = p.matcher(email);
		return m.matches();
	}
}
