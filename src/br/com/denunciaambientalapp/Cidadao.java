package br.com.denunciaambientalapp;

import java.util.Scanner;

public class Cidadao {
    private int id;
    private String nomeCidadao;
    private Cidade cidade;
    private String email;
    private String whatsapp;

    public Cidadao() {


        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o seu nome: ");
        nomeCidadao = sc.nextLine();


        System.out.println("Informe o WhatsApp: ");
        whatsapp = sc.nextLine();


        System.out.println("Informe o seu Email: ");
        email = sc.nextLine();

        Cidade c1 = new Cidade();
        this.cidade = c1;

        this.nomeCidadao = nomeCidadao;
        this.whatsapp = whatsapp;
        this.email = email;
        sc.close();



    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;


        }

    @Override
    public String toString() {
        return
                "\nNome: " + nomeCidadao + '\n' +
                "Cidade: " + cidade + '\n' +
                "Email: " + email + '\n' +
                "Whatsapp: " + whatsapp ;

    }
}
