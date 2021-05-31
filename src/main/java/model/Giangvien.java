/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author HoangCV-TamCT
 */
public class Giangvien {
    String magiangvien;
    String hogiangvien;
    String tengiangvien;
    String sodienthoai;
    String email;

    public Giangvien(String magiangvien, String hogiangvien, String tengiangvien, String sodienthoai, String email) {
        this.magiangvien = magiangvien;
        this.hogiangvien = hogiangvien;
        this.tengiangvien = tengiangvien;
        this.sodienthoai = sodienthoai;
        this.email = email;
    }

    public Giangvien(String magiangvien) {
        this.magiangvien = magiangvien;
    }
    

    public String getMagiangvien() {
        return magiangvien;
    }

    public void setMagiangvien(String magiangvien) {
        this.magiangvien = magiangvien;
    }

    public String getHogiangvien() {
        return hogiangvien;
    }

    public void setHogiangvien(String hogiangvien) {
        this.hogiangvien = hogiangvien;
    }

    public String getTengiangvien() {
        return tengiangvien;
    }

    public void setTengiangvien(String tengiangvien) {
        this.tengiangvien = tengiangvien;
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
    
}
