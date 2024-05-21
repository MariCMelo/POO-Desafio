public class Iphone {
    public static void main(String[] args) throws Exception {
        ReprodutorMusical rm = new ReprodutorMusical();
        NavegadorInternet ni = new NavegadorInternet();
        AparelhoTelefonico tel = new AparelhoTelefonico();

        rm.selecionarMusica("Blurry Eyes");
        rm.tocar();
        rm.pausar();

        ni.exibirPagina("www.google.com");
        ni.adicionarNovaAba();
        ni.atualizarPagina();

        tel.atender();
        tel.ligar("(00)000-000");
        tel.iniciarCorreioVoz();
    }

}
