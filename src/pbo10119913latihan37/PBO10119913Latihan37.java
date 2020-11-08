/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10119913latihan37;


/**
 * @author
 * NAMA     : Muhammad Alvin Rizqi Ramdhan 
 * KELAS    : IF 10K
 * NIM      : 10119913
 */public class PBO10119913Latihan37 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Mahasiswa mhs = new Mahasiswa();
        double nilaiMahasiswa, ratarata;
        double totalNilai = 0;
        double jumlahMahasiswa = mhs.getBanyak_mahasiswa();

        for (int i =1; i <= jumlahMahasiswa; i++) {
            nilaiMahasiswa = mhs.getNilai(i);
            totalNilai += nilaiMahasiswa;
        }
        ratarata = totalNilai / jumlahMahasiswa;
        System.out.printf("%nRataRata : %1$.1f%n",ratarata);

   
    }
    
}
