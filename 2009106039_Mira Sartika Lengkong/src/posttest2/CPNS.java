package PraktikumPBO;

import java.util.ArrayList;
import java.util.Scanner;

public class CPNS {
    public static void main(String[] args){
        ArrayList<String> nama = new ArrayList<>();
        ArrayList<String> agama = new ArrayList<>();
        ArrayList<String> jenis_kelamin = new ArrayList<>();
        ArrayList<String> alamat = new ArrayList<>();
        ArrayList<Long> nik = new ArrayList<>();
        ArrayList<Long> no_telp = new ArrayList<>();

        int pilih;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("----------------");
            System.out.println("Data CPNS");
            System.out.println("----------------");
            System.out.println("1. Tambah data CPNS");
            System.out.println("2. Tampilkan data CPNS");
            System.out.println("3. Ubah data CPNS");
            System.out.println("4. Hapus data CPNS");
            System.out.println("5. Tampilkan Postest 2");
            System.out.println("6. Keluar");
            System.out.print("Pilih sesuai angka diatas: ");
            pilih = scan.nextInt();
            if (pilih == 1){
                Scanner scancreate = new Scanner(System.in);
                String scanstr;
                long scanint;

                System.out.println("Menu Tambah Data CPNS");
                System.out.print("Masukkan Nama : ");
                scanstr = scancreate.nextLine();
                nama.add(scanstr);
                System.out.print("Masukkan Agama : ");
                scanstr = scancreate.nextLine();
                agama.add(scanstr);
                System.out.print("Masukkan Jenis Kelamin : ");
                scanstr = scancreate.nextLine();
                jenis_kelamin.add(scanstr);
                System.out.print("Masukkan Alamat : ");
                scanstr = scancreate.nextLine();
                alamat.add(scanstr);
                System.out.print("Masukkan NIK : ");
                scanint = scancreate.nextLong();
                nik.add(scanint);
                System.out.print("Masukkan No Telepon : ");
                scanint = scancreate.nextLong();
                no_telp.add(scanint);
                System.out.println("Data Berhasil Ditambahkan!");
            }if (pilih == 2){
                System.out.println("Menu Tampilkan Data PNS");
                
                for(int i = 0; i < nama.size(); i++) {
                    System.out.println("Menu Tampilkan Data CPNS");
                    System.out.println("Data ke-" + (i+1));
                    System.out.println("Nama          : " + nama.get(i));
                    System.out.println("Agama         : " + agama.get(i));
                    System.out.println("Jenis Kelamin : " + jenis_kelamin.get(i));
                    System.out.println("Alamat        : " + alamat.get(i));
                    System.out.println("NIK           : " + nik.get(i));
                    System.out.println("No Telepon    : " + no_telp.get(i));
                    System.out.println("=======================================");
                    }                    
                }
            if (pilih == 3){
                Scanner input = new Scanner(System.in);
                Scanner scanupdate = new Scanner(System.in);
                String scanstr;
                long scanint;
        
                System.out.println("Menu Ubah Data CPNS");
                if(nama.isEmpty()) System.out.println("Data Kosong!");
                else {
                    for(int i = 0; i < nama.size(); i++) {
                        System.out.println("=======================================");
                        System.out.println("Data ke-" + (i+1));
                        System.out.println("Nama          : " + nama.get(i));
                        System.out.println("Agama         : " + agama.get(i));
                        System.out.println("Jenis Kelamin : " + jenis_kelamin.get(i));
                        System.out.println("Alamat        : " + alamat.get(i));
                        System.out.println("NIK           : " + nik.get(i));
                        System.out.println("No Telepon    : " + no_telp.get(i));
                        System.out.println("=======================================");
                    }                    
                }
                System.out.print("Masukkan Nomor Data yang ingin diubah: ");
                int no = input.nextInt();
                System.out.print("Masukkan Nama : ");
                scanstr = scanupdate.nextLine();
                nama.set(no-1, scanstr);
                System.out.print("Masukkan Agama : ");
                scanstr = scanupdate.nextLine();
                agama.set(no-1, scanstr);
                System.out.print("Masukkan Jenis Kelamin : ");
                scanstr = scanupdate.nextLine();
                jenis_kelamin.set(no-1, scanstr);
                System.out.print("Masukkan Alamat : ");
                scanstr = scanupdate.nextLine();
                alamat.set(no-1, scanstr);
                System.out.print("Masukkan NIK : ");
                scanint = scanupdate.nextLong();
                nik.set(no-1, scanint);
                System.out.print("Masukkan No Telepon : ");
                scanint = scanupdate.nextLong();
                no_telp.set(no-1, scanint);
                System.out.println("Data Berhasil Diubah!");                
            }if (pilih == 4){
                System.out.println("Menu Hapus Data CPNS");
                Scanner input = new Scanner(System.in);
        
                System.out.println("Menu Ubah Data CPNS");
                if(nama.isEmpty()) System.out.println("Data Kosong!");
                else {
                    for(int i = 0; i < nama.size(); i++) {
                        System.out.println("=======================================");
                        System.out.println("Data ke-" + (i+1));
                        System.out.println("Nama          : " + nama.get(i));
                        System.out.println("Agama         : " + agama.get(i));
                        System.out.println("Jenis Kelamin : " + jenis_kelamin.get(i));
                        System.out.println("Alamat        : " + alamat.get(i));
                        System.out.println("NIK           : " + nik.get(i));
                        System.out.println("No Telepon    : " + no_telp.get(i));
                        System.out.println("=======================================");
                    }
                }
                System.out.print("Masukkan Nomor Data yang ingin dihapus: ");
                int no = input.nextInt();
                nama.remove(no-1);
                agama.remove(no-1);
                jenis_kelamin.remove(no-1);
                alamat.remove(no-1);
                nik.remove(no-1);
                no_telp.remove(no-1);
                System.out.println("Data Berhasil Dihapus!");
            }if (pilih == 5){
                System.out.println("Class PNS");
                Pns pns1 = new Pns("Mira", "Kristen", "Perempuan", 6403030, "Tim Pengawas Ujian CPNS");
                Pns pns2 = new Pns("Naya", "Islam", "Perempuan", 6403031, "Tim Penyeleksi Ujian CPNS");
                
                System.out.print("Nama          : ");
                System.out.println(pns1.nama);
                System.out.print("Agama         : ");
                System.out.println(pns1.agama);
                System.out.print("Jenis Kelamin : ");
                System.out.println(pns1.jenis_kelamin);
                System.out.print("NIK           : ");
                System.out.println(pns1.nik);
                System.out.print("Jabatan       : ");
                System.out.println(pns1.jabatan);
                System.out.print("Tugas         :");
                pns1.tugas1pns();
                System.out.println("=======================================");
                System.out.print("Nama          : ");
                System.out.println(pns2.nama);
                System.out.print("Agama         : ");
                System.out.println(pns2.agama);
                System.out.print("Jenis Kelamin : ");
                System.out.println(pns2.jenis_kelamin);
                System.out.print("NIK           : ");
                System.out.println(pns2.nik);
                System.out.print("Jabatan       : ");
                System.out.println(pns2.jabatan);
                System.out.print("Tugas         : ");
                pns2.tugas2pns();
                System.out.println("=======================================");
            }
            if (pilih == 6){
                System.out.println("Terima Kasih!!!");
            }
        } while(pilih != 6);      
    }
}