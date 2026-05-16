package model;


//Classe criada para ordernar as habilidades, a começar pelo seu nível, nome, efeito, dano e custo.

public class Habilidades {
    int nivelHabilidade;
    String nomeHabilidade;
    String efeitoHabilidade;
    double danoHabilidade;
    int custoHabilidade;


    public Habilidades(int nivelHabilidade, String nomeHabilidade, String efeitoHabilidade, int danoHabilidade, int custoHabilidade) {
        this.nivelHabilidade = nivelHabilidade;
        this.nomeHabilidade = nomeHabilidade;
        this.efeitoHabilidade = efeitoHabilidade;
        this.danoHabilidade = danoHabilidade;
        this.custoHabilidade = custoHabilidade;

    }




//Override criado para ser representado como paramêtro na ArrayList do arquivo CLasseRPG.java (ArrayList<model.Habilidades> habilidades;)
    public String toString(){
        return
                "\nNível da Habilidade: " +nivelHabilidade+
                "\nNome da Habilidade: " +nomeHabilidade+
                "\nEfeito da Habilidade: "+efeitoHabilidade+
                "\nDano da Habilidade: " +danoHabilidade+
                "\nCusto da Habilidade: " +custoHabilidade;

    }












    public int getNivelHabilidade() {
        return nivelHabilidade;
    }

    public String getNomeHabilidade() {
        return nomeHabilidade;
    }

    public String getEfeitoHabilidade() {
        return efeitoHabilidade;
    }

    public double getDanoHabilidade() {
        return danoHabilidade;
    }

    public int getCustoHabilidade() {
        return custoHabilidade;
    }



}

