package com.Bot2.qa.Testcases;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng_forBot2 {

	static WebDriver driver;

	@BeforeTest
	public static void Log_in_to_erome() throws InterruptedException, Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\seleniumdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		try {
			System.out.print("logging in");
			driver.get("https://www.erome.com/user/login");
			driver.manage().window().maximize();
			WebElement email = driver.findElement(By.name("email"));
			WebElement password = driver.findElement(By.name("password"));

			WebElement login = driver.findElement(By.cssSelector("button[type=\"submit\"]"));

			email.sendKeys("fernandogoula@gmail.com");
			password.sendKeys("hardik786");

			login.click();
			Thread.sleep(2000);
			System.out.print("    Loggedin Successfull!");
			driver.findElements(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[1]/a"));

			WebElement Profilepage = driver.findElement(By.cssSelector("#nav-right"));
			Profilepage.click();

		} catch (Exception exp) {

			WebElement popup = driver.findElement(By.xpath("//*[text()=\"Close Ad\"]"));
			popup.click();
			Thread.sleep(1000);
		}
	}

	@SuppressWarnings("deprecation")
	@Test
	public static void Scanning_every_Album() throws InterruptedException {
		for (int i = 1; i <= 3000; i++) {

			try {
			//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/a[1]")).click();
				Clicking_album();
				driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[2]/a[1]")).click();
				Clicking_album();
				// Thread.sleep(1000);
				driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[3]/a[1]")).click();
				Clicking_album();
				driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[4]/a[1]")).click();
				Clicking_album();
				driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[5]/a[1]")).click();
				Clicking_album();
				driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[6]/a[1]")).click();
				Clicking_album();
				driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[7]/a[1]")).click();
				Clicking_album();
				driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[8]/a[1]")).click();
				Clicking_album();
				driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[9]/a[1]")).click();
				Clicking_album();
				driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[10]/a[1]")).click();
				Clicking_album();
				driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[11]/a[1]")).click();
				Clicking_album();
				driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[12]/a[1]")).click();
				Clicking_album();
				driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[13]/a[1]")).click();
				Clicking_album();
				driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[14]/a[1]")).click();
				Clicking_album();
				driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[15]/a[1]")).click();
				Clicking_album();
				driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[16]/a[1]")).click();
				Clicking_album();
				driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[17]/a[1]")).click();
				Clicking_album();
				driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[18]/a[1]")).click();
				Clicking_album();
				driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[19]/a[1]")).click();
				Clicking_album();
				driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[20]/a[1]")).click();
				Clicking_album();
				driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[21]/a[1]")).click();
				Clicking_album();
				driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[22]/a[1]")).click();
				Clicking_album();
				driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[23]/a[1]")).click();
				Clicking_album();
				driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[24]/a[1]")).click();
				Clicking_album();
				driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[25]/a[1]")).click();
				Clicking_album();
				driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[26]/a[1]")).click();
				Clicking_album();
				driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[27]/a[1]")).click();
				Clicking_album();
				driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[28]/a[1]")).click();
				Clicking_album();
				driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[29]/a[1]")).click();
				Clicking_album();
				driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[30]/a[1]")).click();
				Clicking_album();
				driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[31]/a[1]")).click();
				Clicking_album();
				driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[32]/a[1]")).click();
				Clicking_album();
				driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[33]/a[1]")).click();
				Clicking_album();
				driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[34]/a[1]")).click();
				Clicking_album();
				driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[35]/a[1]")).click();
				Clicking_album();
				driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[36]/a[1]")).click();
				Clicking_album();
				System.out.print(i);
				System.out.print("Test Successful");

			} catch (Exception exp) {

				WebElement popup = driver.findElement(By.xpath("//*[text()=\"Close Ad\"]"));
				popup.click();
				Thread.sleep(1000);

			} // catch (Exception exp) {

			// }
		}
	}

	@AfterMethod
	public static void Closing_browser() {

		driver.quit();

	}

	public static void Clicking_album() throws InterruptedException {

		String Verify_Textviews = driver.findElement(By.xpath("//*[@class=\"mr-5\"]")).getText();
        
		
		
		String numberOnly = Verify_Textviews.replaceAll("[^0-9]", "");
// //not to be comment out//  System.out.print(numberOnly);
		int Totalviews = Integer.parseInt(numberOnly);

		WebElement settingsbutton = driver.findElement(By.xpath("//*[@id=\"userAlbum\"]/div[2]/div[2]/div/button"));
		settingsbutton.click();

		WebElement Scrollbuttonedit = driver.findElement(By.xpath("//*[text()=\"EDIT\"]"));
		Scrollbuttonedit.click();

		boolean Display = driver.findElements(By.xpath("//*[contains(text(),'MEGA')]")).isEmpty();
		
		int minimumvies = 500;
		if ((Totalviews >= minimumvies) && (Display==true) ) {
			// WebElement settingsbutton=
			// driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/button[1]"));
			// settingsbutton.click();

			// WebElement Scrollbuttonedit=
			// driver.findElement(By.xpath("//*[text()=\"EDIT\"]"));
			// Scrollbuttonedit.click();

			WebElement Setlinkinbox = driver.findElement(By.cssSelector("#legend-area"));
			Setlinkinbox.clear();
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("#legend-area")).sendKeys(throw_back_random_link());
			Thread.sleep(1000);

			WebElement Clickonfreespace_tosave = driver
					.findElement(By.cssSelector("body:nth-child(2) > div.free-space:nth-child(2)"));
			Clickonfreespace_tosave.click();
		}
		
		Thread.sleep(500);
		driver.navigate().back();
		Thread.sleep(500);
		driver.navigate().back();

	}

	public static String throw_back_random_link() {

		String[] links = { "MEGA LINK https://jpst.it/2y_z223", "MEGA LINK https://jpst.it/2y_z224",
				"MEGA LINK https://jpst.it3/2y_z225", "MEGA LINK https://jpst.it/2y4_z226",
				"MEGA LINK https://jpst3.it/42y_z227", "MEGA LINK https://jpst.it/24y_z228",
				"MEGA LINK https://jpst.it/2y_3z229", "MEGA LINK h3ttps://jpst.it/2y_z300" };

		String random = (links[new Random().nextInt(links.length)]);

		return random;

	}

}
