package comn.rifqi.Modul2.Inheritance;

public class B extends A {
    public int z;
    // variabel x dan z mewarisi class A
    public void sumValue(){
        System.out.println("Jumlah\t: "+ (x+y+z));
    }
}