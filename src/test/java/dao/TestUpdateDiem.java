/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import static org.junit.Assert.*;
import model.Diemmonhoc;
import org.junit.After;
import org.junit.AfterClass;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author HoangCV-TamCT
 */
public class TestUpdateDiem {

    DiemmonhocDAOImp diemmonhocDAOImp;
    Diemmonhoc diemmonhoc;
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() throws SQLException {
    }
    
    @After
    public void tearDown() {
    }
      @Test
    public void testUpdateDiemDefine() throws Exception {
        System.out.println("updateDiem");
        Connection connection = new DAOImp().createConnection();
        connection.setAutoCommit(false);
        diemmonhoc=new Diemmonhoc();
        diemmonhocDAOImp=new DiemmonhocDAOImp(connection);
        boolean res=false;
        diemmonhoc.setMadiemmonhoc("diem30");
        diemmonhoc.setDiemcc(11);
        diemmonhoc.setDiemgiuaky(8);
        diemmonhoc.setDiemcuoiky(3);
        boolean b=diemmonhocDAOImp.updateDiem(diemmonhoc);
       DiemmonhocDAOImp diemmonhocDAOImp2 =new DiemmonhocDAOImp();
        Diemmonhoc list = diemmonhocDAOImp2.selectDiem("diem30");
        assertEquals("INT1448", list.getMamonhoc());
        assertEquals("Phát triển phần mềm hướng dịch vụ", list.getTenmonhoc());
        assertEquals("B17DCVT143", list.getMasinhvien());
        assertEquals("Cao Viet", list.getHosinhvien());
        assertEquals("Hoang", list.getTensinhvien());
        assertEquals("hk3", list.getMahocky());
        assertEquals("Học kỳ hè", list.getTenhocky());
        assertEquals(11, list.getDiemcc(),0);
        assertEquals(8, list.getDiemgiuaky(),0);
        assertEquals(3, list.getDiemcuoiky(),0);
        connection.rollback();
        assertEquals(res,b);
    }
        @Test
    public void testUpdateDiemDefine2() throws Exception {
        System.out.println("updateDiem");
        Connection connection = new DAOImp().createConnection();
        connection.setAutoCommit(false);
        diemmonhoc=new Diemmonhoc();
        diemmonhocDAOImp=new DiemmonhocDAOImp(connection);
        boolean res=true;
        diemmonhoc.setMadiemmonhoc("diem30");
        diemmonhoc.setDiemcc(8);
        diemmonhoc.setDiemgiuaky(11);
        diemmonhoc.setDiemcuoiky(3);
        boolean b=diemmonhocDAOImp.updateDiem(diemmonhoc);
        DiemmonhocDAOImp diemmonhocDAOImp2 =new DiemmonhocDAOImp();
        Diemmonhoc list = diemmonhocDAOImp2.selectDiem("diem30");
        assertEquals("INT1448", list.getMamonhoc());
        assertEquals("Phát triển phần mềm hướng dịch vụ", list.getTenmonhoc());
        assertEquals("B17DCVT143", list.getMasinhvien());
        assertEquals("Cao Viet", list.getHosinhvien());
        assertEquals("Hoang", list.getTensinhvien());
        assertEquals("hk3", list.getMahocky());
        assertEquals("Học kỳ hè", list.getTenhocky());
        assertEquals(8, list.getDiemcc(),0);
        assertEquals(11, list.getDiemgiuaky(),0);
        assertEquals(3, list.getDiemcuoiky(),0);
        connection.rollback();
        assertEquals(res,b);
    }
    @Test
    public void testUpdateDiemDefine3() throws Exception {
        System.out.println("updateDiem");
        Connection connection = new DAOImp().createConnection();
        connection.setAutoCommit(false);
        diemmonhoc=new Diemmonhoc();
        diemmonhocDAOImp=new DiemmonhocDAOImp(connection);
        boolean res=true;
        diemmonhoc.setMadiemmonhoc("diem30");
        diemmonhoc.setDiemcc(8);
        diemmonhoc.setDiemgiuaky(8);
        diemmonhoc.setDiemcuoiky(11);
        boolean b=diemmonhocDAOImp.updateDiem(diemmonhoc);
        DiemmonhocDAOImp diemmonhocDAOImp2 =new DiemmonhocDAOImp();
        Diemmonhoc list = diemmonhocDAOImp2.selectDiem("diem30");
        assertEquals("INT1448", list.getMamonhoc());
        assertEquals("Phát triển phần mềm hướng dịch vụ", list.getTenmonhoc());
        assertEquals("B17DCVT143", list.getMasinhvien());
        assertEquals("Cao Viet", list.getHosinhvien());
        assertEquals("Hoang", list.getTensinhvien());
        assertEquals("hk3", list.getMahocky());
        assertEquals("Học kỳ hè", list.getTenhocky());
        assertEquals(8, list.getDiemcc(),0);
        assertEquals(8, list.getDiemgiuaky(),0);
        assertEquals(11, list.getDiemcuoiky(),0);
        connection.rollback();
        assertEquals(res,b);
    }
    @Test
    public void testUpdateDiemWrong() throws Exception {
        System.out.println("updateDiem");
        Connection connection = new DAOImp().createConnection();
        connection.setAutoCommit(false);
        diemmonhoc=new Diemmonhoc();
        diemmonhocDAOImp=new DiemmonhocDAOImp(connection);
        boolean res=false;
        diemmonhoc.setMadiemmonhoc("diem30");
        diemmonhoc.setDiemcc(-2);
        diemmonhoc.setDiemgiuaky(8);
        diemmonhoc.setDiemcuoiky(6);
        boolean b=diemmonhocDAOImp.updateDiem(diemmonhoc);
        DiemmonhocDAOImp diemmonhocDAOImp2 =new DiemmonhocDAOImp();
        Diemmonhoc list = diemmonhocDAOImp2.selectDiem("diem30");
        assertEquals("INT1448", list.getMamonhoc());
        assertEquals("Phát triển phần mềm hướng dịch vụ", list.getTenmonhoc());
        assertEquals("B17DCVT143", list.getMasinhvien());
        assertEquals("Cao Viet", list.getHosinhvien());
        assertEquals("Hoang", list.getTensinhvien());
        assertEquals("hk3", list.getMahocky());
        assertEquals("Học kỳ hè", list.getTenhocky());
        assertEquals(-2, list.getDiemcc(),0);
        assertEquals(8, list.getDiemgiuaky(),0);
        assertEquals(6, list.getDiemcuoiky(),0);
        connection.rollback();
        assertEquals(res,b);
    }
        @Test
    public void testUpdateDiemWrong2() throws Exception {
        System.out.println("updateDiem");
        Connection connection = new DAOImp().createConnection();
        connection.setAutoCommit(false);
        diemmonhoc=new Diemmonhoc();
        diemmonhocDAOImp=new DiemmonhocDAOImp(connection);
        boolean res=true;
        diemmonhoc.setMadiemmonhoc("diem30");
        diemmonhoc.setDiemcc(8);
        diemmonhoc.setDiemgiuaky(-2);
        diemmonhoc.setDiemcuoiky(6);
        boolean b=diemmonhocDAOImp.updateDiem(diemmonhoc);
        DiemmonhocDAOImp diemmonhocDAOImp2 =new DiemmonhocDAOImp();
        Diemmonhoc list = diemmonhocDAOImp2.selectDiem("diem30");
        assertEquals("INT1448", list.getMamonhoc());
        assertEquals("Phát triển phần mềm hướng dịch vụ", list.getTenmonhoc());
        assertEquals("B17DCVT143", list.getMasinhvien());
        assertEquals("Cao Viet", list.getHosinhvien());
        assertEquals("Hoang", list.getTensinhvien());
        assertEquals("hk3", list.getMahocky());
        assertEquals("Học kỳ hè", list.getTenhocky());
        assertEquals(8, list.getDiemcc(),0);
        assertEquals(-1, list.getDiemgiuaky(),0);
        assertEquals(6, list.getDiemcuoiky(),0);
        connection.rollback();
        assertEquals(res,b);
    }
            @Test
    public void testUpdateDiemWrong3() throws Exception {
        System.out.println("updateDiem");
        Connection connection = new DAOImp().createConnection();
        connection.setAutoCommit(false);
        diemmonhoc=new Diemmonhoc();
        diemmonhocDAOImp=new DiemmonhocDAOImp(connection);
        boolean res=true;
        diemmonhoc.setMadiemmonhoc("diem30");
        diemmonhoc.setDiemcc(8);
        diemmonhoc.setDiemgiuaky(7);
        diemmonhoc.setDiemcuoiky(-2);
        boolean b=diemmonhocDAOImp.updateDiem(diemmonhoc);
        DiemmonhocDAOImp diemmonhocDAOImp2 =new DiemmonhocDAOImp();
        Diemmonhoc list = diemmonhocDAOImp2.selectDiem("diem30");
        assertEquals("INT1448", list.getMamonhoc());
        assertEquals("Phát triển phần mềm hướng dịch vụ", list.getTenmonhoc());
        assertEquals("B17DCVT143", list.getMasinhvien());
        assertEquals("Cao Viet", list.getHosinhvien());
        assertEquals("Hoang", list.getTensinhvien());
        assertEquals("hk3", list.getMahocky());
        assertEquals("Học kỳ hè", list.getTenhocky());
        assertEquals(8, list.getDiemcc(),0);
        assertEquals(7, list.getDiemgiuaky(),0);
        assertEquals(-2, list.getDiemcuoiky(),0);
        connection.rollback();
        assertEquals(res,b);
    }
}
