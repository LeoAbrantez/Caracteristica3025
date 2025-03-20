/*
VAR
    numero, parte1, parte2: Inteiro

INICIO
    Ler numero

    parte1 <- numero / 100
    parte2 <- numero % 100

    SE (parte1 + parte2) * (parte1 + parte2) = numero ENTAO
        Escreva "O número ", numero, " satisfaz a característica."
    SENAO
        Escreva "O número ", numero, " não satisfaz a característica."
    FIM SE
FIM

TESTE DE MESA

Número	Parte1	Parte2	Soma	Quadrado	Satisfaz?
3025	30	    25	    55	    3025	    Sim
2025	20	    25	    45	    2025	    Sim
1234	12	    34	    46	    2116	    Não
 */

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int numero, parte1, parte2;

        // Entrada de dados
        String sNumero = JOptionPane.showInputDialog(null, "Digite um número de 4 dígitos:");
        numero = Integer.parseInt(sNumero);

        // Separação do número
        parte1 = numero / 100;
        parte2 = numero % 100;

        // Verificação
        if ((parte1 + parte2) * (parte1 + parte2) == numero) {
            JOptionPane.showMessageDialog(null, "O número " + numero + " satisfaz a característica.");
        } else {
            JOptionPane.showMessageDialog(null, "O número " + numero + " não satisfaz a característica.");
        }
    }
}