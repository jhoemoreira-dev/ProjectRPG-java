/*
Arquivo ClasseRPG:

Aqui é possível manipular os arquivos adicionados e fazer a chamada das classes tratando elas como um tipo de variável.
(StatusRPG e ArrayList<Habilidades>)
Através do atributo aqui criado 'private String nome;' é possível determinar o nome das classes no arquivo 'FichasRPGFactory.java'.

*/


import java.util.ArrayList;

public class FichaRPG {

    private String nome;
    private StatusRPG status;
    private ArrayList<Habilidades> habilidades;
    private int lvlUp;
    private int xpAtual;
    private double xpNecessario;
    private ClasseBase classeBase;


    public FichaRPG(String nome, ClasseBase classeBase, StatusRPG status) {
        this.nome = nome;
        this.classeBase = classeBase;
        this.habilidades = new ArrayList<>();
        this.status = status;
        this.lvlUp = 1;
        this.xpAtual = 0;
        this.xpNecessario = 1500;
    }

    public void mostrarHabilidades(Habilidades habilidades) {
        this.habilidades.add(habilidades);
    }


    public void ganharXP(int xpGanho) {
        xpAtual = xpGanho;
        System.out.println("\nRecebeu " + xpAtual + " XP!");

        subirNivel();
    }

    public void subirNivel() {
        if (xpAtual >= xpNecessario) {
            xpAtual -= xpNecessario;
            lvlUp++;
            System.out.println("\nParabéns! Você Subiu de Nível!\nSeu Nível Atual é: " + lvlUp + "");
            status.ptArmadura += classeBase.getArmaduraPorNivel();
            status.vida += classeBase.getHpPorNivel();
            status.mana += classeBase.getManaPorNivel();
            status.furiaBase += classeBase.getFuriaPorNivel();
            status.danoBase += classeBase.getDanoPorNivel();
            status.forca += classeBase.getForcaPorNivel();
            status.destreza += classeBase.getDestrezaPorNivel();
            status.mentalidade += classeBase.getMentalidadePorNivel();
            status.resistencia += classeBase.getResistenciaPorNivel();
            status.inteligencia += classeBase.getInteligenciaPorNivel();
            xpNecessario *= 1.7;
        }
    }


    public String toString() {

        String listaHabilidades = "";


        for (Habilidades h : habilidades) {
            listaHabilidades += "\n\n" + h;
        }

        return
                "\n\n========== FICHA DO PERSONAGEM ==========\n" +
                        "Classe:         " + nome +
                        "\nNível:        " + lvlUp +
                        "\nArmadura:     " + status.ptArmadura +
                        "\nHP:           " + status.vida +
                        "\nFúria:        " + status.furiaBase +
                        "\nMana:         " + status.mana +
                        "\nDano Base:    " + status.danoBase +
                        "\nForça:        " + status.forca +
                        "\nDestreza:     " + status.destreza +
                        "\nMentalidade:  " + status.mentalidade +
                        "\nResistência:  " + status.resistencia +
                        "\nInteligência: " + status.inteligencia +
                        "\n\nXP Atual:   " + xpAtual +
                        "\nXP Para Subir de Nível:     " + xpNecessario +


                        "\n\n========== Habilidades do Personagem ==========" +
                        listaHabilidades;

    }

}














