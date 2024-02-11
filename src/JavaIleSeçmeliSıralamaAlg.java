public class JavaIleSeçmeliSıralamaAlg {
    void secmeliSiralamaAlg(){
        int[] sayilar = new int[10];
        for (int i = 0; i < sayilar.length; i++) {
            sayilar[i] = ((int) (Math.random() * 100) + 1);
        }
        System.out.print("Random üretilen sayı dizisi: ");
        for (int sayi : sayilar) {
            System.out.print(" " + sayi);
        }

        int enKucukIndis,geciciDegisken;
        for (int i = 0; i < sayilar.length; i++) {
            enKucukIndis = i;
            for (int j = i + 1; j < sayilar.length; j++) {
                if (sayilar[enKucukIndis] > sayilar[j]) {
                    enKucukIndis = j;
                }
            }
            geciciDegisken=sayilar[enKucukIndis];
            sayilar[enKucukIndis]=sayilar[i];
            sayilar[i]=geciciDegisken;

        }

        System.out.print("\nSıralanmış sayı dizisi: ");
        for (int sayi : sayilar) {
            System.out.print(" " + sayi);
        }
    }
}
