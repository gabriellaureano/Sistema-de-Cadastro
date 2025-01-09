import java.util.ArrayList;
import java.util.Scanner;

public class Cadastro {
    Scanner teclado = new Scanner(System.in);

    public void cadastrar(ArrayList<Pessoa> lista, String name, int year, int plan){
        lista.add(new Pessoa(name,year,plan));
    }

}
