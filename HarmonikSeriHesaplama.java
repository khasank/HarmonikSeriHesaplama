package Giris;

import java.util.Scanner;

public class HarmonikSeriHesaplama {
    public static void main(String[] args) {
    int n = 0 ;
    double sonuc = 0.0;

        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz : ");
        n = input.nextInt();

        System.out.println("Harmonik Sayılar :");
        for (int i = 1 ; i <= n ; i++ ) {

            sonuc += (1.0 / i);
            System.out.printf("\n"+ i + ". Harmonik  : %.2f ", sonuc);

        }
    }
}
