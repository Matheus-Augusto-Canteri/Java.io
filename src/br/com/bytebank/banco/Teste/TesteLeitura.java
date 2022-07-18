package javaio.src.br.com.bytebank.banco.Teste;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.BufferedReader;

public class TesteLeitura {

    public static void main(String[] args) throws IOException {

        // Fluxo com entrada de arquivo
        InputStream fis = new FileInputStream("OnePiece.txt");
        Reader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        String linha = br.readLine();

        while (linha != null) {

            System.out.println(linha);
            linha = br.readLine();
        }

        br.close();

    }
}
