import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    //UC1 firstname
    @Test
    void givenFirstName_WhenProperFirstName_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.addFirstName("Avinash");
        Assertions.assertTrue(result);
    }

    //UC1 firstname false
    @Test
    void givenFirstName_WhenNotProperFirstName_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.addFirstName("avinash");
        Assertions.assertFalse(result);
    }

    //UC2 last name true
    @Test
    void givenFirstName_WhenProperLastName_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.addLastName("Pujari");
        Assertions.assertTrue(result);
    }

    //UC2 last name false
    @Test
    void givenFirstName_WhenNotProperLastName_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.addFirstName("pujari");
        Assertions.assertFalse(result);
    }

    //UC3 EmailId true
    @Test
    void givenFirstName_WhenProperEmailId_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.addEmail("avi.100@gmail.com");
        Assertions.assertTrue(result);
    }

    //UC3 Email id false
    @Test
    void givenFirstName_WhenNotProperEmailId_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.addEmail("avi.100@g.c");
        Assertions.assertFalse(result);
    }

    //UC4 PhoneNumber true
    @Test
    void givenFirstName_WhenProperPhoneNumber_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.addPhoneNumber("91 7204024334");
        Assertions.assertTrue(result);
    }

    //UC4 PhoneNumber false
    @Test
    void givenFirstName_WhenNotProperPhoneNumber_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.addPhoneNumber("917204024334");
        Assertions.assertFalse(result);
    }


    //*UC5 password only accept 8 character true
    //*password should have at least one Upper case letter
    //*password shoudat least one  have digits
    @Test
    void givenFirstName_WhenProperPassword_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.addPassword("Aa3ssdasd4$#");
        Assertions.assertTrue(result);
    }

    //UC5 password false
    @Test
    void givenFirstName_WhenNotProperPassword_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.addPassword("aasasAasd$");
        Assertions.assertFalse(result);
    }
}
