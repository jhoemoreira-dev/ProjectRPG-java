public class SkillFactory_VastoLorde {


        public static Habilidades criarEspinhoNegro() {
        return new Habilidades(
                1,
                "Espinho Negro",
                "Chance de 30% em causar medo no oponente por 1T.",
                90,
                10
        );
        }

        public static Habilidades criarVortexSombrio(){
         return new Habilidades(
                 1,
                 "Vórtex Sombrio",
                 "Reduz a evasão e vida máxima do alvo em 25% por 2T",
                 80,
                 20
         );


        }

        public static Habilidades criarCancelarMentes(){
            return new Habilidades(
                    3,
                    "Cancelar Mentes",
                    "Chance de remover todos os buffs do oponente de 40%",
                    90,
                    20
            );




        }

        public static Habilidades criarOReiDecaido(){
            return new Habilidades(
                    4,
                    "O Rei Decaído",
                    "Sacrifica 1/3 do HP para causar o dobro de dano das próximas 2 habilidades.",
                    0,
                    50
            );




        }

        public static Habilidades criarOUltimoLorde(){
            return new Habilidades(
                    5,
                    "O Último Lorde",
                    "50% de chance de causar paralisia total do oponente por 2T, sacrifica 50% do HP para causar o triplo de dano na próxima habilidade.",
                    0,
                    50
            );




        }

}
