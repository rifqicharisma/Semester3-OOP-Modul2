package comn.rifqi.Modul2.VMI;

public class DemoVMI {
    public static void main(String[] args) {
        // deklarasi objek
        Child child = new Child();
        Parent parentChild = new Parent();

        // mengambil data dari class parent dan child
        child.getData();
        parentChild.getData();
    }
}
