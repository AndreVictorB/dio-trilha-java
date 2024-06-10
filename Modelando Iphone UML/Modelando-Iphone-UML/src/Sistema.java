public class Sistema  implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{


    @Override
    public void ligar() {
        System.out.println("Ligando");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo telefone");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de Voz");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Acessando página https://www.dio.me/");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada");
    }

    @Override
    public void adicinarNovaAba() {
        System.out.println("Nova aba adicionada");
    }

    @Override
    public void tocarMusica() {
        System.out.println("Tocando musica");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Pausando Musica");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Tocando Jesus Humilha o Satanás");
    }
}
