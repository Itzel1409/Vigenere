package vigenere;

public class TextosVigi {
    
    private String textoCifrado = "";
    private String TextoClaro = "";
    
    CifradoVigenere cifradovigi = new CifradoVigenere();
    DescifradoVigenere descifradovigi = new DescifradoVigenere();
    
    public String encryptTextoClaro(String textoClaro, String clave){
        textoCifrado = "";
        String claveCompletada = "";
        
        int indice = 0;
        
        for (int i = indice; i < textoClaro.length(); i++) {
            for (int j = indice; j < clave.length(); j++) {
                if (claveCompletada.length() < textoClaro.length()) {
                    if (textoClaro.charAt(indice) != ' ') {
                        claveCompletada += clave.charAt(j) + "";
                    } else {
                        claveCompletada += " ";
                        j--;
                    }
                    indice++;
                }
            }
        }
        
        for (int i = 0; i < textoClaro.length(); i++) {
            char TextoClaro = textoClaro.charAt(i);
            char claveCompleta = claveCompletada.charAt(i);
            if (TextoClaro != ' ') {
                textoCifrado += cifradovigi.TextoCifrado(TextoClaro, claveCompleta) + "";
            } else{
                textoCifrado += " ";
            }
        }
        return textoCifrado;
        
    }
    
    public String desencryptTextoCifrado(String textoCifrado, String clave){
        TextoClaro = "";
        String claveCompletada = "";
        
        int indice = 0;
        
        for (int i = indice; i < textoCifrado.length(); i++) {
            for (int j = indice; j < clave.length(); j++) {
                if (claveCompletada.length() < textoCifrado.length()) {
                    if (textoCifrado.charAt(indice) != ' ') {
                        claveCompletada += clave.charAt(j) + "";
                    } else {
                        claveCompletada += " ";
                        j--;
                    }
                    indice++;
                }
            }
        }
        
        for (int i = 0; i < textoCifrado.length(); i++) {
            char TextoCifrados = textoCifrado.charAt(i);
            char claveCompleta = claveCompletada.charAt(i);
            if (TextoCifrados != ' ') {
                TextoClaro += descifradovigi.TextoDescifrado(TextoCifrados, claveCompleta) + "";
            } else{
                TextoClaro += " ";
            }
        }

        return TextoClaro;        
    }
    
}
