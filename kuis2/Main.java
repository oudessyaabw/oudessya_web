package jti.polinema.kuis2;

public class Main {
    public static void main(String[] args) {
        Pembayaran p = new Pembayaran();
        KeretaApiEksekutif kae = new KeretaApiEksekutif();
        kae.setHargaTiket(2000);
        System.out.println("Harga total kereta api eksekutif = " + p.bayar(kae));
        Pesawat pes = new Pesawat();
        pes.setHargaTiket(5000);
        pes.setBiayaCheckIn(1000);
        System.out.println("Harga total pesawat = " + p.bayar(pes));
    }
}
