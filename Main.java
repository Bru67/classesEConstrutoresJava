import java.util.Scanner;

public class Controle {
    //Atributos:
    public String marca; //ex: Xbox ou Playstation
    public String cor;
    public int ano;
    public String botoes; //estilos de botão
    public String estiloConexaoConsole; //ex: com fio ou sem fio
    public boolean ligado = false;
    public boolean botaoMenu = false;

    //Construtor para input
    public Controle(String marca, String estiloConexaoConsole, String botoes, String cor, int ano){
        this.marca = marca;
        this.estiloConexaoConsole = estiloConexaoConsole;
        this.botoes = botoes;
        this.cor = cor;
        this.ano = ano;
    }
    //Construtor nulo/vazio
    public Controle(){
        this.marca = null;
        this.estiloConexaoConsole = null;
        this.botoes = null;
    }

    //Construtor com valores pré-estabelecidos
    public Controle(String marca, String botoes){
        this.marca = "Nintendo";
        this.estiloConexaoConsole = "Com fio";
        this.botoes = "Setas";
    }

    //Métodos
    public void comandoMover(){
        //up, down, left, right -> cursor/personagem
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual ação deseja realizar??\n 1 - Up\n 2 - Right\n 3 - Down\n 4 - Left");
        int acao = scanner.nextInt();
        System.out.println("Voçê realizou a ação " + acao);
    }
    public void ligarControle(){
        //press -> turn on
        ligado = true;
        System.out.println("Seu controle " + marca + " está ligado! Seja bem-vindo! ");
    }
    public void desligar(){
        ligado = false;
        System.out.println("Desligando! Até a próxima!");
    }
    public void conectadoAoConsole(){
        if (ligado){
            System.out.println("Seu controle está conectado com o Console! É hora de jogar!");
        }
    }

    public void botaoMenu(){
        //abrir menu
        botaoMenu = true;
        System.out.println("----------MENU----------\n" +
                "- Configurações de console\n" +
                "- Configurações de Usuário\n" +
                "- Controle de jogos\n" +
                "- Sobre\n" +
                "- Central de Ajuda\n" +
                "------------------------");
    }
    public void acoes(){
        //pular/selecionar; atacar/voltar etc..
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Qual ação deseja realizar??
                 1 - Selecionar
                 2 - Voltar""");
        int acao = scanner.nextInt();
        System.out.println("Voçê realizou a ação " + acao);
    }

}