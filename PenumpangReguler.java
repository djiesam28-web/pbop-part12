/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.demoangkutan;

/**
 *
 * @author ThinkPad
 */

   class PenumpangRegular extends Penumpang {
    public PenumpangRegular(String nama, String noTiket) {
        super(nama, noTiket);
    }
    @Override
    public double hitungHargaTiket() {
        return 50000;
    }
}

