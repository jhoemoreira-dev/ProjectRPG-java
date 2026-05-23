package factory;
import model.Habilidades;

public class SkillFactory_Guerreiro_Das_Sombras {

    public static Habilidades criarAuraSombria(){
        return new Habilidades(
                1,
                "Aura Sombria",
                "Adiciona efeito sombrio à arma por 2 turnos aumentando dano em 120",
                0,
                0
        );



    }

    public static Habilidades criarCorvoSombrio(){
        return new Habilidades(
                1,
                "Corvo Sombrio",
                "Invoca um corvo intangível para auxiliar no combate por 5 turnos e reage a cada ataque bem sucedido",
                100,
                0
        );
    }

    public static Habilidades criarCloneDasSombras(){
        return new Habilidades(3,
                "Clone das Sombras",
                "Invoca um clone das sombras para auxiliar no combate por 2 turnos",
                120,
                25
        );
    }

    public static Habilidades criarAlemDaMorte(){
        return new Habilidades(
                4,
                "Além da Morte",
                "Só pode ser usado segundos após receber um ataque. Chance de sucesso = 40% || Reflete o dano que seria recebido em 60%.",
                150,
                45
        );
    }

    public static Habilidades criarDancaDasSombras(){
        return new Habilidades(
                5,
                "Dança das Sombras",
                "Cria 5 clones sombrios que causam 15% do dano causado pelo usuário (CADA), só pode ser usado quando é abdicada a esquiva. Chance de sucesso = 50%.",
                100,
                65
        );
    }

    public static Habilidades criarEstiloSombrio(){
        return new Habilidades(
                6,
                "Estilo Sombrio",
                "Desfere um voo em direção ao oponente, aliado ao corvo, com chances de Instant Kill = 20%, Sangramento de 500 por 2T = 30%",
                160,
                100
        );
    }
}
