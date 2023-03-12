import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int km,minPayPrice=20;
        double perKm =2.20, total, startPrice=10;
        Scanner input = new Scanner(System.in);

        System.out.println("Mesafeyi KM cinsinden giriniz : ");

        km = input.nextInt();
        total = (km*perKm);
        total+=startPrice;

        total = (total<=minPayPrice)? minPayPrice: total;


        System.out.println("Toplam Tutar : " + total + " TL");



    }
}














