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
public class Hocky {
    String mahocky;
    String tenhocky;

    public Hocky() {
    }

    public Hocky(String mahocky, String tenhocky) {
        this.mahocky = mahocky;
        this.tenhocky = tenhocky;
    }
    public Hocky(String mahocky) {
        this.mahocky = mahocky;
    }
    public String getMahocky() {
        return mahocky;
    }

    public void setMahocky(String mahocky) {
        this.mahocky = mahocky;
    }

    public String getTenhocky() {
        return tenhocky;
    }

    public void setTenhocky(String tenhocky) {
        this.tenhocky = tenhocky;
    }
    
}
