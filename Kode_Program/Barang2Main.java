package Pertemuan2.Kode_Program;

public class Barang2Main {
    public static void main(String[] args) {
        Barang2 b2 = new Barang2();
        b2.nama = "Yaudah";
        b2.jumlah = 3;
        b2.hargaSatuan = 100000;
        int total = b2.hitungHargaTotal(3);
      double diskon = b2.hitungDiskon(total);
       double bayar = b2.hitungHargaBayar(diskon, total);
        System.out.println("Harga Total = "+total);
        System.out.println("Diskon = "+diskon);
        System.out.println("Harga 3 Buah = " + bayar);
        b2.tampilBarang();
    }
}
