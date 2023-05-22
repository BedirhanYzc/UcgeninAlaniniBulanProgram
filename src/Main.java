import java.util.Scanner;
public class UcgeninAlaniniBulanProgram {
    public static void main(String[] args) {
        // Değişkenleri tanımlayalım

        int a,b,c;

        // Scanner sınıfımızı oluşturalım

        Scanner girdi = new Scanner(System.in);

        // Kullanıcıdan veri alalım

        System.out.print("Birinci kenarı giriniz: ");
        a = girdi.nextInt();

        System.out.print("İkinci kenarı giriniz: ");
        b = girdi.nextInt();

        System.out.print("Üçüncü kenarı giriniz: ");
        c = girdi.nextInt();

        double u = (a + b + c) / 2;
        double alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));
        System.out.print("Üçgenin alanı: " + alan);



    }
}