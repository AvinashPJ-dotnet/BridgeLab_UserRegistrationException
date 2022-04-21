import java.util.regex.Pattern;

public class UserRegistration {
    UserDetails userDetails = new UserDetails();

    @FunctionalInterface
    public interface IUserRegistrationFunction {
        boolean validate(String value, String pattern) throws UserDetailException;
    }

    IUserRegistrationFunction addFirstName = (firstName, pattern) -> {
        try {
            if (firstName.length() == 0) {
                throw new UserDetailException("Please enter valid first name", UserDetailException.ExceptionTypes.ENTERED_EMPTY);
            }
            boolean isFirstName = Pattern.matches(pattern, firstName);
            if (isFirstName) {
                userDetails.setFirstName(firstName);
                return true;
            }
        } catch (NullPointerException e) {
            throw new UserDetailException("Please enter valid first name", UserDetailException.ExceptionTypes.ENTERED_NULL);
        }
        System.out.println("Please check First Name");
        return false;
    };

    IUserRegistrationFunction addLastName = (lastName, pattern) -> {
        try {
            if (lastName.length() == 0) {
                throw new UserDetailException("Please enter valid last name", UserDetailException.ExceptionTypes.ENTERED_EMPTY);
            }
            boolean isLastName = Pattern.matches(pattern, lastName);
            if (isLastName) {
                userDetails.setLastName(lastName);
                return true;
            }
        } catch (NullPointerException e) {
            throw new UserDetailException("Please enter valid last name", UserDetailException.ExceptionTypes.ENTERED_NULL);
        }
        System.out.println("Please check Last Name");
        return false;
    };

    IUserRegistrationFunction addEmail = (email, pattern) -> {
        try {
            if (email.length() == 0) {
                throw new UserDetailException("Please enter valid Email", UserDetailException.ExceptionTypes.ENTERED_EMPTY);
            }
            boolean isMailId = Pattern.matches(pattern, email);
            if (isMailId) {
                userDetails.setEmail(email);
                return true;
            }
        } catch (NullPointerException e) {
            throw new UserDetailException("Please enter valid Email", UserDetailException.ExceptionTypes.ENTERED_NULL);
        }
        System.out.println("Please check email id");
        return false;
    };

    IUserRegistrationFunction addPhoneNumber = (phoneNumber, pattern) -> {
        try {
            if (phoneNumber.length() == 0) {
                throw new UserDetailException("Please enter valid Phone number", UserDetailException.ExceptionTypes.ENTERED_EMPTY);
            }
            boolean isPhoneNumber = Pattern.matches(pattern, phoneNumber);
            if (isPhoneNumber) {
                userDetails.setPhoneNumber(phoneNumber);
                return true;
            }
        } catch (NullPointerException e) {
            throw new UserDetailException("Please enter valid Phone number", UserDetailException.ExceptionTypes.ENTERED_NULL);
        }
        System.out.println("Please check Phone Number");
        return false;
    };

    IUserRegistrationFunction addPassword = (password, pattern) -> {
        try {
            if (password.length() == 0) {
                throw new UserDetailException("Please enter valid Phone number", UserDetailException.ExceptionTypes.ENTERED_EMPTY);
            }
            boolean isPassword = Pattern.matches(pattern, password);
            if (isPassword) {
                userDetails.setPassword(password);
                return true;
            } else {
                System.out.println("Please check Password");
                return false;
            }
        } catch (NullPointerException | UserDetailException e) {
            throw new UserDetailException("Please enter valid Phone number", UserDetailException.ExceptionTypes.ENTERED_NULL);
        }
    };
}