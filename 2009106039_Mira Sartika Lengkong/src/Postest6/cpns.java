/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Postest6;

/**
 *
 * @author ACER-GK
 */
public class cpns {
   private String n; 
   private String a;
   private String j;
   private long k; 
   
   cpns(String nama, String agama, String jenis_kelamin, long nik) {
       
        this.n = nama;
        this.a = agama;
        this.j = jenis_kelamin;
        this.k = nik;
   }
    void tambahData() {
        System.out.println("Data Anda Telah Berhasil Ditambahkan !");
    }
    
    void tambahData(String status) {
        System.out.println("Data Anda " + status + " Dan Telah Berhasil Ditambahkan!!!");
    }

    void hapusData() {
        System.out.println("Data Anda Telah Berhasil Dihapus !");
    }

    void editData() {
        System.out.println("Data Anda Telah Berhasil Diubah !");
    }

    void tampilkanData() {
        System.out.println("Data Anda Telah Berhasil Ditampilkan !");
    }
    
    public String getN() {
        return n;
    }

    public void setN(String n) {
        this.n = n;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getJ() {
        return j;
    }

    public void setJ(String j) {
        this.j = j;
    }

    public long getK() {
        return k;
    }

    public void setK(long k) {
        this.k = k;
    }

   
    
}
