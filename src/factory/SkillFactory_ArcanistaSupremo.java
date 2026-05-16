//Arquivo dedicado a criação de habilidades da classe: Arcanista Supremo.

public class SkillFactory_ArcanistaSupremo {
    public static Habilidades criarEsferaArcana() {
        return new Habilidades(1,
                "Esfera Arcana",
                "Lança uma esfera de energia arcana no alvo",
                85,
                5
        );
    }

    public static Habilidades criarCorpoArcano() {
        return new Habilidades(1,
                "Corpo Arcano",
                "Redução de acertos de efeitos adversos = -10% || Aumento de defesa = +250% do Dano Base.",
                0,
                15
        );
    }

    public static Habilidades criarLuzArcana(){
        return new Habilidades(
                1,
                "Luz Arcana",
                "60% de Causar 125x2 de Dano por Turno",
                80,
                25
        );
    }

    public static Habilidades criarChoqueArcano(){
        return new Habilidades(
                4,
                "Choque Arcano",
                "Desfere uma onda atordoante causando chance de 40% de atordoamento",
                120,
                25
        );



    }

    public static Habilidades criarDisparoDoArcanista(){
     return new Habilidades(5,
             "Disparo do Arcanista",
             "Lança uma Flecha Arcana que causa dano por magia em 2T de 175 com chance de acerto de 40%.",
             150,
             50
     );
    }
}

