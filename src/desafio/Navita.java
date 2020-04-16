package desafio;

import java.util.Arrays;
import java.util.Objects;

public class Navita {

    public int solution(int N) {

        String entrada;
        String retornoString = "";
        int retorno;

        if ((N < 0) || (Objects.isNull(N))) {
            // Nao foi especificado o que devo retornar em caso de entrada O ou null. Neste
            // casos atribui o retorno como 0.
            return 0;
        }

        entrada = "" + N;

        char[] nChar = entrada.toCharArray();

        Arrays.sort(nChar);

        for (int i = nChar.length - 1; i >= 0; i--) {
            retornoString = retornoString + nChar[i];
        }

        retorno = Integer.parseInt(retornoString);

        return retorno > 100000000 ? 1 : retorno;

    }

}

