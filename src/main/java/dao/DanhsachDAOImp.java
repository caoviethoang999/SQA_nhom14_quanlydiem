/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Diemmonhoc;

/**
 *
 * @author HoangCV-TamCT
 */
public class DanhsachDAOImp implements DanhsachDAO{
    private static final String SELECT_ALL_DS = "select * from diemmonhoc,monhoc,sinhvien,hocky where monhoc.mamonhoc = ? and sinhvien.masinhvien=diemmonhoc.masinhvien and monhoc.mamonhoc=diemmonhoc.mamonhoc and hocky.mahocky=diemmonhoc.mahocky";
    private Connection connection = new DAOImp().createConnection();
    @Override
    public Map<String, List<Diemmonhoc>> selectAllDS(String mamh) throws SQLException {
        ArrayList <Diemmonhoc> sinhvienduocthi = new ArrayList <> ();
        ArrayList <Diemmonhoc> sinhvienkhongduocthi = new ArrayList<>();
        PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_DS);
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
            if(diemcc==0||diemgiuaky==0||diemtrungbinh<1){
                sinhvienkhongduocthi.add(new Diemmonhoc(madiemmonhoc,mamonhoc,tenmonhoc,masinhvien,hosinhvien,tensinhvien,mahocky,tenhocky,diemcc,diemgiuaky,diemcuoiky,diemtrungbinh));
            }
            else {
                sinhvienduocthi.add(new Diemmonhoc(madiemmonhoc,mamonhoc,tenmonhoc,masinhvien,hosinhvien,tensinhvien,mahocky,tenhocky,diemcc,diemgiuaky,diemcuoiky,diemtrungbinh));
            }
        }
        Map<String,List<Diemmonhoc>> map =new HashMap();
        map.put("duocthi",sinhvienduocthi);
        map.put("khongduocthi",sinhvienkhongduocthi);
        return map;
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
