public class SkillFactory_AnciaoNegro {
    public static Habilidades criarEsferaNegra(){
        return new Habilidades(
                1,
                "Esfera Negra",
                "Chance de causar maldição ao alvo: 30% || Maldição: -100HP por 2T",
                70,
                10
        );




    }

    public static Habilidades criarNevoaMaldita(){
        return new Habilidades(
                2,
                "Névoa Maldita",
                "Chance de causar maldição no alvo: 30%, caso não tenha sucesso, potencializa o dano dos debuffs em 20% || Maldição: -150HP por 2T",
                0,
                15
        );
    }

    public static Habilidades criarCuraSombria(){
        return new Habilidades(
                3,
                "Cura Sombria",
                "Absorve HP do aliado selecionado em até 20%",
                0,
                15
        );
    }

    public static Habilidades criarRaioNegro(){
        return new Habilidades(
                4,
                "Raio Negro",
                "Permite a conjuração de uma magia extra em troca de 30% de HP, além de chance de paralisar o oponente em 30% por 1T",
                120,
                40
        );
    }

    public static Habilidades criarInvocacaoNegra(){
        return new Habilidades(
                5,
                "Invocação Negra",
                "Invoca um guerreiro das sombras para lutar ao seu lado",
                0,
                100
        );
    }
}
