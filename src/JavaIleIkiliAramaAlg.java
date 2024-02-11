public class JavaIleIkiliAramaAlg {
    // Dizide bir elemanı arayan ikiliAramaAlg metodu
    // dizi: Sıralı dizi
    // aranan: Aranan eleman
    // başlangıç: Aramanın başlayacağı indeks
    // son: Aramanın biteceği indeks
    public static int ikiliAramaAlg(int[] dizi, int aranan, int baslangic, int son) {
        if (son >= baslangic) {
            int orta = baslangic + (son - baslangic) / 2;

            // Ortadaki eleman aranan eleman mı?
            if (dizi[orta] == aranan)
                return orta;

            // Eğer aranan eleman ortadaki elemandan küçükse, sol tarafta ara
            if (dizi[orta] > aranan)
                return ikiliAramaAlg(dizi, aranan, baslangic, orta - 1);

            // Eğer aranan eleman ortadaki elemandan büyükse, sağ tarafta ara
            return ikiliAramaAlg(dizi, aranan, orta + 1, son);
        }

        // Eleman dizide bulunamadı
        return -1;
    }

    public static void main(String[] args) {
        int[] dizi = { 2, 3, 4, 10, 40 };
        int arananEleman = 10;
        int n = dizi.length;
        int sonuc = ikiliAramaAlg(dizi, arananEleman, 0, n - 1);
        if (sonuc == -1)
            System.out.println("Eleman bulunamadı.");
        else
            System.out.println("Eleman " + sonuc + ". indekste bulundu.");
    }
}
