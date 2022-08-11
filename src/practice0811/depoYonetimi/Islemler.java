package practice0811.depoYonetimi;

import java.util.*;
public class Islemler extends Urunler {
    static Map<Integer, String> mapUrunListesi = new HashMap<>();
    static Scanner scan = new Scanner(System.in);
    static int id = 100;
    static int miktar = 0;
    static String raf = "Atanmadı";

    public static void girisMenusu() {
        System.out.println("***********HOŞGELDİNİZ************");
        System.out.println("------>İŞLEM TERCİHİ YAPINIZ<------\n" +
                "1-->Ürün tanımlama     \n" +
                "2-->Ürün Girişi           \n" +
                "3-->Ürün Listeleme        \n" +
                "4-->Ürün Rafa Yerleştirme \n" +
                "5-->Ürün Çıkışı           \n" +
                "6-->Çıkış                 \n");

        int secim = scan.nextInt();
        switch (secim) {
            case 1:
                urunTanımlama();
                girisMenusu();
                break;
            case 2:
                urunGirisi();
                girisMenusu();
                break;
            case 3:
                urunListele();
                girisMenusu();
                break;
            case 4:
                rafaYerlestırme();
                girisMenusu();
                break;
            case 5:
                urunCıkıs();
                girisMenusu();
                break;
            case 6:
                cıkıs();
                break;
            default:
                System.out.println("Yanlış Seçim yaptınız");
        }
    }


    private static void urunTanımlama() {
        System.out.println("-----> Ürün Tanımlama Sayfası <-----");
        System.out.println("Lütfen tanımlamak istediğiniz ürünün ismini giriniz");
        scan.nextLine();//dummy
        String urunIsmı = scan.nextLine().toUpperCase();
        System.out.println("ürünün üreticisini giriniz");

        String uretıcı = scan.nextLine().toUpperCase();
        System.out.println("Ürün birimini giriniz");
        String birim = scan.nextLine().toUpperCase();
        String value = "Ürün adı:" + urunIsmı + ", Üretici:" + uretıcı + ", Birim:" + birim + ", "
                + miktar + ", Raf:" + raf;//map e atacagım value tek strıng olmalı.
        mapUrunListesi.put(id, value);//map e urune aıt bılgıler key-value olarak atandı

        System.out.println("Ürün güncellemesi tamamlandı\nÜrününüz--->" + id + "=" + mapUrunListesi.get(id));
        System.out.println("depodakı tum urun listesi-->" + mapUrunListesi);
        id++;
    }

    private static void urunGirisi() {

        System.out.println("----->Ürün Giriş Sayfası<-----");
        System.out.println("Lütfen ekleme yapmak istediğiniz ürünün id numarasını giriniz");
        int idNo = scan.nextInt();
        boolean flag = false;
        if (mapUrunListesi.keySet().contains(idNo)) {
            flag = true;
            System.out.println("Lütfen ürüne eklemek istediğiniz miktarın birimini giriniz");
            String birim = scan.next().toUpperCase();
            if (mapUrunListesi.get(idNo).contains(birim)) {
                System.out.println("Lütfen eklemek istediğiniz mıktarı gırınız");
                int mıktar = scan.nextInt();

                String arr[][] = valuelereUlas();
                int valuedekıMıktar = Integer.parseInt((arr[idNo - 100][3]));
                valuedekıMıktar += mıktar;
                String yeniValue = arr[idNo - 100][0] + ", " + arr[idNo - 100][1] + ", " + arr[idNo - 100][2] +
                        ", " + valuedekıMıktar + ", " + arr[idNo - 100][4];
                mapUrunListesi.computeIfPresent(idNo, (k, v) -> v != null ? v = yeniValue : null);

                System.out.println("ekleme işleminiz gerçekleşmiştir.");
                System.out.println("Ürün--->" + mapUrunListesi.get(idNo));

            }
        }
        if (!flag) {
            System.out.println("bu ıd numarası ile eşleşen ürün mevcut değildir");
            urunGirisi();
        }


    }

    private static void urunListele() {
        System.out.println("-----> Depodaki Ürün Listesi <-----");
        System.out.println(mapUrunListesi);

    }

    private static void rafaYerlestırme() {
        System.out.println("----> Raf numarası verme sayfası<----");
        System.out.println("Raf numarası vermek istediğiniz ürünün id numarasını gırınız");
        int idNo = scan.nextInt();
        boolean flag = false;
        if (mapUrunListesi.keySet().contains(idNo)) {
            flag = true;
            System.out.println("Lütfen ürüne vermek istediğiniz raf ismini giriniz");
            String rafIsmı = scan.next();
            String arr[][] = valuelereUlas();

            arr[idNo - 100][4] = ", Raf:" + rafIsmı;
            String yeniValue = arr[idNo - 100][0] + ", " + arr[idNo - 100][1] + ", " + arr[idNo - 100][2]
                    + ", " + arr[idNo - 100][3] + ", " + arr[idNo - 100][4];
            mapUrunListesi.computeIfPresent(idNo, (k, v) -> v != null ? v = yeniValue : null);

            System.out.println("Ürün rafa yerleştirildi");
            System.out.println(mapUrunListesi.get(idNo));
        }

        if (!flag) {
            System.out.println("bu id numarası ile eşleşen urun mevcut değildir");
        }
    }

    private static void urunCıkıs() {
        System.out.println("---->Ürün çıkış sayfası<----");
        System.out.println("lütfen ürün çıkışı yapmak istediğiniz ürünün id numarasını gırınız");
        int idNo = scan.nextInt();
        boolean flag = false;
        if (mapUrunListesi.keySet().contains(idNo)) {
            flag = true;
            System.out.println("Lütfen çıkışını yapmak istediğiniz ürün için mıktar gırınız");
            int mıktar = scan.nextInt();

            String arr[][] = valuelereUlas();
            int valuedekıMıktar = Integer.parseInt((arr[idNo - 100][3]));
            if (valuedekıMıktar >= mıktar) {
                valuedekıMıktar -= mıktar;
                String yeniValue = arr[idNo - 100][0] + ", " + arr[idNo - 100][1] + ", "
                        + arr[idNo - 100][2] + ", " + valuedekıMıktar + ", " + arr[idNo - 100][4];
                mapUrunListesi.computeIfPresent(idNo, (k, v) -> v != null ? v = yeniValue : null);

                System.out.println("Ürün çıkış işleminiz gerçekleşmiştir.");
                System.out.println("Ürün--->" + mapUrunListesi.get(idNo));
            } else System.out.println("depoda girdiğiniz miktar kadar ürün bulunmamaktadır");


        }


        if (!flag) {
            System.out.println("bu id numarası ıle eşleşen urun mevcut değildir");
        }
    }

    private static void cıkıs() {
        System.out.println("Yine bekleriz");
    }

    private static String[][] valuelereUlas() {
        Collection<String> values = mapUrunListesi.values();//value ler collectıon a atıldı
        List<String> valueLıst = new ArrayList<>(values);//collactıon yapısındakı valueler list yapısına atıldı

        //valulerde en içtekı elemente ulaşmak için multı dıemensınol array yapısına cevırmek gerk
        int outer = valueLıst.size();

        String ilkValue = valueLıst.get(0);//(urun adı, urun uretıcı, bırımı,raf,mıktar)
        String ilkValueArray[] = ilkValue.split(", ");
        int inner = ilkValueArray.length;

        String arr[][] = new String[outer][inner];
        for (int i = 0; i < outer; i++) {
            String array[] = valueLıst.get(i).split(", ");
            for (int j = 0; j < array.length; j++) {
                arr[i][j] = array[j];// value ler artık ıkı katlı array yapısı ıle elımızde.

            }

        }
        return arr;
    }
}

