/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Monhoc;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HoangCV-TamCT
 */
public class MonhocDAOImpTest {
    Monhoc monhoc;
    MonhocDAOImp monhocDAOImp;
    
    public MonhocDAOImpTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testGetMonHocByID() throws SQLException {
        System.out.println("GetMonhocByID");
        monhoc = new Monhoc();
        monhocDAOImp = new MonhocDAOImp();
        monhoc = monhocDAOImp.getMonHocByID("INT1449");
        assertEquals("INT1449",monhoc.getMamonhoc());
        assertEquals("Phát triển ứng dụng cho các thiết bị di động",monhoc.getTenmonhoc());
        monhoc = monhocDAOImp.getMonHocByID("TEL1409");
        assertEquals("TEL1409",monhoc.getMamonhoc());
        assertEquals("Internet và giao thức",monhoc.getTenmonhoc());
        monhoc = monhocDAOImp.getMonHocByID("TEL1403");
        assertEquals("TEL1403",monhoc.getMamonhoc());
        assertEquals("Các mạng thông tin vô tuyến",monhoc.getTenmonhoc());
    }

    @Test
    public void testGetMonHocByIDException() throws SQLException {
        System.out.println("GetMonhocByID");
        monhoc = new Monhoc();
        monhocDAOImp = new MonhocDAOImp();
        monhoc = monhocDAOImp.getMonHocByID("INT1500");
        assertEquals(null,monhoc.getMamonhoc());
        assertEquals(null,monhoc.getTenmonhoc());
    }

    @Test
    public void testSelectMonhoc() throws Exception {
        System.out.println("selectMonhoc");
        monhoc=new Monhoc();
        monhocDAOImp=new MonhocDAOImp();
        List<Monhoc> list = monhocDAOImp.selectMonhoc();
        assertEquals(5, list.size());
        Monhoc test = list.get(0);
        assertEquals("INT1448", test.getMamonhoc());
        assertEquals("Phát triển phần mềm hướng dịch vụ", test.getTenmonhoc());
    }

}
