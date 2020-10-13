package comn.rifqi.Modul2.Polimorfisme;

public class DemoOverloading {
    public static void main(String[] args) {
        // deklarasi objek dengan paramater
        Lagu lagu1 = new Lagu("Tarik Siis, Semongko");
        Lagu lagu2 = new Lagu("Ku Menangis", "Rossa");

        // mencetak data dari setiap parameter
        lagu1.getDataLagu();
        lagu2.getDataLagu();
    }
}
