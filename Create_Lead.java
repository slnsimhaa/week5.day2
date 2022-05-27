package week5.day2;

//import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class Create_Lead extends ProjectSpecificMethods {
	@Test(dataProvider = "testData")
	public void runCreateLead(String username, String pword, String cname, String fname, String lname)
	{
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(pword);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.name("submitButton")).click();
		}
	@DataProvider
	public String[][] testData()
	{
		String[][] array = new String[2][5];
		array[0][0] = "Demosalesmanager";
		array[0][1] = "crmsfa";
		array[0][2] = "TestLeaf";
		array[0][3] = "Lakshminarasimhan";
		array[0][4] = "S";
		
		array[1][0] = "DemoCSR";
		array[1][1] = "crmsfa";
		array[1][2] = "TestLeaf";
		array[1][3] = "Sampath";
		array[1][4] = "G";
		return array;
				
	}
	}