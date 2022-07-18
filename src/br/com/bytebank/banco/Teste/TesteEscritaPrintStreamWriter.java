package javaio.src.br.com.bytebank.banco.Teste;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;

import java.io.Writer;
import java.io.BufferedWriter;
import java.io.File;

public class TesteEscritaPrintStreamWriter {

    public static void main(String[] args) throws IOException {

        // Fluxo com entrada de arquivo
        // OutputStream fos = new FileOutputStream("OnePiece.txt");
        // Writer osw = new OutputStreamWriter(fos);
        // BufferedWriter bw = new BufferedWriter(osw);

        // BufferedWriter bw = new BufferedWriter(new FileWriter("OnePiece2.txt"));
        // PrintStream ps = new PrintStream(new File("OnePiece2.txt"));
        PrintWriter ps = new PrintWriter("OnePiece2.txt", "UTF-8"); // Método atualizado

        ps.println("3 bilhões de berries");
        ps.println(); // Pular linha
        ps.println("Sanji é um personagem foda"); 

        ps.close();

    }
}
