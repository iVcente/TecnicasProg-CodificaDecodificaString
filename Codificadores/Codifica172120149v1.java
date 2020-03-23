package Codificadores;

public class Codifica172120149v1 implements Codifica{

    //Codifica a frase transformando cada caracter para seu valor correspondente em ASCII
    @Override
    public String codifica(String str) {
        String codificada = "";
        int ascii = 0;
        for (int i = 0; i < str.length() ; i++) {
            ascii = str.charAt(i);
            codificada = codificada + Integer.toString(ascii) + ".";        
        }
        return codificada;
    }

    //Decodifica a frase usando como referencia o ponto final apos cada caracter para facilidade.
    @Override
    public String decodifica(String str) {
        String decodificada = "";
        int ascii = 0;       
        char aux;
        
        for (String s : str.split("\\.")){
            ascii = Integer.parseInt(s);
            aux = (char)ascii;
            decodificada = decodificada + aux;
        }
        return decodificada;
    }

    @Override
    public String getMatriculaAutor() {
        return "17212014-9";
    }

    @Override
    public String getNomeAutor() {
        return "Vicente Vivian";
    }

}