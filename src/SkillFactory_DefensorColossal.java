//Arquivo dedicado a criação de habilidades da classe: Defensor Colossal.

public class SkillFactory_DefensorColossal {
    public static Habilidades criarForteImpacto(){
        return new Habilidades(1,
                "Forte Impacto",
                "Ao golpear o inimigo, causa Atordoamento por 1T com chance de 80%",
                30,
                0
        );
    }

    public static Habilidades criarImpactoUnilateral(){
        return new Habilidades(
                1,
                "Impacto Unilateral",
                "Golpeia o oponente com chance de derruba-lo de 40%.",
                80,
                0
        );
    }

    public static Habilidades criarEscudeiroDesenfreado(){
        return new Habilidades(
                3,
                "Escudeiro Desenfreado",
                "Corre em grande velocidade em linha reta, tendo a chance de Atordoamento de 40%.",
                85,
                10
        );
    }

    public static Habilidades criarAgressao(){
        return new Habilidades(
                4,
                "Agressão",
                "Provoca inimigos a lhe atacar, reduzindo o ataque em 40% por 2T (Chance de 60%).",
                0,
                15
        );
    }

    public static Habilidades criarJulgamentoColossal(){
        return new Habilidades(
                5,
                "Julgamento Colossal",
                "Evita o dano ao alvo e reflete o dano recebido em 80% por 3T || Chance de Atordoamento 50% por 2T.",
                100,
                60
        );
    }
}
