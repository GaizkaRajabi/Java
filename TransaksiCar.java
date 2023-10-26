package kuis;

public class TransaksiCar {
    private PemesanCar pemesan;
    private double hargaSedan = 20000;
    private double hargaSUV = 30000;
    private double hargaLCGC = 25000;
    private double hargacucimobil = 200000;
    private double salonmobilinterrior = 260000;
    private double salonmobileksterior = 250000;
    private double teamsea = 100000;
    private double teammountain = 200000;
    private double teamforest = 250000;

    public TransaksiCar(PemesanCar pemesan) {
        this.pemesan = pemesan;
    }

    public double hitungBiaya() {
        String jenismobil = pemesan.getjenismobil();
        String jenisjasa = pemesan.getjenisjasa();
        String pjenis = pemesan.getpjasa();

        double biayamobil = 0;
        if (jenismobil.equalsIgnoreCase("Sedan")) {
            biayamobil = hargaSedan;
        } else if (jenismobil.equalsIgnoreCase("SUV")) {
            biayamobil = hargaSUV;
        } else if (jenismobil.equalsIgnoreCase("LCGC")) {
            biayamobil = hargaLCGC;
        }
        
        double biayacuci = 0;
        if (jenisjasa.equalsIgnoreCase("Cuci Mobil")) {
            biayacuci = hargacucimobil;
        } else if (jenisjasa.equalsIgnoreCase("Salon Mobil Interior")) {
            biayacuci = salonmobilinterrior;
        } else if (jenisjasa.equalsIgnoreCase("Salon Mobil Eksterior")) {
            biayacuci = salonmobileksterior;
        }

        double biayateam = 0;
        if (pjenis.equalsIgnoreCase("Team Sea")) {
            biayateam =teamsea;
        } else if (pjenis.equalsIgnoreCase("Team Mountain")) {
            biayateam = teammountain;
        } else if (pjenis.equalsIgnoreCase("Team Forest")) {
            biayateam= teamforest;
        }

        return biayamobil + biayacuci + biayateam;
    }

    public void tampilkanTransaksi() {
        System.out.println("Transaksi:");
        pemesan.tampilkanDataPemesan();
        double biaya = hitungBiaya();
        System.out.println("Biaya: $" + biaya);
}
}