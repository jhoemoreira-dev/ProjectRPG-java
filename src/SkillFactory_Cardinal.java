//Arquivo dedicado a criação de habilidades da classe: Cardinal.

public class SkillFactory_Cardinal {
    public static Habilidades criarMaosCurativas(){
        return new Habilidades(1,
                "Mãos Curativas",
                "Cura o alvo equivalente a 25% de seu HP e Armadura atual.",
                0,
                5
        );
    }

    public static Habilidades criarQueimaAlmas(){
        return new Habilidades(1,
                "Queima Almas",
                "(Dano celestial +150) em alvos em Flag* || Flag: Humanos Corrompidos pelo poder.",
                100,
                15
        );
    }

    public static Habilidades criarProfecia(){
        return new Habilidades(
                3,
                "Profecia",
                "Reduz o dano físico e mágico em 25% por 3T",
                0,
                20
        );
    }

    public static Habilidades criarChamdsDoEsplendor(){
        return new Habilidades(
                4,
                "Chamas do Esplendor",
                "Aumenta a vida e mana máxima atual em 25% por 3T",
                0,
                35
        );
    }

    public static Habilidades criarFascinioMiraculoso(){
        return new Habilidades(
                5,
                "Fascínio Miraculoso",
                "Aumenta o consumo de ações em 100% por 3T || Alvo em Flag* +300 de Dano.",
                180,
                50
        );
    }
}
