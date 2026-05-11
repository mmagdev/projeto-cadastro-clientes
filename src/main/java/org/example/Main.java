package org.example;

import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.UUID;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        System.out.println("SISTEMA DE CADASTRO DE CLIENTES.");
        System.out.println("Preencha os dados do cliente: ");

        //Criando um objeto para a classe Scanner
        var scanner = new Scanner(System.in);


        //Criando um objeto para acessar o conteúdo da classe cliente:
        var cliente = new Cliente();

        cliente.id = UUID.randomUUID(); //Gerando o ID do cliente
        cliente.dataHoraCadastro = LocalDateTime.now(); //Gerando a data e a hora atual

        System.out.print("\nInforme o nome do cliente....: ");
        cliente.nome = scanner.nextLine();

        System.out.print("\nInforme o email..............:");
        cliente.email = scanner.nextLine();

        System.out.print("\nInforme o telefone............:");
        cliente.telefone = scanner.nextLine();

        System.out.print("\nInforme o CPF.................:");
        cliente.cpf = scanner.nextLine();

        //Executar o método para salvar os dados desse cliente
        cliente.salvarDados();



        }
    }

