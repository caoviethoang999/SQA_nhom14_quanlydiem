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

public class DiemmonhocDAOImpTest {
    DiemmonhocDAOImp diemmonhocDAOImp;
    Diemmonhoc diemmonhoc;
    public DiemmonhocDAOImpTest() {
    }
    
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
    public void testInsertDiem() throws SQLException{
        Connection connection = new DAOImp().createConnection();
        connection.setAutoCommit(false);
        System.out.println("insertDiem");
        diemmonhoc=new Diemmonhoc();
        diemmonhocDAOImp=new DiemmonhocDAOImp(connection);
        diemmonhoc.setMadiemmonhoc("diem92");
        diemmonhoc.setMamonhoc("INT1448");
        diemmonhoc.setMasinhvien("B17DCVT143");
        diemmonhoc.setMahocky("hk3");
        diemmonhoc.setDiemcc(10);
        diemmonhoc.setDiemgiuaky(8);
        diemmonhoc.setDiemcuoiky(3);
        assertEquals("diem92", diemmonhoc.getMadiemmonhoc());
        assertEquals("INT1448", diemmonhoc.getMamonhoc());
        assertEquals("B17DCVT143", diemmonhoc.getMasinhvien());
        assertEquals("hk3", diemmonhoc.getMahocky());
        assertEquals(10, diemmonhoc.getDiemcc(),0);
        assertEquals(8, diemmonhoc.getDiemgiuaky(),0);
        assertEquals(3, diemmonhoc.getDiemcuoiky(),0);
        assertEquals(5.2, diemmonhoc.getDiemtrungbinh(),0);
        diemmonhocDAOImp.insertDiem(diemmonhoc);
        List<Diemmonhoc> list = diemmonhocDAOImp.selectAllDiem();
        assertEquals(11, list.size());
        connection.rollback();
    }
    @Test
    public void testInsertDiemWrong() throws SQLException{
        Connection connection = new DAOImp().createConnection();
        connection.setAutoCommit(false);
        System.out.println("insertDiem");
        diemmonhoc=new Diemmonhoc();
        diemmonhocDAOImp=new DiemmonhocDAOImp(connection);
        diemmonhoc.setMadiemmonhoc("diem92");
        diemmonhoc.setMamonhoc("INT1448");
        diemmonhoc.setMasinhvien("B17DCVT143");
        diemmonhoc.setMahocky("hk3");
        diemmonhoc.setDiemcc(-1);
        diemmonhoc.setDiemgiuaky(4);
        assertEquals("diem92", diemmonhoc.getMadiemmonhoc());
        assertEquals("INT1448", diemmonhoc.getMamonhoc());
        assertEquals("B17DCVT143", diemmonhoc.getMasinhvien());
        assertEquals("hk3", diemmonhoc.getMahocky());
        assertEquals(-1, diemmonhoc.getDiemcc(),0);
        assertEquals(4, diemmonhoc.getDiemgiuaky(),0);
        diemmonhocDAOImp.insertDiem(diemmonhoc);
        List<Diemmonhoc> list = diemmonhocDAOImp.selectAllDiem();
        assertEquals(11, list.size());
        connection.rollback();
    }
     @Test
    public void testInsertDiemWrong2() throws SQLException{
        Connection connection = new DAOImp().createConnection();
        connection.setAutoCommit(false);
        System.out.println("insertDiem");
        diemmonhoc=new Diemmonhoc();
        diemmonhocDAOImp=new DiemmonhocDAOImp(connection);
        diemmonhoc.setMadiemmonhoc("diem92");
        diemmonhoc.setMamonhoc("INT1448");
        diemmonhoc.setMasinhvien("B17DCVT143");
        diemmonhoc.setMahocky("hk3");
        diemmonhoc.setDiemcc(4);
        diemmonhoc.setDiemgiuaky(-2);
        assertEquals("diem92", diemmonhoc.getMadiemmonhoc());
        assertEquals("INT1448", diemmonhoc.getMamonhoc());
        assertEquals("B17DCVT143", diemmonhoc.getMasinhvien());
        assertEquals("hk3", diemmonhoc.getMahocky());
        assertEquals(4, diemmonhoc.getDiemcc(),0);
        assertEquals(-2, diemmonhoc.getDiemgiuaky(),0);
        diemmonhocDAOImp.insertDiem(diemmonhoc);
        List<Diemmonhoc> list = diemmonhocDAOImp.selectAllDiem();
        assertEquals(11, list.size());
        connection.rollback();
    }
    @Test
    public void testInsertDiemDefine() throws SQLException{
        Connection connection = new DAOImp().createConnection();
        connection.setAutoCommit(false);
        System.out.println("insertDiem");
        diemmonhoc=new Diemmonhoc();
        diemmonhocDAOImp=new DiemmonhocDAOImp(connection);
        diemmonhoc.setMadiemmonhoc("diem92");
        diemmonhoc.setMamonhoc("INT1448");
        diemmonhoc.setMasinhvien("B17DCVT143");
        diemmonhoc.setMahocky("hk3");
        diemmonhoc.setDiemcc(11);
        diemmonhoc.setDiemgiuaky(4);
        assertEquals("diem92", diemmonhoc.getMadiemmonhoc());
        assertEquals("INT1448", diemmonhoc.getMamonhoc());
        assertEquals("B17DCVT143", diemmonhoc.getMasinhvien());
        assertEquals("hk3", diemmonhoc.getMahocky());
        assertEquals(11, diemmonhoc.getDiemcc(),0);
        assertEquals(4, diemmonhoc.getDiemgiuaky(),0);
        diemmonhocDAOImp.insertDiem(diemmonhoc);
        List<Diemmonhoc> list = diemmonhocDAOImp.selectAllDiem();
        assertEquals(11, list.size());
        connection.rollback();
    }
      @Test
    public void testInsertDiemDefine2() throws SQLException{
        Connection connection = new DAOImp().createConnection();
        connection.setAutoCommit(false);
        System.out.println("insertDiem");
        diemmonhoc=new Diemmonhoc();
        diemmonhocDAOImp=new DiemmonhocDAOImp(connection);
        diemmonhoc.setMadiemmonhoc("diem92");
        diemmonhoc.setMamonhoc("INT1448");
        diemmonhoc.setMasinhvien("B17DCVT143");
        diemmonhoc.setMahocky("hk3");
        diemmonhoc.setDiemcc(4);
        diemmonhoc.setDiemgiuaky(11);
        assertEquals("diem92", diemmonhoc.getMadiemmonhoc());
        assertEquals("INT1448", diemmonhoc.getMamonhoc());
        assertEquals("B17DCVT143", diemmonhoc.getMasinhvien());
        assertEquals("hk3", diemmonhoc.getMahocky());
        assertEquals(4, diemmonhoc.getDiemcc(),0);
        assertEquals(11, diemmonhoc.getDiemgiuaky(),0);
        diemmonhocDAOImp.insertDiem(diemmonhoc);
        List<Diemmonhoc> list = diemmonhocDAOImp.selectAllDiem();
        assertEquals(11, list.size());
        connection.rollback();
    }
    @Test
    public void testSelectAllDiem() throws SQLException{
        System.out.println("selectAllDiem");
        diemmonhoc=new Diemmonhoc();
        diemmonhocDAOImp=new DiemmonhocDAOImp();
        List<Diemmonhoc> list = diemmonhocDAOImp.selectAllDiem();
        assertEquals(10, list.size());
        Diemmonhoc test = list.get(2);
        assertEquals("diem30", test.getMadiemmonhoc());
        assertEquals("INT1448", test.getMamonhoc());
        assertEquals("Phát triển phần mềm hướng dịch vụ", test.getTenmonhoc());
        assertEquals("B17DCVT143", test.getMasinhvien());
        assertEquals("Cao Viet", test.getHosinhvien());
        assertEquals("Hoang", test.getTensinhvien());
        assertEquals("hk3", test.getMahocky());
        assertEquals("Học kỳ hè", test.getTenhocky());
        assertEquals(9.5, test.getDiemcc(),0);
        assertEquals(2.5, test.getDiemgiuaky(),0);
        assertEquals(0, test.getDiemcuoiky(),0);
        assertEquals(1.7, test.getDiemtrungbinh(),0);
    }

    @Test
    public void testSelectByMonhoc() throws Exception {
        System.out.println("selectByMonhoc");
        diemmonhoc=new Diemmonhoc();
        diemmonhocDAOImp=new DiemmonhocDAOImp();
        List<Diemmonhoc> list = diemmonhocDAOImp.selectByMonhoc("TEL1409");
        assertEquals(1, list.size());
        Diemmonhoc test = list.get(0);
        assertEquals("TEL1409", test.getMamonhoc());
        assertEquals("Internet và giao thức", test.getTenmonhoc());
        assertEquals("B17DCVT143", test.getMasinhvien());
        assertEquals("Cao Viet", test.getHosinhvien());
        assertEquals("Hoang", test.getTensinhvien());
        assertEquals("hk1", test.getMahocky());
        assertEquals("Học kỳ 1", test.getTenhocky());
        assertEquals(10, test.getDiemcc(),0);
        assertEquals(5, test.getDiemgiuaky(),0);
        assertEquals(6, test.getDiemcuoiky(),0);
        assertEquals(6.1, test.getDiemtrungbinh(),0);
    }

    @Test
    public void testSelectDiem() throws SQLException {
        System.out.println("selectByMonhoc");
        diemmonhoc=new Diemmonhoc();
        diemmonhocDAOImp=new DiemmonhocDAOImp();
        Diemmonhoc list = diemmonhocDAOImp.selectDiem("diem30");
        assertEquals("INT1448", list.getMamonhoc());
        assertEquals("Phát triển phần mềm hướng dịch vụ", list.getTenmonhoc());
        assertEquals("B17DCVT143", list.getMasinhvien());
        assertEquals("Cao Viet", list.getHosinhvien());
        assertEquals("Hoang", list.getTensinhvien());
        assertEquals("hk3", list.getMahocky());
        assertEquals("Học kỳ hè", list.getTenhocky());
        assertEquals(9.5, list.getDiemcc(),0);
        assertEquals(2.5, list.getDiemgiuaky(),0);
        assertEquals(0, list.getDiemcuoiky(),0);
        assertEquals(1.7, list.getDiemtrungbinh(),0);
    }

    @Test
    public void testDeleteDiem() throws Exception {
        System.out.println("deleteDiem");
        Connection connection = new DAOImp().createConnection();
        connection.setAutoCommit(false);
        diemmonhoc=new Diemmonhoc();
        diemmonhocDAOImp=new DiemmonhocDAOImp(connection);
        boolean res=true;
        diemmonhoc.setMadiemmonhoc("diem30");
        boolean b=diemmonhocDAOImp.deleteDiem(diemmonhoc);
        assertEquals(res,b);
        List<Diemmonhoc> list = diemmonhocDAOImp.selectAllDiem();
        assertEquals(9, list.size());
        connection.rollback();
    }

    @Test
    public void testUpdateDiem() throws Exception {
        System.out.println("updateDiem");
        Connection connection = new DAOImp().createConnection();
        connection.setAutoCommit(false);
        diemmonhoc=new Diemmonhoc();
        diemmonhocDAOImp=new DiemmonhocDAOImp(connection);
        boolean res=true;
        diemmonhoc.setMadiemmonhoc("diem30");
        diemmonhoc.setDiemcc(9);
        diemmonhoc.setDiemgiuaky(8);
        diemmonhoc.setDiemcuoiky(7);
        boolean b=diemmonhocDAOImp.updateDiem(diemmonhoc);
        connection.rollback();
        assertEquals(res,b);
    }
//    @Test
//    public void testUpdateDiemDefine() throws Exception {
//        System.out.println("updateDiem");
//        Connection connection = new DAOImp().createConnection();
//        connection.setAutoCommit(false);
//        diemmonhoc=new Diemmonhoc();
//        diemmonhocDAOImp=new DiemmonhocDAOImp(connection);
//        boolean res=true;
//        diemmonhoc.setMadiemmonhoc("diem30");
//        diemmonhoc.setDiemcc(11);
//        diemmonhoc.setDiemgiuaky(8);
//        diemmonhoc.setDiemcuoiky(3);
//        boolean b=diemmonhocDAOImp.updateDiem(diemmonhoc);
//        DiemmonhocDAOImp diemmonhocDAOImp2 =new DiemmonhocDAOImp();
//        Diemmonhoc list = diemmonhocDAOImp2.selectDiem("diem30");
//        assertEquals("INT1448", list.getMamonhoc());
//        assertEquals("Phát triển phần mềm hướng dịch vụ", list.getTenmonhoc());
//        assertEquals("B17DCVT143", list.getMasinhvien());
//        assertEquals("Cao Viet", list.getHosinhvien());
//        assertEquals("Hoang", list.getTensinhvien());
//        assertEquals("hk3", list.getMahocky());
//        assertEquals("Học kỳ hè", list.getTenhocky());
//        assertEquals(11, list.getDiemcc(),0);
//        assertEquals(8, list.getDiemgiuaky(),0);
//        assertEquals(3, list.getDiemcuoiky(),0);
//        connection.rollback();
//        assertEquals(res,b);
//    }
//        @Test
//    public void testUpdateDiemDefine2() throws Exception {
//        System.out.println("updateDiem");
//        Connection connection = new DAOImp().createConnection();
//        connection.setAutoCommit(false);
//        diemmonhoc=new Diemmonhoc();
//        diemmonhocDAOImp=new DiemmonhocDAOImp(connection);
//        boolean res=true;
//        diemmonhoc.setMadiemmonhoc("diem30");
//        diemmonhoc.setDiemcc(8);
//        diemmonhoc.setDiemgiuaky(11);
//        diemmonhoc.setDiemcuoiky(3);
//        boolean b=diemmonhocDAOImp.updateDiem(diemmonhoc);
//        DiemmonhocDAOImp diemmonhocDAOImp2 =new DiemmonhocDAOImp();
//        Diemmonhoc list = diemmonhocDAOImp2.selectDiem("diem30");
//        assertEquals("INT1448", list.getMamonhoc());
//        assertEquals("Phát triển phần mềm hướng dịch vụ", list.getTenmonhoc());
//        assertEquals("B17DCVT143", list.getMasinhvien());
//        assertEquals("Cao Viet", list.getHosinhvien());
//        assertEquals("Hoang", list.getTensinhvien());
//        assertEquals("hk3", list.getMahocky());
//        assertEquals("Học kỳ hè", list.getTenhocky());
//        assertEquals(8, list.getDiemcc(),0);
//        assertEquals(11, list.getDiemgiuaky(),0);
//        assertEquals(3, list.getDiemcuoiky(),0);
//        connection.rollback();
//        assertEquals(res,b);
//    }
//        @Test
//    public void testUpdateDiemDefine3() throws Exception {
//        System.out.println("updateDiem");
//        Connection connection = new DAOImp().createConnection();
//        connection.setAutoCommit(false);
//        diemmonhoc=new Diemmonhoc();
//        diemmonhocDAOImp=new DiemmonhocDAOImp(connection);
//        boolean res=true;
//        diemmonhoc.setMadiemmonhoc("diem30");
//        diemmonhoc.setDiemcc(8);
//        diemmonhoc.setDiemgiuaky(8);
//        diemmonhoc.setDiemcuoiky(11);
//        boolean b=diemmonhocDAOImp.updateDiem(diemmonhoc);
//        DiemmonhocDAOImp diemmonhocDAOImp2 =new DiemmonhocDAOImp();
//        Diemmonhoc list = diemmonhocDAOImp2.selectDiem("diem30");
//        assertEquals("INT1448", list.getMamonhoc());
//        assertEquals("Phát triển phần mềm hướng dịch vụ", list.getTenmonhoc());
//        assertEquals("B17DCVT143", list.getMasinhvien());
//        assertEquals("Cao Viet", list.getHosinhvien());
//        assertEquals("Hoang", list.getTensinhvien());
//        assertEquals("hk3", list.getMahocky());
//        assertEquals("Học kỳ hè", list.getTenhocky());
//        assertEquals(8, list.getDiemcc(),0);
//        assertEquals(8, list.getDiemgiuaky(),0);
//        assertEquals(11, list.getDiemcuoiky(),0);
//        connection.rollback();
//        assertEquals(res,b);
//    }
//    @Test
//    public void testUpdateDiemWrong() throws Exception {
//        System.out.println("updateDiem");
//        Connection connection = new DAOImp().createConnection();
//        connection.setAutoCommit(false);
//        diemmonhoc=new Diemmonhoc();
//        diemmonhocDAOImp=new DiemmonhocDAOImp(connection);
//        boolean res=true;
//        diemmonhoc.setMadiemmonhoc("diem30");
//        diemmonhoc.setDiemcc(-1);
//        diemmonhoc.setDiemgiuaky(8);
//        diemmonhoc.setDiemcuoiky(6);
//        boolean b=diemmonhocDAOImp.updateDiem(diemmonhoc);
//        DiemmonhocDAOImp diemmonhocDAOImp2 =new DiemmonhocDAOImp();
//        Diemmonhoc list = diemmonhocDAOImp2.selectDiem("diem30");
//        assertEquals("INT1448", list.getMamonhoc());
//        assertEquals("Phát triển phần mềm hướng dịch vụ", list.getTenmonhoc());
//        assertEquals("B17DCVT143", list.getMasinhvien());
//        assertEquals("Cao Viet", list.getHosinhvien());
//        assertEquals("Hoang", list.getTensinhvien());
//        assertEquals("hk3", list.getMahocky());
//        assertEquals("Học kỳ hè", list.getTenhocky());
//        assertEquals(-1, list.getDiemcc(),0);
//        assertEquals(8, list.getDiemgiuaky(),0);
//        assertEquals(6, list.getDiemcuoiky(),0);
//        connection.rollback();
//        assertEquals(res,b);
//    }
//        @Test
//    public void testUpdateDiemWrong2() throws Exception {
//        System.out.println("updateDiem");
//        Connection connection = new DAOImp().createConnection();
//        connection.setAutoCommit(false);
//        diemmonhoc=new Diemmonhoc();
//        diemmonhocDAOImp=new DiemmonhocDAOImp(connection);
//        boolean res=true;
//        diemmonhoc.setMadiemmonhoc("diem30");
//        diemmonhoc.setDiemcc(8);
//        diemmonhoc.setDiemgiuaky(-1);
//        diemmonhoc.setDiemcuoiky(6);
//        boolean b=diemmonhocDAOImp.updateDiem(diemmonhoc);
//        DiemmonhocDAOImp diemmonhocDAOImp2 =new DiemmonhocDAOImp();
//        Diemmonhoc list = diemmonhocDAOImp2.selectDiem("diem30");
//        assertEquals("INT1448", list.getMamonhoc());
//        assertEquals("Phát triển phần mềm hướng dịch vụ", list.getTenmonhoc());
//        assertEquals("B17DCVT143", list.getMasinhvien());
//        assertEquals("Cao Viet", list.getHosinhvien());
//        assertEquals("Hoang", list.getTensinhvien());
//        assertEquals("hk3", list.getMahocky());
//        assertEquals("Học kỳ hè", list.getTenhocky());
//        assertEquals(8, list.getDiemcc(),0);
//        assertEquals(-1, list.getDiemgiuaky(),0);
//        assertEquals(6, list.getDiemcuoiky(),0);
//        connection.rollback();
//        assertEquals(res,b);
//    }
//            @Test
//    public void testUpdateDiemWrong3() throws Exception {
//        System.out.println("updateDiem");
//        Connection connection = new DAOImp().createConnection();
//        connection.setAutoCommit(false);
//        diemmonhoc=new Diemmonhoc();
//        diemmonhocDAOImp=new DiemmonhocDAOImp(connection);
//        boolean res=true;
//        diemmonhoc.setMadiemmonhoc("diem30");
//        diemmonhoc.setDiemcc(8);
//        diemmonhoc.setDiemgiuaky(7);
//        diemmonhoc.setDiemcuoiky(-1);
//        boolean b=diemmonhocDAOImp.updateDiem(diemmonhoc);
//        DiemmonhocDAOImp diemmonhocDAOImp2 =new DiemmonhocDAOImp();
//        Diemmonhoc list = diemmonhocDAOImp2.selectDiem("diem30");
//        assertEquals("INT1448", list.getMamonhoc());
//        assertEquals("Phát triển phần mềm hướng dịch vụ", list.getTenmonhoc());
//        assertEquals("B17DCVT143", list.getMasinhvien());
//        assertEquals("Cao Viet", list.getHosinhvien());
//        assertEquals("Hoang", list.getTensinhvien());
//        assertEquals("hk3", list.getMahocky());
//        assertEquals("Học kỳ hè", list.getTenhocky());
//        assertEquals(8, list.getDiemcc(),0);
//        assertEquals(7, list.getDiemgiuaky(),0);
//        assertEquals(-1, list.getDiemcuoiky(),0);
//        connection.rollback();
//        assertEquals(res,b);
//    }
}