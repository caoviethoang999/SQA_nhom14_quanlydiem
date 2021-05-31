/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import dao.DAOImp;
import dao.DanhsachDAOImp;
import dao.DiemmonhocDAOImp;
import java.io.IOException;
import java.sql.Array;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.MonhocDAOImp;
import java.sql.Connection;
import model.Diemmonhoc;
import model.Monhoc;


@WebServlet("/")
public class DiemmonhocServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private DiemmonhocDAOImp diemmonhocDAO;
    private DanhsachDAOImp danhsachDAO;
    private MonhocDAOImp monhocDAO;
    public void init() {
        diemmonhocDAO = new DiemmonhocDAOImp();
        danhsachDAO = new DanhsachDAOImp();
        monhocDAO = new MonhocDAOImp();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        String action = request.getServletPath();

        try {
            switch (action) {
                case "/new":
                    showNewForm(request, response);
                    break;
                case "/insert":
                    insertDiem(request, response);
                    break;
                case "/delete":
                    deleteDiem(request, response);
                    break;
                case "/edit":
                    showEditForm(request, response);
                    break;
                case "/update":
                    updateDiem(request, response);
                    break;
                case "/show":
                    listDiem(request, response);
                    break;
                case "/thongke":
                    listDS(request, response);
                    break;
                default:
                    listDiem(request, response);
                    break;
            }
        } catch (SQLException ex) {
            throw new ServletException(ex);
        }
    }
    private void listDiem(HttpServletRequest request, HttpServletResponse response)
    throws SQLException, IOException, ServletException {
        String mamh = request.getParameter("mamonhoc");
        if(mamh==null) {
            List<Monhoc> listMonHoc = monhocDAO.selectMonhoc();
            request.setAttribute("listMonHoc", listMonHoc);
            RequestDispatcher dispatcher = request.getRequestDispatcher("diem-list.jsp");
            dispatcher.forward(request, response);
        }
        else if(mamh.equals("all")){
            List<Monhoc> listMonHoc = monhocDAO.selectMonhoc();
            ArrayList< Diemmonhoc > listDiem = diemmonhocDAO.selectAllDiem();
            request.setAttribute("listMonHoc", listMonHoc);
            request.setAttribute("listDiem", listDiem);
            RequestDispatcher dispatcher = request.getRequestDispatcher("diem-list.jsp");
            dispatcher.forward(request, response);
        }
        else {
            List<Monhoc> listMonHoc = monhocDAO.selectMonhoc();
            List < Diemmonhoc > listDiem = diemmonhocDAO.selectByMonhoc(mamh);
            request.setAttribute("listMonHoc", listMonHoc);
            request.setAttribute("listDiem", listDiem);
            RequestDispatcher dispatcher = request.getRequestDispatcher("diem-list.jsp");
            dispatcher.forward(request, response);
        }
    }
    private void showNewForm(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("diem-form.jsp");
        dispatcher.forward(request, response);
    }
    

    private void showEditForm(HttpServletRequest request, HttpServletResponse response)
    throws SQLException, ServletException, IOException {
        String madiemmonhoc = request.getParameter("madiemmonhoc");
        Diemmonhoc existingDiem = diemmonhocDAO.selectDiem(madiemmonhoc);
        RequestDispatcher dispatcher = request.getRequestDispatcher("diem-edit.jsp");
        request.setAttribute("diem", existingDiem);
        dispatcher.forward(request, response);
    }

    private void insertDiem(HttpServletRequest request, HttpServletResponse response)
    throws SQLException, IOException {
        String madiemmonhoc = request.getParameter("madiemmonhoc");
        String mamonhoc = request.getParameter("mamonhoc");
        String masinhvien = request.getParameter("masinhvien");
        String mahocky = request.getParameter("mahocky");
        double diemcc = Double.parseDouble(request.getParameter("diemcc"));
        double diemgiuaky = Double.parseDouble(request.getParameter("diemgiuaky"));
        Diemmonhoc diemmonhoc = new Diemmonhoc(madiemmonhoc,mamonhoc,masinhvien,mahocky,diemcc,diemgiuaky);
        diemmonhocDAO.insertDiem(diemmonhoc);
        response.sendRedirect("show");
    }
    private void updateDiem(HttpServletRequest request, HttpServletResponse response)
    throws SQLException, IOException {
        String madiemmonhoc = request.getParameter("madiemmonhoc");
        double diemcc = Double.parseDouble(request.getParameter("diemcc"));
        double diemgiuaky = Double.parseDouble(request.getParameter("diemgiuaky"));
        double diemcuoiky = Double.parseDouble(request.getParameter("diemcuoiky"));
        Diemmonhoc diemmonhoc = new Diemmonhoc(madiemmonhoc,diemcc,diemgiuaky,diemcuoiky);
        diemmonhocDAO.updateDiem(diemmonhoc);
        response.sendRedirect("show");
    }
    private void deleteDiem(HttpServletRequest request, HttpServletResponse response)
    throws SQLException, IOException {
        String madiemmonhoc = request.getParameter("madiemmonhoc");
        Diemmonhoc diemmonhoc = new Diemmonhoc(madiemmonhoc);
        diemmonhocDAO.deleteDiem(diemmonhoc);
        response.sendRedirect("show");
    }
    private void listDS(HttpServletRequest request, HttpServletResponse response)
    throws SQLException, IOException, ServletException {
        String mamh = request.getParameter("mamonhoc");
        if(mamh==null) {
            List<Monhoc> listMonHoc = monhocDAO.selectMonhoc();
            request.setAttribute("listMonHoc", listMonHoc);
            RequestDispatcher dispatcher = request.getRequestDispatcher("ds-list.jsp");
            dispatcher.forward(request, response);
        }
        else {
            Map<String, List<Diemmonhoc>> map = danhsachDAO.selectAllDS(mamh);
            ArrayList < Diemmonhoc > sinhvienduocthi = (ArrayList<Diemmonhoc>) map.get("duocthi");
            ArrayList < Diemmonhoc > sinhvienkhongduocthi = (ArrayList<Diemmonhoc>) map.get("khongduocthi");
            System.out.println(sinhvienduocthi);
            System.out.println(sinhvienkhongduocthi);
            List<Monhoc> listMonHoc = monhocDAO.selectMonhoc();
            request.setAttribute("listMonHoc", listMonHoc);
            request.setAttribute("sinhvienduocthi", sinhvienduocthi);
            request.setAttribute("sinhvienkhongduocthi", sinhvienkhongduocthi);
            RequestDispatcher dispatcher = request.getRequestDispatcher("ds-list.jsp");
            dispatcher.forward(request, response);
        }
    }
}
