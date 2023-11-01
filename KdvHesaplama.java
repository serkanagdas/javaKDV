import java.util.Scanner;
public class KdvHesaplama {
    public static void main(String[] args) {
        //kullanıcıdan fiyat bilgisi alınır
        double a ,kdvOran, kdvTutar , toplamTutar;
        Scanner input=new Scanner(System.in);
        System.out.print("Bir tutar giriniz: ");
        a=input.nextDouble();
        //if koşul ifadesi kullanmadan burada 0<a<1000 arasındaysa kdv oranını 0.18 değilse 0.10 aldık.
        kdvOran = a>0&&a<1000 ? 0.18:0.10;
        kdvTutar = a*kdvOran;
        toplamTutar=a+kdvTutar;
        //Deneme
        System.out.println("Tutarınız: "+a);
        System.out.println("Kdv oranı: "+kdvOran);
        System.out.println("Kdv tutarı: "+kdvTutar);
        System.out.println("Toplam kdv li tutar: "+toplamTutar);


    }
}


