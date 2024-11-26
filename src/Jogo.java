import java.util.ArrayList;
import java.util.Scanner;

public class Jogo {
    private final Palavra palavra;
    private  final Jogador jogador;


    public Jogo(Palavra palavra, Jogador jogador) {
        this.palavra = palavra;
        this.jogador = jogador;
    }
    public void iniciarJogo(){
        var numeroChutes = 5;
        var chutes = new ArrayList<String>();


        this.palavra.gerarPalavraSecreta();

        var scanner = new Scanner(System.in);
        System.out.println("Olá"+ this.jogador.getNome()+ ",bem-vindo ao Jogo da Forca!");
        System.out.println("Voce tem "+ numeroChutes +"chutes para advinhar a palavra secreta.");
        System.out.println(this.palavra.getPalavraComChute()+"\n");

        while(!this.palavra.palavraCompleta() && chutes.size() < numeroChutes){
            System.out.println("Digite seu chute: ");
            var chute = scanner.nextLine();


            if (chute.contains(chute)){
                System.out.println("Voce já chutou essa letra! \n Tente novamente! ");
                continue;
            }
            chutes.add(chute);

            this.palavra.revelarLetra();

            System.out.println("Palavra: " + this.palavra.getPalavraComChute());

            if(this.palavra.palavraCompleta()){
                System.out.println("Parabéns" + this.jogador.getNome()+ "! Voce Venceu");
            }else if(chutes.size()== numeroChutes){
                System.out.println("Poxa" + this.jogador.getNome() + " Voce Perdeu! A palavra secreta era "+
                        this.palavra.getPalavraSecreta());
            }
        }
    }

}
