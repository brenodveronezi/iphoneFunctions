//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        iPhone iphone = new iPhone();

        System.out.println("====================================\n");

        //AparelhoTelefonico
        System.out.println("AparelhoTelefonico");
        iphone.ligar("16931137343");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        System.out.println("====================================\n");

        //NavegadorInternet
        System.out.println("NavegadorInternet");
        iphone.exibirPagina("https://www.linkedin.com/in/breno-veronezi-275b08145/");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

        System.out.println("====================================\n");

        //ReprodutorMusical
        System.out.println("ReprodutorMusical");
        iphone.selecionarMusica("Billie Eilish - CHIHIRO");
        iphone.tocar();
        iphone.pausar();

        System.out.println("====================================\n");

    }
}