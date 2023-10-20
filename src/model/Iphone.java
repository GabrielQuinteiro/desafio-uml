package model;

public class Iphone implements Telefone, ReprodutorMusical, NavegadorInternet{

    public Iphone() {
        System.out.println("Deslize para desbloquear");
    }
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba aberta");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada");
    }

    @Override
    public void selecionarMuisca() {
        System.out.println("Selecionando música...");
    }

    @Override
    public void fazerChamada() {
        System.out.println("Realizando chamada...");
    }

    @Override
    public void receberChamada() {
        System.out.println("Recebendo chamada...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }
}
