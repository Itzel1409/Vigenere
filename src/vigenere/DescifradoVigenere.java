package vigenere;

public class DescifradoVigenere {
    
    char tablaCesar[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
                         'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q',
                         'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    
    public char TextoDescifrado(char TextoCifrado, char TextoClave){
        int indiceTextoCifrado = 0;
        int IndiceTextoClave = 0;
        
        for (int i = 0; i < tablaCesar.length; i++) {
            if (TextoCifrado == tablaCesar[i]) {
                indiceTextoCifrado = i;
                break;
            }
        }
        
        for (int j = 0; j < tablaCesar.length; j++) {
            if (TextoClave == tablaCesar[j]) {
                IndiceTextoClave = j;
                break;
            }
        }
        
        if (indiceTextoCifrado >= IndiceTextoClave) {
            return tablaCesar[(indiceTextoCifrado - IndiceTextoClave) % 27]; 
        } else{
            return tablaCesar[ (27 - (IndiceTextoClave - indiceTextoCifrado))];
        }
        
        
    }
}
