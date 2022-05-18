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
public class Jaksa extends cpns implements Display{   
    private long s;
    
    public Jaksa(String nama, String agama, String jenis_kelamin, long nik, long nip_jaksa){
        super(nama, agama, jenis_kelamin, nik);
        this.s = nip_jaksa;
    }


    public long getS() {
        return s;
    }

    public void setS(long s) {
        this.s = s;
    }

    @Override
    public void tambahData(){
        System.out.println("Data Jaksa Berhasil Ditambahkan!!!");
    }
    
    @Override
    public void tampilkanData(){
        System.out.println("Data Jaksa Berhasil Ditampilkan!!!");
    }

    @Override
    public void LihatdataPensiunan() {
       System.out.println("Data Pensiunan Jaksa");   
    }

    @Override
    public void LihatdataPNSbaru() {
        System.out.println("Data PNS Baru Jaksa");
    }  
    
}
