import model.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.receberChamada();
        iphone.iniciarCorreioVoz();
        iphone.fazerChamada();

        iphone.adicionarNovaAba();
        iphone.exibirPagina();
        iphone.atualizarPagina();

        iphone.selecionarMuisca();
        iphone.tocar();
        iphone.pausar();
    }
}