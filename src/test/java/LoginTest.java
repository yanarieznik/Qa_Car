import models.User;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

@BeforeMethod
   public  void preCondition(){
    if(app.getHelperUser().isLogged())
        app.getHelperUser().logout();
}


    @Test
    public void loginSuccessModels() {


        User user = new User().withEmail("yana9@aa.com").withPassword("Yyana1234");

        app.getHelperUser().openLoginForm();
        app.getHelperUser().fillLoginForm(user);
        app.getHelperUser().submit();

        Assert.assertEquals(app.getHelperUser().getMessage(), "Logged in success");


    }

    @Test
    public void negativeWrongEmail() {

        User user = new User().withEmail("yana9aa.com").withPassword("Yyana1234");

        app.getHelperUser().openLoginForm();
        app.getHelperUser().fillLoginForm(user);
        app.getHelperUser().submit();
        // Assert errorMessagge
        Assert.assertEquals(app.getHelperUser().getErrorText(), "It'snot look like email");
        // Assert buttonYalla not active
        Assert.assertTrue(app.getHelperUser().isYallaButtonNotActive());
    }

    @Test
    public void negativeWrongPassword() {
        User user = new User().withEmail("yana9aa.com").withPassword("Yyana12");

        app.getHelperUser().openLoginForm();
        app.getHelperUser().fillLoginForm(user);
        app.getHelperUser().submit();
        Assert.assertEquals(app.getHelperUser().getMessage(), "Wrong email or password");
        // Assert text message "Authorization error"
        Assert.assertEquals(app.getHelperUser().getTitleMessage(), "Authorization error");

    }
    @AfterMethod
    public void postCondition(){

        app.getHelperUser().clickOkButton();
    }
}




