// CLASSES E SEUS ATRIBUTOS BASE:

public enum ClasseBase {
    BATEDOR_FURIOSO(
            50,
            560,
            0,
            10,
            50,
            17,
            7,
            6,
            5,
            5,

            15,
            25,
            0,
            3,
            8,
            3,
            1,
            1,
            1,
            1

    ),
    ARCANISTA_SUPREMO(
            50,
            450,
            150,
            0,
            40,
            8,
            13,
            6,
            15,
            15,

            10,
            20,
            15,
            0,
            10,
            1,
            2,
            1,
            2,
            2
    ),
    CARDINAL(
            50,
            400,
            160,
            0,
            35,
            7,
            5,
            14,
            15,
            13,

            8,
            18,
            12,
            0,
            4,
            1,
            1,
            2,
            1,
            2
    ),
    VASTO_LORDE(
            50,
            420,
            200,
            0,
            45,
            8,
            8,
            14,
            7,
            17,

            10,
            20,
            15,
            0,
            18,
            1,
            1,
            2,
            1,
            2
    ),
    DEFENSOR_COLOSSAL(
            80,
            500,
            100,
            0,
            40,
            7,
            6,
            8,
            17,
            7,

            20,
            25,
            5,
            0,
            10,
            1,
            1,
            1,
            3,
            1
    ),
    ANCIAO_NEGRO(
            60,
            480,
            170,
            0,
            35,
            5,
            7,
            15,
            12,
            14,

            10,
            20,
            20,
            0,
            8,
            1,
            1,
            2,
            1,
            2
    ),
    GUERREIRO_DAS_SOMBRAS(
            50,
            450,
            120,
            0,
            35,
            8,
            15,
            10,
            7,
            12,

            15,
            15,
            15,
            0,
            17,
            1,
            3,
            1,
            1,
            2
    ),
    NOBRE_DAS_LAMINAS(
            70,
            480,
            100,
            0,
            37,
            8,
            15,
            7,
            8,
            6,

            12,
            20,
            10,
            0,
            10,
            1,
            4,
            1,
            1,
            1
    ),
    SENTINELA_FANTASMA(60,
            400,
            120,
            0,
            40,
            13,
            16,
            8,
            8,
            7,

            20,
            25,
            18,
            0,
            20,
            2,
            3,
            1,
            1,
            1
    );

//      ##  GETTERS DOS ATRIBUTOS BASE  ##

    public int getFuriaBase() {
        return furiaBase;
    }

    public int getArmaduraBase() {
        return armaduraBase;
    }

    public int getHpBase() {
        return hpBase;
    }

    public int getManaBase() {
        return manaBase;
    }

    public int getDanoBase() {
        return danoBase;
    }

    public int getForcaBase() {
        return forcaBase;
    }

    public int getDestrezaBase() {
        return destrezaBase;
    }

    public int getMentalidadeBase() {
        return mentalidadeBase;
    }

    public int getResistenciaBase() {
        return resistenciaBase;
    }

    public int getInteligenciaBase() {
        return inteligenciaBase;
    }

    /*-------------------------------------------------------------------------------

      ##  GETTERS PARA SCALING DOS PERSONAGENS  ##  */

    public int getFuriaPorNivel() {
        return furiaPorNivel;
    }

    public int getArmaduraPorNivel() {
        return armaduraPorNivel;
    }

    public int getHpPorNivel() {
        return hpPorNivel;
    }

    public int getManaPorNivel() {
        return manaPorNivel;
    }

    public int getDanoPorNivel() {
        return danoPorNivel;
    }

    public int getForcaPorNivel() {
        return forcaPorNivel;
    }

    public int getDestrezaPorNivel() {
        return destrezaPorNivel;
    }

    public int getMentalidadePorNivel() {
        return mentalidadePorNivel;
    }

    public int getResistenciaPorNivel() {
        return resistenciaPorNivel;
    }

    public int getInteligenciaPorNivel() {
        return inteligenciaPorNivel;
    }



//  ##  ATRIBUTOS BASE DOS PERSONAGENS  ##

    private int furiaBase;
    private int armaduraBase;
    private int hpBase;
    private int manaBase;
    private int danoBase;
    private int forcaBase;
    private int destrezaBase;
    private int mentalidadeBase;
    private int resistenciaBase;
    private int inteligenciaBase;

    //  ##  ATRIBUTOS PARA FAZER SCALING POR NIVEL  ##

    private int furiaPorNivel;
    private int armaduraPorNivel;
    private int hpPorNivel;
    private int manaPorNivel;
    private int danoPorNivel;
    private int forcaPorNivel;
    private int destrezaPorNivel;
    private int mentalidadePorNivel;
    private int resistenciaPorNivel;
    private int inteligenciaPorNivel;


    ClasseBase(
            //  ##  CONSTRUTOR DOS ATRIBUTOS BASE  ##
                int armaduraBase, int hpBase, int manaBase, int furiaBase,
                int danoBase, int forcaBase, int destrezaBase,
                int mentalidadeBase, int resistenciaBase, int inteligenciaBase,

            //  ##  ATRIBUTOS PARA SCALING POR NIVEL DE PERSONAGEM (CONSTRUTOR)  ##
                int armaduraPorNivel,int hpPorNivel, int manaPorNivel, int furiaPorNivel,
                int danoPorNivel, int forcaPorNivel, int destrezaPorNivel,
                int mentalidadePorNivel, int resistenciaPorNivel, int inteligenciaPorNivel){


        //ATRIBUIÇÃO DA BASE DE CADA CLASSE:
        this.armaduraBase = armaduraBase;
        this.hpBase = hpBase;
        this.manaBase = manaBase;
        this.furiaBase = furiaBase;
        this.danoBase = danoBase;
        this.forcaBase = forcaBase;
        this.destrezaBase = destrezaBase;
        this.mentalidadeBase = mentalidadeBase;
        this.resistenciaBase = resistenciaBase;
        this.inteligenciaBase = inteligenciaBase;

        //ATRIBUIÇÃO DE SCALING DE CADA CLASSE:
        this.armaduraPorNivel = armaduraPorNivel;
        this.hpPorNivel = hpPorNivel;
        this.furiaPorNivel = furiaPorNivel;
        this.manaPorNivel = manaPorNivel;
        this.danoPorNivel = danoPorNivel;
        this.forcaPorNivel = forcaPorNivel;
        this.destrezaPorNivel = destrezaPorNivel;
        this.mentalidadePorNivel = mentalidadePorNivel;
        this.resistenciaPorNivel = resistenciaPorNivel;
        this.inteligenciaPorNivel = inteligenciaPorNivel;
    }
}
