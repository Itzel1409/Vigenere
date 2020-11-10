package vigenere;

public class CifradoVigenere {

    char tablaCesar[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
                         'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q',
                         'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    public char TextoCifrado(char TextoClaro, char TextoClave) {
        int indiceX = 0;
        int indiceY = 0;

        for (int i = 0; i < tablaCesar.length; i++) {
            if (TextoClaro == tablaCesar[i]) {
                indiceX = i;
                break;
            }
        }

        for (int j = 0; j < tablaCesar.length; j++) {
            if (TextoClave == tablaCesar[j]) {
                indiceY = j;
                break;
            }

        }
        return tablaCesar[(indiceX + indiceY) % 27];
    }

}
