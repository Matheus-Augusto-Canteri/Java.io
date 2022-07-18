package javaio.src.br.com.bytebank.banco.Teste;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

import java.io.Writer;
import java.io.BufferedWriter;

public class TesteEscrita {

    public static void main(String[] args) throws IOException {

        // Fluxo com entrada de arquivo
        OutputStream fos = new FileOutputStream("OnePiece.txt");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        bw.write("Luffy > Kid e Law");
        bw.newLine();
        bw.newLine();
        bw.write("Sanji é um personagem foda");

        bw.close();

    }
}
