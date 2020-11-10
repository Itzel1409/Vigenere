package vigenere;

public class OperacionesVigi {

    char[] mensaje;
    char[] clave;
    char[] resultado; //resultado cifrado
    char matriz[][];

    public String OperacionesVigi(String msg, String clave) {
        String tabla = "";
        this.mensaje = msg.toCharArray();
        char[] claveTemp = clave.toCharArray();
        this.clave = new char[mensaje.length];
        int cont = 0;

        for (int i = 0; i < mensaje.length; i++) {
            this.clave[i] = claveTemp[cont];
            cont++;
            if (cont == claveTemp.length) {
                cont = 0;
            }
        }  

        this.matriz = generarMatrizABC();
        cifrar();
        for (int i = 0; i < matriz.length; i++) {
            tabla += String.valueOf(matriz[i]) + "\n";
        }
        
        return tabla;
    }

    public void cifrar() //Genera cifrado
    {
        char[] cifrado = new char[mensaje.length];
        int i;
        int j;
        for (int cont = 0; cont < mensaje.length; cont++) {

            i = (int) this.mensaje[cont] - 97;
            j = (int) this.clave[cont] - 97;
            cifrado[cont] = this.matriz[i][j];
        }

        this.resultado = cifrado;
        for(int k = 0;k<27;k++){
          //System.out.println(this.matriz[k]);
        }
        /*System.out.println(this.mensaje);
        System.out.println(this.clave);
        System.out.println(cifrado);*/
    }

    public String getMensajeCifrado() {
        String result = "";
        for (int i = 0; i < resultado.length; ++i) {
            result = result + this.resultado[i];
        }
        return result;
    }

    private char[][] generarMatrizABC() {
        int contador;
        char abcTemp[] = this.generarAbecedario();
        char abc[] = new char[abcTemp.length * 2];
        
        for (int c = 0; c < 27; c++) {
            abc[c] = abcTemp[c];
            abc[c + 27] = abcTemp[c];
        }

        char[][] matriz = new char[27][27];
        
        for (int i = 0; i < 27; i++) {
            contador = 0;
            for (int j = 0; j < 27; j++) {
                matriz[i][j] = abc[contador + i];
                contador++;
            }
        }
        return matriz;

    }

    private char[] generarAbecedario() {
        char[] abc = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
                         'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q',
                         'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        
        /*for (int i = 97; i <= 122; i++) {
            abc[i - 97] = (char) i;
        }*/
        return abc;
    }

    public String Longitud(String clave, String texto) {
        String nuevaClave = clave;
        
        while (nuevaClave.length() < texto.length()) {            
            nuevaClave += clave;
        }
        
        return nuevaClave;
    }
    
}
