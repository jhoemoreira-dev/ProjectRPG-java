package system;
import factory.FichasRPGFactory;
import model.FichaRPG;
import java.util.Locale;
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

FichaRPG jogador7 = FichasRPGFactory.criarGuerreiroDasSombras();

        jogador7.ganharXP(100);

        System.out.println(jogador7);


        sc.close();
    }
}








