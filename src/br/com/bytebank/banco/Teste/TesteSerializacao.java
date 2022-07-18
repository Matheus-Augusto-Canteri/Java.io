package javaio.src.br.com.bytebank.banco.Teste;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.FileInputStream;

public class TesteSerializacao {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //String nome = "Matheus Canteri";

        // ObjectOutputStream oos = new ObjectOutputStream(new FileOutp utStream("objeto.bin")); // Dessirialização
        // oos.writeObject(nome);
        // oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin")); // Serialização
        String nome = (String) ois.readObject();
        ois.close();
        System.out.println(nome);
    }

   
    
}
