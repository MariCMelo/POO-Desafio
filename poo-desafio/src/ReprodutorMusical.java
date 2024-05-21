public class ReprodutorMusical {
    private String musicaSelecionada; 

    void tocar() {
        if (musicaSelecionada != null) {
            System.out.println("Tocando a música: " + musicaSelecionada);
        } else {
            System.out.println("Selecione uma música");
        }
    }

    void pausar() {
        System.out.println("Música pausada");
    }

    void selecionarMusica(String musica) {
        musicaSelecionada = musica; // Atribuição à variável de instância
        System.out.println("Selecionou a música: " + musica);
    }
}
