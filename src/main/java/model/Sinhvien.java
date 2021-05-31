/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author HoangCV-TamCT
 */
public class Sinhvien {
    String masinhvien;
    String hosinhvien;
    String tensinhvien;
    Date ngaysinh;
    String noisinh;
    String sodienthoai;
    String email;
    Lophoc lophoc;

    public Sinhvien() {
    }

    public Sinhvien(String masinhvien, String hosinhvien, String tensinhvien, Date ngaysinh, String noisinh, String sodienthoai, String email,String malophoc) {
        this.masinhvien = masinhvien;
        this.hosinhvien = hosinhvien;
        this.tensinhvien = tensinhvien;
        this.ngaysinh = ngaysinh;
        this.noisinh = noisinh;
        this.sodienthoai = sodienthoai;
        this.email = email;
        this.lophoc = new Lophoc(malophoc);
    }

    public Sinhvien(String masinhvien, String hosinhvien, String tensinhvien) {
        this.masinhvien = masinhvien;
        this.hosinhvien = hosinhvien;
        this.tensinhvien = tensinhvien;
    }

    public Sinhvien(String masinhvien) {
        this.masinhvien = masinhvien;
    }
    
    
    public String getMasinhvien() {
        return masinhvien;
    }

    public void setMasinhvien(String masinhvien) {
        this.masinhvien = masinhvien;
    }

    public String getHosinhvien() {
        return hosinhvien;
    }

    public void setHosinhvien(String hosinhvien) {
        this.hosinhvien = hosinhvien;
    }

    public String getTensinhvien() {
        return tensinhvien;
    }

    public void setTensinhvien(String tensinhvien) {
        this.tensinhvien = tensinhvien;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getNoisinh() {
        return noisinh;
    }

    public void setNoisinh(String noisinh) {
        this.noisinh = noisinh;
    }

    public String getSodienthoai() {
        return sodienthoai;
    }

    public void setSodienthoai(String sodienthoai) {
        this.sodienthoai = sodienthoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getMalophoc() {
        return lophoc.malophoc;
    }

    public void setMalophoc(String malophoc) {
        this.lophoc.malophoc = malophoc;
    }
}
