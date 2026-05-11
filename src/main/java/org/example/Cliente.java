package org.example;

/*
Clasee de modelo de dados para Cliente
 */

import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.UUID;

public class Cliente {

    //Atributos do cliente
    public UUID id;
    public String nome;
    public String email;
    public String telefone;
    public String cpf;
    public LocalDateTime dataHoraCadastro;

    //Método para salvar os dados do cliente em um arquivo
    public void salvarDados() {
        try {

            //Definindo o local e o nome do arquivo
            var fileWriter = new FileWriter("c:\\Aula01\\clientes.txt", true);
            //Escrever no arquivo
            var printWriter = new PrintWriter(fileWriter);

            printWriter.println(id);
            printWriter.println(nome);
            printWriter.println(email);
            printWriter.println(telefone);
            printWriter.println(cpf);
            printWriter.println(dataHoraCadastro);
            printWriter.println("******");

            //fechar o arquivo
            printWriter.close();

            System.out.println("\nDados gravados com sucesso!");


        }
        catch(Exception e) {
            System.out.println("\nFalha ao gravar o arquivo!");

        }
    }

}
