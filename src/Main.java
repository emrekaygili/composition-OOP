//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Urun urun1 =new Urun("Alarko kombi","Beyaz eşya",45000 ,17 ,58);

    UrunYonetimi urunYonetimi = new UrunYonetimi(urun1);

    urunYonetimi.ekle();
    urunYonetimi.sil();
    urunYonetimi.güncelle();

    }
}