/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.SQLException;
import model.Diemmonhoc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author HoangCV-TamCT
 */
public class SeleniumTestUpdate {
     @Test
    public void updateDiemWrong() throws SQLException {
        Diemmonhoc diemmonhoc=new Diemmonhoc();
    	System.setProperty("webdriver.chrome.driver","C:/Users/HoangCV-TamCT/Documents/NetBeansProjects/mavenproject7/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost:8080/mavenproject7/edit?madiemmonhoc=diem59");
        WebElement diemchuyencan=driver.findElement(By.name("diemcc"));
        WebElement diemgiuaky=driver.findElement(By.name("diemgiuaky"));
        WebElement diemcuoiky=driver.findElement(By.name("diemcuoiky"));
        WebElement submit=driver.findElement(By.name("commit"));
        diemmonhoc.setDiemcc(Double.parseDouble("asdasdas"));
        diemmonhoc.setDiemgiuaky(8);
        diemmonhoc.setDiemcuoiky(5);
        diemchuyencan.clear();
        diemgiuaky.clear();
        diemcuoiky.clear();
        diemchuyencan.sendKeys(String.valueOf(diemmonhoc.getDiemcc()));
        diemgiuaky.sendKeys(String.valueOf(diemmonhoc.getDiemgiuaky()));
        diemcuoiky.sendKeys(String.valueOf(diemmonhoc.getDiemcuoiky()));
        submit.click();
        String actualUrl="http://localhost:8080/mavenproject7/show";
        String expectedUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }
      @Test
    public void updateDiemWrong1() throws SQLException {
        Diemmonhoc diemmonhoc=new Diemmonhoc();
    	System.setProperty("webdriver.chrome.driver","C:/Users/HoangCV-TamCT/Documents/NetBeansProjects/mavenproject7/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost:8080/mavenproject7/edit?madiemmonhoc=diem59");
        WebElement diemchuyencan=driver.findElement(By.name("diemcc"));
        WebElement diemgiuaky=driver.findElement(By.name("diemgiuaky"));
        WebElement diemcuoiky=driver.findElement(By.name("diemcuoiky"));
        WebElement submit=driver.findElement(By.name("commit"));
        diemmonhoc.setDiemcc(8);
        diemmonhoc.setDiemgiuaky(Double.parseDouble("asdasdas"));
        diemmonhoc.setDiemcuoiky(5);
        diemchuyencan.clear();
        diemgiuaky.clear();
        diemcuoiky.clear();
        diemchuyencan.sendKeys(String.valueOf(diemmonhoc.getDiemcc()));
        diemgiuaky.sendKeys(String.valueOf(diemmonhoc.getDiemgiuaky()));
        diemcuoiky.sendKeys(String.valueOf(diemmonhoc.getDiemcuoiky()));
        submit.click();
        String actualUrl="http://localhost:8080/mavenproject7/show";
        String expectedUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }
     @Test
    public void updateDiemWrong2() throws SQLException {
        Diemmonhoc diemmonhoc=new Diemmonhoc();
    	System.setProperty("webdriver.chrome.driver","C:/Users/HoangCV-TamCT/Documents/NetBeansProjects/mavenproject7/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost:8080/mavenproject7/edit?madiemmonhoc=diem59");
        WebElement diemchuyencan=driver.findElement(By.name("diemcc"));
        WebElement diemgiuaky=driver.findElement(By.name("diemgiuaky"));
        WebElement diemcuoiky=driver.findElement(By.name("diemcuoiky"));
        WebElement submit=driver.findElement(By.name("commit"));
        diemmonhoc.setDiemcc(8);
        diemmonhoc.setDiemgiuaky(5);
        diemmonhoc.setDiemcuoiky(Double.parseDouble("asdasdas"));
        diemchuyencan.clear();
        diemgiuaky.clear();
        diemcuoiky.clear();
        diemchuyencan.sendKeys(String.valueOf(diemmonhoc.getDiemcc()));
        diemgiuaky.sendKeys(String.valueOf(diemmonhoc.getDiemgiuaky()));
        diemcuoiky.sendKeys(String.valueOf(diemmonhoc.getDiemcuoiky()));
        submit.click();
        String actualUrl="http://localhost:8080/mavenproject7/show";
        String expectedUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }
}
