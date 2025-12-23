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
        char lagi;

        do {
            System.out.print("\nMasukkan Nama Penumpang: ");
            String nama = input.nextLine();

            System.out.print("Masukkan No Tiket: ");
            String noTiket = input.nextLine();

            System.out.print("Jenis Penumpang (1. Reguler / 2. VIP): ");
            int jenis = input.nextInt();
            input.nextLine(); // hapus newline

            Penumpang penumpang;

            if (jenis == 1) {
                penumpang = new PenumpangReguler(nama, noTiket);
                penumpang.tampilkanData("Reguler");
            } else {
                penumpang = new PenumpangVIP(nama, noTiket);
                penumpang.tampilkanData("VIP");
            }

            System.out.print("Tambah penumpang lagi? (y/n): ");
            lagi = input.next().charAt(0);
            input.nextLine();

        } while (lagi == 'y' || lagi == 'Y');

        input.close();
    }
}
    

