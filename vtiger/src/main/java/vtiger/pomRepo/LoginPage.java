package vtiger.pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
/**
 * This is an object repository for Login Page
 * @author Akash Deb
 *
 */

public class LoginPage {
	//This is an constructor for Login Page
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}
	
	//Here identifying the elements of the Login Page
	@FindBy(name = "user_name")
	private WebElement username_TextDField;
	
	@FindBy(name = "user_password")
	private WebElement password_TextDField;
	
	@FindBy(id = "submitButton")
	private WebElement loginButton;

	public WebElement getUsername_TextDField() {
		return username_TextDField;
	}

	public WebElement getPassword_TextDField() {
		return password_TextDField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	/**
	 * This method is used login an user
	 * @param username
	 * @param password
	 */
	public void loginAction(String username, String password) {
		
		username_TextDField.sendKeys(username);
		password_TextDField.sendKeys(password);
		loginButton.click();
	}
	
	

}
