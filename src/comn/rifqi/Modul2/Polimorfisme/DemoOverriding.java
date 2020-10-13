package comn.rifqi.Modul2.Polimorfisme;

public class DemoOverriding {
    public static void main(String[] args) {
        // deklarasi objek
        X superClass = new X();
        Y subClass = new Y();

        // memanggil class parent dan child
        superClass.getValue("Tidur");
        subClass.getValue("Makan");
    }
}
