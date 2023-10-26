package kuis;

import java.util.Scanner;

public class PemesanCar {
    private String nama;
    private String nomorTelepon;
    private String alamat;
    private String jenisjasa;
    private String pjasa;
    private String email;
    private String jenismobil;

    public void inputDataPemesan() {
        Scanner input = new Scanner(System.in);
        System.out.println("--- Car Cleaning.. Anda Pesan Kami Bayar---");
        System.out.println("===========================================");
        System.out.println("--------------------oOo--------------------");
        System.out.println("*Masukan Data Pemesan*");
        System.out.print("Masukan Nama     : ");
        nama = input.nextLine();
        System.out.print("Masukan Alamat    :");
        alamat = input.nextLine();
        System.out.print("Masukan No. TLP   : ");
        nomorTelepon = input.nextLine();
        System.out.print("Masukan Email     :");
        email = input.nextLine();
        System.out.println();
        System.out.println("Jenis Mobil:");
        System.out.println("Sedan");
        System.out.println("SUV");
        System.out.println("LCGC");
        System.out.print("Pilih Mobil : ");
        jenismobil = input.nextLine();
        System.out.println();
        System.out.println("Jenis Jasa: ");
        System.out.println("Cuci Mobil");
        System.out.println("Salon Mobil Interior");
        System.out.println("Salon Mobil Eksterior");
        System.out.print("Pilih Jasa : ");
        jenisjasa = input.nextLine();
        System.out.println();
        System.out.println("Team Penyedia Jasa: ");
        System.out.println("Team Sea (2 orang)");
        System.out.println("Team Mountain (4 orang)");
        System.out.println("Team Forest (5 orang)");
        System.out.print("Pilih Team : ");
        pjasa = input.nextLine();
    }

    public void tampilkanDataPemesan() {
        System.out.println("--------------------oOo--------------------");
        System.out.println("===========================================");
        System.out.println("Data Pemesan:");
        System.out.println("Nama                : " + nama);
        System.out.println("Nomor Telepon       : " + nomorTelepon);
        System.out.println("Alamat              : " + alamat);
        System.out.println("Email               : " + email );
        System.out.println("Jenis Mobil         : " + jenismobil); 
        System.out.println("Jasa yang di pesan  : " + jenisjasa);
        System.out.println("Nama Penyedia Jasa  : " + pjasa);
    }

    public String getjenismobil () {
        return jenismobil;
    }
    public String getjenisjasa() {
        return jenisjasa;
    }
    public String getpjasa () {
        return pjasa;
    }
}
