import org.json.simple.parser.ParseException;

import java.io.IOException;

import static RestApiTest.POST.*;

public class ApiTests {
    public static void main(String[] args) throws IOException, ParseException {

        // Positive Scenario : Invalid email format
        Post_ApiTest_Positive();

        // Negative Scenario : Invalid email format
        Post_ApiTest_Invalid_EmailFormat();

        // Negative API Test : Invalid password
        Post_ApiTest_InvalidPassword();

        // Negative API Test : Missing email field
        Post_ApiTest_MissingEmailField();
    }
}