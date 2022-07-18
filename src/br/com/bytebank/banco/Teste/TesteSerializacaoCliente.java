package javaio.src.br.com.bytebank.banco.Teste;

import java.io.IOException;
import java.io.ObjectOutputStream;

import javaio.src.br.com.bytebank.banco.Modelo.Cliente;

import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.FileInputStream;

public class TesteSerializacaoCliente {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        // Cliente cliente = new Cliente();
        // cliente.setNome("Matheus");
        // cliente.setProfissao("Dev");
        // cliente.setCpf("234113131");

        // String nome = "Matheus Canteri";

        //  ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin")); // Dessirialização
        //  oos.writeObject(nome);
        //  oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin")); // Serialização
        Cliente cliente = (Cliente) ois.readObject();
        ois.close();
        System.out.println(cliente.getNome());
    }

   
    
}
