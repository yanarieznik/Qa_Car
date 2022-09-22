import org.testng.annotations.Test;

public class LoginTest extends TestBase {


    @Test
    public void loginSuccess() {

        app.getHelperUser().openLoginForm();
        app.getHelperUser().fillLoginForm("yana9@aa.com", "Yyana1234");
        app.getHelperUser().submitLogin();


    }
}




