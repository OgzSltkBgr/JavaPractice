package practice0811.depoYonetimi.depoYonetimi;

public class Urunler {
    public String urunIsmi;
    public String uretici;
    public String birimi;
    public int id;
    public double miktar;
    public String rafNo;

    public Urunler() {
    }
    public Urunler(String urunIsmi, String uretici, String birimi, int id) {
        this.urunIsmi = urunIsmi;
        this.uretici = uretici;
        this.birimi = birimi;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Urunler{" +
                "urunIsmi='" + urunIsmi + '\'' +
                ", uretici='" + uretici + '\'' +
                ", birimi='" + birimi + '\'' +
                ", id=" + id +
                ", miktar=" + miktar +
                ", rafNo='" + rafNo + '\'' +
                '}';
    }
}
