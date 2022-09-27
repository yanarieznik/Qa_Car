import models.User;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegistrationTests extends TestBase {

    @BeforeMethod
    public void preCondition() {
        if (app.getHelperUser().isLogged())
            app.getHelperUser().logout();
    }




    @Test
    public void registrationSuccess(){
   System.currentTimeMillis();
   int i =(int) System.currentTimeMillis()/1000%3600;
   User user = new User().withName("Lola") .withLastname("Snow").withEmail("lol"+i+"@gmail.com") ;
   app.getHelperUser().openRegistrationForm();
   app.getHelperUser().fillRegistrationForm(user);
   app.getHelperUser().checkPolicy();
   app.getHelperUser().checkPoliXY();
   app.getHelperUser().submit();











}


















}
