package testdatata;

import org.testng.annotations.DataProvider;

public class LoginCredentials {
    @DataProvider(name = "loginCredentials")
    public static Object[][] loginData(){
        return new Object[][] {
                {"test@testuser.com", "test123"},
                {"test2@testuser.com", "test123"},
                {"invaliduser@example.com", "user123"}
        };
    }
}
