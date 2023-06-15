import java.util.Scanner;
public class DesCriptografar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in) ;
        System.out.print("Entre com o texto cifrado: ");
        String textoCifrado = in.nextLine() ;
        System.out.print("Entre com a chave para descriptografar: ");
        int chave = in.nextInt() ;
        textoCifrado = textoCifrado.toUpperCase();
        String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String textoOriginal = "";
        for(int i = 0; i < textoCifrado.length(); i++) {
            char caractereCifrado = textoCifrado.charAt(i);
            int posCaractereCifradoAlfabeto = alfabeto.indexOf(caractereCifrado) ;
            if(posCaractereCifradoAlfabeto == -1) {
                textoOriginal += caractereCifrado;
                continue;
            }
            int posCaractereOriginal = (posCaractereCifradoAlfabeto - chave + 26) % 26;
            char caractereOriginal = alfabeto.charAt(posCaractereOriginal) ;
            textoOriginal += caractereOriginal;
        }
        System.out.println("Texto original: " + textoOriginal);
    }
} 