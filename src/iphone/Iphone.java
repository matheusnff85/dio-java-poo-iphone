package iphone;

import iphone.interfaces.AparelhoTelefonico;
import iphone.interfaces.NavegadorNaInternet;
import iphone.interfaces.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorNaInternet, ReprodutorMusical {


  @Override
  public void ligar() {
    System.out.println("Iniciando ligação...");
  }

  @Override
  public void atender() {
    System.out.println("Atendendo a ligação...");
  }

  @Override
  public void iniciarCorreioVoz() {
    System.out.println("Iniciando correio de voz...");
  }

  @Override
  public void exibirPagina() {
    System.out.println("Exibindo página atual.");
  }

  @Override
  public void adicionarNovaAba() {
    System.out.println("Adicionando nova aba.");
  }

  @Override
  public void atualizarPagina() {
    System.out.println("Atualizando a página.");
  }

  @Override
  public void tocar() {
    System.out.println("Tocando música!");
  }

  @Override
  public void pausar() {
    System.out.println("Pausando música!");
  }

  @Override
  public void selecionarMusica() {
    System.out.println("Música selecionada!");
  }
}
