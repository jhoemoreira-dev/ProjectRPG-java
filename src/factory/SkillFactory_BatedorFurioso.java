package factory;
import model.Habilidades;

//Arquivo dedicado a criação de habilidades da classe: Batedor Furioso.




public class SkillFactory_BatedorFurioso {
    public static Habilidades criarAtaqueBruto(){
        return new Habilidades(
                1,
                "Ataque Bruto",
                "Aumenta Acúmulo de Fúria (ADF) em 2 pontos.",
                20,
                0

        );
    }
        public static Habilidades criarSocosFuriosos(){
        return new Habilidades(1,
                "Socos Furiosos",
                "Chance de atordoamento (30%) por 1T || Recebe 1 (ADF)",
                50,
                0
        );
    }
        public static Habilidades criarBencaoDoBerserker() {
            return new Habilidades(
                    3,
                    "Benção do Berserker",
                    "Aumenta o dano base em 85Pts e diminui a Armadura em 50% por 2T",
                    0,
                    2
            );
    }
        public static Habilidades criarGritoDoGuerreiro(){
            return new Habilidades(
                    4,
                    "Grito Agonizante",
                    "Aumenta os pontos de ADF em 3 || Chance de causar medo no inimigo: 40%   " +
                            " ==== MEDO: Inimigo fica vulnerável ao próximo golpe ===",
                    0,
                    5
            );




        }
        public static Habilidades criarIMPARAVEL(){
        return new Habilidades(5,
                "IMPARÁVEL",
                "Libera 5 ADF e recebe o seguinte bônus: " +
                        "Ataque Base: 45x por cada 150HP perdido ",
                0,
                5
        );
        }

    }













