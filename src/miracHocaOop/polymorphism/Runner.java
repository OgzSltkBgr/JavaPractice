package miracHocaOop.polymorphism;

public class Runner {
    public static void main(String[] args) {

        Civciv civciv1 = new Civciv();
        Animal animal= new Civciv();
        Ordek ordek1 = new Ordek();

        hayvanSesiCikar(civciv1);
        hayvanSesiCikar(ordek1);
    }

    public static void hayvanSesiCikar(Animal bos) {
        bos.sesiCikar();
    }
}
