import java.util.Scanner;

public class deneme16{
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        double a;
        double b;
        double secim;

        System.out.println("A Sayısını giriniz : ");
        a=input.nextInt();
        System.out.println("B Sayısını Giriniz : ");
        b=input.nextInt();

        System.out.println("Yapacağınız İşlemi Seçiniz : ");
        System.out.println("1 - Toplama \t 2 - Çıkarma \t 3 - Çarpma \t 4 - Bölme");

        System.out.println("Seçiminiz : ");
        secim=input.nextDouble();

        if(secim==1){
            System.out.println("Toplama : "+ (a+b));
        }else if (secim==2){
            System.out.println("Çıkarma : "+ (a-b) );
        }else if (secim==3){
            System.out.println("Çarpma : "+ (a*b));
        }else if (secim==4){
            
            if(b==0){
                System.out.println("İkinci Sayı 0'a Eşittir ve Sonuç Belirsizdir ! ");
            }else {
                System.out.println("Bölme : "+ (a/b));
            }
            
        }
    }
}
