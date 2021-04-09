package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import stepdefinitions.Hooks;

public class UtilMethods {
	
	protected WebDriver webDriver;
	
	
	public void esperarElemento(WebElement elemento) {
		webDriver = Hooks.getDriver();
		WebDriverWait wait =  new WebDriverWait(webDriver,10);
		wait.until(ExpectedConditions.visibilityOf(elemento));
		
	}
	
	
	
	public void selecionar (WebElement elemento, String texto) {
		webDriver  = Hooks.getDriver();
		Select dropDown = new Select(elemento);
		dropDown.selectByVisibleText(texto);
	}
}
