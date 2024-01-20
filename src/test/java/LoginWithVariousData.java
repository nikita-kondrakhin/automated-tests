import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginWithVariousData extends BaseTest {
    @DataProvider
    public Object[][] loginData() {
        return new Object[][]{
                {"user1", "pass1"},
                {"user2", "pass2"},
                {"user2", "pass2"}
        };
    }

    @Test(dataProvider = "loginData")
    public void testLogin(String username, String password) {

    }

}
