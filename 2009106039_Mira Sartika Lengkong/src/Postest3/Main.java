
package Postest3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<String> nama;
    static ArrayList<String> agama;
    static ArrayList<String> jenis_kelamin;
    static ArrayList<String> jabatan;
    static ArrayList<Long> nik;
    
    static boolean isEditing = false;
    static Scanner input;
    
   
    public static void main(String[] args) {
        // TODO code application logic here
        nama = new ArrayList<>();
        agama = new ArrayList<>();
        jenis_kelamin = new ArrayList<>();
        nik = new ArrayList<>();
        jabatan = new ArrayList<>();
        input = new Scanner(System.in);
        
         while (true) {
            menuTampil();
        }

    }
    
    static void clearScreen() {
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                // clear screen untuk windows
                new ProcessBuilder("cmd", "/c", "cls")
                        .inheritIO()
                        .start()
                        .waitFor();
            } else {
                // clear screen untuk Linux, Unix, Mac
                Runtime.getRuntime().exec("clear");
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (final IOException | InterruptedException e) {
            System.out.println("Error karena: " + e.getMessage());
        }

    }
    
    static void menuTampil(){
        System.out.println(" ");
        System.out.println("===============================================");
        System.out.println("|         Program Data CPNS Samarinda         |");
        System.out.println("===============================================");
        System.out.println("|[1] Lihat data CPNS                           |");
        System.out.println("|[2] Tambah data CPNS                          |");
        System.out.println("|[3] Edit data CPNS                            |");
        System.out.println("|[4] Hapus data CPNS                           |");
        System.out.println("|[5] Keluar                                    |");
        System.out.println("===============================================");
        System.out.print("Pilih menu :  ");
           String menu = input.nextLine(); 
        
        switch (menu){
            case "1":
                menuLihat();
                break;
            case "2":
                menuTambah();
                break;
            case "3":
                menuEdit();
                break;
            case "4":
                menuHapus();
                break;
            case "5":
                System.exit(0);
            default:
                System.out.println("Menu yang dipilih tidak tersedia!!!");
                kembali();
                break;
        }
    }
    static void menuLihat(){
        clearScreen();
        if (nama.size() > 0) {
            System.out.println("========================================================================================================");
            System.out.println("|NO\tNama\t\tAgama\t\tJenis Kelamin\t\tJabatan\t\tNIK                           |");
            System.out.println("========================================================================================================");
            int i = 0;
            for (String n : nama) {
                String a = agama.get(i);
                String j = jenis_kelamin.get(i);
                String b = jabatan.get(i);
                Long k = nik.get(i);
                System.out.println(String.format("%d\t%s\t\t%s\t\t%s\t\t\t%s\t\t%s", i+1, n, a, j, b, k));
                System.out.println("========================================================================================================");
                i++;
            }
        } else {
            System.out.println("Tidak ada data!");
        }

        if (!isEditing) {
            kembali();
        }
    }
    static void menuTambah(){
        clearScreen();
        System.out.print("Masukkan Nama           : ");
        String n = input.nextLine();
        nama.add(n);
        System.out.print("Masukkan Agama          : ");
        String a = input.nextLine();
        agama.add(a);
        System.out.print("Masukkan Jenis Kelamin  : ");
        String j = input.nextLine();
        jenis_kelamin.add(j);
        System.out.print("Masukkan Jabatan        : ");
        String b = input.nextLine();
        jabatan.add(b);
        System.out.print("Masukkan NIK            : ");
        long k = input.nextLong();
        nik.add(k);

        cpns cpns1 = new cpns(n, a, j, b, k);
        System.out.println(" ");
        cpns1.tambahData();
        cpns1.getN();
        cpns1.getA();
        cpns1.getJ();
        cpns1.getB();
        cpns1.getK();
        System.out.println("======================================");
        System.out.println("Nama                 : " + cpns1.getN());
        System.out.println("Agama                : " + cpns1.getA());
        System.out.println("Jenis Kelamin        : " + cpns1.getJ());
        System.out.println("Jabatan              : " + cpns1.getB());
        System.out.println("NIK                  : " + cpns1.getK());
        System.out.println("======================================");
        
        isEditing = false;
        kembali();
    }
    static void menuEdit(){
        isEditing = true;
        menuLihat();

        try {
            System.out.println("===============================");
            System.out.print("Pilih Data yang ingin diganti: ");
            System.out.println("===============================");
            int index = Integer.parseInt(input.nextLine());

            if (index > nama.size()) {
                throw new IndexOutOfBoundsException("Kamu memasukan data yang salah!");
            } else {
                
                System.out.println("======================================");
                System.out.println("              Data Baru               ");
                System.out.println("======================================");
                System.out.print("Nama           : ");
                String newn = input.nextLine();
                System.out.print("Agama          : ");
                String newa = input.nextLine();
                System.out.print("Jenis Kelamin  : ");
                String newj = input.nextLine();
                System.out.print("Jabatan        : ");
                String newb = input.nextLine();
                System.out.print("NIK            : ");
                long newk = input.nextLong();

                // update data
                nama.set(index-1, newn);
                agama.set(index-1, newa);
                jenis_kelamin.set(index-1, newj);
                jabatan.set(index-1, newb);
                nik.set(index-1, newk);

                cpns cpns2 = new cpns(newn, newa, newj, newb, newk);
                System.out.println(" ");
                cpns2.editData();
                cpns2.setN(newn);
                cpns2.setA(newa);
                cpns2.setJ(newj);
                cpns2.setB(newb);
                cpns2.setK(newk);
                System.out.println("======================================");
                System.out.println("Nama                 : " + cpns2.getN());
                System.out.println("Agama                : " + cpns2.getA());
                System.out.println("Jenis Kelamin        : " + cpns2.getJ());
                System.out.println("Jabatan              : " + cpns2.getB());
                System.out.println("NIK                  : " + cpns2.getK());
                System.out.println("======================================");
            }
        } catch (IndexOutOfBoundsException | NumberFormatException e) {
            System.out.println(e.getMessage());
        }

        isEditing = false;
        kembali();
    }
    static void menuHapus(){
        isEditing = true;
        menuLihat();

        System.out.println("===============================");
        System.out.print("Pilih Data yang ingin dihapus: ");
        int index = Integer.parseInt(input.nextLine());
        System.out.println("===============================");

        try {
            if (index > nama.size()) {
                throw new IndexOutOfBoundsException("Kamu memasukan data yang salah!");
            } else {

                System.out.println("Kamu akan menghapus Index ke " + (index-1));
                System.out.println("Apa kamu yakin?");
                System.out.print("Jawab (y/t): ");
                String jawab = input.nextLine();

                if (jawab.equalsIgnoreCase("y")) {
                    nama.remove(index-1);
                    agama.remove(index-1);
                    jenis_kelamin.remove(index-1);
                    jabatan.remove(index-1);
                    nik.remove(index-1);
                }
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        isEditing = false;
        kembali();
    }
    static void kembali() {
        System.out.println("");
        System.out.print("Tekan Enter untuk kembali!!!");
        input.nextLine();
        clearScreen();
    }
}  
