import java.util.ArrayList;

public class Cadastro {

    public void cadastrar(ArrayList<Pessoa> lista, String name, int year, int plan){
        lista.add(new Pessoa(name,year,plan));
    }
}
