package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginFormPage extends BasePage {

    public LoginFormPage(WebDriver navegador) {
        super(navegador);
    }

    public LoginFormPage digitarlogin(String login) {
        navegador.findElement(By.id("signinbox")).findElement(By.name("login")).sendKeys(login);
        return this;

    }

    public LoginFormPage digitarSenha(String password) {
        navegador.findElement(By.id("signinbox")).findElement(By.name("password")).sendKeys(password);
        return this;
    }

    public SecretaPage clicarSignIn() {
        navegador.findElement(By.linkText("SIGN IN")).click();
        return new SecretaPage(navegador);

    }

    public SecretaPage fazerLogin(String Login, String Senha) {
        digitarlogin(Login);
        digitarSenha(Senha);
        clicarSignIn();

        return new SecretaPage(navegador);


    }


}
