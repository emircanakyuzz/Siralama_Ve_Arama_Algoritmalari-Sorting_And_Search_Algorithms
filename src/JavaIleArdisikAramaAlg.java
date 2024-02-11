import java.util.Scanner;

public class JavaIleArdisikAramaAlg {
    void ardisikAramaAlg(){
        int[] sayilar = new int[30];
        for (int i = 0; i < sayilar.length; i++) {
            sayilar[i] = ((int) (Math.random() * 100) + 1);
        }
        System.out.println("Random üretilen sayı dizisi");
        for (int sayi : sayilar) {
            System.out.print(" " + sayi);
        }

        Scanner input = new Scanner(System.in);
        System.out.println( "\n" + "Aramak istediğiniz sayıyı giriniz.");
        int aranacakSayi = input.nextInt();
        boolean sayiVarMi=false;

        int l=0;
        for (int k=0;k< sayilar.length;k++){
            if (sayilar[k]==aranacakSayi){
                sayiVarMi=true;
                l=k;
            }
        }

        if (sayiVarMi){
            System.out.println("Sayı mevcut. İndisi: " + l );
        }
        else System.out.println("Sayı mevcut değil!");



        int i=0;
        for (int j = 0; j < sayilar.length; j++) {
            if (sayilar[j] == aranacakSayi) {
                System.out.println("Aradığınız sayı dizide mevcut. İndis sayısı: " + j);
                break;
            }
            else i=i+1;
        }
        if (i==10){
            System.out.println("Aradığınız sayı dizide mevcut değil.");
        }
        input.close();
    }
}
