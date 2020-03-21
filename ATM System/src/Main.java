
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Login login = new Login();

        Atm atm = new Atm();

        login.Kullanıcı();//IF YOU WANT TO CHANGE NAME OR PASSWORD, GO TO LOGIN CLASS!!!

        atm.System();
    }

}
