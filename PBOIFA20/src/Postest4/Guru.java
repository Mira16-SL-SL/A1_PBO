/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Postest4;

/**
 *
 * @author ACER-GK
 */
public class Guru extends cpns{
    private long g;
    
    public Guru(String nama, String agama, String jenis_kelamin, long nik, long nip_guru){
        super(nama, agama, jenis_kelamin, nik);
        this.g = nip_guru;
    }

    
    public long getG() {
        return g;
    }

    public void setG(long g) {
        this.g = g;
    }
    
    @Override
    public void tambahData(){
        System.out.println("Data Guru Berhasil Ditambahkan!!!");
    }
    
    @Override
    public void tampilkanData(){
        System.out.println("Data Guru Berhasil Ditampilkan!!!");
    }
}
