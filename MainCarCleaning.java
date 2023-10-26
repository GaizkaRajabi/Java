package kuis;

public class MainCarCleaning {
    public static void main(String[] args) {
          PemesanCar pemesan = new PemesanCar();
        pemesan.inputDataPemesan();

        TransaksiCar transaksi = new TransaksiCar(pemesan);
        transaksi.tampilkanTransaksi();
    }

}
  