/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Array;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Diemmonhoc;
import model.Sinhvien;

/**
 *
 * @author HoangCV-TamCT
 */
public interface DiemmonhocDAO {
    public ArrayList<Diemmonhoc> selectByMonhoc(String mamh) throws SQLException;
    public void insertDiem(Diemmonhoc diemmonhoc) throws SQLException;
    public boolean deleteDiem(Diemmonhoc diemmonhoc) throws SQLException ;
    public boolean updateDiem(Diemmonhoc diemmonhoc) throws SQLException;
    public Diemmonhoc selectDiem(String diemmonhoc) ;
    public ArrayList < Diemmonhoc > selectAllDiem() ;
}
