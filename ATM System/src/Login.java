import java.util.Scanner;

public class Login {
    Scanner scanner = new Scanner(System.in);
    String Name;
    String Password;
    int girishakki = 3;
    public void Kullanıcı() {


        while (true) {
            System.out.println("ADINIZI GİRİNİZ");
            Name = scanner.nextLine();
            System.out.println("ŞİFRENİZİ GİRİNİZ");
            Password = scanner.nextLine();
            if (Name.equals("MUHAMMED GÜVEN") && Password.equals("123456")) {//NAME - PASSWORD IN HERE!!!
                System.out.println("GİRİŞ BAŞARILI");
                break;
            } else {
                System.out.println("HATALI GİRİŞ YAPTINIZ");
                girishakki--;
                System.out.println("GİRİŞ HAKKI " + girishakki + " KALDI");
            }
            if (girishakki == 0) {
                System.out.println("GİRİŞ BAŞARISIZ");
                System.exit(0);
                return;

            }

        }

    }
}
