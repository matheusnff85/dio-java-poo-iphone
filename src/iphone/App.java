package iphone;

public class App {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Iphone telefone = new Iphone();

    System.out.println("-- ...Ligando... --");
    System.out.println("-- Aparelho Telefônico --");

    telefone.ligar();
    telefone.atender();
    telefone.iniciarCorreioVoz();

    System.out.println("-------------------------");
    System.out.println("-- Navegador na Internet --");

    telefone.exibirPagina();
    telefone.adicionarNovaAba();
    telefone.atualizarPagina();

    System.out.println("-------------------------");
    System.out.println("-- Reprodutor Musical --");

    telefone.tocar();
    telefone.pausar();
    telefone.selecionarMusica();

    System.out.println("-------------------------");
    System.out.println("-- ...Desligando... --");

  }

}
