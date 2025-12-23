/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.demoangkutan;
import java.util.Scanner;
/**
 *
 * @author ThinkPad
 */


public class DemoAngkutan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama Penumpang: ");
        String nama = input.nextLine();

        System.out.print("Masukkan No Tiket: ");
        String noTiket = input.nextLine();

        System.out.print("Jenis Penumpang (1.Regular / 2.VIP): ");
        int pilihan = input.nextInt();

        Penumpang penumpang;

        if (pilihan == 1) {
            penumpang = new PenumpangRegular(nama, noTiket);
            penumpang.tampilkanData("Regular");
        } else {
            penumpang = new PenumpangVIP(nama, noTiket);
            penumpang.tampilkanData("VIP");
        }

        input.close();
    }
}
