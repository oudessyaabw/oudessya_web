package jti.polinema.kuis2;

public class Pembayaran {
    public int bayar(LayananExtra le) {
        int total = 0;
        if (le instanceof KeretaApiEksekutif) {
            total = (
                    (KeretaApiEksekutif) le).getHargaTiket() +
                    le.karaoke() +
                    le.restorasi();
        } else if (le instanceof KapalPesiar) {
            total = ((KapalPesiar) le).getHargaTiket() +
                    ((KapalPesiar) le).getBiayaVisa() +
                    ((KapalPesiar) le).getBiayaReservasi() +
                    le.karaoke() +
                    le.restorasi();
        } else if (le instanceof Pesawat) {
            total = ((Pesawat) le).getHargaTiket() +
                    ((Pesawat) le).getBiayaCheckIn() +
                    le.karaoke() +
                    le.restorasi();
        }
        return total;
    }
}
