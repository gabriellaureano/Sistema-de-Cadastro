import java.util.ArrayList;

public class Pessoa {
    String nome;
    int idade;
    int plano;
    String planoAtual;
    double valor;

    public Pessoa(String nome, int idade, int plano){
        this.nome = nome;
        this.idade = idade;
        this.plano = plano;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getPlano() {
        switch (this.plano){
            case 1:
                valor = 90.0;
                planoAtual = "FIT R$"+ valor;
                break;
            case 2:
                valor = 115.0;
                planoAtual = "FITNESS R$" + valor;
                break;
            case 3:
                valor = 140.0;
                planoAtual = "TOP R$" + valor;
        }
        return planoAtual;
    }




}
