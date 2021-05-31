/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import model.Diemmonhoc;

/**
 *
 * @author HoangCV-TamCT
 */
public interface DanhsachDAO {
     public Map<String, List<Diemmonhoc>> selectAllDS(String mamh) throws SQLException;
}
