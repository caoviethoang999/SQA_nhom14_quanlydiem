package dao;

import model.Diemmonhoc;
import model.Monhoc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MonhocDAOImp implements MonhocDAO{
    private Connection connection = new DAOImp().createConnection();
    private static final String SELECTMH = "select mamonhoc,tenmonhoc from monhoc;";
    private static final String SELECTMHBYID = "select mamonhoc,tenmonhoc from monhoc where mamonhoc = ?";
    @Override
    public ArrayList<Monhoc> selectMonhoc() throws SQLException {
        ArrayList<Monhoc> listmonhoc = new ArrayList<>();
        Monhoc monhoc=null;
        try (PreparedStatement preparedStatement = connection.prepareStatement(SELECTMH);) {
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                monhoc = new Monhoc(rs.getString("mamonhoc"),rs.getString("tenmonhoc"));
                listmonhoc.add(monhoc);
            }
        } catch (SQLException e) {
            throw e;
        }
        return listmonhoc;
    }

    public Monhoc getMonHocByID(String id) throws SQLException{
        Monhoc monhoc = new Monhoc();
        try (PreparedStatement preparedStatement = connection.prepareStatement(SELECTMHBYID);) {
            preparedStatement.setString(1,id);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                monhoc = new Monhoc(rs.getString("mamonhoc"),rs.getString("tenmonhoc"));
            }
        } catch (SQLException e) {
            throw e;
        }
        return monhoc;
    }
}
