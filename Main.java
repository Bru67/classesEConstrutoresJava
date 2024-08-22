import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a marca do seu controle?? ");
        String marca = sc.nextLine();
        System.out.println("Qual o tipo de conexão com o Console (ex: com ou sem fio)?? ");
        String estiloConexaoConsole = sc.nextLine();
        System.out.println("Qual é o modelo dos botões do seu controle?? ");
        String botoes = sc.nextLine();
        System.out.println("Qual é a cor do seu controle?? ");
        String cor = sc.nextLine();
        System.out.println("Qual é o ano de fabricação do seu controle?? ");
        int ano = sc.nextInt();

        //Construtor com input do usuário
        Controle controle = new Controle(marca, estiloConexaoConsole, botoes, cor, ano);
        System.out.println(controle);

        controle.ligarControle();
        controle.conectadoAoConsole();
        controle.botaoMenu();
        controle.comandoMover();
        controle.acoes();
        controle.desligar();

        //Construtor vazio e alterado
        Controle controle2 = new Controle();

        controle2.marca = "Playstation";
        controle2.estiloConexaoConsole = "Sem fio";
        controle2.botoes = "Quadrado, Triângulo, Circulo e Xis";
        controle2.ligarControle();
        controle2.desligar();

        //Construtor pré-estabelecido
        Controle controle3 = new Controle("Nintendo", "Setas");

        System.out.println(controle3.estiloConexaoConsole);
        controle3.ligarControle();
        controle3.desligar();


    }
}
