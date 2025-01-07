import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Pessoa> clientes = new ArrayList<>();

        while (true) {
            String nome;
            int idade;
            int plano;
            int cad;

            System.out.println("Quantos clientes quer cadastrar? ");
            cad = teclado.nextInt();
            teclado.nextLine();

            for (int i = 0; i < cad; i++) {

                System.out.println("Digite o nome:");
                nome = teclado.nextLine().toUpperCase();


                System.out.println("Digite a idade:");
                idade = teclado.nextInt();

                System.out.println("1. FIT R$90,00\n2. FITNESS R$115,00\n3. TOP R$140,00\nDigite o plano:");
                plano = teclado.nextInt();

                Cadastro cadastro = new Cadastro();
                cadastro.cadastrar(clientes,nome,idade,plano);
            }


            char resposta;
            System.out.println("Quer continuar?");
            resposta = teclado.next().toLowerCase().charAt(0);

            if (resposta == 'n'){
                break;
            }

        }

        while (true){
            System.out.println("1. Consultar dados\n2. Sair");
            int resposta = teclado.nextInt();
            teclado.nextLine();

            if (resposta == 2){
                System.out.println("Saindo...");
                break;
            }
            switch(resposta){
                case 1:
                    System.out.println("Nome do cliente:");
                    String nome = teclado.nextLine().toUpperCase();

                    for (Pessoa cliente : clientes) {
                        if(nome.equals(cliente.getNome())){
                            System.out.printf("Nome: %s, Idade: %d, Plano: %s\n",cliente.getNome(),cliente.getIdade(),cliente.getPlano());
                        }
                    }
            }
        }
    }
}
