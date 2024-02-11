public class JavaIleKabarcikSiralamasiAlg {
    void kabarcikSiralamaAlg(){
        int[] sayilar = new int[20];
        for (int i = 0; i < sayilar.length; i++) {
            sayilar[i] = ((int) (Math.random() * 100) + 1);
        }
        System.out.println("Random üretilen sayı dizisi");
        for (int sayi:sayilar){
            System.out.print(" " + sayi);
        }
        System.out.println(" \n Sıralanmış sayı dizisi");
        int k = 0;
        for (k = 0; k < sayilar.length; k++) {
            for (int i = k + 1; i < sayilar.length; i++) {
                if (sayilar[k] < sayilar[i]) {
                    int j = sayilar[k];
                    sayilar[k] = sayilar[i];
                    sayilar[i] = j;
                }
            }
            System.out.print(" " + sayilar[k]);
        }
    }
}