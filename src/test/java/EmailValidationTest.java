//import org.junit.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class EmailValidationTest {
    private String email;
    private boolean isEmail;

    public EmailValidationTest(String email,boolean isEmail) {
        this.email = email;
        this.isEmail = isEmail;
    }

    @Parameterized.Parameters
    public static Collection input(){
//        return Arrays.asList(new Object[][] {
//                {"abc@yahoo.com",true},
//                {"abc-100@yahoo.com",true},
//                {"abc.100@yahoo.com",true},
//                {"abc111@abc.com",true},
//                {"abc-100@abc.net",true},
//                {"abc.100@abc.com.au",true},
//                {"abc@1.com",true},
//                {"abc@gmail.com.com",true},
//                {"abc+100@gmail.com",true}
//        });

        return Arrays.asList(new Object[][] {
                {"abc",false},
                {"abc@.com.my",false},
                {"abc123@gmail.a",false},
                {"abc123@.com",false},
                {"abc123@.com.com",false},
                {".abc@abc.com",false},
                {"abc()*@gmail.com",false},
                {"abc@%*.com",false},
                {"abc..2002@gmail.com",false},
                {"abc.@gmail.com",false},
                {"abc@abc@gmail.com –",false},
                {"abc@gmail.com.1a",false},
                {"abc@gmail.com.aa.au",false}
        });
    }

    @Test
    public void givenArrayOfEmailId_WhenValidMailId_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.addEmail(this.email);
        assertEquals(isEmail,result);
    }
}
