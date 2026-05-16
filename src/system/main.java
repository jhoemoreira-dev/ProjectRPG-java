package system;
import factory.FichasRPGFactory;
import model.FichaRPG;
import java.util.Locale;
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

FichaRPG jogador1 = FichasRPGFactory.criarBatedorFurioso();

        jogador1.ganharXP(1600);

        System.out.println(jogador1);


        sc.close();
    }
}








