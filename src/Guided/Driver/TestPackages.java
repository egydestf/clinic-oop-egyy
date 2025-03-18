package Guided.Driver;

import Guided.HargaBuku.KelasHarga;
import Guided.HargaToken.KelasToken;

public class TestPackages {
    public static void main(String[] args) {
        KelasToken token = new KelasToken();
        KelasHarga harga = new KelasHarga();
        token.info();
        harga.info();
    }
}
