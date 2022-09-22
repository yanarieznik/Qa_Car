package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HelperUser extends HelperBase {

    public HelperUser(WebDriver wd) {
        super(wd);
    }


    public void openLoginForm() {
        WebElement login = wd.findElement(By.xpath("//a[@href='/login?url=%2Fsearch']"));
        login.click();


    }


    public void fillLoginForm(String email,String password) {
        WebElement inputEmail = wd.findElement(By.cssSelector("#email"));
        inputEmail.click();
        inputEmail.clear();
        inputEmail.sendKeys(email);

        WebElement inputPassword = wd.findElement(By.cssSelector("#password"));
        inputPassword.click();
        inputPassword.clear();
        inputPassword.sendKeys(password);




    }

    public void submitLogin() {

        WebElement loginButton = wd.findElement(By.xpath("//*[text()='Y’alla!']"));
        loginButton.click();
    }
















}
