package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;
import javax.transaction.Transactional;
import model.Diemmonhoc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class SeleniumTest {
    @Test
    public void insertDiem() throws SQLException {
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
    public void updateDiem() throws SQLException {
        Diemmonhoc diemmonhoc=new Diemmonhoc();
    	System.setProperty("webdriver.chrome.driver","C:/Users/HoangCV-TamCT/Documents/NetBeansProjects/mavenproject7/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost:8080/mavenproject7/edit?madiemmonhoc=diem59");
        WebElement diemchuyencan=driver.findElement(By.name("diemcc"));
        WebElement diemgiuaky=driver.findElement(By.name("diemgiuaky"));
        WebElement diemcuoiky=driver.findElement(By.name("diemcuoiky"));
        WebElement submit=driver.findElement(By.name("commit"));
        diemmonhoc.setDiemcc(5);
        diemmonhoc.setDiemgiuaky(8);
        diemmonhoc.setDiemcuoiky(5);
        diemchuyencan.clear();
        diemgiuaky.clear();
        diemcuoiky.clear();
        diemchuyencan.sendKeys(String.valueOf(diemmonhoc.getDiemcc()));
        diemgiuaky.sendKeys(String.valueOf(diemmonhoc.getDiemgiuaky()));
        diemcuoiky.sendKeys(String.valueOf(diemmonhoc.getDiemcuoiky()));
        driver.get("http://localhost:8080/mavenproject7/edit?madiemmonhoc=diem59");
        diemchuyencan=driver.findElement(By.name("diemcc"));
        diemgiuaky=driver.findElement(By.name("diemgiuaky"));
        diemcuoiky=driver.findElement(By.name("diemcuoiky"));
        submit=driver.findElement(By.name("commit"));
        diemmonhoc.setDiemcc(10);
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
        driver.close();
    }
        @Test
    public void selectAllDiem() throws SQLException {
    	System.setProperty("webdriver.chrome.driver","C:/Users/HoangCV-TamCT/Documents/NetBeansProjects/mavenproject7/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost:8080/mavenproject7/show?mamonhoc=all");
                String actualUrl="http://localhost:8080/mavenproject7/show?mamonhoc=all";
        String expectedUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
        driver.close();
}
            @Test
    public void selectDiem() throws SQLException {
    	System.setProperty("webdriver.chrome.driver","C:/Users/HoangCV-TamCT/Documents/NetBeansProjects/mavenproject7/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost:8080/mavenproject7/show?mamonhoc=INT1448");
        String actualUrl="http://localhost:8080/mavenproject7/show?mamonhoc=INT1448";
        String expectedUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
        driver.close();
}
                @Test
    public void selectDiemWrong() throws SQLException {
    	System.setProperty("webdriver.chrome.driver","C:/Users/HoangCV-TamCT/Documents/NetBeansProjects/mavenproject7/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost:8080/mavenproject7/show?mamonhoc=INT1447");
        String actualUrl="http://localhost:8080/mavenproject7/show?mamonhoc=INT1447";
        String expectedUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
        driver.close();
}
@Test
    public void selectDS() throws SQLException {
    	System.setProperty("webdriver.chrome.driver","C:/Users/HoangCV-TamCT/Documents/NetBeansProjects/mavenproject7/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost:8080/mavenproject7/thongke?mamonhoc=INT1448");
        String actualUrl="http://localhost:8080/mavenproject7/thongke?mamonhoc=INT1448";
        String expectedUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
        driver.close();
}
    @Test
    public void selectPageAdd() throws SQLException {
    	System.setProperty("webdriver.chrome.driver","C:/Users/HoangCV-TamCT/Documents/NetBeansProjects/mavenproject7/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost:8080/mavenproject7/show");
        WebElement submit=driver.findElement(By.name("add"));
        submit.click();
        String actualUrl="http://localhost:8080/mavenproject7/new";
        String expectedUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
        driver.close();
}
        @Test
    public void selectPageUpdate() throws SQLException {
    	System.setProperty("webdriver.chrome.driver","C:/Users/HoangCV-TamCT/Documents/NetBeansProjects/mavenproject7/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost:8080/mavenproject7/show?mamonhoc=all");
        WebElement submit=driver.findElement(By.name("edit"));
        submit.click();
        String actualUrl="http://localhost:8080/mavenproject7/edit?madiemmonhoc=diem1";
        String expectedUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
        driver.close();
}       
    @Test
    public void selectPagePrint() throws SQLException {
    	System.setProperty("webdriver.chrome.driver","C:/Users/HoangCV-TamCT/Documents/NetBeansProjects/mavenproject7/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost:8080/mavenproject7/show");
        WebElement submit=driver.findElement(By.name("print"));
        submit.click();
        String actualUrl="http://localhost:8080/mavenproject7/thongke";
        String expectedUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
        driver.close();
}
    @Test
public void deleteDiem() throws SQLException {
        Connection connection = new DAOImp().createConnection();
        connection.setAutoCommit(false);
        Statement stmt = connection.createStatement();
        String sql = "select * from diemmonhoc";
        ResultSet rs = stmt.executeQuery(sql);
        Savepoint saveString = connection.setSavepoint("ROWS_DELETED_1");
        Diemmonhoc diemmonhoc=new Diemmonhoc();
    	System.setProperty("webdriver.chrome.driver","C:/Users/HoangCV-TamCT/Documents/NetBeansProjects/mavenproject7/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost:8080/mavenproject7/delete?madiemmonhoc=diem92");
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
        diemmonhoc.setDiemcc(10);
        diemmonhoc.setDiemgiuaky(8);
        madiemmonhoc.sendKeys(diemmonhoc.getMadiemmonhoc());
        mamonhoc.sendKeys(diemmonhoc.getMamonhoc());
        masinhvien.sendKeys(diemmonhoc.getMasinhvien());
        mahocky.sendKeys(diemmonhoc.getMahocky());
        diemchuyencan.sendKeys(String.valueOf(diemmonhoc.getDiemcc()));
        diemgiuaky.sendKeys(String.valueOf(diemmonhoc.getDiemgiuaky()));
        submit.click();
        String actualUrl="http://localhost:8080/mavenproject7/show";
        String expectedUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
        driver.close();
    }
}
