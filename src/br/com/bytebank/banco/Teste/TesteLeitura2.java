package javaio.src.br.com.bytebank.banco.Teste;

import java.io.File;
import java.util.Scanner;
import java.util.Locale;

public class TesteLeitura2 {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(new File("contas.csv"), "UTF-8"); // Ler arquivo
        while (scanner.hasNextLine()) { // Enquanto
            String linha = scanner.nextLine();
            // System.out.println(linha);

            Scanner linhaScanner = new Scanner(linha);
            linhaScanner.useLocale(Locale.US);
            linhaScanner.useDelimiter(",");
            
            String tipoConta = linhaScanner.next();
            int agencia = linhaScanner.nextInt();
            int numConta = linhaScanner.nextInt();
            String titular = linhaScanner.next();
            double saldo = linhaScanner.nextDouble();

            System.out.format(new Locale("pt_br","BR") , "%s - %04d-%08d, %s: %07.2f %n", tipoConta, agencia, numConta, titular, saldo); // format string %s e formatados de acordo com a documentação
            linhaScanner.close();

            // String[] valores = linha.split(",");
            // System.out.println(valores[3]);
        }
        scanner.close();
    }

}
