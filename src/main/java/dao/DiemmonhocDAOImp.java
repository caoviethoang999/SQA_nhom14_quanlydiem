/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
import model.Diemmonhoc;
import model.Sinhvien;

/**
 *
 * @author HoangCV-TamCT
 */
public class DiemmonhocDAOImp implements DiemmonhocDAO {

    public DiemmonhocDAOImp(Connection connection) {
        this.connection=connection;
    }

    public DiemmonhocDAOImp() {
    }
    private static final String INSERT_DIEM_SQL = "INSERT INTO diemmonhoc" + "(madiemmonhoc,mamonhoc, masinhvien, mahocky,diemcc, diemgiuaky, diemcuoiky, diemtrungbinh) VALUES " +
        " (?,?,?,?,?,?,?,?)";
    private static final String SELECT_ALL_DIEM = "select * from diemmonhoc,sinhvien,monhoc,hocky where sinhvien.masinhvien=diemmonhoc.masinhvien and monhoc.mamonhoc=diemmonhoc.mamonhoc and hocky.mahocky=diemmonhoc.mahocky";
    private static final String SELECT_DIEM_BY_ID = "select * from diemmonhoc,sinhvien,monhoc,hocky where madiemmonhoc =? and sinhvien.masinhvien=diemmonhoc.masinhvien and monhoc.mamonhoc=diemmonhoc.mamonhoc and hocky.mahocky=diemmonhoc.mahocky";
    private static final String DELETE_DIEM_SQL = "delete from diemmonhoc where madiemmonhoc = ?";
    private static final String UPDATE_DIEM_SQL = "update diemmonhoc set diemcc = ?,diemgiuaky = ?, diemcuoiky = ?, diemtrungbinh= ? where madiemmonhoc = ?";
    private static final String SELECT_DIEM_BY_MONHOC = "select * from diemmonhoc,monhoc,sinhvien,hocky where monhoc.mamonhoc = ? and sinhvien.masinhvien=diemmonhoc.masinhvien and monhoc.mamonhoc=diemmonhoc.mamonhoc and hocky.mahocky=diemmonhoc.mahocky";
    private Connection connection = new DAOImp().createConnection();
    @Override
    public void insertDiem(Diemmonhoc diemmonhoc) throws SQLException {
        System.out.println(INSERT_DIEM_SQL);
        try (PreparedStatement preparedStatement = connection.prepareStatement(INSERT_DIEM_SQL)) {
            preparedStatement.setString(1, diemmonhoc.getMadiemmonhoc());
            preparedStatement.setString(2, diemmonhoc.getMamonhoc());
            preparedStatement.setString(3, diemmonhoc.getMasinhvien());
            preparedStatement.setString(4, diemmonhoc.getMahocky());
            if(diemmonhoc.getDiemcc()>=0&&diemmonhoc.getDiemcc()<=10){
            preparedStatement.setDouble(5, diemmonhoc.getDiemcc());
            }
            if(diemmonhoc.getDiemgiuaky()>=0&&diemmonhoc.getDiemgiuaky()<=10){
            preparedStatement.setDouble(6, diemmonhoc.getDiemgiuaky());
            }
            if(diemmonhoc.getDiemcuoiky()>=0&&diemmonhoc.getDiemcuoiky()<=10){
            preparedStatement.setDouble(7, diemmonhoc.getDiemcuoiky());
            }
            preparedStatement.setDouble(8, diemmonhoc.getDiemtrungbinh());
            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        }
    }
    @Override
    public ArrayList < Diemmonhoc > selectAllDiem() {
        ArrayList < Diemmonhoc > diemmonhoc = new ArrayList < > ();
        try (PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_DIEM);) {
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                String madiemmonhoc = rs.getString("madiemmonhoc");
                String mamonhoc=rs.getString("mamonhoc");
                String tenmonhoc=rs.getString("tenmonhoc");
                String masinhvien = rs.getString("masinhvien");
                String hosinhvien = rs.getString("hosinhvien");
                String tensinhvien = rs.getString("tensinhvien");
                String mahocky = rs.getString("mahocky");
                String tenhocky = rs.getString("tenhocky");
                double diemcc = rs.getDouble("diemcc");
                double diemgiuaky = rs.getDouble("diemgiuaky");
                double diemcuoiky = rs.getDouble("diemcuoiky");
                double diemtrungbinh = rs.getDouble("diemtrungbinh");
                diemmonhoc.add(new Diemmonhoc(madiemmonhoc,mamonhoc,tenmonhoc,masinhvien,hosinhvien,tensinhvien,mahocky,tenhocky,diemcc,diemgiuaky,diemcuoiky,diemtrungbinh));
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return diemmonhoc;
    }
    public ArrayList<Diemmonhoc> selectByMonhoc(String mamh) throws SQLException {
        ArrayList < Diemmonhoc > diemmonhoc = new ArrayList < > ();
        PreparedStatement preparedStatement = connection.prepareStatement(SELECT_DIEM_BY_MONHOC);
        preparedStatement.setString(1,mamh);
        ResultSet rs = preparedStatement.executeQuery();
        while (rs.next()) {
            String madiemmonhoc = rs.getString("madiemmonhoc");
            String mamonhoc=rs.getString("mamonhoc");
            String tenmonhoc=rs.getString("tenmonhoc");
            String masinhvien = rs.getString("masinhvien");
            String hosinhvien = rs.getString("hosinhvien");
            String tensinhvien = rs.getString("tensinhvien");
            String mahocky = rs.getString("mahocky");
            String tenhocky = rs.getString("tenhocky");
            double diemcc = rs.getDouble("diemcc");
            double diemgiuaky = rs.getDouble("diemgiuaky");
            double diemcuoiky = rs.getDouble("diemcuoiky");
            double diemtrungbinh = rs.getDouble("diemtrungbinh");
            diemmonhoc.add(new Diemmonhoc(madiemmonhoc,mamonhoc,tenmonhoc,masinhvien,hosinhvien,tensinhvien,mahocky,tenhocky,diemcc,diemgiuaky,diemcuoiky,diemtrungbinh));
        }
        return diemmonhoc;
    }
    @Override
    public Diemmonhoc selectDiem(String madiemmonhoc) {
        Diemmonhoc diemmonhoc=null;
        try (PreparedStatement preparedStatement = connection.prepareStatement(SELECT_DIEM_BY_ID);) {
            preparedStatement.setString(1, madiemmonhoc);
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                String mamonhoc=rs.getString("mamonhoc");
                String tenmonhoc=rs.getString("tenmonhoc");
                String masinhvien = rs.getString("masinhvien");
                String hosinhvien = rs.getString("hosinhvien");
                String tensinhvien = rs.getString("tensinhvien");
                String mahocky = rs.getString("mahocky");
                String tenhocky = rs.getString("tenhocky");
                double diemcc = rs.getDouble("diemcc");
                double diemgiuaky = rs.getDouble("diemgiuaky");
                double diemcuoiky = rs.getDouble("diemcuoiky");
                double diemtrungbinh = rs.getDouble("diemtrungbinh");
                diemmonhoc = new Diemmonhoc(madiemmonhoc,mamonhoc,tenmonhoc,masinhvien,hosinhvien,tensinhvien,mahocky,tenhocky,diemcc,diemgiuaky,diemcuoiky,diemtrungbinh);

            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return diemmonhoc;
    }
    @Override
    public boolean deleteDiem(Diemmonhoc diemmonhoc) throws SQLException {
        boolean rowDeleted;
        try (PreparedStatement statement = connection.prepareStatement(DELETE_DIEM_SQL);) {
            statement.setString(1, diemmonhoc.getMadiemmonhoc());
            rowDeleted = statement.executeUpdate() > 0;
        }
        return rowDeleted;
    }
    @Override
    public boolean updateDiem(Diemmonhoc diemmonhoc) throws SQLException {
        boolean rowUpdated;
        try (PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_DIEM_SQL);) {
              if(diemmonhoc.getDiemcc()>=0&&diemmonhoc.getDiemcc()<=10){
            preparedStatement.setDouble(1, diemmonhoc.getDiemcc());
            }
            if(diemmonhoc.getDiemgiuaky()>=0&&diemmonhoc.getDiemgiuaky()<=10){
            preparedStatement.setDouble(2, diemmonhoc.getDiemgiuaky());
            }
            if(diemmonhoc.getDiemcuoiky()>=0&&diemmonhoc.getDiemcuoiky()<=10){
            preparedStatement.setDouble(3, diemmonhoc.getDiemcuoiky());
            }
             preparedStatement.setDouble(4, Math.ceil(((diemmonhoc.getDiemcc()*10/100 + diemmonhoc.getDiemgiuaky()*30/100 +diemmonhoc.getDiemcuoiky()*60/100)*100)/100));
             preparedStatement.setString(5, diemmonhoc.getMadiemmonhoc() );
            rowUpdated = preparedStatement.executeUpdate() > 0;
        } 
        return rowUpdated;
    }
     private void printSQLException(SQLException ex) {
        for (Throwable e: ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
}


