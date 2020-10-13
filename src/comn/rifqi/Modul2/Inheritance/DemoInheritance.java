package comn.rifqi.Modul2.Inheritance;

public class DemoInheritance {
    public static void main(String[] args) {
        // deklarasikan objek
        A superClass = new A();
        B subClass = new B();

        System.out.println("Masukkan data ke SuperClass");
        // memanggil superclass atau parent
        superClass.x = 3;
        superClass.y = 4;
        superClass.printXY();

        // member superclass dapat diakeses ke subclass
        System.out.println("Masukkan data ke SubClass");
        // memanggil subclass atau child
        subClass.x = 30;
        subClass.y = 40;
        subClass.z = 10;
        subClass.printXY();
        subClass.sumValue();
    }
}
