package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searching {
	
	WebDriver driver;
	
	public Searching(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	@FindBy(xpath = "//*[@id=\"APjFqb\"]")
	WebElement SearchBar;
	public void SearchBar() {
		SearchBar.click();
		SearchBar.sendKeys("Any Input");
		SearchBar.sendKeys(Keys.ENTER);
	}
	
	
	public void ListOfLinks() {
		WebElement FullPage = driver.findElement(By.xpath("//*[@id=\"rso\"]"));
		System.out.println(FullPage.findElements(By.tagName("a")).size()); 
	}
	
	@FindBy(xpath = "//*[@id='search']/div/div/div/div/div/div/div/div/div/div/div/a/h3")
	WebElement LinkClick;
	public void LinkClick() {
		LinkClick.click();
		System.out.println("Title of First link when I search Any Input "+driver.getTitle());
	}
}
