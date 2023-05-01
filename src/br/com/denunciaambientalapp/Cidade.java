package br.com.denunciaambientalapp;

import java.util.Scanner;

public class Cidade {
    private int id;
    private String nome;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public Cidade() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a Cidade: ");
        nome = sc.nextLine();
        this.nome = nome;
        sc.close();

    }

    @Override
    public String toString() {
        return nome ;

    }
}
