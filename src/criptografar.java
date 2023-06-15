import java.util.Scanner;
public class criptografar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in) ;
        System.out.print("Entre com o texto para criptografar: ");
        String textoOriginal = in.nextLine() ;
        textoOriginal = textoOriginal.toUpperCase();
        String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int chave = (int) (Math.random() * 25 + 7);
        String textoCifrado = "";
        for(int i = 0; i < textoOriginal.length(); i++) {
            char caractereOriginal = textoOriginal.charAt(i);
            int posCaractereOriginalAlfabeto = alfabeto.indexOf(caractereOriginal) ;
            if(posCaractereOriginalAlfabeto == -1) {
                textoCifrado += caractereOriginal;
                continue;
            }
            int posCaractereCifrado = (posCaractereOriginalAlfabeto + chave) % 26 ;
            char caractereCifrado = alfabeto.charAt(posCaractereCifrado) ;

            textoCifrado += caractereCifrado ;

        }

        System.out.println("Texto criptografado: " + textoCifrado);

    }

}