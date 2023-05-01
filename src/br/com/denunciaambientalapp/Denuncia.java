package br.com.denunciaambientalapp;

import java.util.Scanner;

public class Denuncia {
    private int id;
    private String tipoDenuncia;
    private String descricao;
    private String denuncia;
    private Cidadao cidadao;

    public Denuncia() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o tipo da denúncia: ");
        this.tipoDenuncia = sc.nextLine();

        System.out.println("Informe a denúncia: ");
        this.denuncia = sc.nextLine();

        System.out.println("Descreva a denúncia: ");
        this.descricao = sc.nextLine();

        Cidadao c1 = new Cidadao();
        this.cidadao = c1;
        sc.close();
        imprimirDenuncia();


    }

    public int getId() {
        return id;

    }

   public void imprimirDenuncia () {
       System.out.println(" ");
       System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=");
       System.out.println("A DENÚNCIA FOI REGISTRADA!");
       System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
       System.out.println(" ");
       System.out.println("<<<< Detalhes da Denúncia >>>> ");
       System.out.println("Tipo de Denuncia: " + tipoDenuncia);
       System.out.println("Denúncia: " + denuncia);
       System.out.println("Descrição da Denúncia: " + descricao);
       System.out.println(" ");
       System.out.println("<<<< Denunciante >>>> " + cidadao);
   }
}
