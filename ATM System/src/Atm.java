import java.util.Scanner;

public class Atm {
    public void System(){
        int Bakiye = 0;
        int hata = 3;
        Menu menu = new Menu();
        while (true) {
            menu.M();
            Scanner sc = new Scanner(System.in);
            int choose;
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("YATIRMAK İSTEDİĞİNİZ MİKTARI GİRİNİZ");
                    int Yatir = sc.nextInt();
                    if (Yatir <= 0 ) {
                        System.out.println("HESABINIZA " + Yatir + " TL MİKTARDA PARA YATIRAMAZSINIZ.");
                        break;
                    }
                    Bakiye = Bakiye + Yatir;
                    System.out.println("YENİ BAKİYENİZ " + Bakiye + " TL");

                    break;
                case 2:
                    System.out.println("ÇEKMEK İSTEDİĞİNİZ MİKTARI GİRİNİZ");
                    int Cek = sc.nextInt();
                    if (Cek <= 0 ) {
                        System.out.println("HESABINIZAN " + Cek + " TL MİKTARDA PARA ÇEKEMEZSİNİZ.");
                        break;
                    }
                    if (Cek > Bakiye) {
                        System.out.println("HESABINIZDA " + Cek + " TL MİKTARDA PARA BULUNMAMAKTADIR.");
                        break;
                    }

                    Bakiye = Bakiye - Cek;
                    System.out.println(Cek + " TL ÇEKTİNİZ");
                    System.out.println("YENİ BAKİYENİZ " + Bakiye + " TL");
                    break;
                case 3:
                    System.out.println("BAKİYENİZ " + Bakiye + " TL");
                    break;
                case 4:
                    System.out.println("Çıkış Yapılıyor...");
                    return;
                default:
                    hata -= 1;
                    System.out.println("HATALI GİRİŞ YAPTINIZ!");
                    System.out.println("HATA YAPMA HAKKINIZ " + hata + " KALDI...");
            }
            if (hata == 0) {
                System.out.println("LİMİTİ AŞTINIZ PROGRAMDAN ÇIKILIYOR...");
                return;
            }

        }
    }
}