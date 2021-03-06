import java.util.Scanner;

public class RegexTwo {

	public static void main(String[] args) {

		boolean nameValid = false;
		boolean emailValid = false;
		boolean phoneValid = false;
		boolean dateValid = false;
		System.out.println("Welcome to Regex Validation Two!\n");
		Scanner scnr = new Scanner(System.in);

		while (nameValid == false) {
			System.out.println("Please enter a name that:");
			System.out.println("- Starts with a capital letter");
			System.out.println("- Has only alphabet characters");
			System.out.println("- Is not longer than 30 characters");
			System.out.println("- Example: Gary");
			String userName = scnr.nextLine();
				if(validateName(userName)) {
					nameValid = true;
					break;
				} else {
					nameValid = false;
				}
		}
		
		while (emailValid == false) {
			System.out.println("Please enter an email that has:");
			System.out.println("- Alphanumeric characters, with a length between 5 and 30,\n  and there are no special characters");
			System.out.println("- Then an @ symbol");
			System.out.println("- Then alphanumeric characters, with a length between 3 and 10");
			System.out.println("- Then a . symbol");
			System.out.println("- Then a top level domain (ie com) that is between 2-3 characters");
			System.out.println("- Example: garyowens85@gmail.com");
			String userEmail = scnr.nextLine();
				if(validateEmail(userEmail)) {
					emailValid = true;
					break;
				} else {
					emailValid = false;
				}
		}
		
		while (phoneValid == false) {
			System.out.println("Please enter an phone number that has:");
			System.out.println("- Area code that is 3 digits");
			System.out.println("- Then an - symbol");
			System.out.println("- Then 3 digits");
			System.out.println("- Then a - symbol");
			System.out.println("- Then 4 digits");
			System.out.println("- Example: 888-123-4567");
			String userPhone = scnr.nextLine();
				if(validatePhone(userPhone)) {
					phoneValid = true;
					break;
				} else {
					phoneValid = false;
				}
		}
		
		while (dateValid == false) {
			System.out.println("Please enter a date in the following format:");
			System.out.println("- MM/DD/YYYY or MM-DD-YYYY");
			System.out.println("- Not before 1900 or after 2099");
			System.out.println("- Example: 12/31/2022 or 12-31-2022");
			String userDate = scnr.nextLine();
				if(validateDate(userDate)) {
					dateValid = true;
					break;
				} else {
					dateValid = false;
				}
		}
		scnr.close();
		System.out.println("Thanks for playing!");
	}

	public static boolean validateName(String name) {
		String nameRegex = "^[A-Z][A-z]{1,29}";
		if (name.matches(nameRegex)) {
			System.out.println("Success");
			return true;
		}
		System.out.println("Sorry, that was not a valid entry.\n");
		return false;
	}

	public static boolean validateEmail(String email) {
		String emailRegex = "[A-z0-9]{5,30}@[A-z0-9]{3,10}\\.[A-z0-9]{2,3}";
		if (email.matches(emailRegex)) {
			System.out.println("Success");
			return true;
		}
		System.out.println("Sorry, that was not a valid entry.\n");
		return false;
	}

	public static boolean validatePhone(String phone) {
		String phoneRegex = "\\d{3}-\\d{3}-\\d{4}";
		if (phone.matches(phoneRegex)) {
			System.out.println("Success");
			return true;
		}
		System.out.println("Sorry, that was not a valid entry.\n");
		return false;
	}

	public static boolean validateDate(String date) {
		String dateRegex = "^(0[1-9]|1[012])[- /.](0[1-9]|[12][0-9]|3[01])[- /.](19|20)\\d\\d$";
		if (date.matches(dateRegex)) {
			System.out.println("Success");
			return true;
		}
		System.out.println("Sorry, that was not a valid entry.\n");
		return false;
	}

}
