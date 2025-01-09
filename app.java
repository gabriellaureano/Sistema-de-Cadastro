import java.util.ArrayList;
import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Pessoa> clientes = new ArrayList<>();
        Cadastro cadastro = new Cadastro();

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
                teclado.nextLine();

                System.out.println("1. FIT R$90,00\n2. FITNESS R$115,00\n3. TOP R$140,00\nDigite o plano:");
                plano = teclado.nextInt();
                teclado.nextLine();

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
            System.out.println("1. Consultar Dados\n2. Mostrar Clientes\n3. Sair");
            int resposta = teclado.nextInt();
            teclado.nextLine();

            if (resposta == 3){
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
                    break;
                case 2:
                    var n = "Nome";
                    var i = "Idade";
                    var p = "Plano";
                    System.out.println(" ");
                    System.out.printf("%-40s     %-3s         %-2s\n", n,i,p);
                    for (Pessoa client : clientes) {
                        System.out.printf("%-40s      %-3s        %-2s\n" , client.getNome(), client.getIdade(), client.getPlano());
                    }
                    System.out.println(" ");
                    break;
            }
        }
    }
}
