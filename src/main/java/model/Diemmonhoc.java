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
public class Diemmonhoc {
    String madiemmonhoc;
    double diemcc;
    double diemgiuaky;
    double diemcuoiky;
    double diemtrungbinh;
    public Monhoc monhoc;

    public Diemmonhoc(String madiemmonhoc) {
        this.madiemmonhoc = madiemmonhoc;
    }
    public Sinhvien sinhvien;
    public Hocky hocky;

    public Diemmonhoc(String madiemmonhoc,String mamonhoc,String tenmonhoc,String masinhvien,String hosinhvien,String tensinhvien,String mahocky,String tenhocky,double diemcc, double diemgiuaky, double diemcuoiky, double diemtrungbinh) {
        this.madiemmonhoc=madiemmonhoc;
        this.diemcc = diemcc;
        this.diemgiuaky = diemgiuaky;
        this.diemcuoiky = diemcuoiky;
        this.diemtrungbinh = diemtrungbinh;
        this.monhoc=new Monhoc(mamonhoc,tenmonhoc);
        this.sinhvien=new Sinhvien(masinhvien,hosinhvien,tensinhvien);
        this.hocky=new Hocky(mahocky,tenhocky);
    }
    public Diemmonhoc(String madiemmonhoc,String mamonhoc,String masinhvien,String mahocky,double diemcc, double diemgiuaky) {
        this.madiemmonhoc=madiemmonhoc;
        this.diemcc = diemcc;
        this.diemgiuaky = diemgiuaky;
        this.monhoc=new Monhoc(mamonhoc);
        this.sinhvien=new Sinhvien(masinhvien);
        this.hocky=new Hocky(mahocky);
    }

    public Diemmonhoc(String madiemmonhoc,double diemcc, double diemgiuaky, double diemcuoiky) {
        this.madiemmonhoc=madiemmonhoc;
        this.diemcc = diemcc;
        this.diemgiuaky = diemgiuaky;
        this.diemcuoiky = diemcuoiky;
    }
    public Diemmonhoc() {
    }
    public Diemmonhoc(Monhoc monhoc, Sinhvien sinhvien, Hocky hocky) {
        super();
        this.monhoc = new Monhoc();
        this.sinhvien = new Sinhvien();
        this.hocky = new Hocky();
    }
    public String getMadiemmonhoc() {
        return madiemmonhoc;
    }

    public void setMadiemmonhoc(String madiemmonhoc) {
        this.madiemmonhoc = madiemmonhoc;
    }
    

    public double getDiemcc() {
        if(diemcc>=0&&diemcc<=10){
            return diemcc;
        }
        return -1;
    }

    public void setDiemcc(double diemcc) {
        this.diemcc = diemcc;
    }

    public double getDiemgiuaky() {
        if(diemgiuaky>=0&&diemgiuaky<=10){
            return diemgiuaky;
        }
        return -1;
    }

    public void setDiemgiuaky(double diemgiuaky) {
        this.diemgiuaky = diemgiuaky;
    }

    public double getDiemcuoiky() {
        if(diemcuoiky>=0&&diemcuoiky<=10){
            return diemcuoiky;
        }
        return -1;
    }

    public void setDiemcuoiky(double diemcuoiky) {
        this.diemcuoiky = diemcuoiky;
    }

    public double getDiemtrungbinh() {
        diemtrungbinh=diemcc*10/100+diemgiuaky*30/100+diemcuoiky*60/100;
        return diemtrungbinh;
    }

    public void setDiemtrungbinh(double diemtrungbinh) {
        this.diemtrungbinh = diemtrungbinh;
    }
    
    public String getMamonhoc() {
        return monhoc.mamonhoc;
    }
    public void setMamonhoc(String mamonhoc) {
        monhoc = new Monhoc(mamonhoc);
        this.monhoc.mamonhoc = mamonhoc;
    }
    public String getMasinhvien() {
        return sinhvien.masinhvien;
    }

    public void setMasinhvien(String masinhvien) {
        sinhvien=new Sinhvien(masinhvien);
        this.sinhvien.masinhvien = masinhvien;
    }
    public String getMahocky() {
        return hocky.mahocky;
    }
    public void setMahocky(String mahocky) {
        hocky=new Hocky(mahocky);
        this.hocky.mahocky = mahocky;
    }
      public String getHosinhvien() {
        return sinhvien.hosinhvien;
    }
    public void setHosinhvien(String hosinhvien) {
        sinhvien=new Sinhvien(hosinhvien);
        this.sinhvien.hosinhvien = hosinhvien;
    }
    public String getTensinhvien() {
        return sinhvien.tensinhvien;
    }

    public void setTensinhvien(String tensinhvien) {
        sinhvien=new Sinhvien(tensinhvien);
        this.sinhvien.tensinhvien = tensinhvien;
    }
     public String getTenmonhoc() {
        return monhoc.tenmonhoc;
    }

    public void setTenmonhoc(String tenmonhoc) {
        monhoc = new Monhoc(tenmonhoc);
        this.monhoc.tenmonhoc = tenmonhoc;
    }
    public String getTenhocky() {
        return hocky.tenhocky;
    }

    public void setTenhocky(String tenhocky) {
        hocky=new Hocky(tenhocky);
        this.hocky.tenhocky = tenhocky;
    }
}
