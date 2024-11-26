//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var jogador = new Jogador("Samis");
        var Palavra = new Palavra();
        var jogo = new Jogo(Palavra,jogador);

        jogo.iniciarJogo();

        }
    }