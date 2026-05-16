//Arquivo dedicado a criação de atributos essenciais dos personagens.

public class StatusRPG {
    int ptArmadura;
    int vida;
    int mana;
    int furiaBase;
    int danoBase;
    int forca;
    int destreza;
    int mentalidade;
    int resistencia;
    int inteligencia;


    public StatusRPG(ClasseBase classeBase){
        this.ptArmadura = classeBase.getArmaduraBase();
        this.vida = classeBase.getHpBase();
        this.mana = classeBase.getManaBase();
        this.furiaBase = classeBase.getFuriaBase();
        this.danoBase = classeBase.getDanoBase();
        this.forca = classeBase.getForcaBase();
        this.destreza = classeBase.getDestrezaBase();
        this.mentalidade = classeBase.getMentalidadeBase();
        this.resistencia = classeBase.getResistenciaBase();
        this.inteligencia = classeBase.getInteligenciaBase();
    }


}
