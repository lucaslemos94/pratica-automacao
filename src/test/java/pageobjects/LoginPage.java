package pageobjects;

import static org.junit.Assert.assertTrue;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import utils.UtilMethods;

/*class to map and instance page elements*/
public class LoginPage extends UtilMethods {
	
	protected WebDriver webDriver;
	
	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID,using="txtUsername")
	private WebElement usuario;
	
	@FindBy(how=How.ID, using="txtPassword")
	private WebElement senha;
	
	@FindBy(how=How.ID, using="btnLogin")
	private WebElement btnLogin;
	
	@FindBy(how=How.LINK_TEXT,using="Dashboard")
	private WebElement dashboard;
	
	public void preencherUsuario(String nomeUsuario) {
		  esperarElemento(usuario);
		  usuario.sendKeys(nomeUsuario);
	}
	
	public void preencherSenha(String senhaUsuario) {
		
		esperarElemento(senha);
		senha.sendKeys(senhaUsuario);
	}
	
	public void clicarBotaoLogin() {
		esperarElemento(btnLogin);
		btnLogin.click();	
	}
	

	
	public void validarDashboard() {
		esperarElemento(dashboard);
		assertTrue(dashboard.isEnabled());
	}
}
 