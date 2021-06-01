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
    public void testSelectByMonhocException() throws Exception {
        System.out.println("selectByMonhoc");
        diemmonhoc=new Diemmonhoc();
        diemmonhocDAOImp=new DiemmonhocDAOImp();
        List<Diemmonhoc> list = diemmonhocDAOImp.selectByMonhoc("TEL5000");
        assertEquals(0, list.size());
    }

    @Test
    public void testSelectDiem() throws SQLException {
        System.out.println("selectbyDiemmonhoc");
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
    public void testSelectDiemException() throws SQLException {
        System.out.println("selectbyDiemmonhoc");
        diemmonhoc=new Diemmonhoc();
        diemmonhocDAOImp=new DiemmonhocDAOImp();
        Diemmonhoc list = diemmonhocDAOImp.selectDiem("diem1000");
        assertEquals(null, list);
    }

    @Test
    public void testSelectAllDiem() throws SQLException{
        System.out.println("selectAllDiem");
        diemmonhoc=new Diemmonhoc();
        diemmonhocDAOImp=new DiemmonhocDAOImp();
        List<Diemmonhoc> list = diemmonhocDAOImp.selectAllDiem();
        assertEquals(10, list.size());
        for(int i=0;i<list.size();i++){
            Diemmonhoc test = list.get(i);
            Diemmonhoc compare = diemmonhocDAOImp.selectDiem(test.getMadiemmonhoc());
            assertEquals(compare.getMadiemmonhoc(), test.getMadiemmonhoc());
            assertEquals(compare.getMamonhoc(), test.getMamonhoc());
            assertEquals(compare.getTenmonhoc(), test.getTenmonhoc());
            assertEquals(compare.getMasinhvien(), test.getMasinhvien());
            assertEquals(compare.getHosinhvien(), test.getHosinhvien());
            assertEquals(compare.getTensinhvien(), test.getTensinhvien());
            assertEquals(compare.getMahocky(), test.getMahocky());
            assertEquals(compare.getTenhocky(), test.getTenhocky());
            assertEquals(compare.getDiemcc(), test.getDiemcc(),0);
            assertEquals(compare.getDiemgiuaky(), test.getDiemgiuaky(),0);
            assertEquals(compare.getDiemcuoiky(), test.getDiemcuoiky(),0);
            assertEquals(compare.getDiemtrungbinh(), test.getDiemtrungbinh(),0);
        }
    }

    @Test
    public void testInsertDiem() throws SQLException{
        Connection connection = new DAOImp().createConnection();
        connection.setAutoCommit(false);
        System.out.println("insertDiem");
        diemmonhoc=new Diemmonhoc();
        diemmonhocDAOImp=new DiemmonhocDAOImp(connection);
        List<Diemmonhoc> records = diemmonhocDAOImp.selectAllDiem();
        diemmonhoc.setMadiemmonhoc("diem92");
        diemmonhoc.setMamonhoc("INT1448");
        diemmonhoc.setMasinhvien("B17DCVT143");
        diemmonhoc.setMahocky("hk3");
        diemmonhoc.setDiemcc(10);
        diemmonhoc.setDiemgiuaky(8);
        diemmonhoc.setDiemcuoiky(3);
        diemmonhocDAOImp.insertDiem(diemmonhoc);
        //Get insert record from db
        Diemmonhoc inserted = diemmonhocDAOImp.selectDiem(diemmonhoc.getMadiemmonhoc());
        //Compare
        assertEquals(inserted.getMadiemmonhoc(), diemmonhoc.getMadiemmonhoc());
        assertEquals(inserted.getMamonhoc(), diemmonhoc.getMamonhoc());
        assertEquals(inserted.getMasinhvien(), diemmonhoc.getMasinhvien());
        assertEquals(inserted.getMahocky(), diemmonhoc.getMahocky());
        assertEquals(inserted.getDiemcc(), diemmonhoc.getDiemcc(),0);
        assertEquals(inserted.getDiemgiuaky(), diemmonhoc.getDiemgiuaky(),0);
        assertEquals(inserted.getDiemcuoiky(), diemmonhoc.getDiemcuoiky(),0);
        assertEquals(inserted.getDiemtrungbinh(), diemmonhoc.getDiemtrungbinh(),0);
        List<Diemmonhoc> list = diemmonhocDAOImp.selectAllDiem();
        //Check Size
        assertEquals(records.size()+1, list.size());
        connection.rollback();
    }
    @Test
    public void testInsertDiemException1() throws SQLException{
        Connection connection = new DAOImp().createConnection();
        connection.setAutoCommit(false);
        System.out.println("insertDiem");
        diemmonhoc=new Diemmonhoc();
        diemmonhocDAOImp=new DiemmonhocDAOImp(connection);
        List<Diemmonhoc> records = diemmonhocDAOImp.selectAllDiem();
        diemmonhoc.setMadiemmonhoc("diem92");
        diemmonhoc.setMamonhoc("INT1448");
        diemmonhoc.setMasinhvien("B17DCVT143");
        diemmonhoc.setMahocky("hk3");
        diemmonhoc.setDiemcc(-1);
        diemmonhoc.setDiemgiuaky(4);
        diemmonhoc.setDiemcuoiky(3);
        diemmonhocDAOImp.insertDiem(diemmonhoc);
        List<Diemmonhoc> list = diemmonhocDAOImp.selectAllDiem();
        assertEquals(records.size(), list.size());
        connection.rollback();
    }
     @Test
    public void testInsertDiemException2() throws SQLException{
        Connection connection = new DAOImp().createConnection();
        connection.setAutoCommit(false);
        System.out.println("insertDiem");
        diemmonhoc=new Diemmonhoc();
        diemmonhocDAOImp=new DiemmonhocDAOImp(connection);
        List<Diemmonhoc> records = diemmonhocDAOImp.selectAllDiem();
        diemmonhoc.setMadiemmonhoc("diem92");
        diemmonhoc.setMamonhoc("INT1448");
        diemmonhoc.setMasinhvien("B17DCVT143");
        diemmonhoc.setMahocky("hk3");
        diemmonhoc.setDiemcc(4);
        diemmonhoc.setDiemgiuaky(-2);
        diemmonhoc.setDiemcuoiky(3);
        diemmonhocDAOImp.insertDiem(diemmonhoc);
        List<Diemmonhoc> list = diemmonhocDAOImp.selectAllDiem();
        assertEquals(records.size(), list.size());
        connection.rollback();
    }
    @Test
    public void testInsertDiemException3() throws SQLException{
        Connection connection = new DAOImp().createConnection();
        connection.setAutoCommit(false);
        System.out.println("insertDiem");
        diemmonhoc=new Diemmonhoc();
        diemmonhocDAOImp=new DiemmonhocDAOImp(connection);
        List<Diemmonhoc> records = diemmonhocDAOImp.selectAllDiem();
        diemmonhoc.setMadiemmonhoc("diem92");
        diemmonhoc.setMamonhoc("INT1448");
        diemmonhoc.setMasinhvien("B17DCVT143");
        diemmonhoc.setMahocky("hk3");
        diemmonhoc.setDiemcc(11);
        diemmonhoc.setDiemgiuaky(4);
        diemmonhoc.setDiemcuoiky(3);
        diemmonhocDAOImp.insertDiem(diemmonhoc);
        List<Diemmonhoc> list = diemmonhocDAOImp.selectAllDiem();
        assertEquals(records.size(), list.size());
        connection.rollback();
    }
    @Test
    public void testInsertDiemException4() throws SQLException{
        Connection connection = new DAOImp().createConnection();
        connection.setAutoCommit(false);
        System.out.println("insertDiem");
        diemmonhoc=new Diemmonhoc();
        diemmonhocDAOImp=new DiemmonhocDAOImp(connection);
        List<Diemmonhoc> records = diemmonhocDAOImp.selectAllDiem();
        diemmonhoc.setMadiemmonhoc("diem92");
        diemmonhoc.setMamonhoc("INT1448");
        diemmonhoc.setMasinhvien("B17DCVT143");
        diemmonhoc.setMahocky("hk3");
        diemmonhoc.setDiemcc(4);
        diemmonhoc.setDiemgiuaky(11);
        diemmonhoc.setDiemcuoiky(3);
        diemmonhocDAOImp.insertDiem(diemmonhoc);
        List<Diemmonhoc> list = diemmonhocDAOImp.selectAllDiem();
        assertEquals(records.size(), list.size());
        connection.rollback();
    }

    @Test
    public void testInsertDiemException5() throws SQLException{
        Connection connection = new DAOImp().createConnection();
        connection.setAutoCommit(false);
        System.out.println("insertDiem");
        diemmonhoc=new Diemmonhoc();
        diemmonhocDAOImp=new DiemmonhocDAOImp(connection);
        List<Diemmonhoc> records = diemmonhocDAOImp.selectAllDiem();
        diemmonhoc.setMadiemmonhoc("diem92");
        diemmonhoc.setMamonhoc("INT1448");
        diemmonhoc.setMasinhvien("B17DCVT143");
        diemmonhoc.setMahocky("hk3");
        diemmonhoc.setDiemcc(4);
        diemmonhoc.setDiemgiuaky(7);
        diemmonhoc.setDiemcuoiky(-1);
        diemmonhocDAOImp.insertDiem(diemmonhoc);
        List<Diemmonhoc> list = diemmonhocDAOImp.selectAllDiem();
        assertEquals(records.size(), list.size());
        connection.rollback();
    }

    @Test
    public void testInsertDiemException6() throws SQLException{
        Connection connection = new DAOImp().createConnection();
        connection.setAutoCommit(false);
        System.out.println("insertDiem");
        diemmonhoc=new Diemmonhoc();
        diemmonhocDAOImp=new DiemmonhocDAOImp(connection);
        List<Diemmonhoc> records = diemmonhocDAOImp.selectAllDiem();
        diemmonhoc.setMadiemmonhoc("diem92");
        diemmonhoc.setMamonhoc("INT1448");
        diemmonhoc.setMasinhvien("B17DCVT143");
        diemmonhoc.setMahocky("hk3");
        diemmonhoc.setDiemcc(4);
        diemmonhoc.setDiemgiuaky(7);
        diemmonhoc.setDiemcuoiky(11);
        diemmonhocDAOImp.insertDiem(diemmonhoc);
        List<Diemmonhoc> list = diemmonhocDAOImp.selectAllDiem();
        assertEquals(records.size(), list.size());
        connection.rollback();
    }


    @Test
    public void testDeleteDiem() throws Exception {
        System.out.println("deleteDiem");
        Connection connection = new DAOImp().createConnection();
        connection.setAutoCommit(false);
        diemmonhoc=new Diemmonhoc();
        diemmonhocDAOImp=new DiemmonhocDAOImp(connection);
        List<Diemmonhoc> records = diemmonhocDAOImp.selectAllDiem();
        diemmonhoc.setMadiemmonhoc("diem30");
        boolean b=diemmonhocDAOImp.deleteDiem(diemmonhoc);
        assertEquals(true,b);
        List<Diemmonhoc> list = diemmonhocDAOImp.selectAllDiem();
        assertEquals(records.size()-1, list.size());
        connection.rollback();
    }

    @Test
    public void testDeleteDiemException() throws Exception {
        System.out.println("deleteDiem");
        Connection connection = new DAOImp().createConnection();
        connection.setAutoCommit(false);
        diemmonhoc=new Diemmonhoc();
        diemmonhocDAOImp=new DiemmonhocDAOImp(connection);
        List<Diemmonhoc> records = diemmonhocDAOImp.selectAllDiem();
        diemmonhoc.setMadiemmonhoc("diem1000");
        boolean b=diemmonhocDAOImp.deleteDiem(diemmonhoc);
        assertEquals(false,b);
        List<Diemmonhoc> list = diemmonhocDAOImp.selectAllDiem();
        assertEquals(records.size(), list.size());
        connection.rollback();
    }

    @Test
    public void testUpdateDiem() throws Exception {
        System.out.println("updateDiem");
        Connection connection = new DAOImp().createConnection();
        connection.setAutoCommit(false);
        diemmonhoc=new Diemmonhoc();
        diemmonhocDAOImp=new DiemmonhocDAOImp(connection);
        diemmonhoc.setMadiemmonhoc("diem30");
        diemmonhoc.setDiemcc(9);
        diemmonhoc.setDiemgiuaky(8);
        diemmonhoc.setDiemcuoiky(7);
        boolean b=diemmonhocDAOImp.updateDiem(diemmonhoc);
        Diemmonhoc updated = new Diemmonhoc();
        updated = diemmonhocDAOImp.selectDiem(diemmonhoc.getMadiemmonhoc());
        assertEquals(updated.getDiemcc(),diemmonhoc.getDiemcc(),0);
        assertEquals(updated.getDiemtrungbinh(),diemmonhoc.getDiemtrungbinh(),0);
        assertEquals(updated.getDiemcuoiky(),diemmonhoc.getDiemcuoiky(),0);
        assertEquals(true,b);
        connection.rollback();
    }
    @Test
    public void testUpdateDiemException1() throws Exception {
        System.out.println("updateDiem Exception1");
        Connection connection = new DAOImp().createConnection();
        connection.setAutoCommit(false);
        diemmonhoc=new Diemmonhoc();
        diemmonhocDAOImp=new DiemmonhocDAOImp(connection);
        diemmonhoc.setMadiemmonhoc("diem30");
        diemmonhoc.setDiemcc(11);
        diemmonhoc.setDiemgiuaky(8);
        diemmonhoc.setDiemcuoiky(3);
        Diemmonhoc beforeUpdate = diemmonhocDAOImp.selectDiem(diemmonhoc.getMadiemmonhoc());
        boolean b=diemmonhocDAOImp.updateDiem(diemmonhoc);
        Diemmonhoc afterUpdate = diemmonhocDAOImp.selectDiem(diemmonhoc.getMadiemmonhoc());
        assertEquals(afterUpdate.getDiemcc(), beforeUpdate.getDiemcc(),0);
        assertEquals(afterUpdate.getDiemgiuaky(), beforeUpdate.getDiemgiuaky(),0);
        assertEquals(afterUpdate.getDiemcuoiky(), beforeUpdate.getDiemcuoiky(),0);
        assertEquals(false,b);
        connection.rollback();

    }

    @Test
    public void testUpdateDiemException2() throws Exception {
        System.out.println("updateDiem Exception 2");
        Connection connection = new DAOImp().createConnection();
        connection.setAutoCommit(false);
        diemmonhoc=new Diemmonhoc();
        diemmonhocDAOImp=new DiemmonhocDAOImp(connection);
        diemmonhoc.setMadiemmonhoc("diem30");
        diemmonhoc.setDiemcc(8);
        diemmonhoc.setDiemgiuaky(11);
        diemmonhoc.setDiemcuoiky(3);
        Diemmonhoc beforeUpdate = diemmonhocDAOImp.selectDiem(diemmonhoc.getMadiemmonhoc());
        boolean b=diemmonhocDAOImp.updateDiem(diemmonhoc);
        Diemmonhoc afterUpdate = diemmonhocDAOImp.selectDiem(diemmonhoc.getMadiemmonhoc());
        assertEquals(afterUpdate.getDiemcc(), beforeUpdate.getDiemcc(),0);
        assertEquals(afterUpdate.getDiemgiuaky(), beforeUpdate.getDiemgiuaky(),0);
        assertEquals(afterUpdate.getDiemcuoiky(), beforeUpdate.getDiemcuoiky(),0);
        assertEquals(false,b);
        connection.rollback();
    }
        @Test
    public void testUpdateDiemException3() throws Exception {
            System.out.println("updateDiem Exception 3");
            Connection connection = new DAOImp().createConnection();
            connection.setAutoCommit(false);
            diemmonhoc=new Diemmonhoc();
            diemmonhocDAOImp=new DiemmonhocDAOImp(connection);
            diemmonhoc.setMadiemmonhoc("diem30");
            diemmonhoc.setDiemcc(8);
            diemmonhoc.setDiemgiuaky(8);
            diemmonhoc.setDiemcuoiky(11);
            Diemmonhoc beforeUpdate = diemmonhocDAOImp.selectDiem(diemmonhoc.getMadiemmonhoc());
            boolean b=diemmonhocDAOImp.updateDiem(diemmonhoc);
            Diemmonhoc afterUpdate = diemmonhocDAOImp.selectDiem(diemmonhoc.getMadiemmonhoc());
            assertEquals(afterUpdate.getDiemcc(), beforeUpdate.getDiemcc(),0);
            assertEquals(afterUpdate.getDiemgiuaky(), beforeUpdate.getDiemgiuaky(),0);
            assertEquals(afterUpdate.getDiemcuoiky(), beforeUpdate.getDiemcuoiky(),0);
            assertEquals(false,b);
            connection.rollback();
    }
    @Test
    public void testUpdateDiemException4() throws Exception {
        System.out.println("updateDiem Exception 4");
        Connection connection = new DAOImp().createConnection();
        connection.setAutoCommit(false);
        diemmonhoc=new Diemmonhoc();
        diemmonhocDAOImp=new DiemmonhocDAOImp(connection);
        diemmonhoc.setMadiemmonhoc("diem30");
        diemmonhoc.setDiemcc(-1);
        diemmonhoc.setDiemgiuaky(8);
        diemmonhoc.setDiemcuoiky(6);
        Diemmonhoc beforeUpdate = diemmonhocDAOImp.selectDiem(diemmonhoc.getMadiemmonhoc());
        boolean b=diemmonhocDAOImp.updateDiem(diemmonhoc);
        Diemmonhoc afterUpdate = diemmonhocDAOImp.selectDiem(diemmonhoc.getMadiemmonhoc());
        assertEquals(afterUpdate.getDiemcc(), beforeUpdate.getDiemcc(),0);
        assertEquals(afterUpdate.getDiemgiuaky(), beforeUpdate.getDiemgiuaky(),0);
        assertEquals(afterUpdate.getDiemcuoiky(), beforeUpdate.getDiemcuoiky(),0);
        assertEquals(false,b);
        connection.rollback();
    }

    @Test
    public void testUpdateDiemException5() throws Exception {
        System.out.println("updateDiem Exception 5");
        Connection connection = new DAOImp().createConnection();
        connection.setAutoCommit(false);
        diemmonhoc=new Diemmonhoc();
        diemmonhocDAOImp=new DiemmonhocDAOImp(connection);
        diemmonhoc.setMadiemmonhoc("diem30");
        diemmonhoc.setDiemcc(4);
        diemmonhoc.setDiemgiuaky(-1);
        diemmonhoc.setDiemcuoiky(6);
        Diemmonhoc beforeUpdate = diemmonhocDAOImp.selectDiem(diemmonhoc.getMadiemmonhoc());
        boolean b=diemmonhocDAOImp.updateDiem(diemmonhoc);
        Diemmonhoc afterUpdate = diemmonhocDAOImp.selectDiem(diemmonhoc.getMadiemmonhoc());
        assertEquals(afterUpdate.getDiemcc(), beforeUpdate.getDiemcc(),0);
        assertEquals(afterUpdate.getDiemgiuaky(), beforeUpdate.getDiemgiuaky(),0);
        assertEquals(afterUpdate.getDiemcuoiky(), beforeUpdate.getDiemcuoiky(),0);
        assertEquals(false,b);
        connection.rollback();
    }

    @Test
    public void testUpdateDiemException6() throws Exception {
        System.out.println("updateDiem Exception 6");
        Connection connection = new DAOImp().createConnection();
        connection.setAutoCommit(false);
        diemmonhoc=new Diemmonhoc();
        diemmonhocDAOImp=new DiemmonhocDAOImp(connection);
        diemmonhoc.setMadiemmonhoc("diem30");
        diemmonhoc.setDiemcc(4);
        diemmonhoc.setDiemgiuaky(8);
        diemmonhoc.setDiemcuoiky(-1);
        Diemmonhoc beforeUpdate = diemmonhocDAOImp.selectDiem(diemmonhoc.getMadiemmonhoc());
        boolean b=diemmonhocDAOImp.updateDiem(diemmonhoc);
        Diemmonhoc afterUpdate = diemmonhocDAOImp.selectDiem(diemmonhoc.getMadiemmonhoc());
        assertEquals(afterUpdate.getDiemcc(), beforeUpdate.getDiemcc(),0);
        assertEquals(afterUpdate.getDiemgiuaky(), beforeUpdate.getDiemgiuaky(),0);
        assertEquals(afterUpdate.getDiemcuoiky(), beforeUpdate.getDiemcuoiky(),0);
        assertEquals(false,b);
        connection.rollback();
    }
}