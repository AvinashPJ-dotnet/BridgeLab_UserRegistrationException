import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    //UC1 firstname
    @Test
    void givenFirstName_WhenProperFirstName_ShouldReturnTrue() throws UserDetailException {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.addFirstName("Avinash");
        Assertions.assertTrue(result);
    }

    //UC1 firstname false
    @Test
    void givenFirstName_WhenNotProperFirstName_ShouldReturnFalse() throws UserDetailException {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.addFirstName("avinash");
        Assertions.assertFalse(result);
    }

    //UC12 firstname Null Exception
    @Test
    void givenNull_WhenFirstNameException_ShouldMatch() {
        try {
            UserRegistration userRegistration = new UserRegistration();
            boolean result = userRegistration.addFirstName(null);
            Assertions.assertFalse(result);
        } catch (UserDetailException e) {
            Assertions.assertEquals(UserDetailException.ExceptionTypes.ENTERED_NULL,e.types);
        }
    }
    //UC12 firstname Empty Exception
    @Test
    void givenEmpty_WhenFirstNameException_ShouldMatch() {
        try {
            UserRegistration userRegistration = new UserRegistration();
            boolean result = userRegistration.addFirstName(" ");
            Assertions.assertFalse(result);
        } catch (UserDetailException e) {
            Assertions.assertEquals(UserDetailException.ExceptionTypes.ENTERED_EMPTY,e.types);
        }
    }

    //UC2 last name true
    @Test
    void givenFirstName_WhenProperLastName_ShouldReturnTrue() throws UserDetailException {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.addLastName("Pujari");
        Assertions.assertTrue(result);
    }

    //UC2 last name false
    @Test
    void givenFirstName_WhenNotProperLastName_ShouldReturnFalse() throws UserDetailException {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.addLastName("pujari");
        Assertions.assertFalse(result);
    }

    //UC12 last_name Null Exception
    @Test
    void givenNull_WhenLastNameException_ShouldMatch() {
        try {
            UserRegistration userRegistration = new UserRegistration();
            boolean result = userRegistration.addLastName(null);
            Assertions.assertFalse(result);
        } catch (UserDetailException e) {
            Assertions.assertEquals(UserDetailException.ExceptionTypes.ENTERED_NULL,e.types);
        }
    }
    //UC12 last name Empty Exception
    @Test
    void givenEmpty_WhenLastNameException_ShouldMatch() {
        try {
            UserRegistration userRegistration = new UserRegistration();
            boolean result = userRegistration.addLastName(" ");
            Assertions.assertFalse(result);
        } catch (UserDetailException e) {
            Assertions.assertEquals(UserDetailException.ExceptionTypes.ENTERED_EMPTY,e.types);
        }
    }


    //UC3 EmailId true
    @Test
    void givenFirstName_WhenProperEmailId_ShouldReturnTrue() throws UserDetailException {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.addEmail("avi.100@gmail.com");
        Assertions.assertTrue(result);
    }

    //UC3 Email id false
    @Test
    void givenFirstName_WhenNotProperEmailId_ShouldReturnFalse() throws UserDetailException {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.addEmail("avi.100@g.c");
        Assertions.assertFalse(result);
    }


    //UC12 email Null Exception
    @Test
    void givenNull_WhenEmailException_ShouldMatch() {
        try {
            UserRegistration userRegistration = new UserRegistration();
            boolean result = userRegistration.addEmail(null);
            Assertions.assertFalse(result);
        } catch (UserDetailException e) {
            Assertions.assertEquals(UserDetailException.ExceptionTypes.ENTERED_NULL,e.types);
        }
    }
    //UC12 email Empty Exception
    @Test
    void givenEmpty_WhenEmailException_ShouldMatch() {
        try {
            UserRegistration userRegistration = new UserRegistration();
            boolean result = userRegistration.addEmail(" ");
            Assertions.assertFalse(result);
        } catch (UserDetailException e) {
            Assertions.assertEquals(UserDetailException.ExceptionTypes.ENTERED_EMPTY,e.types);
        }
    }

    //UC4 PhoneNumber true
    @Test
    void givenFirstName_WhenProperPhoneNumber_ShouldReturnTrue() throws UserDetailException {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.addPhoneNumber("91 7204024334");
        Assertions.assertTrue(result);
    }

    //UC4 PhoneNumber false
    @Test
    void givenFirstName_WhenNotProperPhoneNumber_ShouldReturnFalse() throws UserDetailException {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.addPhoneNumber("917204024334");
        Assertions.assertFalse(result);
    }

    //UC12 Phone number Null Exception
    @Test
    void givenNull_WhenPhoneNumberException_ShouldMatch() {
        try {
            UserRegistration userRegistration = new UserRegistration();
            boolean result = userRegistration.addPhoneNumber(null);
            Assertions.assertFalse(result);
        } catch (UserDetailException e) {
            Assertions.assertEquals(UserDetailException.ExceptionTypes.ENTERED_NULL,e.types);
        }
    }
    //UC12 Phone number Empty Exception
    @Test
    void givenEmpty_WhenPhoneNumberException_ShouldMatch() {
        try {
            UserRegistration userRegistration = new UserRegistration();
            boolean result = userRegistration.addPhoneNumber(" ");
            Assertions.assertFalse(result);
        } catch (UserDetailException e) {
            Assertions.assertEquals(UserDetailException.ExceptionTypes.ENTERED_EMPTY,e.types);
        }
    }


    //*UC5 password only accept 8 character true
    //*password should have at least one Upper case letter
    //*password shoudat least one  have digits
    @Test
    void givenFirstName_WhenProperPassword_ShouldReturnTrue() throws UserDetailException {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.addPassword("Aa3ssdasd4$#");
        Assertions.assertTrue(result);
    }

    //UC5 password false
    @Test
    void givenFirstName_WhenNotProperPassword_ShouldReturnFalse() throws UserDetailException {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.addPassword("aasasAasd$");
        Assertions.assertFalse(result);
    }


    //UC12 Password Null Exception
    @Test
    void givenNull_WhenPasswordException_ShouldMatch() {
        try {
            UserRegistration userRegistration = new UserRegistration();
            boolean result = userRegistration.addPassword(null);
            Assertions.assertFalse(result);
        } catch (UserDetailException e) {
            Assertions.assertEquals(UserDetailException.ExceptionTypes.ENTERED_NULL,e.types);
        }
    }
    //UC12 password Empty Exception
    @Test
    void givenEmpty_WhenPasswordException_ShouldMatch() {
        try {
            UserRegistration userRegistration = new UserRegistration();
            boolean result = userRegistration.addPassword(" ");
            Assertions.assertFalse(result);
        } catch (UserDetailException e) {
            Assertions.assertEquals(UserDetailException.ExceptionTypes.ENTERED_EMPTY,e.types);
        }
    }
}
