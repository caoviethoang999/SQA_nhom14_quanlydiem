/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;
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
public class SeleniumTestInsert {
    @Test
  public void insertDiemWrong() throws SQLException {
        Diemmonhoc diemmonhoc=new Diemmonhoc();
    	System.setProperty("webdriver.chrome.driver","C:/Users/HoangCV-TamCT/Documents/NetBeansProjects/mavenproject7/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost:8080/mavenproject7/new");
        WebElement madiemmonhoc=driver.findElement(By.name("madiemmonhoc"));
        WebElement mamonhoc=driver.findElement(By.name("mamonhoc"));
        WebElement masinhvien=driver.findElement(By.name("masinhvien"));
        WebElement mahocky=driver.findElement(By.name("mahocky"));
        WebElement diemchuyencan=driver.findElement(By.name("diemcc"));
        WebElement diemgiuaky=driver.findElement(By.name("diemgiuaky"));
        WebElement submit=driver.findElement(By.name("commit"));
        diemmonhoc.setMadiemmonhoc("diem92dsadasdasdas");
        diemmonhoc.setMamonhoc("INT1448");
        diemmonhoc.setMasinhvien("B17DCVT143");
        diemmonhoc.setMahocky("hk3");
        diemmonhoc.setDiemcc(10);
        diemmonhoc.setDiemgiuaky(8);
        madiemmonhoc.sendKeys(diemmonhoc.getMadiemmonhoc());
        mamonhoc.sendKeys(diemmonhoc.getMamonhoc());
        masinhvien.sendKeys(diemmonhoc.getMasinhvien());
        mahocky.sendKeys(diemmonhoc.getMahocky());
        diemchuyencan.sendKeys(String.valueOf(diemmonhoc.getDiemcc()));
        diemgiuaky.sendKeys(String.valueOf(diemmonhoc.getDiemgiuaky()));
        submit.click();
        driver.get("http://localhost:8080/mavenproject7/delete?madiemmonhoc=diem92");
        String actualUrl="http://localhost:8080/mavenproject7/show";
        String expectedUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
            driver.close();
    }
   @Test
    public void insertDiemWrong2() throws SQLException {
        Diemmonhoc diemmonhoc=new Diemmonhoc();
    	System.setProperty("webdriver.chrome.driver","C:/Users/HoangCV-TamCT/Documents/NetBeansProjects/mavenproject7/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost:8080/mavenproject7/new");
        WebElement madiemmonhoc=driver.findElement(By.name("madiemmonhoc"));
        WebElement mamonhoc=driver.findElement(By.name("mamonhoc"));
        WebElement masinhvien=driver.findElement(By.name("masinhvien"));
        WebElement mahocky=driver.findElement(By.name("mahocky"));
        WebElement diemchuyencan=driver.findElement(By.name("diemcc"));
        WebElement diemgiuaky=driver.findElement(By.name("diemgiuaky"));
        WebElement submit=driver.findElement(By.name("commit"));
        diemmonhoc.setMadiemmonhoc("");
        diemmonhoc.setMamonhoc("INT1448");
        diemmonhoc.setMasinhvien("B17DCVT143");
        diemmonhoc.setMahocky("hk3");
        diemmonhoc.setDiemcc(10);
        diemmonhoc.setDiemgiuaky(8);
        madiemmonhoc.sendKeys(diemmonhoc.getMadiemmonhoc());
        mamonhoc.sendKeys(diemmonhoc.getMamonhoc());
        masinhvien.sendKeys(diemmonhoc.getMasinhvien());
        mahocky.sendKeys(diemmonhoc.getMahocky());
        diemchuyencan.sendKeys(String.valueOf(diemmonhoc.getDiemcc()));
        diemgiuaky.sendKeys(String.valueOf(diemmonhoc.getDiemgiuaky()));
        submit.click();
        driver.get("http://localhost:8080/mavenproject7/delete?madiemmonhoc=diem92");
        String actualUrl="http://localhost:8080/mavenproject7/show";
        String expectedUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
            driver.close();
    }
       @Test
    public void insertDiemWrong3() throws SQLException {
        Diemmonhoc diemmonhoc=new Diemmonhoc();
    	System.setProperty("webdriver.chrome.driver","C:/Users/HoangCV-TamCT/Documents/NetBeansProjects/mavenproject7/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost:8080/mavenproject7/new");
        WebElement madiemmonhoc=driver.findElement(By.name("madiemmonhoc"));
        WebElement mamonhoc=driver.findElement(By.name("mamonhoc"));
        WebElement masinhvien=driver.findElement(By.name("masinhvien"));
        WebElement mahocky=driver.findElement(By.name("mahocky"));
        WebElement diemchuyencan=driver.findElement(By.name("diemcc"));
        WebElement diemgiuaky=driver.findElement(By.name("diemgiuaky"));
        WebElement submit=driver.findElement(By.name("commit"));
        diemmonhoc.setMadiemmonhoc("diem92");
        diemmonhoc.setMamonhoc("INT1448");
        diemmonhoc.setMasinhvien("B17DCVT143");
        diemmonhoc.setMahocky("hk3");
        diemmonhoc.setDiemcc(Double.parseDouble("dasdas"));
        diemmonhoc.setDiemgiuaky(8);
        madiemmonhoc.sendKeys(diemmonhoc.getMadiemmonhoc());
        mamonhoc.sendKeys(diemmonhoc.getMamonhoc());
        masinhvien.sendKeys(diemmonhoc.getMasinhvien());
        mahocky.sendKeys(diemmonhoc.getMahocky());
        diemchuyencan.sendKeys(String.valueOf(diemmonhoc.getDiemcc()));
        diemgiuaky.sendKeys(String.valueOf(diemmonhoc.getDiemgiuaky()));
        submit.click();
        driver.get("http://localhost:8080/mavenproject7/delete?madiemmonhoc=diem92");
        String actualUrl="http://localhost:8080/mavenproject7/show";
        String expectedUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
            driver.close();
        
    }
          @Test
    public void insertDiemWrong4() throws SQLException {
        Diemmonhoc diemmonhoc=new Diemmonhoc();
    	System.setProperty("webdriver.chrome.driver","C:/Users/HoangCV-TamCT/Documents/NetBeansProjects/mavenproject7/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost:8080/mavenproject7/new");
        WebElement madiemmonhoc=driver.findElement(By.name("madiemmonhoc"));
        WebElement mamonhoc=driver.findElement(By.name("mamonhoc"));
        WebElement masinhvien=driver.findElement(By.name("masinhvien"));
        WebElement mahocky=driver.findElement(By.name("mahocky"));
        WebElement diemchuyencan=driver.findElement(By.name("diemcc"));
        WebElement diemgiuaky=driver.findElement(By.name("diemgiuaky"));
        WebElement submit=driver.findElement(By.name("commit"));
        diemmonhoc.setMadiemmonhoc("diem92");
        diemmonhoc.setMamonhoc("INT1448");
        diemmonhoc.setMasinhvien("B17DCVT143");
        diemmonhoc.setMahocky("hk3");
        diemmonhoc.setDiemcc(Double.parseDouble(""));
        diemmonhoc.setDiemgiuaky(8);
        madiemmonhoc.sendKeys(diemmonhoc.getMadiemmonhoc());
        mamonhoc.sendKeys(diemmonhoc.getMamonhoc());
        masinhvien.sendKeys(diemmonhoc.getMasinhvien());
        mahocky.sendKeys(diemmonhoc.getMahocky());
        diemchuyencan.sendKeys(String.valueOf(diemmonhoc.getDiemcc()));
        diemgiuaky.sendKeys(String.valueOf(diemmonhoc.getDiemgiuaky()));
        submit.click();
        driver.get("http://localhost:8080/mavenproject7/delete?madiemmonhoc=diem92");
        String actualUrl="http://localhost:8080/mavenproject7/show";
        String expectedUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
            driver.close();
    }
             @Test
    public void insertDiemWrong5() throws SQLException {
        Diemmonhoc diemmonhoc=new Diemmonhoc();
    	System.setProperty("webdriver.chrome.driver","C:/Users/HoangCV-TamCT/Documents/NetBeansProjects/mavenproject7/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost:8080/mavenproject7/new");
        WebElement madiemmonhoc=driver.findElement(By.name("madiemmonhoc"));
        WebElement mamonhoc=driver.findElement(By.name("mamonhoc"));
        WebElement masinhvien=driver.findElement(By.name("masinhvien"));
        WebElement mahocky=driver.findElement(By.name("mahocky"));
        WebElement diemchuyencan=driver.findElement(By.name("diemcc"));
        WebElement diemgiuaky=driver.findElement(By.name("diemgiuaky"));
        WebElement submit=driver.findElement(By.name("commit"));
        diemmonhoc.setMadiemmonhoc("diem92");
        diemmonhoc.setMamonhoc("INT1448");
        diemmonhoc.setMasinhvien("B17DCVT143");
        diemmonhoc.setMahocky("hk3");
        diemmonhoc.setDiemcc(8);
        diemmonhoc.setDiemgiuaky(Double.parseDouble("dasdas"));
        madiemmonhoc.sendKeys(diemmonhoc.getMadiemmonhoc());
        mamonhoc.sendKeys(diemmonhoc.getMamonhoc());
        masinhvien.sendKeys(diemmonhoc.getMasinhvien());
        mahocky.sendKeys(diemmonhoc.getMahocky());
        diemchuyencan.sendKeys(String.valueOf(diemmonhoc.getDiemcc()));
        diemgiuaky.sendKeys(String.valueOf(diemmonhoc.getDiemgiuaky()));
        submit.click();
        driver.get("http://localhost:8080/mavenproject7/delete?madiemmonhoc=diem92");
        String actualUrl="http://localhost:8080/mavenproject7/show";
        String expectedUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
            driver.close();
    }
             @Test
    public void insertDiemWrong6() throws SQLException {
        Diemmonhoc diemmonhoc=new Diemmonhoc();
    	System.setProperty("webdriver.chrome.driver","C:/Users/HoangCV-TamCT/Documents/NetBeansProjects/mavenproject7/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost:8080/mavenproject7/new");
        WebElement madiemmonhoc=driver.findElement(By.name("madiemmonhoc"));
        WebElement mamonhoc=driver.findElement(By.name("mamonhoc"));
        WebElement masinhvien=driver.findElement(By.name("masinhvien"));
        WebElement mahocky=driver.findElement(By.name("mahocky"));
        WebElement diemchuyencan=driver.findElement(By.name("diemcc"));
        WebElement diemgiuaky=driver.findElement(By.name("diemgiuaky"));
        WebElement submit=driver.findElement(By.name("commit"));
        diemmonhoc.setMadiemmonhoc("diem92");
        diemmonhoc.setMamonhoc("INT1448");
        diemmonhoc.setMasinhvien("B17DCVT143");
        diemmonhoc.setMahocky("hk3");
        diemmonhoc.setDiemcc(8);
        diemmonhoc.setDiemgiuaky(Double.parseDouble(""));
        madiemmonhoc.sendKeys(diemmonhoc.getMadiemmonhoc());
        mamonhoc.sendKeys(diemmonhoc.getMamonhoc());
        masinhvien.sendKeys(diemmonhoc.getMasinhvien());
        mahocky.sendKeys(diemmonhoc.getMahocky());
        diemchuyencan.sendKeys(String.valueOf(diemmonhoc.getDiemcc()));
        diemgiuaky.sendKeys(String.valueOf(diemmonhoc.getDiemgiuaky()));
        submit.click();
        driver.get("http://localhost:8080/mavenproject7/delete?madiemmonhoc=diem92");
        String actualUrl="http://localhost:8080/mavenproject7/show";
        String expectedUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
            driver.close();
    }
             @Test
    public void insertDiemWrong7() throws SQLException {
        Diemmonhoc diemmonhoc=new Diemmonhoc();
    	System.setProperty("webdriver.chrome.driver","C:/Users/HoangCV-TamCT/Documents/NetBeansProjects/mavenproject7/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost:8080/mavenproject7/new");
        WebElement madiemmonhoc=driver.findElement(By.name("madiemmonhoc"));
        WebElement mamonhoc=driver.findElement(By.name("mamonhoc"));
        WebElement masinhvien=driver.findElement(By.name("masinhvien"));
        WebElement mahocky=driver.findElement(By.name("mahocky"));
        WebElement diemchuyencan=driver.findElement(By.name("diemcc"));
        WebElement diemgiuaky=driver.findElement(By.name("diemgiuaky"));
        WebElement submit=driver.findElement(By.name("commit"));
        diemmonhoc.setMadiemmonhoc("diem92");
        diemmonhoc.setMamonhoc("");
        diemmonhoc.setMasinhvien("B17DCVT143");
        diemmonhoc.setMahocky("hk3");
        diemmonhoc.setDiemcc(7);
        diemmonhoc.setDiemgiuaky(8);
        madiemmonhoc.sendKeys(diemmonhoc.getMadiemmonhoc());
        mamonhoc.sendKeys(diemmonhoc.getMamonhoc());
        masinhvien.sendKeys(diemmonhoc.getMasinhvien());
        mahocky.sendKeys(diemmonhoc.getMahocky());
        diemchuyencan.sendKeys(String.valueOf(diemmonhoc.getDiemcc()));
        diemgiuaky.sendKeys(String.valueOf(diemmonhoc.getDiemgiuaky()));
        submit.click();
        driver.get("http://localhost:8080/mavenproject7/delete?madiemmonhoc=diem92");
        String actualUrl="http://localhost:8080/mavenproject7/show";
        String expectedUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
            driver.close();
    }
             @Test
    public void insertDiemWrong8() throws SQLException {
        Diemmonhoc diemmonhoc=new Diemmonhoc();
    	System.setProperty("webdriver.chrome.driver","C:/Users/HoangCV-TamCT/Documents/NetBeansProjects/mavenproject7/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost:8080/mavenproject7/new");
        WebElement madiemmonhoc=driver.findElement(By.name("madiemmonhoc"));
        WebElement mamonhoc=driver.findElement(By.name("mamonhoc"));
        WebElement masinhvien=driver.findElement(By.name("masinhvien"));
        WebElement mahocky=driver.findElement(By.name("mahocky"));
        WebElement diemchuyencan=driver.findElement(By.name("diemcc"));
        WebElement diemgiuaky=driver.findElement(By.name("diemgiuaky"));
        WebElement submit=driver.findElement(By.name("commit"));
        diemmonhoc.setMadiemmonhoc("diem92");
        diemmonhoc.setMamonhoc("INT1448");
        diemmonhoc.setMasinhvien("");
        diemmonhoc.setMahocky("hk3");
        diemmonhoc.setDiemcc(Double.parseDouble("dasdas"));
        diemmonhoc.setDiemgiuaky(8);
        madiemmonhoc.sendKeys(diemmonhoc.getMadiemmonhoc());
        mamonhoc.sendKeys(diemmonhoc.getMamonhoc());
        masinhvien.sendKeys(diemmonhoc.getMasinhvien());
        mahocky.sendKeys(diemmonhoc.getMahocky());
        diemchuyencan.sendKeys(String.valueOf(diemmonhoc.getDiemcc()));
        diemgiuaky.sendKeys(String.valueOf(diemmonhoc.getDiemgiuaky()));
        submit.click();
        driver.get("http://localhost:8080/mavenproject7/delete?madiemmonhoc=diem92");
        String actualUrl="http://localhost:8080/mavenproject7/show";
        String expectedUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
            driver.close();
    }
             @Test
    public void insertDiemWrong9() throws SQLException {
        Diemmonhoc diemmonhoc=new Diemmonhoc();
    	System.setProperty("webdriver.chrome.driver","C:/Users/HoangCV-TamCT/Documents/NetBeansProjects/mavenproject7/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost:8080/mavenproject7/new");
        WebElement madiemmonhoc=driver.findElement(By.name("madiemmonhoc"));
        WebElement mamonhoc=driver.findElement(By.name("mamonhoc"));
        WebElement masinhvien=driver.findElement(By.name("masinhvien"));
        WebElement mahocky=driver.findElement(By.name("mahocky"));
        WebElement diemchuyencan=driver.findElement(By.name("diemcc"));
        WebElement diemgiuaky=driver.findElement(By.name("diemgiuaky"));
        WebElement submit=driver.findElement(By.name("commit"));
        diemmonhoc.setMadiemmonhoc("diem92");
        diemmonhoc.setMamonhoc("INT1448");
        diemmonhoc.setMasinhvien("B17DCVT143");
        diemmonhoc.setMahocky("");
        diemmonhoc.setDiemcc(Double.parseDouble("dasdas"));
        diemmonhoc.setDiemgiuaky(8);
        madiemmonhoc.sendKeys(diemmonhoc.getMadiemmonhoc());
        mamonhoc.sendKeys(diemmonhoc.getMamonhoc());
        masinhvien.sendKeys(diemmonhoc.getMasinhvien());
        mahocky.sendKeys(diemmonhoc.getMahocky());
        diemchuyencan.sendKeys(String.valueOf(diemmonhoc.getDiemcc()));
        diemgiuaky.sendKeys(String.valueOf(diemmonhoc.getDiemgiuaky()));
        submit.click();
        driver.get("http://localhost:8080/mavenproject7/delete?madiemmonhoc=diem92");
        String actualUrl="http://localhost:8080/mavenproject7/show";
        String expectedUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
            driver.close();
    }
             @Test
    public void insertDiemWrong10() throws SQLException {
        Diemmonhoc diemmonhoc=new Diemmonhoc();
    	System.setProperty("webdriver.chrome.driver","C:/Users/HoangCV-TamCT/Documents/NetBeansProjects/mavenproject7/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost:8080/mavenproject7/new");
        WebElement madiemmonhoc=driver.findElement(By.name("madiemmonhoc"));
        WebElement mamonhoc=driver.findElement(By.name("mamonhoc"));
        WebElement masinhvien=driver.findElement(By.name("masinhvien"));
        WebElement mahocky=driver.findElement(By.name("mahocky"));
        WebElement diemchuyencan=driver.findElement(By.name("diemcc"));
        WebElement diemgiuaky=driver.findElement(By.name("diemgiuaky"));
        WebElement submit=driver.findElement(By.name("commit"));
        diemmonhoc.setMadiemmonhoc("diem92");
        diemmonhoc.setMamonhoc("INT1448sadas");
        diemmonhoc.setMasinhvien("B17DCVT143");
        diemmonhoc.setMahocky("hk3");
        diemmonhoc.setDiemcc(5);
        diemmonhoc.setDiemgiuaky(8);
        madiemmonhoc.sendKeys(diemmonhoc.getMadiemmonhoc());
        mamonhoc.sendKeys(diemmonhoc.getMamonhoc());
        masinhvien.sendKeys(diemmonhoc.getMasinhvien());
        mahocky.sendKeys(diemmonhoc.getMahocky());
        diemchuyencan.sendKeys(String.valueOf(diemmonhoc.getDiemcc()));
        diemgiuaky.sendKeys(String.valueOf(diemmonhoc.getDiemgiuaky()));
        submit.click();
        driver.get("http://localhost:8080/mavenproject7/delete?madiemmonhoc=diem92");
        String actualUrl="http://localhost:8080/mavenproject7/show";
        String expectedUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
            driver.close();
    }
              @Test
    public void insertDiemWrong11() throws SQLException {
        Diemmonhoc diemmonhoc=new Diemmonhoc();
    	System.setProperty("webdriver.chrome.driver","C:/Users/HoangCV-TamCT/Documents/NetBeansProjects/mavenproject7/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost:8080/mavenproject7/new");
        WebElement madiemmonhoc=driver.findElement(By.name("madiemmonhoc"));
        WebElement mamonhoc=driver.findElement(By.name("mamonhoc"));
        WebElement masinhvien=driver.findElement(By.name("masinhvien"));
        WebElement mahocky=driver.findElement(By.name("mahocky"));
        WebElement diemchuyencan=driver.findElement(By.name("diemcc"));
        WebElement diemgiuaky=driver.findElement(By.name("diemgiuaky"));
        WebElement submit=driver.findElement(By.name("commit"));
        diemmonhoc.setMadiemmonhoc("diem92");
        diemmonhoc.setMamonhoc("INT1448");
        diemmonhoc.setMasinhvien("B17DCVT143321");
        diemmonhoc.setMahocky("hk3");
        diemmonhoc.setDiemcc(5);
        diemmonhoc.setDiemgiuaky(8);
        madiemmonhoc.sendKeys(diemmonhoc.getMadiemmonhoc());
        mamonhoc.sendKeys(diemmonhoc.getMamonhoc());
        masinhvien.sendKeys(diemmonhoc.getMasinhvien());
        mahocky.sendKeys(diemmonhoc.getMahocky());
        diemchuyencan.sendKeys(String.valueOf(diemmonhoc.getDiemcc()));
        diemgiuaky.sendKeys(String.valueOf(diemmonhoc.getDiemgiuaky()));
        submit.click();
        driver.get("http://localhost:8080/mavenproject7/delete?madiemmonhoc=diem92");
        String actualUrl="http://localhost:8080/mavenproject7/show";
        String expectedUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
            driver.close();
    }
              @Test
    public void insertDiemWrong12() throws SQLException {
        Diemmonhoc diemmonhoc=new Diemmonhoc();
    	System.setProperty("webdriver.chrome.driver","C:/Users/HoangCV-TamCT/Documents/NetBeansProjects/mavenproject7/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost:8080/mavenproject7/new");
        WebElement madiemmonhoc=driver.findElement(By.name("madiemmonhoc"));
        WebElement mamonhoc=driver.findElement(By.name("mamonhoc"));
        WebElement masinhvien=driver.findElement(By.name("masinhvien"));
        WebElement mahocky=driver.findElement(By.name("mahocky"));
        WebElement diemchuyencan=driver.findElement(By.name("diemcc"));
        WebElement diemgiuaky=driver.findElement(By.name("diemgiuaky"));
        WebElement submit=driver.findElement(By.name("commit"));
        diemmonhoc.setMadiemmonhoc("diem92");
        diemmonhoc.setMamonhoc("INT1448");
        diemmonhoc.setMasinhvien("B17DCVT143");
        diemmonhoc.setMahocky("hk3131323132");
        diemmonhoc.setDiemcc(5);
        diemmonhoc.setDiemgiuaky(8);
        madiemmonhoc.sendKeys(diemmonhoc.getMadiemmonhoc());
        mamonhoc.sendKeys(diemmonhoc.getMamonhoc());
        masinhvien.sendKeys(diemmonhoc.getMasinhvien());
        mahocky.sendKeys(diemmonhoc.getMahocky());
        diemchuyencan.sendKeys(String.valueOf(diemmonhoc.getDiemcc()));
        diemgiuaky.sendKeys(String.valueOf(diemmonhoc.getDiemgiuaky()));
        submit.click();
        driver.get("http://localhost:8080/mavenproject7/delete?madiemmonhoc=diem92");
        String actualUrl="http://localhost:8080/mavenproject7/show";
        String expectedUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
            driver.close();
    }
}
