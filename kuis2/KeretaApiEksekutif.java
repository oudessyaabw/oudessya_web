package jti.polinema.kuis2;

public class KeretaApiEksekutif extends KeretaApiEkonomi implements LayananExtra{
    @Override
    public int karaoke() {
        return 1000;
    }

    @Override
    public int restorasi() {
        return 2000;
    }
}
