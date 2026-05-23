package factory;
import model.FichaRPG;
import model.ClasseBase;
import model.StatusRPG;
import model.Habilidades;

/*
Arquivo

Onde será criado todas as classes e suas respectivas habilidades, nomes das classes e status dos personagens.
Aqui também será o arquivo de origem dos métodos que serão usados no arquivo system.Main.java para a apresentação das fichas aos usuários

'model.FichaRPG jogador = new model.FichaRPG (String nome: "", (model.ClasseBase.BATEDOR_FURIOSO), model.StatusRPG(param)'
                                   ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
                       Aqui serão chamados os dois arquivos como argumentos, Stringo nome e model.StatusRPG.
*/


public class FichasRPGFactory {

    public static FichaRPG criarBatedorFurioso() {


        FichaRPG jogador1 = new FichaRPG(

                "Batedor Furioso",
                (ClasseBase.BATEDOR_FURIOSO),
                new StatusRPG(ClasseBase.BATEDOR_FURIOSO));

        jogador1.mostrarHabilidades(SkillFactory_BatedorFurioso.criarAtaqueBruto());
        jogador1.mostrarHabilidades(SkillFactory_BatedorFurioso.criarSocosFuriosos());
        jogador1.mostrarHabilidades(SkillFactory_BatedorFurioso.criarBencaoDoBerserker());
        jogador1.mostrarHabilidades(SkillFactory_BatedorFurioso.criarGritoDoGuerreiro());
        jogador1.mostrarHabilidades(SkillFactory_BatedorFurioso.criarIMPARAVEL());


        return jogador1;
    }

    public static FichaRPG criarArcanistaSupremo() {
        FichaRPG jogador2 = new FichaRPG(

                "Arcanista Supremo",
                (ClasseBase.ARCANISTA_SUPREMO),
                new StatusRPG(ClasseBase.ARCANISTA_SUPREMO));


        jogador2.mostrarHabilidades(SkillFactory_ArcanistaSupremo.criarEsferaArcana());
        jogador2.mostrarHabilidades(SkillFactory_ArcanistaSupremo.criarCorpoArcano());
        jogador2.mostrarHabilidades(SkillFactory_ArcanistaSupremo.criarChoqueArcano());
        jogador2.mostrarHabilidades(SkillFactory_ArcanistaSupremo.criarLuzArcana());
        jogador2.mostrarHabilidades(SkillFactory_ArcanistaSupremo.criarDisparoDoArcanista());


        return jogador2;
    }

    public static FichaRPG criarCardinal() {
        FichaRPG jogador3 = new FichaRPG(

                "Cardinal",
                (ClasseBase.CARDINAL),
                new StatusRPG(ClasseBase.CARDINAL));


        jogador3.mostrarHabilidades(SkillFactory_Cardinal.criarMaosCurativas());
        jogador3.mostrarHabilidades(SkillFactory_Cardinal.criarQueimaAlmas());
        jogador3.mostrarHabilidades(SkillFactory_Cardinal.criarProfecia());
        jogador3.mostrarHabilidades(SkillFactory_Cardinal.criarChamdsDoEsplendor());
        jogador3.mostrarHabilidades(SkillFactory_Cardinal.criarFascinioMiraculoso());

        return jogador3;
    }

    public static FichaRPG criarDefensorColossal() {
        FichaRPG jogador4 = new FichaRPG(

                "Defensor Colossal",
                (ClasseBase.DEFENSOR_COLOSSAL),
                new StatusRPG(ClasseBase.DEFENSOR_COLOSSAL));


        jogador4.mostrarHabilidades(SkillFactory_DefensorColossal.criarForteImpacto());
        jogador4.mostrarHabilidades(SkillFactory_DefensorColossal.criarImpactoUnilateral());
        jogador4.mostrarHabilidades(SkillFactory_DefensorColossal.criarEscudeiroDesenfreado());
        jogador4.mostrarHabilidades(SkillFactory_DefensorColossal.criarAgressao());
        jogador4.mostrarHabilidades(SkillFactory_DefensorColossal.criarJulgamentoColossal());

        return jogador4;
    }

    public static FichaRPG criarVastoLorde() {
        FichaRPG jogador5 = new FichaRPG(

                "Vasto Lorde",
                (ClasseBase.VASTO_LORDE),
                new StatusRPG(ClasseBase.VASTO_LORDE));


        jogador5.mostrarHabilidades(SkillFactory_VastoLorde.criarEspinhoNegro());
        jogador5.mostrarHabilidades(SkillFactory_VastoLorde.criarVortexSombrio());
        jogador5.mostrarHabilidades(SkillFactory_VastoLorde.criarCancelarMentes());
        jogador5.mostrarHabilidades(SkillFactory_VastoLorde.criarOReiDecaido());
        jogador5.mostrarHabilidades(SkillFactory_VastoLorde.criarOUltimoLorde());

        return jogador5;


    }

    public static FichaRPG criarAnciaoNegro() {
        FichaRPG jogador6 = new FichaRPG(

                "Ancião Negro",
                (ClasseBase.ANCIAO_NEGRO),
                new StatusRPG(ClasseBase.ANCIAO_NEGRO));


        jogador6.mostrarHabilidades(SkillFactory_AnciaoNegro.criarEsferaNegra());
        jogador6.mostrarHabilidades(SkillFactory_AnciaoNegro.criarNevoaMaldita());
        jogador6.mostrarHabilidades(SkillFactory_AnciaoNegro.criarCuraSombria());
        jogador6.mostrarHabilidades(SkillFactory_AnciaoNegro.criarRaioNegro());
        jogador6.mostrarHabilidades(SkillFactory_AnciaoNegro.criarInvocacaoNegra());

        return jogador6;


    }

    public static FichaRPG criarGuerreiroDasSombras() {

        FichaRPG jogador7 = new FichaRPG("Guerreiro das Sombras",
                (ClasseBase.GUERREIRO_DAS_SOMBRAS),
                new StatusRPG(ClasseBase.GUERREIRO_DAS_SOMBRAS));


        jogador7.mostrarHabilidades(SkillFactory_Guerreiro_Das_Sombras.criarAuraSombria());
        jogador7.mostrarHabilidades(SkillFactory_Guerreiro_Das_Sombras.criarCorvoSombrio());
        jogador7.mostrarHabilidades(SkillFactory_Guerreiro_Das_Sombras.criarCloneDasSombras());
        jogador7.mostrarHabilidades(SkillFactory_Guerreiro_Das_Sombras.criarAlemDaMorte());
        jogador7.mostrarHabilidades(SkillFactory_Guerreiro_Das_Sombras.criarDancaDasSombras());
        jogador7.mostrarHabilidades(SkillFactory_Guerreiro_Das_Sombras.criarEstiloSombrio());

        return jogador7;
    }



}
