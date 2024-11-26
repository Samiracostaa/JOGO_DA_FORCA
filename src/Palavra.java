import java.util.Arrays;
import java.util.List;

public class Palavra {
    private final List<String>palavras = Arrays.asList("FADA","DENTE","VESTIDO","CHAPÉU","BLUSA");
    private  String palavraSecreta;
    private String palavraComChute;

    public void gerarPalavraSecreta(){
        //size tamanho da lista
        var range = this.palavras.size() -1;
        //Math.random - retorna um valor flutuante
        var index =(int)(Math.random() * range);

        this.palavraSecreta = this.palavras.get(index);
        this.palavraComChute = "_".repeat(this.palavraSecreta.length());

    }

    public void revelarLetra(){
        for(int i=0;i < this.palavraSecreta.length();i++){
           //CharAt - pega as letras dentro da string's no   index.
            String letra = "";
            if (this.palavraSecreta.charAt(i) == letra.charAt(0)){
                this.palavraComChute = this.palavraComChute.substring(0,i) +
                        letra + this.palavraComChute.substring(i+1);

            }

        }
    }

    public boolean palavraCompleta(){
        return !this.palavraComChute.contains("_");
    }

    public List<String> getPalavras() {
        return palavras;
    }

    public String getPalavraSecreta() {
        return palavraSecreta;
    }


    public String getPalavraComChute() {
        return palavraComChute;
    }

    public void setPalavraComChute(String palavraComChute) {
        this.palavraComChute = palavraComChute;
    }
}
