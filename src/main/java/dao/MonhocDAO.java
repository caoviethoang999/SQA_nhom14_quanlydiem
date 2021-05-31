package dao;

import model.Monhoc;

import java.sql.SQLException;
import java.util.ArrayList;

public interface MonhocDAO {
    public ArrayList<Monhoc> selectMonhoc() throws SQLException;
}
