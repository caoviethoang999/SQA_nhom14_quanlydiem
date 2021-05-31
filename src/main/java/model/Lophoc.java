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
public class Lophoc {
    String malophoc;
    String tenlophoc;

    public Lophoc(String malophoc, String tenlophoc) {
        this.malophoc = malophoc;
        this.tenlophoc = tenlophoc;
    }

    public Lophoc(String malophoc) {
        this.malophoc = malophoc;
    }
    

    public String getMalophoc() {
        return malophoc;
    }

    public void setMalophoc(String malophoc) {
        this.malophoc = malophoc;
    }

    public String getTenlophoc() {
        return tenlophoc;
    }

    public void setTenlophoc(String tenlophoc) {
        this.tenlophoc = tenlophoc;
    }
    
}
