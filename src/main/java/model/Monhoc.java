/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author HoangCV-TamCT
 */
public class Monhoc {
    String mamonhoc;
    String tenmonhoc;
    int sotinchi;
    Giangvien giangvien;
    public Monhoc() {
    }
    public Monhoc(String mamonhoc, String tenmonhoc, int sotinchi,String magiangvien) {
        this.mamonhoc = mamonhoc;
        this.tenmonhoc = tenmonhoc;
        this.sotinchi = sotinchi;
        this.giangvien= new Giangvien(magiangvien);
    }

    public Monhoc(String mamonhoc, String tenmonhoc) {
        this.mamonhoc = mamonhoc;
        this.tenmonhoc = tenmonhoc;
    }
    

    public Monhoc(String mamonhoc) {
        this.mamonhoc = mamonhoc;
    }
    

    public String getMamonhoc() {
        return mamonhoc;
    }

    public void setMamonhoc(String mamonhoc) {
        this.mamonhoc = mamonhoc;
    }

    public String getTenmonhoc() {
        return tenmonhoc;
    }

    public void setTenmonhoc(String tenmonhoc) {
        this.tenmonhoc = tenmonhoc;
    }

    public int getSotinchi() {
        return sotinchi;
    }

    public void setSotinchi(int sotinchi) {
        this.sotinchi = sotinchi;
    }
        public String getMagiangvien() {
        return giangvien.magiangvien;
    }

    public void setMagiangvien(String magiangvien) {
        this.giangvien.magiangvien = magiangvien;
    }
}
