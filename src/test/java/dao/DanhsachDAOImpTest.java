/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.Diemmonhoc;
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
public class DanhsachDAOImpTest {
    DanhsachDAOImp danhsachDAOImp;
    Diemmonhoc diemmonhoc;
    public DanhsachDAOImpTest() {
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
    public void testSelectAllDS() throws Exception {
        System.out.println("selectAllDS");
        diemmonhoc=new Diemmonhoc();
        danhsachDAOImp=new DanhsachDAOImp();
        Map<String, List<Diemmonhoc>> list = danhsachDAOImp.selectAllDS("TEL1409");
        assertEquals(2, list.size());
    }
    @Test
    public void testSelectAllDSWrong() throws Exception {
        System.out.println("selectAllDS");
        diemmonhoc=new Diemmonhoc();
        danhsachDAOImp=new DanhsachDAOImp();
        Map<String, List<Diemmonhoc>> list = danhsachDAOImp.selectAllDS("INT1448");
        assertEquals(0, list.size());
    }
}
