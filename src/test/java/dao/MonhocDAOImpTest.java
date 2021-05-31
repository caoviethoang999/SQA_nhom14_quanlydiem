/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

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
        @Test
    public void testSelectMonhocWrong() throws Exception {
        System.out.println("selectMonhoc");
        monhoc=new Monhoc();
        monhocDAOImp=new MonhocDAOImp();
        List<Monhoc> list = monhocDAOImp.selectMonhoc();
        assertEquals(5, list.size());
        Monhoc test = list.get(0);
        assertEquals("INT1447", test.getMamonhoc());
        assertEquals("Cấu trúc dữ liệu giải thuật", test.getTenmonhoc());
    }
}
