
import com.gevernova.UserRegistrationValidator;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class UserRegistrationValidatorTest {

    // ----- NAME TESTS -----
    @ParameterizedTest
    @ValueSource(strings = {"John", "Alex", "Marie"})
    void testValidNames(String name) {
        assertTrue(UserRegistrationValidator.isValidName(name));
    }

    @ParameterizedTest
    @ValueSource(strings = {"jo", "aLex", "An", "john"})
    void testInvalidNames(String name) {
        assertFalse(UserRegistrationValidator.isValidName(name));
    }

    // Valid Email Test
    @ParameterizedTest
    @MethodSource("validEmails")
    void testValidEmails(String email) {
        assertTrue(UserRegistrationValidator.isValidEmail(email));
    }

    static Stream<String> validEmails() {
        return Stream.of(
                "abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com",
                "abc111@abc.com", "abc-100@abc.net", "abc.100@abc.com.au",
                "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com"
        );
    }

    // Invalid Email Test
    @ParameterizedTest
    @MethodSource("invalidEmails")
    void testInvalidEmails(String email) {
        assertFalse(UserRegistrationValidator.isValidEmail(email));
    }

    static Stream<String> invalidEmails() {
        return Stream.of(
                "abc", "abc@.com.my", "abc123@gmail.a", "abc123@.com",
                "abc123@.com.com", ".abc@abc.com", "abc()*@gmail.com",
                "abc@%*.com", "abc..2002@gmail.com", "abc.@gmail.com",
                "abc@abc@gmail.com", "abc@gmail.com.1a", "abc@gmail.com.aa.au"
        );
    }

    // ----- MOBILE NUMBER TESTS -----
    @ParameterizedTest
    @ValueSource(strings = {"91 9919819801", "44 9876543210", "9876543210"})
    void testValidMobileNumbers(String mobile) {
        assertTrue(UserRegistrationValidator.isValidMobile(mobile));
    }

    @ParameterizedTest
    @ValueSource(strings = {"91-9919819801", "91 99198198", "12345", "91 12345678901", "98765 43210"})
    void testInvalidMobileNumbers(String mobile) {
        assertFalse(UserRegistrationValidator.isValidMobile(mobile));
    }

    // ----- PASSWORD TESTS -----
    @ParameterizedTest
    @ValueSource(strings = {"Abcdefg1@", "Hello123#", "Password1!"})
    void testValidPasswords(String password) {
        assertTrue(UserRegistrationValidator.isValidPassword(password));
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "abcdefg1@",  // No uppercase
            "ABCDEFGH@",  // No digit
            "Abcdefgh1",  // No special char
            "A1@",        // Less than 8 chars
            "Abc1@def@"   // More than 1 special char
    })
    void testInvalidPasswords(String password) {
        assertFalse(UserRegistrationValidator.isValidPassword(password));
    }
}
