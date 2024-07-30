public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{


    @Override
    public void ligar(String numero) {
        System.out.println("Discando numero");
        System.out.println("Ligando para " + numero);
        System.out.printf("trimmm trimmm");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Tocando correio de voz");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página web: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando novo aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada");
    }

    @Override
    public void tocar() {
        System.out.println("Reproduzindo um belo som");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada");
    }
}
