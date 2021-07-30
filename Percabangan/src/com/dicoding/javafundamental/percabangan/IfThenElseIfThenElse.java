package com.dicoding.javafundamental.percabangan;

import com.sun.deploy.security.SelectableSecurityManager;

public class IfThenElseIfThenElse {

    public static void main(String[] args) {
        int nilaiUjian = 80;
        char indeksPresentasi;

        if(nilaiUjian >= 90){
            indeksPresentasi = 'A';
        } else if (nilaiUjian >=80){
            indeksPresentasi = 'B';
        }else if (nilaiUjian >= 70){
            indeksPresentasi = 'C';
        }else if (nilaiUjian >= 60){
            indeksPresentasi = 'D';
        }else if (nilaiUjian >= 50){
            indeksPresentasi = 'E';
        }else {
            indeksPresentasi = 'F';
        }
        System.out.println("Nilai ujian akhir anda adalah " + indeksPresentasi);
    }
}
