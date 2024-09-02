public class UrunYonetimi {
    public Urun urun;

    public UrunYonetimi(Urun urun) {
    this.urun = urun;
    }

    //METHODLAR
    public void ekle() {
        System.out.println("ürün eklendi. :" + urun.isim);
    }
    public void güncelle() {
        System.out.println("ürün güncellendi. :" + urun.katagori);
    }
    public void sil() {
        System.out.println("ürün silindi. :" + urun.stok);
    }

}
